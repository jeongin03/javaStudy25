package ch05.mbcbank;

import java.util.Scanner;

import org.xml.sax.HandlerBase;

import ch05.mbcbank.DTO.AccountDTO;
import ch05.mbcbank.service.HanBankService;

public class BankExam {
	// 필드
	public static Scanner inputInt = new Scanner(System.in);
	public static Scanner inputStr = new Scanner(System.in);
	
	public static AccountDTO[] hanaBank = new AccountDTO[10];
	public static AccountDTO[] woriBank = new AccountDTO[10];
	public static AccountDTO[] nhBank = new AccountDTO[10];
	public static AccountDTO session = null;
	
	
	// 생성자 -> 정적블럭 (main메서드 초기화 값)
	static {
		AccountDTO accountDTO0 = new AccountDTO("1234", "원숭이", 5000, "하나");
		hanaBank[0] = accountDTO0 ;
		
		AccountDTO accountDTO1 = new AccountDTO("1235", "이숭이", 50000, "우리");
		woriBank[0] = accountDTO1 ;
		
		AccountDTO accountDTO2 = new AccountDTO("1236", "삼숭이", 500000, "농협");
		nhBank[0] = accountDTO2 ;
	}
	
	
	
	// 메서드

	public static void main(String[] args) {
		// 은행 3개를 만들어 계좌 관리하는 프로그래밍
		// 테스트 코드 작성
		// 기본값 입력 더미데이터 출력용 코드 toString 오버라이딩으로 볼 수 있다.
		/*
		 * System.out.println("하나 은행 더미데이터 출력 테스트 : " + honaBank[0]);
		 * System.out.println("하나 은행 더미데이터 출력 테스트 : " + woriBank[0]);
		 * System.out.println("하나 은행 더미데이터 출력 테스트 : " + nhBank[0]);
		 */
		
		boolean run = true ; // 주메뉴 반복용
		while(run) {
			System.out.println("=========================");
			System.out.println("MBC코인시스템에 오신것을 환영합니다.");
			System.out.println("==========================");
			System.out.println("1. 하나은행");
			System.out.println("2. 우리은행");
			System.out.println("3. 농협은행");
			System.out.println("4. 프로그램 종료");
			System.out.print(">>>");
            String select = inputStr.next();
            switch (select) {
            case "1" :
            	System.out.println("하나은행으로 진입합니다.");
            	HanBankService hanBankService = new HanBankService();
            	hanBankService.menu(inputInt, inputStr, hanaBank) ;
            	break ;
            case "2" :
            	System.out.println("우리은행으로 진입합니다.");
            	break ;
            case "3" :
            	System.out.println("농협은행으로 진입합니다.");
            	break ;
            case "4" :
            	System.out.println("프로그램을 종료합니다.");
            	break ;
            default :
            	System.out.println("1~4값만 입력하세요");
            	
            } // 메뉴 선택문 종료( switch )
			
		} // 주 메뉴 종료 (while)

	} // 메서드종료 (main)

} //class종료
