package ch01;

public class CastingExam {

	public static void main(String[] args) {
		// ����Ÿ�Ժ�ȯ (Casting)
		// ū ũ���� Ÿ���� ���� ũ���� Ÿ������ �ڵ���ȯ �� �� ����.
		// int(21��) -> byte Ÿ������ ������ ������ �߻��Ѵ�.
	    // �̰��� ������ �߻��ص� ������ �����ϴ� ���� ���� Ÿ�� ��ȯ�̶�� ��.
		
		int intValue = 123456789 ;
		byte byteValue = (byte) intValue ; // ������ byte Ÿ������ ��ȯ
		// Type mimatch: cannot convert from int to byte 
		// int Ÿ���� ���� byte Ÿ�� ������ ���� �� ��� ���� ���� (java���� ���� ���� )
		
		System.out.println("int Ÿ�� �� ��� : " + intValue);
		System.out.println("byte Ÿ�� �� ��� : " + byteValue);
		// byte Ÿ���� 8bit�� ����� �տ� ���� ����������.
		// 111010110111100110100010101
		//                    00010101 -> 21
		
		int kor = 85 ;
		int eng = 99 ;
		int mat = 97 ;
		
		int total = kor + eng + mat ;
		System.out.println("========= ����ǥ =========");
		System.out.println("���� + ���� + ���� = ���� : " + total);
		
		double avg = (double) total / 3 ; // �ڵ�Ÿ�� ��ȯ ��.
		System.out.println("��� ���� : " + avg);
		    // ���� �߻� : � ���� ����ص� �Ҽ����� 0���� ����
		    // ���� : intŸ�� total�� 3���� �������� 
		    // �����ذ� : double Ÿ������ ���� ��ȯ �Ŀ� 3���� ���������
		
		avg = (double)total / 3 ; // ���� Ÿ�� ��ȯ�� 
		System.out.println("��� ����(����Ÿ�Ժ�ȯ) : " + avg);
		 

	}

}
