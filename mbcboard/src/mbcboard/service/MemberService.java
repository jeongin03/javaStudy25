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
	public void subMenu(Scanner inputStr) throws SQLException  {
		// 회원 메뉴 전용 
		
		System.out.println("회원 메뉴 전용입니다.");
		System.out.println("1. 회원가입");
		System.out.println("2. 로그인");
		System.out.println("3. 회원전용 게시글 모두 보기");
		System.out.println("4. 회원 전용게시글 자세히 보기");
		System.out.println("5. 회원 전용 게시글 작성");
		System.out.println("6. 회원 전용 게시글 수정");
	    System.out.println("7. 회원 전용게시글 삭제");
		System.out.println("8. 회원 게시글 나가기");
		System.out.print(">>>");
		String subSelect = inputStr.next();
		
		switch (subSelect) {
		case "1" :
			System.out.println("회원가입하기");
			insertMember(memberDAO, inputStr);			
			break;
			
		case "2" :
			System.out.println("로그인하기");
			break;
			
		case "3" :
			System.out.println("회원전용 게시글 모두 보기");
			break;
			
		case "4" :
			System.out.println("회원 전용게시글 자세히 보기");
			break;
			
		case "5" :
			System.out.println("회원 전용 게시글 작성");
			break;
			
		case "6" :
			System.out.println("회원 전용 게시글 수정");
			break;
			
		case "7" :
			System.out.println("회원 전용게시글 삭제");
			break;
			
		case "8" :
			System.out.println("회원 게시글 나가기");
			break;			

		default:
			break;
		}
		
	}



	private void insertMember(MemberDAO memberDAO, Scanner inputStr) throws SQLException {
		// 회원가입 메서드
		MemberDTO memberDTO = new MemberDTO();
		
		System.out.println("성함을 입력하시오");
		memberDTO.setBwriter(inputStr.next());
		
		while (true) {
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
	
	
	

}
