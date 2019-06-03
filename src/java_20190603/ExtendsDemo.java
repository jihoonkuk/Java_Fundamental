package java_20190603;

public class ExtendsDemo {
	public static void main(String[] args) {
		Customer c = new Customer ();
		c.name = "국지훈";
		c.cphone = "010-9192-1234";
		System.out.println("이름: " +c.name);
		System.out.println("핸드폰: " + c.cphone);
		c.actionCustomer();
	
		
		Alba a = new Alba();
		a.name = "알바";
		a.cphone = "010-9900-1942";
		a.address = "강원도";
		System.out.println("이름: " +a.name);
		System.out.println("핸드폰: " + a.cphone);
		System.out.println("주소: "+ a.address);
		a.actionAlba();
		a.actionCustomer();
		
		
		
		Manager m = new Manager ();
		m.name = "매니";
		m.cphone = "010-0000-2929";
		m.address = "경기도";
		m.id ="fiv5";
		m.password = "12312412";
		System.out.println("이름: " +m.name);
		System.out.println("핸드폰: " + m.cphone);
		System.out.println("주소: "+ m.address);
		System.out.println("아이디: "+ m.id);
		System.out.println("비밀번호: "+ m.password);
		m.actionCustomer();
		m.actionAlba();
		m.actionManager();
		
		
		
		//Super타입 (Alba)으로 Sub 객체 (Manager)를 생성할수있다.
		//맴버변수는 Super 타입(Alba)의 포함한 상위 클래스 (Customer) 접근 가능.
		
		Alba alba = (Alba) new Manager ();
		alba.name = "매니";
		alba.cphone = "010-0000-2929";
		alba.address = "경기도";
		//alba.id ="fiv5";
		//alba.password = "12312412";
		System.out.println("이름: " +m.name);
		System.out.println("핸드폰: " + m.cphone);
		System.out.println("주소: "+ m.address);
		System.out.println("아이디: "+ m.id);
		System.out.println("비밀번호: "+ m.password);
		alba.actionAlba();
		alba.actionCustomer();
		
		
		
		
	}

}
