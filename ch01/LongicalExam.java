package ch01;

import java.util.Scanner; // �ܺζ��̺귯��

public class LongicalExam {

	public static void main(String[] args) {
		// ������ �����ڴ� ũ�� 5���� ������ �ִ�.
		// & : �� �� -> ~ �̰� (2���� ������ ��� ���ϰ�� ��)
		// | : �� �� -> ~ �̰ų� (2���� �� �Ѱ��� ���̸� ��)		
		// ! : �� ���� -> ���� ������ ������
		// ^ : ��Ÿ�� �� �� -> ������ �������� 1+1=0 ���� ����̳�
		
		String loginid = "aaa" ;
		String loginpw = "5858" ;
		
		Scanner input = new Scanner(System.in);
		// ū�ֿ� Ű����� ���� �о� ���� ��ü�� ������
		
		System.out.println("�α����� id�� �Է��ϼ���");
		String id = input.nextLine();
		System.out.println("�Է��Ͻ� id�� : " + id + "�Դϴ�.");
		
		System.out.println("�α����� ��ȣ�� �Է��ϼ��� : ");
		String pw = input.nextLine() ;
		System.out.println("== ���� �� �Դϴ�. ==");
		
		if( (loginid.equals(id)) | loginpw.equals(pw)) {
			// ������ �ִ� id�� Ű����� �Է��� id�� ������
			// �̰ų� or
			// ������ �ִ� pw�� Ű����� �Է��� pw�� ������
			System.out.println("id�� pw�� ��ġ�մϴ�.");
			System.out.println("�α��� ���� !");
		} else { // if���� false ó����
		   System.out.println("id�� pw�� �ٸ��ϴ�.");
		   System.out.println("�α��� ���� ~");
		} // if�� ����
		
		

	} // main �޼��� ����

} // class ����
