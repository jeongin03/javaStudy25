package ch02;

import java.util.Scanner;

public class WhileExam {

	public static void main(String[] args) {
		// while문은 조건식이 true일 때만 반복한다.
		// while을 종료하고 싶으면 false처리를 한다.
		// 무한반복용 코드를 작성할 때 사용한다.

		Scanner inputInt = new Scanner(System.in); // 정수용 inputInt
		Scanner inputChar = new Scanner(System.in); // 문자용 inputChar
		boolean run = true; // 무한반복용 변수 
		
		while(run) {
			System.out.println("====엠비씨성적처리====");
			System.out.println("1. 교직원관리");
			System.out.println("2. 학생관리");
			System.out.println("3. 성적관리");
			System.out.println("9. 프로그램 종료");
			System.out.println("(1~9)>>>");
			int selectInt = inputInt.nextInt() ; // 숫자 입력
			
			switch(selectInt) { // 키보드로 입력된 숫자를 판단하여 분기
			
			case 1 : // create(생성) read(읽기) update(수정) del(삭제) 기법에 맞출것
				boolean subRun = true ;
				
				
				
				while (subRun) {
					System.out.println("===교직원관리메뉴로 진입 ===");
					System.out.println("a. 교직원등록"); // C
					System.out.println("b. 교직원보기"); // R
					System.out.println("c. 교직원수정"); // U
					System.out.println("d. 교직원관리메뉴종료"); //D
					System.out.println("(a~Z)>>>");
					char subSelect = inputChar.next().charAt(0) ;
					// 문자열로 입력된 값중에 맨앞 문자만 subSelect 변수에 넣음
				    // 위에서 입력받은 알파벳 처리 
					switch(subSelect) {
					
					case 'A' :
					case 'a' :
						System.out.println("교직원 등록메뉴로 진입");
						// 교직원 등록 코드작성
					    break ;
					    
					case 'B' :
					case 'b' :
						System.out.println("교직원 보기메뉴로 진입");
						// 교직원 보기 코드작성
						break ;
						
					case 'C' :
					case 'c' :
						System.out.println("교직원 수정메뉴로 진입");
						// 교직원 수정 코드작성
						break ;
						
					case 'D' :
					case 'd' :
						System.out.println("교직원 삭제메뉴로 진입");
						// 교직원 삭제 코드작성
						break ;
						
					case 'Z' :
					case 'z' :
						System.out.println("교직원 메뉴를 종료합니다.");
						// 교직원 종료 코드작성
						subRun = false ;
						break ;
					}
				} // 교직원관리 스위치문 종료 
				// 교직원관리용 코드 입력 
				break ;
			case 2 :
				System.out.println("===학생관리메뉴로 진입===");
				// 학생관리용 코드 입력 
				break ;
				
			default : // 위 조건에 해당하지 않는 값
				System.out.println("1~3까지 입력 바랍니다.");
				break ;
			} // 스위치문 종료 
			
		} // while문 종료
		

	} // main 메서드 종료

} // class 종료
