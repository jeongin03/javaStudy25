package ch02;

public class RandomExam {

	public static void main(String[] args) {
		// 랜덤은 임의 숫자로  Math라는 클래스 안쪽에 random()메서드를 활용한다.
		// 이 메서드는 초를 us단위로 변수에 넣어 사용한다.
		double random = Math.random() * 6 + 1 ; // 1~6 까지의 난수를 발생시킨다.
		System.out.println(random);
		
		int num = (int)random ;
		System.out.println(num);

	}

}
