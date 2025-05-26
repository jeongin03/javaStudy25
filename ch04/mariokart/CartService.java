package ch04.mariokart;

import java.util.Scanner;

import ch04.mariokart.dto.CharacterDTO;
import ch04.mariokart.dto.MemberDTO;

public class CartService {
     	// 카트관리용 CRUD@까지 제공 
	
	    
		// 필드
		
		
		
		// 생성자 -> new 객체 생성(생략시  기본 생성자는 자동으로 생성 된다.)
		
		//메서드
	
	public CartService menu (Scanner input, CharacterDTO[] characterDTOs ,MemberDTO loginState ) { // 키보드로 입력받은 객체캐릭터 배열로그인한 사용자상태
		for (int i = 0; i < characterDTOs.length; i++) {
			if (characterDTOs[i] != null) {
			System.out.print("이름 : " + characterDTOs[i].name + " 무게 : " + characterDTOs[i].weight + "\n");
			
			} // if문 종료
			}// for문 종료
			System.out.println("캐릭터를 선택하세요");
			System.out.print(">>>");
			String selectChar = input.next();

			for( int i = 0 ; i< characterDTOs.length ; i++) {
			if (characterDTOs[i] != null && characterDTOs[i].name.equals(selectChar)) {
			loginState.characterDTO = characterDTOs[i]; 
			// 키보드로 선택한 캐릭터 정보를 로그인한 객체에 연결!!!!
			}// if문 종료
			}// for문 종료
			System.out.println(loginState.nickName + "님은 " + loginState.characterDTO.name + "을 선택하셨습니다." );
			CartService cartService = null;
			return cartService;

		
		
	}

}
