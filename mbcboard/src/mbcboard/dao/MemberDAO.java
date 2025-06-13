package mbcboard.dao;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

import mbcboard.dto.MemberDTO;

public class MemberDAO {
	// 멤버의 DB와 연동을 담당한다.
	// JDBC 5단계를 사용
	// 1단계 : Connect 객체를 사용하여 ojdbc6.jar 를 생성
	// 2단계 : URL, ID, PW, SQL 쿼리문을 작성한다.
	// 3단계 : 쿼리문을 실행한다.
	// 4단계 : 쿼리문 실행 결과를 받는다.
	// 5단계 : 연결 종료를 진행한다.
	
	// try, catch : 예외 전문
	
	// 필드 
	public MemberDTO memberDTO = new MemberDTO();
	public Connection connection = null ; // 1단계에서 사용하는 객체
	public Statement statement = null ; // 3단계에서 사용하는 객체 (구형), 변수 직접 처리 '"+ name + " '
	public PreparedStatement preparedStatement = null ; // 3단계에서 사용하는 객체 (신형) , ? (인파라미터)
	public ResultSet resultSet = null ; // 4단계에서 결과 받는 표 executeQuery (select 결과)
	public int result = 0 ; // 4단계에서 결과 받는 정수 execteUpdate  (insert, update, delete)
	// 1개의 행이 삽입 | 수정 | 삭제 되었습니다. ( 정상처리 -> commit)
	// 0개의 행이 삽입 | 수정 | 삭제 되었습니다. (비정상처리 -> rolldack)
	
