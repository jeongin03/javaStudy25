package ch01;

import java.util.Scanner; // �ܺζ��̺귯��

public class LogcalorExam {

	public static void main(String[] args) {
		// ���� �׽�Ʈ�� 
		// | ������ ��κ� ������ 2�� �̻��� ��� �Ǵ��ϴ� �뵵�� ����Ѵ�.
		// ���� ��� id�� pw�� �Ѵ� �¾ƾ� �α��� �����ϴ� ��� !
		// (������ �ִ� id == Ű����� �Է��� id & ������ �ִ� pw == Ű����� �Է��� pw)
		//             false            false          =   false
		//             true             false          =   false
		//             false            true           =   false
		//             true             true           =   true
		
		
		
		// Ű����� �Է� ���� ���ڰ� 2�� ����̰ų� 3�� ��� �ΰ��� ó���غ���.
		Scanner input = new Scanner(System.in) ; // Ű����� �Է¹޴� ��ü��
		System.out.println("2�� ����� 3�� ����� ���� Ȯ���غ����???");
		System.out.println(">>>");
		int value = input.nextInt() ;
		if ( (value%2 == -0) || (value%3==0) ) {
			// �Է°��� 2�� ���� �������� 0�̸� true
			//           �̰ų�
			// �Է°��� 3���� ���� �������� 0�̸� true
			
			System.out.println("2�� ��� �Ǵ� 3�� ����Դϴ� : " + value);
			System.out.println("2�� ��� �Ǵ� 3�� ����� �ƴմϴ�. : " + value);
		}

	}

}
