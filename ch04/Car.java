package ch04;

public class Car {
	// 필드(객체가 가지고 있어야 하는 값)-> 글로벌 변수(GV)
	// 고유데이터
	public String company ; // 제작회사(현대, 기아, KGM, 쉐보레, 아우디)
	public String model ;   // 아반떼, 그렌저, 쏘나타
	public String color ;   // 빨강, 은색, 검정색, 흰색
	int maxSpeed ;          // 최고속도
	public String oilType ; // 경유, 휘발유
	
   // 상태값(변동가능)
   public int speed ;
   public int rpm ;
   public int oil ;
   
   // 부품 -> 다른 클래스를 생성하여 연결한다.
   // public Body body ;
   // public Engine engine ;
   // public Tire tire ;
   
   // 부품에 필드 사용법
   // Car myCar = new Car() ; -> 객체 생성 (인스턴스)
   // myCar.maxSpeed = 300 ; -> 객체 있는 maxSpeed에 300 정수를 넣는다.
   //-----------------------------------------------------------
   
   
   // 기본생성자 : 생략가능 (객체가 생성할 때 사용되는 메서드 : 클래스명과 같은 이름)
   public Car() {
	   speed = 0 ;
	   rpm = 50 ;
	   oil = 100 ;
   } // 객체가 생성되면서 변수에 값이 저장됨.
   
    // 사용자지정 생성자 -> 개발자가 응용하는 기법
    // 사용자 지정 생성자가 만들어 지면 기본생성자는 자동으로 생성되지 않는다.
   public Car(String company, String model, String color) {
	   this.company = company ;
	   this.model = model ;
	   this.color = color ;
   } // Car myCar = new Car("벤츠","이클래스","빨강") ;
   
   
   
   // 메서드 (객체가 수행해야 되는 동작 )
   // c(시동시작) r(차량상태, 주행상태) u(가속, 감속, 주차) d(시동종료)
   public void start () {
	   System.out.println(this.model + "가(이) 주행을 시작합니다.");
	   System.out.println("현재속도 : " + this.speed);
	   System.out.println("현재 rpm : " + this.rpm);
	   System.out.println("현재 주유량 : " + this.oil);
   }
   
   public void begin () {
	   System.out.println("차량 주행이 시작됬습니다.");
   }

}
