package ch05.promotion.Tire;

public class CarExam {

	public static void main(String[] args) {
		Car car = new Car();
		
		for(int i = 1 ; i <= 10 ; i++ ) { // 자동차 마일리지 소모
			int problemLocation = car.run() ;
			
			switch(problemLocation) {
			case 1 :
				System.out.println("앞왼쪽 한국아티어로 교체");
				car.frontLeftTire = new HankookTire("앞왼쪽", 15) ;
				break ;
			case 2 : 
				System.out.println("앞오른쪽 한국타이어로 교체");
				car.frontRightTire = new HankookTire("앞오른쪽", 20);
			    break ;
			case 3 :
				System.out.println("뒤왼쪽 금호타이어로 교체");
				car.backLeftTire = new KumhoTire("뒤왼쪽", 12) ;
			    break ;
			case 4 : 
				System.out.println("뒤오른쪽 금호아티어로 교체");
				car.backRightTire = new KumhoTire("뒤오른쪽", 17) ;
				break ;
			} // 마일리지 소모후 자동 교체되는 코드
			System.out.println("-------------------");
		} // 1회전 종료에 대한 구분선 

	}

}
