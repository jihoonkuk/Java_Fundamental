package java_20190605;

public class FormatDemo {
	public static void main(String[] args) {
		String t3 =  String.format("%,.2f and %,.2f", 10000.2021, 2000000.124124);
		System.out.println(t3);
		
		
		//float double�� f ���ڴ� s ���ڴ� d
		String tt = String.format("There are %,d birds", 5);
		System.out.println(tt);
		
		
		
		//$�� ���ڼ����� ��Ÿ���� (1$�� ù��° ���ڶ���) ���ٸ� �ڵ��迭�Ѵ�
		//20f�� �ڿ������� 20ĭ�� ������. ĭ���� ������ 20ĭ�� ���� ��ĭ�� �����
		String str = String.format("%2$,f , %1$,20.2f , %,.2f",  1111111.1111, 2222.2222, 3333.333);
		System.out.println(str);
		
		
		int b1 = 10;
		int b2 = 20;
		System.out.printf("b1�� ���� %d �̱���,%nb2�� ���� %d �Դϴ�", b1, b2);
		
	}

}
