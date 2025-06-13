package mbcboard.dto;

import java.sql.Date;

import javax.xml.crypto.Data;

public class MemberDTO {
	// 멤버의 객체를 담당하고 있는 게터 / 세터
	
	// 필드 (테이블에 있는 모든 자료를 입력)
	private int mno ; // 번호
	private String bwriter ; // 작성자
	private String id ; // 아이디
	private String pw ; // 비번
	private Date regidate ; // javax.xml.crypto.Data; 날짜 
	

	
	// 생성자
	
	
	
	// 메서드  -> 게터(출력) / 세터 (입력)
	public int getMno() {return mno;}
	public String getBwriter() {return bwriter;}
	public String getId() {return id;}
	public String getPw() {return pw;}
	public Date getRegidate() {return regidate;}
	
	public void setMno(int mno) {this.mno = mno;}
	public void setBwriter(String bwriter) {this.bwriter = bwriter;}
	public void setId(String id) {this.id = id;}
	public void setPw(String pw) {this.pw = pw;}
	public void setRegidate(Date date) {this.regidate = date;}
	
	

}
