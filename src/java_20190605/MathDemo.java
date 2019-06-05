package java_20190605;

import java.text.DecimalFormat;

public class MathDemo {
	public static void main(String[] args) {
		double d1 = Math.ceil(4.5);
		System.out.println(d1);
		
		double d2 = Math.floor(4.5);
		System.out.println(d2);
		
		
		long d3 = Math.round(42.5);
		//int d3 = Math.round(42.5f);
		//int d3 = (int)Math.round(42.5);
		System.out.println(d3);
		
		double d4 = Math.abs(-144);
		System.out.println(d4);
		
		double d5 = Math.max(4.5, 6.7);
		System.out.println(d5);
		
		double d6 = Math.min(34.67, 56.24);
		System.out.println(d6);
		
		double d7 = Math.sqrt(2);
		System.out.println(d7);
		
		double d8 = Math.pow(2, 3);
		System.out.println(d8);
		
		double d9 = Math.random();
		System.out.println(d9);
		
		
		
		//string이기 때문에 연산은 불가능, 디스플레이 용도로만!
		DecimalFormat cf = new DecimalFormat ( "#,###.##");
		String str = cf.format(1234.5344);
		
		System.out.println(str);
		
		
		
	}

}
