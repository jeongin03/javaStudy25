package ch01;

public class StringConcatExam {

	public static void main(String[] args) {
		// ���ڿ� ���� �׽�Ʈ
		// print("�׽�Ʈ" + "�Դϴ�.") -> + �� ���� ��������
		// �ǿ����� �� ������ ���ڿ��̸� + �����ڴ� ���ڿ� ����� ������
		
		String str1 = "khi" + 20.3 ;
		System.out.println(str1);
		
		String str2 = str1 + "Ư¡" ;
		System.out.println(str2);
		
		String str3 = "khi" + 5 + 5.5 ; // ���ڰ� �տ� ������ ���ڰ� ȥ�յ� kji55.5
		System.out.println(str3);
		
		String str4 = 5 + 5.5 + "kji" ;
		System.out.println(str4);
		// �ڵ忡 �帧�� ������ �Ʒ��� �տ��� �ڷΰ� 
		// 5+5.5�� ���� ����� �� �Ŀ� ���ڿ��� ������ ��

	}

}
