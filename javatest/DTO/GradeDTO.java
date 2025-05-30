package javatest.DTO;


public class GradeDTO {
	// 필드 
	private String name ; // 이름 
	private int age ; // 나이

	// 생성자
	public GradeDTO(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
    
	// 메서드 
	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setAge(int age) {
		this.age = age;
	}
	
	public void  grad () {
		System.out.println("이름 : " + getName());
		System.out.println("나이 : " + getAge());
	}
	
	

}
