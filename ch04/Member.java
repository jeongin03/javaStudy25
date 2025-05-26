package ch04;

import java.util.Scanner;

public class Member {
	// 회원용 객체로 main()메서드는 eaxm에서 진행함
	
		// 클래스의 기본속성이 3가지가 필요하다.
		// 필드, 생성자, 메서드 
		
		
		// 필드 : 객체가 가지고 있어야 할 값 (변수)
		// 회원번호, id, pw, 성명, 이메일 주소, 집주소, 전화번호   	
		public int mno;
		public String id;
		public String pw ;

		// 생성자 : Exam 클래스에서 main()메서드에서 new로 호출 할 때 동작 
		public Member() { // 기본생성자 : 클래스명과 같은 메서드
			// Member member = new Member() ; 
			
		}
		
		// 메서드 : Member 클래스에서 행해지는 동작 CRUD
		public Member memberAdd(Scanner input) { // main에서 전달된 스케너 객체 
			Member member = new Member(); // 리턴용 객체
			
			System.out.println("회원가입용 메서드 입니다.");
			System.out.println("회원번호를 입력하세요");
			System.out.println("(숫자)>>>");
			member.mno = input.nextInt();
			
			System.out.println("회원id를 입력하세요");
			System.out.println(">>>");
			member.id = input.next();
			
			System.out.println("회원pw를 입력하세요");
			member.pw = input.next();
			
			return member;
		} // memberAdd()메서드 종료
		
		
		public void memberAllList(Member[]members) {
			System.out.println("모든 회원 보기 리스트 메서드입니다.");
			for(int i = 0 ; i < members.length ; i ++ ) {
				System.out.print(" 회원번호 : " + members[i].mno);
				System.out.print(" 회원 id : " + members[i].id);
				System.out.print(" 회원 pw : " + members[i].pw );
			}
		}
		
		

}
