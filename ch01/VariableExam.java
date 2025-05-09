package ch01;

public class VariableExam {

	public static void main(String[] args) {
		
		int mach ; // 정수 타입의 mach 변수를 선언
		int distance ; // 정수 타입의 distance 변수 선언
		mach = 340 ;
		distance = mach * 60 * 60 ; // 음속을 m/s로 계산함
		
		System.out.println("소리가 1시간 동안 가는 거리 : ");
		System.out.println(distance + "m");
		
		double radius ; // 실수 타입의 radius 변수를 선언
		double area ; // 실수 타입의 area 변수 선언
		// 실수 타입은 소수점이 있다.
		
		radius = 10 ; // 실수 값을 입력 (초기값이 정수이지만 실수타입으로 변경됨) 
		area = radius * radius * 3.14 ; // 원의 넓이 계산 
		
		System.out.println("반지름이" + radius + "인");
		System.out.println("원의 넓이 : " + area);
		
		char firstName ; // 문자타입의 firstName 변수 생성
		firstName = '홍'  ; // firstName에 문자 입력
		//midName = '길' ;
		//lastName = '동' ;
		// 빨간줄 뜨는 이유 midName, lastName 변수 선언을 하지 않아서. 
		System.out.println(firstName); // firstName에 문자 출력 (개행없음) 
		//System.out.println(midName);
		//System.out.println(lasName);


		

	}

}
