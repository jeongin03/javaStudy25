package javatest.service;

import java.util.Scanner;

import javatest.DTO.GradeDTO;
import javatest.DTO.LoginDTO;
import javatest.DTO.StudentDTO;
import javatest.DTO.TeacherDTO;

public class GradeExam {
	public static Scanner inputInt = new Scanner(System.in) ;
	public static Scanner inputStr = new Scanner(System.in) ;
	public static GradeDTO gradeDTO = new GradeDTO (null, 0); 
	
	public static StudentDTO[] students = new StudentDTO[10] ; // 학생배열
	public static TeacherDTO[] teachers = new TeacherDTO[10] ; // 교직원배열
    
	public static LoginDTO[] logins = new LoginDTO[10]; // 로그인 배열 
	
 	

	public static void main(String[] args) {
		
		boolean run = true ;
		
		while(run) {
			System.out.println("성적처리 프로그램 메뉴입니다.");
			System.out.println("1. 회원가입 메뉴");
			System.out.println("2. 교직원 메뉴");
			System.out.println("3. 학생 메뉴");
			System.out.println("4. 프로그램 종료 ");
			System.out.print(">>>");
			int select = inputInt.nextInt();
			
			switch(select) {
			case 1 :
				System.out.println("회원가입 메뉴로 진입합니다.");
				LoginService loginService =  new LoginService() ; // 로그인서비스 객체 생성 
				LoginService.memu(inputInt, inputStr, logins);
				
				break ;
			case 2 : 
				System.out.println("교직원 메뉴로 진입합니다.");
			    break ;
			case 3 :
				System.out.println("학생 메뉴로 진입합니다.");
				break ;
			case 4 :
				System.out.println("프로그램을 종료하겠습니다.");
				break ; 
				
			default : 
				System.out.println("1~4에 값만 입력해주세요.");
			}
		}
		 run = false ;
	    

	}

}
