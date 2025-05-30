package ch05.extended;

public class ExtendsTestch extends ExtendsTest {
	int field2 ;
	void method2() {
		// 실행문
	} // 메소드 종료

	public static void main(String[] args) {
	ExtendsTestch b = new ExtendsTestch(); // 객체 생성
	b.field1 = 10 ;
	b.method1();
	
	b.field2 = 20 ;
	b.method2();
	

	}

} // 자식 클래스로 부모 객체를 활용한다.
