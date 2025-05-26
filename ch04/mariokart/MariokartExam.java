package ch04.mariokart;

import java.util.Scanner;

import ch04.mariokart.dto.CartDTO;
import ch04.mariokart.dto.CharacterDTO;
import ch04.mariokart.dto.GliderDTO;
import ch04.mariokart.dto.ItemDTO;
import ch04.mariokart.dto.MemberDTO;
import ch04.mariokart.dto.TireDTO;

public class MariokartExam {
	// 필드 -> main()메서드가 있는 필드는 static용으로 만듬
	public static Scanner input = new Scanner(System.in); // 키보드 입력 배열
	public static MemberDTO[] memberDTOs = new MemberDTO[10]; // 회원 배열
	public static CharacterDTO[] characterDTOs = new CharacterDTO[15]; // 캐릭터 배열
	public static CartDTO[] cartDTOs = new CartDTO[8]; // 카트배열
	public static GliderDTO[] gliderDTOs = new GliderDTO[10]; // 글라이더 배열 
	public static TireDTO[] tireDTOs = new TireDTO[10]; // 타이어 배열
	public static String[] itemDTOs = {"물풍선","총","껌","동전먹기","바나나껍질","쉴드","자석","벼락","미사일","우주선전자파"}; // 아이템 배열
	
	public static MemberDTO loginState ; // 로그인상태유지 (세션)
	
	
	
	// 생성자 - new MariokartExam()로 객체를 생성하지 않는다.
	// static{      } 스태틱 블럭을 사용한다. 초기화용
	static {
		CharacterDTO characterDTO0 = new CharacterDTO("마리오", 3.0, 4.5, 3.7, 4.1, 3.8);
		CharacterDTO characterDTO1 = new CharacterDTO("루이지", 3.2, 4.4, 3.1, 4.4, 3.2);
		CharacterDTO characterDTO2 = new CharacterDTO("와리오", 3.4, 4.2, 3.2, 4.2, 3.4);
		CharacterDTO characterDTO3 = new CharacterDTO("피치", 3.1, 4.8, 3.2, 4.2, 3.4);
		
		characterDTOs[0] = characterDTO0 ;
		characterDTOs[1] = characterDTO1 ;
		characterDTOs[2] = characterDTO2 ;
		characterDTOs[3] = characterDTO3 ;  // characterDTO 배열에 삽입 완료
		
	} // 스태틱 블럭 종료 -> 스태틱으로 만든 클래스의 초기값
	
	
	
	// 메소드
	public static void main(String[] args) {
		
		memberDTOs[0] = new MemberDTO("1","1","1","1",characterDTOs[0]);
		
		System.out.println("=== 마리오 카트 게임을 시작합니다. ===");
		boolean run = true ; // 처음 구동
		while(run) {
			System.out.println("1. 회원관리 | 2. 카트관리 | 3. 게임실행 | 4. 종료");
			System.out.print(">>>");
			int select = input.nextInt(); // 숫자가 아닌경우 오류 발생함.(차후처리)

			switch(select){
			case 1 :
			System.out.println("회원관리 클래스로 진입합니다.");
			MemberService memberService = new MemberService(); // 회원관리용 서비스 객체 생성
			loginState = memberService.menu(input, memberDTOs, loginState); // 서비스의 메뉴 호출(스케너객체 전달)

			break;
			case 2 :
			System.out.println("카트관리 클래스로 진입합니다.");
			CartService cartService = new CartService(); // 카트관리 클래스 객체 생성
			cartService.menu(input, characterDTOs, loginState); // 부메뉴 호출

			break;
			case 3 :
			System.out.println("게임실행 클래스로 진입합니다.");
			StatgameService statgameService = new StatgameService();
			statgameService.menu(input, loginState, characterDTOs);
			break;
			
			case 4 :
			System.out.println("게임종료를 진행합니다.");
			System.out.println(loginState.nickName + "님의 레벨은 " + loginState.lv + "입니다.");	
			
			if (loginState.lv < 10) {
				System.out.println("레벨업까지 " + (loginState.leftGame - 1)+  "판 남았습니다.");
				loginState.leftGame -= -1;				
			}
			
			if (loginState.leftGame == 1) {
				System.out.println("축하합니다 레벨업 되셨습니다.");
			    loginState.lv += 1; 
			    loginState.leftGame = 100 ;
			}
			if (loginState.lv == 10) {
				System.out.println("축하합니다! 최고 레벨 10에 도달하셨습니다!");
			}
			run = false ; // while문 종료됨
			break;
			
			default :
			System.out.println("1~4번 숫자만 입력 하세요");

		} // switch 문 종료
		
	} // while 문 종료
	
	} // main 문 종료
} // class 종료

