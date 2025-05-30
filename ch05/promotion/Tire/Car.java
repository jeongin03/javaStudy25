package ch05.promotion.Tire;

public class Car {
	// 필드
	Tire frontLeftTire =  new Tire("앞왼쪽", 6) ;
	Tire frontRightTire = new Tire("앞오른쪽", 2) ;
	Tire backLeftTire = new Tire("뒤왼쪽", 3) ;
	Tire backRightTire  = new Tire("뒤오른쪽", 4) ;
	// 자동차의 부품인 타이어 4개의 객체를 생성한다. (위치, 마일리지)
	// 생성자
	// 메소드 roll 소환하여 주행여부를 판단
	int run ( ) { // 자동차 달리는 여부
		if(frontLeftTire.roll()==false) {stop(); return 1 ;}
		if(frontRightTire.roll()==false) {stop(); return 2 ; }
		if(backLeftTire.roll()==false) {stop(); return 3 ; }
		if(backRightTire.roll()==false) {stop(); return 3 ; }
		return 0 ;
	} // 정상주행이면 0을 리턴 / 펑크시 1~4까지 위치 정보를 리턴한다.
	void stop() {
		System.out.println("자동차가 멈춥니다."); // 펑크 났을 때
		
	}

}
