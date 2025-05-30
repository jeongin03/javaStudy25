package javatest.DTO;

public class StudentDTO extends GradeDTO{
	// 필드
	private String studentID ; // 학번
	private int grade ; // 학년
	private int score ; // 점수
	
    // 생성자 
	public StudentDTO(String name, int age ,String studentID, int grade,int score) {
		super(name, age);
		this.studentID = studentID ;
		this.grade = grade ;
		this.score = score ;
			
	}

	public String getStudentID() {
		return studentID;
	}

	public int getGrade() {
		return grade;
	}

	public int getScore() {
		return score;
	}

	public void setStudentID(String studentID) {
		this.studentID = studentID;
	}

	public void setGrade(int grade) {
		this.grade = grade;
	}

	public void setScore(int score) {
		this.score = score;
	}


	

	
	
	

}
