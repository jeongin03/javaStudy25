package ch03;

import java.util.Scanner;


public class VendingMachineExam {

	public static void main(String[] args) {
		// 자판기 프로그램 구현
		
		boolean run = true ;
		
	   String[] drinks = {"콜라","사이다","커피","물"}; // 음료 이름 배열
	   String[] pay = {"현금", "카드", "계좌이체"} ; // 결제 수단
	   String[] feedback = new String [100]; // 피드백 저장  배열
	   int feedbacksave = 0; // 피드백 저장 개수
	   int[] totalSales = {0}; // 매출합계
	   int[] prices = { 2500, 2000, 1500, 1000} ; //  음료 가격 배열
	   int[] stock = {3, 3, 3, 3 } ; // 음료 재고 배열
	   int[] quantity = {0, 0, 0, 0} ; // 음료 판매 수량 배열
	   
	   int balance = 0; // 잔액
	   int profit = 0 ; // 수익 
	   String pw = "0000" ;
	   
	   Scanner inputInt = new Scanner(System.in);
	   
	   while (run) {
		System.out.println("==== 자판기 프로그램 ====");
		System.out.println("1. 관리자모드");
		System.out.println("2. 사용자모드");
		System.out.println("0. 프로그램종료");
		System.out.print(">>>");
		int choice = inputInt.nextInt() ; // 선택 변수 
		
	    switch(choice) {
	    
		case 1 : 
			System.out.println("관리자모드입니다.");
			System.out.println("관리자 pw를 입력하세요");
			System.out.print(">>>");
			String loginpw = inputInt.next() ;
			if(loginpw.equals(pw)) {
				adminMod(inputInt, drinks,  feedback, pay, prices, stock, quantity,balance,profit,feedbacksave,totalSales) ;			
			}else {
				System.out.println("비밀번호가 틀렸습니다.");					    
			} break ;
		case 2 : 
			System.out.println("사용자모드입니다.");
			useMod(inputInt, drinks,prices, stock, pay, feedback,feedbacksave,quantity ,totalSales) ;
			break ;
			
		case 0 :
			System.out.println("프로그램을 종료합니다.");
			run = false ;
			break ;
			
		default :
			System.out.println("번호를 잘못입력하셨습니다. 다시 번호를 입력해주세요");
			break ;
			
	    } // switch문 종료
	    
	
	   } // while 문 종료
	} // main 메서드 종료
			   
	   

	 

