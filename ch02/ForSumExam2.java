package ch02;

public class ForSumExam2 {

	public static void main(String[] args) {
		// 1부터 100까지의 합을 구해본다 . 1+2+3+... 100 = sum /5050
		int sum = 0 ; // 누적합계를 구하는 변수 선언
		int i = 1;
		for ( ; i <= 500 ; i++) { // 1~100까지 증가값)
		       sum = sum + i ;
		       
		}
		System.out.println("1~" + (i-1) + "까지의 합 : " + sum);

	}

}
