package java_20190605;

public class FormatDemo {
	public static void main(String[] args) {
		String t3 =  String.format("%,.2f and %,.2f", 10000.2021, 2000000.124124);
		System.out.println(t3);
		
		
		//float double은 f 문자는 s 숫자는 d
		String tt = String.format("There are %,d birds", 5);
		System.out.println(tt);
		
		
		
		//$는 인자순서를 나타낸다 (1$는 첫번째 인자란뜻) 없다면 자동배열한다
		//20f는 뒤에서부터 20칸을 가진다. 칸수가 남으면 20칸에 맞춰 빈칸을 만든다
		String str = String.format("%2$,f , %1$,20.2f , %,.2f",  1111111.1111, 2222.2222, 3333.333);
		System.out.println(str);
		
		
		int b1 = 10;
		int b2 = 20;
		System.out.printf("b1의 값은 %d 이구요,%nb2의 값은 %d 입니다", b1, b2);
		
	}

}
