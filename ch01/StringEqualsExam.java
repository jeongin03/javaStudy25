package ch01;

public class StringEqualsExam {

	public static void main(String[] args) {
		// ���ݱ��� ��� ���� Ÿ���� �⺻Ÿ������, �ڹٿ��� ��ü ���� ����
		// String�� ���� ��ü�� �����ϰ� ������ ������ ���ǻ� ������
		String a = "����" ;
		String b = "����" ;
		String c = new String ("����") ; // ��ü ���� ����
		
		
		System.out.println("ù ��° ���� : " + a);
		System.out.println("�� ��° ���� : " + b);
		
	    System.out.println( a == b);
	    System.out.println( a == c);
	    
	    boolean eq1 = a.equals(c) ;
	    System.out.println(" a�� c���� equals �޼��� ��� ��� : " + eq1);

	}

}
