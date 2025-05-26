package ch04.mariokart.dto;

public class MemberDTO {
	// 필드 
	public String id ; // 아이디
	public String pw ; // 비번
	public String nickName ; // 별명 
	public String email ; // 암호찾기용(이메일)
	public int lv ; //레벨 
	public int leftGame ;
	public   CharacterDTO characterDTO; // 사용자가 선택한 캐릭터 연결용

	// 기본 생성자 
	public MemberDTO() {}
	
	// 사용자 정의 생성자
	public MemberDTO(String id, String pw, String nickName, String email, CharacterDTO characterDTO) {
		super();
		this.id = id;
		this.pw = pw;
		this.nickName = nickName;
		this.email = email;
		this.characterDTO = characterDTO;
		this.lv = 1 ;
		this.leftGame = 100;
	}
	
	
	// 생성자 
	
	
	// 메서드
}
