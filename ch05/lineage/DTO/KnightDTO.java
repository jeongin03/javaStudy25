package ch05.lineage.DTO;

public class KnightDTO  extends HumanDTO {
	// 객체를 상속한다.
	// 필드
	private String sword ; // 칼
	private String armor ; // 갑옷
	private String shield ; // 방패
	private String pitching ; // 투구
	private String ride ; // 탈것
	private String shoes ; // 신발
	private String gloves ; // 장갑
	
	// 생성자
	
	// 메서드 
	public String getSword() {
		return sword;
	}
	public String getArmor() {
		return armor;
	}
	public String getShield() {
		return shield;
	}
	public String getPitching() {
		return pitching;
	}
	public String getRide() {
		return ride;
	}
	public String getShoes() {
		return shoes;
	}
	public String getGloves() {
		return gloves;
	}
	public void setSword(String sword) {
		this.sword = sword;
	}
	public void setArmor(String armor) {
		this.armor = armor;
	}
	public void setShield(String shield) {
		this.shield = shield;
	}
	public void setPitching(String pitching) {
		this.pitching = pitching;
	}
	public void setRide(String ride) {
		this.ride = ride;
	}
	public void setShoes(String shoes) {
		this.shoes = shoes;
	}
	public void setGloves(String gloves) {
		this.gloves = gloves;
	}
	
	

}
