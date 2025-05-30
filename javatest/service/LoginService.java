package javatest.service;

import java.util.Scanner;

import javatest.DTO.LoginDTO;

public class LoginService {

	public static LoginDTO memu(Scanner inputInt, Scanner inputStr, LoginDTO[] logins) {
		 System.out.println("===회원가입 메뉴로 진입하셨습니다.===");
		 boolean Run = true ;
		 
		 while (Run) {
			 System.out.println("1.회원가입  | 2. 로그인 | 3. 계정삭제  | 4. 프로그램종료 ");
			 System.out.println(">>>");
			 String select = inputStr.next();
			 
			 switch(select) {
			 case "1" :
				 System.out.println("회원가입 메뉴로 진입합니다.");
				 crate ( inputInt,inputStr, logins) ;
				 break ; 
			 case "2" :
				 System.out.println("로그인 메뉴로 진입합니다.");
				 break ;
			 case "3" :
				 System.out.println("계정삭제 메뉴로 진입합니다.");
				 break ;
			 case "4" :
				 System.out.println("프로그램 종료 합니다.");
				 break ;
			 }
			 
		 }
		
		return null;
	}

	
	private static void crate(Scanner inputInt, Scanner inputStr, LoginDTO[] logins) {
		
		System.out.println("사용하실 id를 입력해주세요");
		System.out.print(">>>");
		String id = inputStr.next() ;
		
		System.out.println("사용하실 pw를 입력해주세요.");
		System.out.print(">>>");
		String pw = inputStr.next();
		
		System.out.println("성함을 입력해주세요");
		System.out.print(">>>");
		String name = inputStr.next() ;
		
		System.out.println("나이를 입력해주세요");
		System.out.println(">>>");
		int age = inputInt.nextInt();
		
		
		
		
		
	}

}
