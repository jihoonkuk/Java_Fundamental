package java_20190531;

import java_20190531_tt.Cat;

public class AccessModifierDemo extends Cat {
	public static void main(String[] args) {
		Car c = new Car ();
	/*	c.modelNumber = "68오4472";*/
		
		//private은 같은 클래스에서만 접근이 가능
		//c.modelNumber = "68오4472";
		
		//default는 같은 패키지(디렉토리)에서 접근가능
		c.color = "red";
		
		//서로 다른 패키지에서 상속받은 경우 접근 가능
		c.doorCount = 5;
		
		//서로 다른 패키지에서 접근 가능
		c.price = 10_000_000;
		
		System.out.println(c.color);
		System.out.println(c.doorCount);
		System.out.println(c.price);
		
		Cat cat = new Cat();
		cat.nickName = "tomcat";
		
		System.out.println(cat.nickName);
		
		AccessModifierDemo a = new AccessModifierDemo();
		
		//상속을 받으면 public뿐만 아니라 protected도 접근가능
		a.age = 10;
		a.nickName = "먼지";
		

	}
}
