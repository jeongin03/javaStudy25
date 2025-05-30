package javatest.DTO;

public class LoginDTO extends GradeDTO {
	private String id ;
	private String pw ; 

	public LoginDTO(String name, int age, String id,  String pw) {
		super(name, age);
		this.id = id ;
		this.pw = pw ;
	}

	public String getId() {
		return id;
	}

	public String getPw() {
		return pw;
	}

	public void setId(String id) {
		this.id = id;
	}

	public void setPw(String pw) {
		this.pw = pw;
	}
}
