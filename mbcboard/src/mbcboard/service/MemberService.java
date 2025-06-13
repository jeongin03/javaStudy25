package mbcboard.service;

import java.sql.SQLException;
import java.util.Scanner;

import mbcboard.dao.MemberDAO;
import mbcboard.dto.MemberDTO;

public class MemberService {
	// 필드
	
	public MemberDAO memberDAO = new MemberDAO() ;

	
	
	// 생성자
	
	
	// 메서드 
	public MemberDTO subMenu(Scanner inputStr, MemberDTO session) throws SQLException  {
		// 회원 메뉴 전용 
		
		System.out.println("회원 메뉴 전용입니다.");
		System.out.println("1. 회원가입");
		System.out.println("2. 로그인");
		System.out.println("3. 회원 목록 보기");
		System.out.println("4. 비밀번호 수정하기");
		System.out.println("5. 회원 쫒아내기 ");	
		System.out.println("6. 회원전용 게시글 모두 보기");
		System.out.println("7. 회원 전용게시글 자세히 보기");
		System.out.println("8. 회원 전용 게시글 작성");
		System.out.println("9. 회원 전용 게시글 수정");
	    System.out.println("10. 회원 전용게시글 삭제");
		System.out.println("11. 회원 게시글 나가기");
		System.out.print(">>>");
		String subSelect = inputStr.next();
		
		switch (subSelect) {
		case "1" :
			System.out.println("회원가입하기");
			insertMember(memberDAO, inputStr);		
			break;
			
		case "2" :
			System.out.println("로그인하기");
			session = login(memberDAO, inputStr);
			if (session != null) {
				System.out.println(session.getId() + "님 환영합니다!");
			}
			break;
			
		case "3" :
			System.out.println("회원 목록 보기");
			memberDAO.listAll();
			break;
			
		case "4" :
			System.out.println("비밀번호 수정 하기");
			System.out.println("수정 하실 비밀번호를 입력하시오");
			System.out.print(">>>");
			String newpw = inputStr.next();
			memberDAO.Update(session, newpw);
		
			break;
			
		case "5" :
			System.out.println("회원 쫒아내기");
			if (memberDAO.delete(session, inputStr)) {
				session = null;
			}
			break;
       	
			
		case "6" :
			System.out.println("회원전용 게시글 모두 보기");
			break;
			
		case "7" :
			System.out.println("회원 전용게시글 자세히 보기");
			break;
			
		case "8" :
			System.out.println("회원 전용 게시글 작성");
			break;
			
		case "9" :
			System.out.println("회원 전용 게시글 수정");
			break;
			
		case "10" :
			System.out.println("회원 전용게시글 삭제");
			break;
			
		case "11" :
			System.out.println("회원 게시글 나가기");
			break;			

		default:
			break;
		}
		return session;
	}










	private void insertMember(MemberDAO memberDAO, Scanner inputStr) throws SQLException {
		// 회원가입 메서드
		MemberDTO memberDTO = new MemberDTO();
		
		System.out.println("성함을 입력하시오");
		memberDTO.setBwriter(inputStr.next());
		
		while (true) { // 아이디가 사용 중 이면 와일문 돔
			System.out.println("사용하실 ID를 입력하시오");
			memberDTO.setId(inputStr.next());			
			if (memberDAO.isIdExist(memberDTO.getId())) {
				System.out.println("이미 사용중인 ID입니다.");
			}
			else {
				break;
			}
		}
		
		System.out.println("사용하실 PW를 입력하시오");
		memberDTO.setPw(inputStr.next());
		
		memberDAO.insertMember(memberDTO);
		
		
	} // insertMember
	
	private MemberDTO login(MemberDAO memberDAO, Scanner inputStr) throws SQLException {
		
		MemberDTO memberDTO = new MemberDTO();
		// 아이디 입력
		System.out.println("ID(아이디)를 입력하시오.");
		System.out.print(">>>");
	    memberDTO.setId(inputStr.next());
	    
		// 비밀번호 입력
	    System.out.println("PW(비밀번호)를 입력하시오.");
	    System.out.print(">>>");
	    memberDTO.setPw(inputStr.next());
	    
	    if(memberDAO.inputlogin(memberDTO) == null) {
	    	System.out.println("비밀번호가 다르지롱 ~ ");	
	    }
	    
	    
	    
	    
	    // for (int i = 0; i < memberDTOs.length; i++) { if(memberDTOs[i].getId()) { //
	    // memberDTOs[i].id.equals(loginMemeber.id) &&
	    // memberDTOs[i].pw.equals(loginMemeber.pw } }  : 비교문쓰다가 지우기 아까워서 주석처리함.
	 
	    // memberDTO에 값을 받음 
	    // memberDAO에서 아이디가 있는지 있으면 맞는지 비교 + 비번포함 => 아이디랑 비번이 맞으면 로그인 성공
	    // => 멤버디티오에 값과 디비에값을 비교할것 
	    // 로그인 성공시 세션에다가 멤버테이블에 있는 정보를 넣음 가져옴    
	   	    
	    return memberDAO.inputlogin(memberDTO);
		
		
	} // login 
	
	
	
	
	

}