	private static void useMod(Scanner inputInt, String[] drinks, int[] prices, int[] stock, String[] pay,
			String[] feedback, int feedbacksave, int[] quantity ,int[]  totalSales) {
		   
		Scanner inputString = new Scanner(System.in);
		    boolean run = true ;
		    
		    while (run) {
				System.out.println("=========사용자모드입니다.========");
				System.out.println("1. 음료구매");
				System.out.println("2. 피드백 남기기");
				System.out.println("3. 환불");
				System.out.println("4. 관리자 호출");
				System.out.println("0. 사용자모드 종료");
				System.out.print(">>>");
				
				int userChoice = inputInt.nextInt();
				
				switch (userChoice) {
				
				case 1 :
					System.out.println("현재 음료 목록 :");
					for(int i = 0 ; i < drinks.length ; i++) {
						System.out.println((i+1) + "." + drinks[i] + "-" + prices[i] + "원 (재고 : " + stock[i]  + ")" );
					}
					System.out.println("구매 할 음료 번호 선택 : ");
					int drinkIndex = inputInt.nextInt() -1 ;
					
					if(drinkIndex< 0 || drinkIndex >= drinks.length) {
						System.out.println("잘못된 번호입니다.");
				    break ;
					}
					
	 				if(stock[drinkIndex] == 0) {
	 					System.out.println("해당 음료는 품절입니다.");
	 					break;
	 				}
				
	 			    System.out.println("결제 방법을 선택하세요.");
	 			    for (int i = 0 ; i < pay.length; i ++ ) {
	 			    	System.out.println((i + 1) + "." + pay[i]);
	 			    }
	 				System.out.println(">>>>");
	 				int payMethod = inputInt.nextInt();
	 				
	 				if (payMethod == 1) { // 현금
	 					System.out.println("금액을 투입하세요 : ");
	 					int inserted = inputInt.nextInt() ;
						if(inserted >= prices[drinkIndex]) {
	 						System.out.println(drinks[drinkIndex] + " 구매 완료!");
	 						int drinksIndex = 0;
							stock[drinksIndex] --;
							quantity[drinkIndex] ++ ;
							 totalSales[0] += prices[drinkIndex];
							int change = inserted - prices[drinkIndex]; 
							System.out.println("거스롬돈 : " + change + "원입니다.");
						}else {
							System.out.println("금액이 부족합니다. 구매 취소됩니다.");
						}
	 				} else if (payMethod == 2) { // 카드
	 					System.out.println("카드 결제가 완료되었습니다.");
	 					System.out.println(drinks[drinkIndex] + " 구매 완료!");
	                    stock[drinkIndex]--;
	                    quantity[drinkIndex]++;
	                    totalSales[0] += prices[drinkIndex];
	 				}else if(payMethod == 3) { // 계좌이체
	 					String account = "고민은행 132-45-6789" ;
	 					System.out.println("다음 계좌이체 해주세요 : " + account);
	 					System.out.println("계좌이체가 완료되었습니까?(1 : 예, 2 : 아니오) : ");
	 				 
	 					int transferCheck = inputInt.nextInt();
	 					if(transferCheck == 1) {
	 						System.out.println("계좌이체가 완료되었습니다. 음료를 드립니다.");
	 						stock[drinkIndex]--;
	 						quantity[drinkIndex]++;
	 						  totalSales[0] += prices[drinkIndex];
	 					}else {
	 						System.out.println("계좌이체가 확인되지 않았습니다.");
	 					}
	 				}else {
	 					System.out.println("올바르지 않는 결제 수단입니다.");
	 				}
	               break;
	               
				case 2 :
					System.out.println("피드백을 입력하세요.");
					inputInt.nextLine();
					String userFeedback = inputInt.nextLine();
					if(feedbacksave < feedback.length) {
						int feedbackave = 0;
						feedback[feedbackave++] = userFeedback ;
						System.out.println("피드백이 저장되었습니다.");
					} else {
						System.out.println("피드백 저장 공간이 부족합니다.");
					}
					break;
					
				case 3 :
					System.out.println("환불 요청 메뉴입니다.");
					System.out.println("환불요청 하시겠습니까? (1 : 예 , 2 : 아니오)");
					String confirmRefund = inputInt.next();

				    if (confirmRefund.equalsIgnoreCase("Y")) {
				        System.out.print("환불할 금액을 입력하세요: ");
				        int refundAmount = inputInt.nextInt();

				        if (refundAmount > 0) {
				            System.out.println("환불 요청이 접수되었습니다.");
				            System.out.println("환불 금액: " + refundAmount + "원");
				            System.out.println("환불이 완료되었습니다. 감사합니다.");
				        } else {
				            System.out.println("유효하지 않은 금액입니다. 환불을 취소합니다.");
				        }
				    } else {
				        System.out.println("환불 요청이 취소되었습니다.");
				    }
				    break;
				    
				 case 4:
		                System.out.println("관리자를 호출합니다... (벨 울림)");
		                System.out.println("잠시만 기다려주세요.");
		                break;

		            case 0:
		                System.out.println("사용자 모드를 종료합니다.");
		                run = false;
		                break;

		            default:
		                System.out.println("잘못된 번호입니다.");
		                break;
		      
				    
	
					
	    
	    
				} // 사용자모드 switch 문 종료
			} // 사용자모드 while 문 종료
			
		    
		    
		    
		
	} // 사용자 지정 메소드 문  사용자모드 종료





