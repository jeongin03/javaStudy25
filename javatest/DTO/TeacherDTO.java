package javatest.DTO;

public class TeacherDTO extends GradeDTO {
	// 필드 
	private String teacherID ; // 교직원번호
	private int greade ; // 담당학년
	private int room ; // 담당교실
	private int stcount ; // 학생 수
	
	public TeacherDTO(String name, int age, String teacherID, int greade, int room, int stcount) {
		super(name, age);
	    this.teacherID = teacherID ; 
	    this.greade = greade ;
	    this.room = room ;
	    this.stcount = stcount ;
	}

	public String getTeacherID() {
		return teacherID;
	}

	public int getGreade() {
		return greade;
	}

	public int getRoom() {
		return room;
	}

	public int getStcount() {
		return stcount;
	}

	public void setTeacherID(String teacherID) {
		this.teacherID = teacherID;
	}

	public void setGreade(int greade) {
		this.greade = greade;
	}

	public void setRoom(int room) {
		this.room = room;
	}

	public void setStcount(int stcount) {
		this.stcount = stcount;
	}

}
