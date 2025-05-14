package ch02;

import java.util.Scanner;

public class SwitchExam {

	public static void main(String[] args) {
		// Switch는 조건 제어문이다
		// 조건이 맞으면 case: 에 있는 실행문이 실행됨
		// if문은 true나 false의 조건이 2개 있지만
		// Switch문은 여러개의 조건 결과를 받는다.

		// 성적 처리 프로그램을 만들어 보자.
		// keypoint : C(생성) R(읽기) U(수정) D(삭제)
		// 교직원 :
		// 학생 :
		// 성적 :
		// 프로그램 종료
		

		// 메뉴 구현(알파벳을 눌러서 메뉴로 진입)

		Scanner input = new Scanner(System.in);
		System.out.println("====================");
		System.out.println("====엠비씨아카데미====");
		System.out.println("====성적처리프로그램====");
		System.out.println("====================");
		System.out.println("a. 교직원관리");
		System.out.println("b. 학생관리");
		System.out.println("c. 성적관리");
		System.out.println("z. 프로그램종료");
		System.out.println("(a~z)>>>");
		char select = input.next().charAt(0);
		// System.out.println("선택한 문자 : " + select) ;
		
		switch(select) {
		
		case 'A' :
		case 'a' :
			System.out.println("교직원관리메뉴로 진입하셨습니다.");
			System.out.println("1. 교직원 등록");
			System.out.println("2. 교직원 보기");
			System.out.println("3. 교직원 수정");
			System.out.println("4. 교직원 삭제");
			System.out.println("(1~4)>>>");
			int subeslect = input.nextInt() ;
			switch(subeslect) {
			
			case 1 :
				System.out.println("교직원등록 메뉴입니다.");
				break ;
			case 2 :
				System.out.println("교직원등록 보기입니다.");
				break ;
			case 3 :
				System.out.println("교직원등록 수정입니다.");
				break ;
			case 4 :
				System.out.println("교직원등록 삭제입니다.");
				break ;
				
			default :
				System.out.println("1~4값만 입력해주세요.");
				System.out.println("프로그램을 다시 실행해주세요.");
				break ;
				
				
			
			} // 교직원 스위치문 종료
			break ;
			
		    case 'B' :
		    case 'b' :
		    	System.out.println("학생관리메뉴로 진입하셨습니다.");
		    	break ;
		    
		    case 'C' :
		    case 'c' :
		    	System.out.println("성적관리메뉴로 진입하셨습니다.");
		    	break ;
		    	
		    case 'Z' :
		    case 'z' :
		    	System.out.println("프로그램을 종료합니다.");
		    	break ;
		    	
		    default :
		    	System.out.println("메뉴에 없는 문자를 넣었습니다.");
		    	System.out.println("프로그램을 다시 실행해 주세요.");		    	
		} // 스위치 문 종료

	} // main메서드 종료

} // class 종료
