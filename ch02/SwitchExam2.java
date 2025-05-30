package ch02;

import java.util.Scanner;

public class SwitchExam2 {

	public static void main(String[] args) {
		// 개선된 switch문을 사용해보자. -> 람다식이 적용 되어 있음
		// 람다식이라는 것은 -> 화살표를 이용하여 값을 전달하는 것
		// 메서드는 동작에 해당하는 기능을 main메서드 바깥쪽에 만듬
		
		// whoIsIt()호출하여 처리
		Scanner inputStr = new Scanner(System.in);
		boolean run = true ;
		while (run) {
			System.out.println("파악하고 싶은 동물 이름을 입력하세요 !!");
			System.out.println(">>>");
			String monster = inputStr.next();
			// 키보드로 동물을 받아 monster에 넣음
			// 내가 만든 메서드를 호출하여 값을 전달 함
			whoIsIt(monster);
		}
		
		
			
	}  // main 메서드 종료
	
	// 사용자 정의 메서드 추가
	// whoIsIt라는 메서드 생성 (입력은 bio라는 문자열이 들어옴)
	 static void whoIsIt(String bio) { // 문자열이 bio 변수로 처리됨
		//  void는 리턴(돌아가는)값이 없을 때 사용함
		 String kind = null ; // 값이 없는  kind 변수에 문자열 타입 선언
		 switch(bio) {
		 case "호랑이","사자","고양이","강아지" -> kind = "포유류" ;
		 case "독수리","참새","까마귀","비둘기" -> kind = "조류" ;
		 case "고등어","돌고래","참치","갈치" -> kind = "어류" ;
		 default -> kind = "알수없는 개체입니다." ;
		 
		 } // 스위치문 종료
		 
		 System.out.println(bio + "는" + kind + "로 판단됩니다.");
		 
	 }
		
		 

} // class 종료
