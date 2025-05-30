package ch04.staticblock;

public class CalculatorExam {

	public static void main(String[] args) {
		// 정적필드와 정적메서드를 사용해보자
		// Calculator myCalc = new Calculator(); // 객체 생성하여 구현
		System.out.println("계산기 내부의 파이값 : " + Calculator.pi);
		double result1 = 10 * 10 * Calculator.pi ;
		System.out.println("정적필드로 파이 계산 결과 : " + result1);
		
		int result2 = Calculator.plus(10, 20);
		System.out.println("정적메서드 플러스 결과 : " + result2);
		
		int result3 = Calculator.minus(50, 30);
		System.out.println("정적메서드 마이너스 결과 : " + result3);
		
		System.out.println("a사용자가 계산기를 이용해서 값을 계산한다.");
		Calculator.result = 10 + 50 ;
		System.out.println("계산기 결과 값 : " + Calculator.result);
		System.out.println("b사용자가 계산기를 빌려달라고 한다.");
		Calculator.result = 100 + 500 ;
		System.out.println("a사용자가 전에 계산했던 10 + 50값에 100을 더했다.");
		Calculator.result = Calculator.result+100 ;
		System.out.println("계산기 결과 값 : " +  Calculator.result);
		// 결론 : static는 객체(인스턴스화)가 되지 않아서 값이 중복처리 된다.
		

	}

}
