package ch04.mariokart.service;

import java.util.Scanner;

import ch04.mariokart.dto.MemberDTO;

public class MemberService {
	// 회원관리용 클래스로 CRUD@까지 제공
	// 부메뉴용
	// 필드
	
	// MemberDTO  memberDTO ; // 안씀 -> new MemberDTO();
	
	
	
	// 생성자 -> new 객체 생성(생략시  기본 생성자는 자동으로 생성 된다.)
	
	//메서드
	
	
	// 부메뉴용 메서드 -> 필요한 파라미터???? (입력객체, 회원배열, 로그인상태)
	public MemberDTO menu(Scanner input, MemberDTO[] memberDTOs, MemberDTO loginState) {
		
		System.out.println("===== 회원관리 메뉴에 진입하였습니다. =====");
		
		boolean run = true ;
		while (run) {
			System.out.println("1. 가입 | 2. 로그인 | 3. 수정 | 4. 삭제 | 5. 종료 ");
		    System.out.print(">>>");
		    String select = input.next(); // menu메서드 호출시 scanner 객체 필수
			
		    
		    switch(select) {
		    
		    case "1" :
		    	System.out.println("계정을 생성합니다.");
		    	create(input, memberDTOs);
		    	break ;
		    case "2" :
		    	System.out.println("로그인을 진행합니다..");
		    	loginState = login(input, memberDTOs, loginState) ;
		    	break ;
		    case "3" :
		    	System.out.println("계정을 수정 합니다.");
		    	modify(input, memberDTOs, loginState);
		    	
		    	break ;
		    case "4" :
		    	System.out.println("계정을 삭제합니다.");
		    	delete(input, memberDTOs, loginState) ;
		    	
		    	break ;
		    case "5" :
		    	System.out.println("메인 메뉴로 진입합니다.");
		    	run = false ;
		    	break ;
		    	
		    case "99" :
		    	System.out.println("히든 메뉴로 진입하셨습니다.");
		    	System.out.println("캐릭터 해킹이 진행됩니다.");
		    	
		    default :
		    	System.out.println("1~5값만 입력하세요");
		    	
		    	
		    	
		    } // 스위치문 종료
		} // 와일문 종료
		
		
		return loginState; // 멤버서비스의 리턴은 로그인 상태 
		
	} // menu 종료






	private void create(Scanner input, MemberDTO[] memberDTOs) { // 계정생성
		System.out.println("사용하실 id를 입력하세요");
		System.out.print(">>>");
		String id = input.next();
		
		System.out.println("사용하실 pw를 입력하세요");
		System.out.print(">>>");
		String pw = input.next();
		
		System.out.println("사용하실 닉네임을 입력하세요.");
		System.out.print(">>>");
		String nickName = input.next();
		
		System.out.println("사용하실 이메일을 입력하세요");
		System.out.print(">>>");
		String email = input.next(); 
		
		//입력받을 값을 객체에 삽입
		MemberDTO memberDTO = new MemberDTO(); // 빈 객체 생성 
		memberDTO.id = id ;
		memberDTO.pw = pw ;
		memberDTO.nickName = nickName ;
		memberDTO.email = email ; // 키보드로 받은 값을 객체에 넣음 // 객체완성 
		
		
	    // 배열에 0 ~ null 값이면 삽입(exam)
		for (int i = 0; i < memberDTOs.length; i ++) {
			if (memberDTOs[i] == null) { // null 이면 값이 있음
				memberDTOs[i] = memberDTO;
				break ;
				
			} // if 문 종료
		} // for문 종료
		
		System.out.println(memberDTO.nickName + "님 회원가입을 축하드립니다.");
		
	}
	
	private MemberDTO login(Scanner input, MemberDTO[] memberDTOs, MemberDTO loginState) { // 로그인
		System.out.println("id를 입력하세요");
		System.out.print(">>>");
		String id = input.next();
		
		System.out.println("pw를 입력하세요");
		System.out.print(">>>");
		String pw = input.next();
		
		// 키보드 입력 완료 -> 빈객체 생성 -> 삽입
		MemberDTO loginMemeber = new MemberDTO();
		loginMemeber.id = id ;
		loginMemeber.pw = pw ;
		
		// 배열에 있는 객체와 지금 키보드로 입력한 객체 비교 
		for (int i = 0 ; i < memberDTOs.length; i ++) {
			if(memberDTOs[i].id.equals(loginMemeber.id) && memberDTOs[i].pw.equals(loginMemeber.pw)) {
				System.out.println("로그인 성공");
				loginState = memberDTOs[i]; //  배열에 있는 정보가 login상태 객체에 삽입
				break;
			} // if문 종료
		} // for문 종료
		System.out.println(loginState.nickName + "님 로그인 성공 !");
		
		return loginState; // 로그인 성공객체를 리턴함.
	} // login 메서드 종료
	
	private void modify(Scanner input, MemberDTO[] memberDTOs, MemberDTO loginState) { // 수정
		System.out.println("id를 입력하세요");
		System.out.print(">>>");
		String id = input.next();
		
		System.out.println("pw를 입력하세요");
		System.out.print(">>>");
		String pw = input.next(); // 입력 값과 새로운 객체 값을 삽입
		
		MemberDTO modifyMember = new MemberDTO();
		modifyMember.id = id ;
		modifyMember.pw = pw ; //  키보드로 입력받은 객체
		
		if(loginState.id.equals(modifyMember.id) && loginState.pw.equals(modifyMember.pw)) {
		   // 키보드로 id와 로그인 id 비교                 // 키보드로 받은 pw와 로그인 pw 비교
			System.out.println("변경할 pw를 입력하세요");
			System.out.print(">>>");
			loginState.pw = input.next();
		} // if문 종료 (로그인한 사용자 정보 변경만)
			
		
	}  // modify 메서드 종료
	
	
	
	private void delete(Scanner input, MemberDTO[] memberDTOs, MemberDTO loginState) { // 삭제
	System.out.println("id를 입력하세요");
	System.out.print(">>>");
	String id = input.next();
	
	System.out.println("pw를 입력하세요");
	System.out.print(">>>");
	String pw = input.next();
	
	MemberDTO deleteMember = new MemberDTO();
	deleteMember.id = id ;
	deleteMember.pw = pw ;
	
	for(int i = 0 ; i< memberDTOs.length ; i ++)       {
     if(memberDTOs[i] == loginState) {
    	 int confirmCount = 0;
    	 String[] questions = {
                 "현재 계정 삭제를 진행하시겠습니까?",
                 "정말 탈퇴를 하시겠습니까?",
                 "진짜로 탈퇴 하시겠습니까?",
                 "진심으로 원하십니까?",
                 "정말로 정말로 원하십니까?"
             };

             for (int j = 0; j < questions.length; j++) {
                 System.out.println(questions[j]);
                 System.out.print("1. 예 | 2. 아니오\n>>> ");
                 int select = input.nextInt();

                 if (select == 1) {
                     confirmCount++;
                 } else {
                     System.out.println("회원탈퇴가 취소되었습니다.");
                     return; // 함수 종료
                 }
             }

             if (confirmCount == 5) {
                 System.out.println("축하드립니다. 회원탈퇴가 되셨습니다.");
                 memberDTOs[i] = null; // 실제로 배열에서 삭제 (null 처리)
             }
             break;
    		
	} // if 문 종료
	} // for 문 종료
	
	
	
	
	

}
	
}
