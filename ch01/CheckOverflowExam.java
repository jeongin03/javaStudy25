package ch01;

public class CheckOverflowExam {

	public static void main(String[] args) {
		// �츮�� ����Ÿ���� Ű����� �Է¹޾� ó���ϴ� ���� ��Ģ
		// �Է°��� ������ �ʿ䰡 �ִ�. (����üũ)
		// main �޼��� �̿ܿ� �� �ٸ� �Լ�(�޼���)�� �߰��Ͽ� ���
		
		int reault = safeAdd(70, 80) ;
		System.out.println(reault);
		
	} // main �޼��� ����

	private static int safeAdd(int left, int right) {
		if (right>0) { // ������ ���� 0���� Ŀ�ߵ�
			if (left>(Integer.MAX_VALUE - right) ) {
				// Integer.MAX_VALUE int Ÿ���� �ִ밪 (�� 21��)
				// int Ÿ�Կ� �ִ밪���� ������ ���� ������ ���� ������ �۾ƾ���
				throw new ArithmeticException("�����÷ο�߻�") ;
				// ����ó�� �����߻��� �ڵ� 
			} // ���ʹ� if�� ����
		}else { // false �϶�
			if(left<(Integer.MAX_VALUE - right)) {
				// Integer.MAX_VAUE int Ÿ���� �ּҰ�(�� -21��)
				throw new ArithmeticException("�����÷ο�߻�") ;
			} // ���� if�� ����
		} // �����÷ο� if�� ����
		
		return left + right ;
	} // safeAdd �޼��� ����
 
	} // class ����


