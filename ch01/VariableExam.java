package ch01;

public class VariableExam {

	public static void main(String[] args) {
		
		int mach ; // ���� Ÿ���� mach ������ ����
		int distance ; // ���� Ÿ���� distance ���� ����
		mach = 340 ;
		distance = mach * 60 * 60 ; // ������ m/s�� �����
		
		System.out.println("�Ҹ��� 1�ð� ���� ���� �Ÿ� : ");
		System.out.println(distance + "m");
		
		double radius ; // �Ǽ� Ÿ���� radius ������ ����
		double area ; // �Ǽ� Ÿ���� area ���� ����
		// �Ǽ� Ÿ���� �Ҽ����� �ִ�.
		
		radius = 10 ; // �Ǽ� ���� �Է� (�ʱⰪ�� ���������� �Ǽ�Ÿ������ �����) 
		area = radius * radius * 3.14 ; // ���� ���� ��� 
		
		System.out.println("��������" + radius + "��");
		System.out.println("���� ���� : " + area);
		
		char firstName ; // ����Ÿ���� firstName ���� ����
		firstName = 'ȫ'  ; // firstName�� ���� �Է�
		//midName = '��' ;
		//lastName = '��' ;
		// ������ �ߴ� ���� midName, lastName ���� ������ ���� �ʾƼ�. 
		System.out.println(firstName); // firstName�� ���� ��� (�������) 
		//System.out.println(midName);
		//System.out.println(lasName);


		

	}

}
