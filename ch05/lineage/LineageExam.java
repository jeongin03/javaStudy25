package ch05.lineage;

import java.util.Scanner;

import ch05.lineage.DTO.Account;
import ch05.lineage.DTO.ElfDTO;
import ch05.lineage.DTO.KnightDTO;

public class LineageExam {
	public static Scanner scanner = new Scanner(System.in);
	public static Account[] accounts = new Account[10] ;  // 로그인용 배열
	public static Account LoainAccount ; // 로그인 성공시 객체(세션역할)
	public static KnightDTO knightDTO = new KnightDTO();
	public static ElfDTO elfDTO = new ElfDTO();
	
	static {
		
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
