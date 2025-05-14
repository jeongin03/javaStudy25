package ch02;

public class IfDficeExam {

	public static void main(String[] args) {
		int num = (int) (Math.random() * 6) + 1 ;
		// 1~6까지의 난수를 발생 시킨다.
		
		System.out.println("주사위의 값 " + num);
		
		if (num == 1) {		
			System.out.println("1번이 나왔습니다.");
		} else if (num == 2) {
			System.out.println("2번이 나왔습니다.");
		} else if (num == 3) {
			System.out.println("3번이 나왔습니다.");
		} else if (num == 4){
			System.out.println("4번이 나왔습니다.");
		} else if (num == 5){
			System.out.println("5번이 나왔습니다.");
		} else if (num == 6) {
			System.out.println("6번이 나왔습니다.");
		} else {
			System.out.println("프로그램 오류로 점검이 필요합니다.");
		}
			

	} //main 메서드 종료

} // class 종료
