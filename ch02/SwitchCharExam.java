package ch02;

import java.util.Scanner;

public class SwitchCharExam {

	public static void main(String[] args) {
		// switch문은 동등비교 연산자로 문자(char)도 동등비교할 수 있다.
		
		Scanner inChar = new Scanner(System.in);
		
		System.out.println("회원 등급을 입력하세요 (A~C) :");
		// String gradeStr = inChar.next() ; // 문자열로 데이터를 입력받아 String에 넣음 
		// char gradeStr.charAt(0); // 문자열 0번 인덱스 문자를 char 타입 변수에 넣음
		
		char gradeChaStr = inChar.next().charAt(0); // 문자열로 받은 값을 문자 처리함.
		
		//System.out.println("검증 코드용 (2줄) : " + gradeChr );
		System.out.println("검증 코드용 (1줄) : " + gradeChaStr );
		
		switch(gradeChaStr) {
		
		case 'a' :
		case 'A' :
			System.out.println("우수 회원 입니다.");
			break;
		
		case 'b' :
		case 'B' :
			System.out.println("일반 회원 입니다.");
	        break;
	      
		case 'c' :
		case 'C' :
			System.out.println("사업자 회원 입니다.");
			break;
			
		default :
			System.out.println("손님 처음이십니까?");
			System.out.println("회원 가입 하시려면 yes를 입력해주세요.");
			String newMember = inChar.next();
			if (newMember.equalsIgnoreCase("yes")) {
				System.out.println("회원가입을 진행합니다.");
				System.out.println("아이디 : ");
				String id = inChar.next();
				System.out.println(id + "님 회원가입을 축하드려요.");
				break;
			} else {
				System.out.println("안녕히가세요 ! 다음 기회에 뵙겠습니다.");
				System.out.println("단, 두번 다시 못 뵐수도 있습니다.");
				break;
			} // 회원가입 if문 종료
	
		} // switch 문 종료 

	}

}
