package ch05.getter_setter;

public class MemberDTO {
	// 필드
	private String name ;
	private int age ;
	private boolean admin ;
	
	
	// 생성자
	// 메서드 -> 공용 메서드를 통해서 값을 주고 받는다.
	// Source 메뉴에 Genernate Getter and Setter을 이용해서 생성
	public String getName() {
		return name + "님";
	}
	public int getAge() {
		return age;
	}
	public String isAdmin() { // boolean일 경우 만 is
		String adminString = null ;
		if(admin ==  true) {
			adminString = "관리자" ;
		}
		return adminString;
	}
	public void setName(String name) {
		System.out.println("이름엔 숫자가 불가능합니다.");
		this.name = name;
	}
	public void setAge(int age) {
		System.out.println("나이에는 19세 이상만 가능합니다.");
		this.age = age;
	}
	public void setAdmin(boolean admin) {
		System.out.println("관리자일 경우에는 true로 처리해주세요");
		this.admin = admin;
	}
	
	

}
