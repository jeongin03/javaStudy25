package ch02;

import java.util.Scanner;

public class SwitchExam3 {

	public static void main(String[] args) {
		// 사용자 지정 메서드를 void 말고 리턴 받아 처리하는 코드
		
		Scanner inputStr = new Scanner(System.in);
		System.out.println("동물의 이름을 입력하세요");
		System.out.println(">>>>");
		String monster = inputStr.next();
		String kind = whoIsIt(monster);
		// whoIsIt(동물이름) 처리후에 kind 값을 받아 String 넣음
		System.out.println(monster + "는" + kind + "로 판단됩니다.");

	} // 메인 메서드 종료

	private static String whoIsIt(String monster) {
		String kind = null ; // 값이 없는 kind 변수에 문자열 타입
		switch (monster) {
		 case "호랑이","사자","고양이","강아지" -> kind = "포유류" ;
		 case "독수리","참새","까마귀","비둘기" -> kind = "조류" ;
		 case "고등어","돌고래","참치","갈치" -> kind = "어류" ;
		 default -> kind = "알수없는 개체입니다." ;
		 
		} // 스위치문 종료
		return kind;
	} // 사용자 지정 메서드 종료

} // 클래스 종료
