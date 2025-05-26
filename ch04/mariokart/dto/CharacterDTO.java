package ch04.mariokart.dto;

public class CharacterDTO {
	// 필드
	public String name ; // 캐릭터명
	public double weight ; // 무게
	public double speed ; // 스피드
	public double acceleration ; // 가속
	public double handling ; // 핸들링
	public double friction ; // 마찰력 
	
	// 기본생성자 -> new CharacterDTO
	// 사용자가 생성자를 만들면 기본생성자는 자동으로 만들지 않는다.
	
	
	
	
	// 생성자 -> 객체 생성시 값을 넣으면서 생성한다.
	public 	CharacterDTO(String name,  double weight, double speed, double acceleration, double handling, double friction) {
		// CharacterDTO characterDTO = new CharacterDTO (파라미터) ;
		this.name = name ;
		this.speed = speed ;
		this.acceleration = acceleration ;
		this.handling = handling ;
		this.friction = friction ;
		this.weight = weight ;
	}
	
	
	// 메소드 
	public String toString() { // 객체 필드 정보를 출력
		return "CharaterDTO [name=" + name + ", weight=" + weight + ", seed=" + speed  + ", acceleration=" + acceleration + ", handling=" +  handling + ", friction=" + friction + "]" ;
		
		
		
	}
	
}
