package java_20190610;

public class TryCatchFinallyDemo {
	public static double getAverage(){
		int sum = a + b;
		return (double) sum / (double) 2;
	}

	public static void main(String[] args) {
		if (args.length != 2) {
			System.err.println("usage : java TrycatchfinallyDemo" + "[��������] [��������]");
			return;
		}
		// integer.parseInt() �ż���� ���ڰ� �ƴ� ���ڿ��� ��� ��, ���ڿ��� ���
		// NumberFormatException ���ܰ� �߻���

		try {
			int korea = Integer.parseInt(args[0]);
			
			//JVM�� ������ ���� ��Ű��, ���� ��ü�� NumberFormatException��ü�� ������ �� catch ���� ã�´�.
			int english = Integer.parseInt(args[1]);
			double avg = average(korea, english);
			System.out.printf("��� : %.2f",avg);
		
			
		} catch (NumberFormatException e) {
			//jvm �޼����� �����ϰ� ��µ�
			//e.printStackTrace();
			//System.err.println("���� �޼��� : "+e.getMessage());
			System.err.println("���ڸ� �Է��ϼž� �մϴ�.");
		} catch (ArrayIndexOutOfBoundsException e){
			System.err.println("usage : java TrycatchfinallyDemo" + "[��������] [��������]");			
		} finally {
			System.out.println("finally block");
		}
	}
}