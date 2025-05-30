package ch05.extended.school;

public class StudentExam {

	public static void main(String[] args) {
		Student stu1 = new Student("일숭이",180, 50, 50, "12345", 3, 4);
		Student stu2 = new Student("이숭이",190, 80, 70, "12375", 2, 5);
		
		stu1.show();
		stu2.show();

	}

}
