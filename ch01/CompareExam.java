package ch01;

public class CompareExam {

	public static void main(String[] args) {
		// 비교 연산자는 동등비교와 크기비교가 있다.
		// == : 같냐?
		// != : 다르냐?
		// >  : 초과, 크냐?
		// >= : 이상, 크거나 같냐?
		// <  : 미만, 작냐?
		// <= : 이하, 작거냐 같냐?
		
		int num1 = 10 ;
		int num2 = 10 ;
		boolean result1 = (num1 == num2) ;
		// boolean 타입은 true, false 값을 갖을 수 있다.
		//                참 ,  거짓
        System.out.println(result1);
        
        char char1 = 'A' ;
        char char2 = 'a' ;
        boolean result2 = (char1 == char2) ;
        System.out.println(result2);
        
        
        
        
        int v2 = 1 ; // 정수 타입의 1
        double v3 = 1.0 ; // 실수 타입의 1.0
        System.out.println(v2 == v3);
        // 비교연산자에 타입이 다른 변수를 비교하면 자동 타입 변환이 일어남
        // 이 때 자동타입 변환은 큰 값으로 타입을 매칭함
        
        double v4 = 0.1 ;
        float v5 = 0.1F ;
        System.out.println("================");
        System.out.println(v4 == v5); // false
        // 실수형(소수점)은 부동소수점 연산을 수행해서 근사값으로 표현함
        // true 처리를 하려면 강제타입 변환을 해야 함
        System.out.println((float)v4 == v5); // v4를 float 형으로 변환
        System.out.println(v4 == (double)v5); // 자동타입 변환임
        
        System.out.println((int)(v4*10) == (int)(v5*10));
        System.out.println(v4); // 0.1
        System.out.println(v5); // 0.1
        // print문에서 계산을 한 값은 변수에 저장되지 않는다
		
	}

}