	private static void adminMod(Scanner inputInt,String[]drinks,String[] feedback,String[] pay, int[] prices, int[] stock,int[] quantity, int balance, int profit , int feedbacksave, int[] totalSales) { 
		boolean run = true ;
		
		
		 Scanner inputString = new Scanner(System.in);
		 
		
		while (run) {
			System.out.println("관리자모드진입하셨습니다.");
			System.out.println("1. 메뉴변경");
			System.out.println("2. 가격변경");
			System.out.println("3. 재고관리");
			System.out.println("4. 매출확인");
			System.out.println("5. 결제시스템 관리");
			System.out.println("6. 고객피드백관리");
			System.out.println("0. 관리자 모드 종료");
		    System.out.print(">>>");
		    int decision = inputInt.nextInt() ;

		    switch(decision) {
		    
		    case 1 :
		        System.out.println("메뉴변경모드입니다.");
		    	for (int i = 0; i< drinks.length; i ++) {
		    		System.out.println((i+1) + "번 음료 새 입력  " + drinks[i] + " : ");
		    		String newdrinks =inputInt.next() ;		
		    	    System.out.println(" " + drinks[i] + "의 음료가  " + newdrinks + "으로 변경되었습니다.");
		    		
		    	} // 메뉴변경모드 
		    	System.out.println("메뉴변경이 완료 되었습니다.");
		    	break;
		    	
		    case 2 :
		    	System.out.println("가격변경모드입니다.");
		    	for (int i = 0 ; i <prices.length ; i++) {
		    	   System.out.println(drinks[i] + "의 새 가격 입력하세요.");
		    	   int newprices = inputInt.nextInt() ;
		    	   prices[i] =  newprices ;
		    	   System.out.println(" " + drinks[i] + "의 가격이 " + newprices + "원으로 변경되었습니다." );
		    		} // 가격변경모드
		    	System.out.println("모든 가격이 변경완료 되었습니다.");
		    	break;
		    
		    case 3 :
		    	System.out.println("재고관리메뉴입니다.");
		    	for (int i = 0; i < stock.length ; i++ ) {
		    		System.out.println(drinks[i] + " 리필 수량 입력 : ");
		    		stock[i] = inputInt.nextInt() ;
		    		System.out.println(" " + drinks[i] + " 의 재고가 " + stock[i] +  "개로 변경되었습니다. ");
		     	} // 재고 변경 모드 
		    	System.out.println("모든 재고 수량이 변경되었습니다.");
		    	break;
		    
		    case 4 :
		    	System.out.println("매출확인메뉴입니다.");
		    	System.out.println("총 매출 : " + totalSales[0] + "원 입니다.");
		    	break;
		    	
		    case 5 :
		    	System.out.println("결제시스템 관리 메뉴입니다.");
		        boolean monePay = true;
		        
		        while (monePay) {
					System.out.println("\n 결제수단 관리옵션 : ");
					System.out.println("1. 현재 사용가능한 결제수단 보기");
					System.out.println("2. 결제수단 추가");
					System.out.println("3. 결제수단 삭제");
					System.out.println("0. 결제시스템 관리 종료");
					System.out.print(">>>");
					int payChoice = inputInt.nextInt();
					
					switch(payChoice) {
					
					case 1 :
						System.out.println("현재 사용가능 결제수단 보기 메뉴 입니다.");
						System.out.println("사용가능한 결제 수단 :");
			             for(String method : pay) {
			                System.out.println("-" + method);
			                } // 결제시스템 관리 모드
			             break;
			             
					case 2 :
						System.out.println("결제수단 추가 메뉴입니다.");
						String newPay = inputInt.next(); // 새배열 추가
						String[] newPayArr = new String[pay.length + 1];
						for(int i = 0; i <pay.length; i ++ ) {
							newPayArr[i] = pay[i] ;
						}
						newPayArr[pay.length] = newPay;
						pay = newPayArr; // 기존배열을 새로운 배열로 대체 
						System.out.println(" " + newPay + "결제수단이 추가되었습니다.");
						break;
						
					case 3 :
						System.out.println("결제 수단 삭제 메뉴입니다.");
						System.out.println("삭제 할 결제 수단 입력: ");
						String deletePay = inputInt.next() ;
						boolean deleteRun = false ;
						int index = -1 ;
						for(int i = 0 ; i< pay.length; i ++) {
							if (pay[i].equals(deletePay)) {
								deleteRun = true ;
								index = i ;
								break;
							}
						}
						if(deleteRun) {
							String[] newPayArr2 = new String[pay.length - 1] ;
							int j =0;
							for(int i = 0; i < pay.length; i++) {
								if (i != index) {
									newPayArr2[j++] = pay[i];
								
							}		
					}
							pay = newPayArr2;
							System.out.println(" " + deletePay + "결제 수단이 삭제되었습니다.");
				} else {
					System.out.println("해당 결제 수단을 찾을 수가 없습니다.");
				}
				break;
					case 0 : 
						System.out.println("결제 수단 관리 프로그램을 종료합니다.");
						 monePay = false;
						default :
							System.out.println("잘못된 번호입니다. 다시 입력해주세요.");
						 			
					} //switch 문 종료 결제 시스템 관리  
		        } //  while 문 종료 결제시스템 관리 	
		        break;
		        
		    case 6 :
		    	System.out.println("고객피드백 관리 메뉴입니다.");
		    	if(feedbacksave == 0) {
		    		System.out.println("등록 된 피드백이 없습니다.");
		    	}else {
		    		for(int i = 0; i<feedbacksave ; i++) {
		    			System.out.println((i + 1) + "."+ feedback[i]);
		    		}
		    	}
		    	break;
		    	
		    case 0 :
		    	System.out.println("관리자 모드 종료합니다.");
		    	run = false ;
		    	break;
		    default :
		    	System.out.println("잘못된 입력입니다.");
		    	
		    } //switch 문 종료
		    
		} // while 문 종료 
		
	} // 사용자 메서드 종료
	
		
		
} // class종료
	