	// 기본생성자
	public MemberDAO () {
		try {
			// 예외가 발생할 수 있는 실행문
			// 프로그램 강제종료 처리용
			Class.forName("oracle.jdbc.driver.OracleDriver"); // 1단계 ojdbc6.jar 호출
			connection = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "boardtest",
					"boardtest"); // 2단계
		} catch (ClassNotFoundException e) {
			System.out.println("드라이버 이름이나, ojdbc6.jar 파일이 잘못 되었습니다.");
			e.printStackTrace();
			System.exit(0); // 강제 종료
		} catch (SQLException e) {
			System.out.println("url, id, pw가 잘못 되었습니다. MemberDAO에 기본생성자를 확인하세요");
			e.printStackTrace();
			System.exit(0); // 강제 종료
		}	
		
	} // MemberDAO 

	public void insertMember(MemberDTO memberDTO) throws SQLException {
		// 회원가입 메서드 
		try {
			String sql = "insert into member(mno, bwriter, id, pw, regidate) "
					+ " values(member_seq.nextval, ?, ?, ?, sysdate)";
			preparedStatement = connection.prepareStatement(sql);
			preparedStatement.setString(1, memberDTO.getBwriter()); // 첫번째 ?에 dto객체에 있는 제목 넣음
			preparedStatement.setString(2, memberDTO.getId()); // 두번째 ?에 dto 객체 내용 넣음
			preparedStatement.setString(3, memberDTO.getPw()); // 세번째 ?에 dto 객체 내용 넣음
			System.out.println("쿼리 확인 : " + sql); // 쿼리 완성본 확인용 (테스트)

			result = preparedStatement.executeUpdate(); // 쿼리문 실행해서 결과를 정수로 받음
			// result = preparedStatement.executeUpdate(sql); 오류발생

			if (result > 0) {
				System.out.println(result + "개의 게시물이 등록 되어 있습니다.");
				connection.commit(); // 영구저장
			} else {
				System.out.println("쿼리 실행 결과 : " + result);
				System.out.println("입력실패!!!");
				connection.rollback(); // 롤백(저장취소)
			}

		} catch (SQLException e) {
			System.out.println("예외발생 : insertBoard()메서드에 쿼리문을 확인하세요 ");
			e.printStackTrace();

		} finally {
			// 예외 발생 및 정상 실행후 무조건 처리되는 실행문
			preparedStatement.close();

		}
	}

	public boolean isIdExist(String id) throws SQLException {
		// 넘겨받은 id가 데이터베이스에 이미 존재하는지 확인하는 메서드
		
		try {
			String sql = "select * from member where id = ?";
			preparedStatement = connection.prepareStatement(sql);
			preparedStatement.setString(1, id); // service에서 넘어온 찾고 싶은 제목이 ?로 넘어간다.
			resultSet = preparedStatement.executeQuery();
			
			if (resultSet.next()) {	// resultSet에 값이 존재한다면 -> 이미 데이터베이스에 입력받은 id값이 존재한다
				return true;
			}
			
		} catch(SQLException e) {
			System.out.println("오류 발생 : isIdExist()메서드 확인하기");
			e.printStackTrace();
		} finally {
			resultSet.close();
			preparedStatement.close();
		}
		
		return false;
	}

	public MemberDTO inputlogin(MemberDTO memberDTO)throws SQLException {
		// 로그인 id & PW가 일치한지, id만 틀린지 확인 메서드
		
		try {
			String sql = "select * from member where id = ? and pw = ? " ;
			preparedStatement = connection.prepareStatement(sql);
			preparedStatement.setString(1, memberDTO.getId() );
			preparedStatement.setString(2, memberDTO.getPw() );
			resultSet = preparedStatement.executeQuery();
			
			while (resultSet.next()) {
				MemberDTO member = new MemberDTO();
				
				member.setId(resultSet.getString("id"));
				member.setPw(resultSet.getString("pw"));
				member.setMno(resultSet.getInt("mno"));
				member.setRegidate(resultSet.getDate("regidate"));
				
				return member;
			}
			
			
		} catch (SQLException e) {
			System.out.println("sql문이 잘못 되었습니다. 확인 부탁요");
			e.printStackTrace();
		}finally {
			resultSet.close();
			preparedStatement.close();
		}
		return null;
	}

	public void listAll() throws SQLException{
		// 회원 정보 목록 보기

		try {
			String sql = "select * from member";
			
			preparedStatement = connection.prepareStatement(sql);
			resultSet = preparedStatement.executeQuery();
			
			while (resultSet.next()) {
           
				System.out.println(resultSet.getString("id") + "\t" + resultSet.getString("bwriter") + "\t" + resultSet.getInt("mno") + "\t" + resultSet.getDate("regidate"));
				
			}
		} catch (SQLException e) {
			System.out.println("SQL문이 잘못된거 갔습니다.");
			e.printStackTrace();			
		}finally {
			resultSet.close();
			preparedStatement.close();
		}
		
	}

	public void Update(MemberDTO session, String newpw) throws SQLException {
		// 비밀번호 수정
		
		try {
			String sql = "update member set pw = ? where id =? ";
			preparedStatement = connection.prepareStatement(sql);
			
			preparedStatement.setString(1, newpw );
			preparedStatement.setString(2, session.getId());
			result = preparedStatement.executeUpdate();		

			if (result > 0 ) {
				System.out.println("비밀번호가 수정이 되었습니다.");
			} else {
				System.out.println("비밀번호 수정 실패");
			}
		} catch (SQLException e) {
			System.out.println("SQL문이 잘못되었습니다.");
			e.printStackTrace();
		}finally {
			preparedStatement.close();
		}
		
	} // Update

	public boolean delete(MemberDTO session, Scanner inputStr) throws SQLException {
		// 회원 쫒아내기.
				
		try {
			String sql = "delete from member where id = ? ";
			preparedStatement = connection.prepareStatement(sql);
			
			preparedStatement.setString(1, session.getId());
			
			String[] questions = {
					
	                 "현재 계정 탈퇴를 진행하시겠습니까?",
	                 "정말 탈퇴를 하시겠습니까?",
	                 "진짜로 탈퇴 하시겠습니까?",
	                 "진심으로 원하십니까?",
	                 "정말로 정말로 원하십니까?",
	                 "감히 날 떠나겠습니까?",
	                 "감히? 님이? 날 ? ",
	                 "진짜 레알로 탈퇴를 원하십니까?",
	                 "징짜루?"
	             };
			int confirmCount = 0;
			for (int j = 0; j < questions.length; j++) {
                System.out.println(questions[j]);
                System.out.print("1. 예 | 2. 아니오\n>>> ");
                String select = inputStr.next();

                if (select.equals("1")) {
                    confirmCount++;
                } else {
                    System.out.println("회원탈퇴가 취소되었습니다.");
                    return false; // 함수 종료
                }
			}
			
			if (confirmCount == 9) {
				result = preparedStatement.executeUpdate();
				
				if (result > 0) {
					System.out.println("잘가");
				}
				else {
					System.out.println("회원탈퇴 실패!!");
				}
            }
		} catch (SQLException e) {
			System.out.println("SQL문이 잘못되었습니다.");
			e.printStackTrace();
		} finally {
			preparedStatement.close();
		}
		return true;
	}
	

	
	
	

}
