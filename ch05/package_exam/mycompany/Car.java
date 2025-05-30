package ch05.package_exam.mycompany;

import ch05.package_exam.hamkook.SnowTire;
import ch05.package_exam.kia.Engine;
import ch05.package_exam.kumho.BigWidthTire;
import ch05.package_exam.kumho.*;

public class Car {
	// 필드
	public String company ;
	public String model ;
	
	// 한국 타이어를 객체로 만듬
	ch05.package_exam.hamkook.Tire tire1 = new ch05.package_exam.hamkook.Tire();
	
	Tire tire2 = new Tire(); // 금호 타이어를 객체로 만듬
	
	// 엔진은 기아 부품으로 사용함 (import확인)
	Engine kiaEngine = new Engine();
	
	SnowTire snowTire = new SnowTire();
	BigWidthTire bigWidthTire = new BigWidthTire();
	SportTire sportTire = new SportTire();
	
	// 생성자
	
	
	
	// 메서드 
	

}
