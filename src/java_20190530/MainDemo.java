package java_20190530;

public class MainDemo {
	public static void main(String[] args) {
		
/*		//Customer c ���� Customer �� Reference Type, c�� reference
		//new Customer()�� Object
		Customer c = new Customer ();
		c.name = "������";
		c.cphone = "010-8970-9404";
		Customer.interestRate = 4.3;
		//Customer.BANKNAME = "��������"; �� BANKNAME�� final �����̱� ������ ���� �Ұ���
				
		
		c.register();
		
		Customer c2 = new Customer ();
		c2.name = "Steve Jobs";
		c2.cphone = "010-3300-9876";
		Customer.interestRate = 4.5;
		
		c2.register();
		
		//c3 reference�� c2 reference�� ����Ű�� Object�� �����϶�� �ǹ�
		Customer c3 = c2;
		c3.name = "������";
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
