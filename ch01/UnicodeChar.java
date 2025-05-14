package ch01;

public class UnicodeChar {

	public static void main(String[] args) {
		char c1 = 75 ;          // A���ڸ� ����ϱ� ���� char�� ����
		char c2 = 105 ;         // 10���� 65�� char�� �����Ͽ� �����ڵ�
		char c3 = 109 ;  // /u��� �����ڵ�ǥ�� �ִ� 16���� 41�� ���
		
		char c4 = 75 ;
		char c5 = 105 ;
		
		char c6 = 87 ;
		char c7 = 111 ;
		char c8 = 110 ;
		System.out.println(c1);
		System.out.println(c2);
		System.out.println(c3);
		
		
		char han1 = '가' ;
		char han2 = 44032 ;
		char han3 = '\uac00' ;
		
		System.out.println(han1);
		System.out.println(han2);
		System.out.println(han3);
		
		int uniCode1 = '나' ;
		int uniCode2 = '다' ;
		int uniCode3 = '라' ;
		
		System.out.println(uniCode1);
		System.out.println(uniCode2);
		System.out.println(uniCode3);
	}
	

}
