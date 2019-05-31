package java_20190530;

public class MainDemo {
	public static void main(String[] args) {
		
/*		//Customer c 에서 Customer 는 Reference Type, c는 reference
		//new Customer()는 Object
		Customer c = new Customer ();
		c.name = "국지훈";
		c.cphone = "010-8970-9404";
		Customer.interestRate = 4.3;
		//Customer.BANKNAME = "국민은행"; 은 BANKNAME이 final 변수이기 때문에 변경 불가능
				
		
		c.register();
		
		Customer c2 = new Customer ();
		c2.name = "Steve Jobs";
		c2.cphone = "010-3300-9876";
		Customer.interestRate = 4.5;
		
		c2.register();
		
		//c3 reference를 c2 reference가 가리키는 Object를 참조하라는 의미
		Customer c3 = c2;
		c3.name = "손정의";
		c3.cphone = "010-1111-2222";
		
		c3.register();
		c2.register();*/
		
			Member m = new Member();
			m.setName("sung");
			m.setCphone("010-2222-1111");
			m.setAddress("seoul");
			m.setZipcode("46780");
		
		
		System.out.println(m.getName());
		System.out.println(m.getAddress());
		System.out.println(m.getCphone());
		System.out.println(m.getZipcode());
				
		
		
	}
}
