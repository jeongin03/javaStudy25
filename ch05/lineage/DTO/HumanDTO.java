package ch05.lineage.DTO;

public class HumanDTO { // 부모 역할을 하는 객체
	// 필드
	private String name; // 이름
	private String sex; // 성별
	private String level; // 레벨
	private int hp; // 피
	private int mp; // 머나
	private int money; // 돈
	private int strength; // 힘
	private int intelligence; // 지능
	private int defense; // 방어력
	private int speed; // 속도
	private int attack; // 공격력
	private int avoidance; // 회피
	private int exp; // 경험치
	
	
	// 생성자

	// 메서드 (게터 : 출력용 메서드 , 세터 : 입력용 메서드)
	public String getName() {return name + "님";}
	// 이름 필드 값을 리턴한다.

	public String getSex() {return sex;}
	// 성별 필드 값을 리턴한다.

	public String getLevel() {return level;}
	// 레벨 필드 값을 리턴한다.

	public int getHp() {return hp;}
	// 피 필드 값을 리턴한다.

	public int getMp() {return mp;}
	// 머나 필드 값을 리턴한다.

	public int getMoney() {return money;}
	// 돈 필드 값을 리턴한다.

	public int getStrength() {return strength;}
	// 힘 필드 값을 리턴한다.

	public int getIntelligence() {return intelligence;}
	// 지능 필드 값을 리턴한다.

	public int getDefense() {return defense;}
	// 방어 필드 값을 리턴한다.

	public int getSpeed() {return speed;}
	// 속도 필드 값을 리턴한다.

	public int getAttack() {return attack;}
	// 공격력 필드 값을 리턴한다.

	public int getAvoidance() {return avoidance;}
	// 회피 필드 값을 리턴한다.

	public int getExp() {return exp;}
	// 경험치 필드 값을 리턴한다.

	public void setName(String name) {this.name = name;}
	// 파라미터로 받은 이름을 필드로 전달한다.

	public void setSex(String sex) {this.sex = sex;}
	// 파라미터로 받은 성별을 필드로 전달한다.

	public void setLevel(String level) {this.level = level;}
    // 파라미터로 받은 레벨을 필드로 전달한다.
	
	public void setHp(int hp) {this.hp = hp;}
    // 파라미터로 받은 피를 필드로 전달한다.
	
	public void setMp(int mp) {this.mp = mp;}
	// 파라미터로 받은 머나를 필드로 전달한다.

	public void setMoney(int money) {this.money = money;}
	// 파라미터로 받은 돈을 필드로 전달한다.

	public void setStrength(int strength) {this.strength = strength;}
	// 파라미터로 받은 힘을 필드로 전달한다.

	public void setIntelligence(int intelligence) {this.intelligence = intelligence;}
	// 파라미터로 받은 지능을 필드로 전달한다.

	public void setDefense(int defense) {this.defense = defense;}
	// 파라미터로 받은 방어력을 필드로 전달한다.

	public void setSpeed(int speed) {this.speed = speed;}
	// 파라미터로 받은 속도를 필드로 전달한다.

	public void setAttack(int attack) {this.attack = attack;}
	// 파라미터로 받은 공격력을 필드로 전달한다.

	public void setAvoidance(int avoidance) {this.avoidance = avoidance;}
	// 파라미터로 받은 회피를 필드로 전달한다.

	public void setExp(int exp) {this.exp = exp;}
	// 파라미터로 받은 경험치를 필드로 전달한다.

}
