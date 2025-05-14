package ch02;

import java.util.Scanner;

public class ForExam {

	public static void main(String[] args) {
		// for문은 반복문으로 초기화식, 조건식, 증감식으로 만든다.
		// for(int i = 10 ; i < 10 ; i++) {반복실행문 ;}
		// i는 0부터 10이전까지 1씩 반복하는 실행문 !
		// for문에서는 사용하는 i 초기값은 for{}끝나면 사라진다.
		Scanner inputInt = new Scanner(System.in) ;
		System.out.println("확인할 max값을 입력하세요");
		System.out.println("숫자입력>>>");
		int max = inputInt.nextInt(); // 키보드로 입력한 숫자를 max변수에 넣음
		
		System.out.println("확인할 min값을 입력하세요");
		System.out.println("숫자입력>>>");
		int min = inputInt.nextInt() ; //키보드로 입력한 숫자를 min변수에 넣음
		
		System.out.println("확인할 증가할 값을 입력하세요");
		System.out.println("숫자입력>>>");
		int up = inputInt.nextInt() ;
		
		System.out.println(min + "~" + max + "까지" + up + "증가값을 출력해보자");
		int total = 0;
		// total = total +1 ; // x 100을 써야 한다.
		
		for (total = min ; total <= max; total+= up) {
                     //          total = total + up
        System.out.println("출력 테스트 : " + total);
		} 
		
	
		
		  
	} // main 메소드종료


} // class 종료