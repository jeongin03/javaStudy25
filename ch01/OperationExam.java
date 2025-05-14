package ch01;

public class OperationExam {

	public static void main(String[] args) {
		// 연산자는 프로그램에서 데이터를 처리하여 결과를 산출함.
		// 연산자는 +, -, *, /, % (4칙연산자 + 나머지계산)
		// 피연산자는 변수, 값을 말함 
		
		// 단항 연산 (변수가 1개인것)
		
		int x = 10 ;
		x++ ; // x = x + 1
		System.out.println("10에 ++ 단항연산한 결과 : " + x);
		
		x-- ; // x = x - 1
		System.out.println("x에 -- 단항연산한 결과 : " + x);
		
		
		// 이항 연산 (변수가 2개인 것)
		int y = 20 ;
		int result = x + y ;
		//   30      10  20
		
		System.out.println("x + y = " + result);
		
		// 삼항 연산 (항이 3개인 것 )
		boolean result1 = (result>10) ? true : false ;
		//                  조건          참      거짓
		System.out.println("result>10 결과 : " + result1);
		
		String result2 = (result>50) ? "크다" : " 작다" ;
		System.out.println("result>50 결과 : " + result2);
		
		int x1 = 10 * 10 ; // 곱셈
		System.out.println("10 x 10 = " + x1);
		int x2 = 10 / 3 ; // 나누기
		System.out.println("10 / 3 = " + x2);
		int x3 = 10 % 3 ; // 나머지
		System.out.println("10을 3로 나눈 나머지 = " + x3);
		
		// 미션 -> 3항 연산자를 사용하여 홀짝 계산을 해보자.
		int odd = 11 ;
		int div = odd % 2 ; // 15를 2로 나누었을때 나머지를 div
		String resultodd = (div == 1) ? "홀수" : "짝수" ;
		System.out.println("11 + 의 홀짝 계산 결과 : " + resultodd);
		
		// 미션 -> 3항 연산자를 사용하여 4의 배수를 찾아라.
		int multi4 = 24 ;
		int div4 = multi4 % 4 ; // 4로 나눈 나머지를 div4에 넣음
        String resultDiv4 = (div4 == 0) ? "4의 배수입니다" : "아닙니다." ;
        System.out.println("4의 배수 판단 결과 : " + resultDiv4);
        
        // 증감연산자 테스트 
        System.out.println("---------증감연산자 위치에 따른 결과---------");
        int a = 10 ;
        a++ ;
        ++a ;
        System.out.println("10-> a++ -> ++a의 결과 : " + a);
        
        int b = 10 ;
        b-- ;
        --b ;
        System.out.println("10-> b-- -> --b의 결과 : " + b);
        
        int c ;
        c = a++ ; // c = a ---> a = a + 1
        System.out.println("a의 결과 : " + a);
            System.out.println("c의 결과 : " + c);
            System.out.println("---------------");
            
            c = ++a ; // c = a = a + 1 
            System.out.println("a의 결과 : " + a); // 14
            System.out.println("c의 결과 : " + c); // 14
            System.out.println("----------------");
            
            c = ++a + b ++ ;
            System.out.println("a의 결과 : " + a); // 15
            System.out.println("b의 결과 : " + b); // 9
            System.out.println("c의 결과 : " + c); // 23
            System.out.println("-----------------");
        
				

	}

}
