package ch01;

public class OperationExam {

	public static void main(String[] args) {
		// �����ڴ� ���α׷����� �����͸� ó���Ͽ� ����� ������.
		// �����ڴ� +, -, *, /, % (4Ģ������ + ���������)
		// �ǿ����ڴ� ����, ���� ���� 
		
		// ���� ���� (������ 1���ΰ�)
		
		int x = 10 ;
		x++ ; // x = x + 1
		System.out.println("10�� ++ ���׿����� ��� : " + x);
		
		x-- ; // x = x - 1
		System.out.println("x�� -- ���׿����� ��� : " + x);
		
		
		// ���� ���� (������ 2���� ��)
		int y = 20 ;
		int result = x + y ;
		//   30      10  20
		
		System.out.println("x + y = " + result);
		
		// ���� ���� (���� 3���� �� )
		boolean result1 = (result>10) ? true : false ;
		//                  ����          ��      ����
		System.out.println("result>10 ��� : " + result1);
		
		String result2 = (result>50) ? "ũ��" : " �۴�" ;
		System.out.println("result>50 ��� : " + result2);
		
		int x1 = 10 * 10 ; // ����
		System.out.println("10 x 10 = " + x1);
		int x2 = 10 / 3 ; // ������
		System.out.println("10 / 3 = " + x2);
		int x3 = 10 % 3 ; // ������
		System.out.println("10�� 3�� ���� ������ = " + x3);
		
		// �̼� -> 3�� �����ڸ� ����Ͽ� Ȧ¦ ����� �غ���.
		int odd = 11 ;
		int div = odd % 2 ; // 15�� 2�� ���������� �������� div
		String resultodd = (div == 1) ? "Ȧ��" : "¦��" ;
		System.out.println("11 + �� Ȧ¦ ��� ��� : " + resultodd);
		
		// �̼� -> 3�� �����ڸ� ����Ͽ� 4�� ����� ã�ƶ�.
		int multi4 = 24 ;
		int div4 = multi4 % 4 ; // 4�� ���� �������� div4�� ����
        String resultDiv4 = (div4 == 0) ? "4�� ����Դϴ�" : "�ƴմϴ�." ;
        System.out.println("4�� ��� �Ǵ� ��� : " + resultDiv4);
        
        // ���������� �׽�Ʈ 
        System.out.println("---------���������� ��ġ�� ���� ���---------");
        int a = 10 ;
        a++ ;
        ++a ;
        System.out.println("10-> a++ -> ++a�� ��� : " + a);
        
        int b = 10 ;
        b-- ;
        --b ;
        System.out.println("10-> b-- -> --b�� ��� : " + b);
        
        int c ;
        c = a++ ; // c = a ---> a = a + 1
        System.out.println("a�� ��� : " + a);
            System.out.println("c�� ��� : " + c);
            System.out.println("---------------");
            
            c = ++a ; // c = a = a + 1 
            System.out.println("a�� ��� : " + a); // 14
            System.out.println("c�� ��� : " + c); // 14
            System.out.println("----------------");
            
            c = ++a + b ++ ;
            System.out.println("a�� ��� : " + a); // 15
            System.out.println("b�� ��� : " + b); // 9
            System.out.println("c�� ��� : " + c); // 23
            System.out.println("-----------------");
        
				

	}

}
