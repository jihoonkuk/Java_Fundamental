package java_20190603;

public class ExtendsDemo {
	public static void main(String[] args) {
		Customer c = new Customer ();
		c.name = "������";
		c.cphone = "010-9192-1234";
		System.out.println("�̸�: " +c.name);
		System.out.println("�ڵ���: " + c.cphone);
		c.actionCustomer();
	
		
		Alba a = new Alba();
		a.name = "�˹�";
		a.cphone = "010-9900-1942";
		a.address = "������";
		System.out.println("�̸�: " +a.name);
		System.out.println("�ڵ���: " + a.cphone);
		System.out.println("�ּ�: "+ a.address);
		a.actionAlba();
		a.actionCustomer();
		
		
		
		Manager m = new Manager ();
		m.name = "�Ŵ�";
		m.cphone = "010-0000-2929";
		m.address = "��⵵";
		m.id ="fiv5";
		m.password = "12312412";
		System.out.println("�̸�: " +m.name);
		System.out.println("�ڵ���: " + m.cphone);
		System.out.println("�ּ�: "+ m.address);
		System.out.println("���̵�: "+ m.id);
		System.out.println("��й�ȣ: "+ m.password);
		m.actionCustomer();
		m.actionAlba();
		m.actionManager();
		
		
		
		//SuperŸ�� (Alba)���� Sub ��ü (Manager)�� �����Ҽ��ִ�.
		//�ɹ������� Super Ÿ��(Alba)�� ������ ���� Ŭ���� (Customer) ���� ����.
		
		Alba alba = (Alba) new Manager ();
		alba.name = "�Ŵ�";
		alba.cphone = "010-0000-2929";
		alba.address = "��⵵";
		//alba.id ="fiv5";
		//alba.password = "12312412";
		System.out.println("�̸�: " +m.name);
		System.out.println("�ڵ���: " + m.cphone);
		System.out.println("�ּ�: "+ m.address);
		System.out.println("���̵�: "+ m.id);
		System.out.println("��й�ȣ: "+ m.password);
		alba.actionAlba();
		alba.actionCustomer();
		
		
		
		
	}

}
