package ch01;

public class StringEqualsExam {

	public static void main(String[] args) {
		// 지금까지 배운 변수 타입은 기본타입으로, 자바에서 객체 없이 사용됨
		// String로 원래 객체를 생성하고 만들어야 하지만 편의상 생략함
		String a = "수박" ;
		String b = "수박" ;
		String c = new String ("수박") ; // 객체 생성 문구
		
		
		System.out.println("첫 번째 과일 : " + a);
		System.out.println("두 번째 과일 : " + b);
		
	    System.out.println( a == b);
	    System.out.println( a == c);
	    
	    boolean eq1 = a.equals(c) ;
	    System.out.println(" a와 c번의 equals 메서드 사용 결과 : " + eq1);

	}

}
