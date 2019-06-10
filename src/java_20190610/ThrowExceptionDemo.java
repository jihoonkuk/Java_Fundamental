package java_20190610;

class InsufficientBalanceException extends Exception{
	InsufficientBalanceException(String msg){
		//Exception Ŭ������ �Ű����� String�� �����ڸ� ȣ�����ش�.
		//msg�� �����޼����� ����� �������� ����Ѵ�.
		super(msg);
	}
}
class IncorrectAccountException extends Exception{
	IncorrectAccountException(String msg){
		//Exception Ŭ������ �Ű����� String�� �����ڸ� ȣ�����ش�.
		//msg�� �����޼����� ����� �������� ����Ѵ�.
		super(msg);
	}
}

public class ThrowExceptionDemo {
	public static double withdraw(String account, int amount){
		double balance = 100000;
		String dbAccount = "123-12-123123";
		if (account != null && account.equals(dbAccount)){
			if (balance - amount>0){
				balance = balance = amount;
				}else{
					throw new InsufficientBalanceException("�ܾ��� �����մϴ�");
				}
		}else{
			throw new IncorrectAccountException("���¹�ȣ�� �߸��Ǿ����ϴ�.");
		}
		return balance;

	public static void main(String[] args) {
		double balance;
		try {
			balance =withdraw("123-12-123123", 100000);
		
		System.out.println("�ܾ�: " + balance);
	
	return balance;
	}
}


	
	
	
	
