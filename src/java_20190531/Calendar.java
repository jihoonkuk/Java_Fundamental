package java_20190531;

public class Calendar {
	public static final int SUNDAY = 0;
	public static final int MONDAY = 1;
	public static final int TUESDAY = 2;
	public static final int WEDNESDAY = 3;
	public static final int THURSDAY = 4;
	public static final int FRIDAY = 5;
	public static final int SATURDAY = 6;
	
	//5�� ������ ��¥�� ���� ã�¹�
	//�������� �ƴ����� �Ǵ��ϴ� �޼���: �Ű������� �����̸� true �ƴϸ� false
	private boolean isLeapYear(int year){
		
		boolean isLeapYear = false;
		if((year%4==0 && year%100 != 0 || year%400==0)){
			isLeapYear = true;
		}
		return isLeapYear;
	}
	
	
	//1��1��1�Ϻ��� ~ ������� ���ϼ��� ���Ѵ�
	public int getCount(int year, int month, int day){
		
		//���ϼ� ���Ҷ��� �⵵�� �����⵵���� �ϼ��� ���ؾ� �ϱ� ������ preYear ������ ����
		int preYear = year - 1;
		//�ش� �⵵�� �������� �����ϱ� ����  ����
		int preMonth = month - 1;
		int totalCnt = 0;
	
		//2018�⵵ �ϼ� ����
		totalCnt = preYear * 365 + (preYear/4 - preYear/100 + preYear/400);
		
		//2019�� 1�� 1�� ���� 4�� 30�ϱ��� �ϼ� ���ϱ�
		//�� �迭�� �����Ѵ�
		int[] monthArray = {31,28,31,30,31,30,31,31,30,31,30,31};
		
		for (int i = 0; i < preMonth; i++) {
			
			totalCnt += monthArray[i];
		}
		
		//�ش� ������ �������� �Ǵ��ϰ� �����ΰ�� 3�� �̻��̸� 1 �߰����ش�.
		if (month >=3 && isLeapYear(year)) {
			totalCnt++;
		}
		
		totalCnt += day;
		return totalCnt;
	}
		//�⵵�� �ſ� ��������¥�� ���ϴ� �ż���
		public int getLastDay(int year, int month){ 
		int[] monthArray = {31,28,31,30,31,30,31,31,30,31,30,31};
		if(isLeapYear(year)){
			//�����̸� 2���� 29�Ϸ� �ٲ�� �Ѵ�.
			monthArray[1] = 29;
		}
			
		
		return monthArray[month-1];
	}
	
	public void print(int year) {
	}
	
	public void print (int year, int month) {
		
		System.out.println(year+"��"+month+ "�� �޷��Դϴ�.");
		System.out.println("��\t��\tȭ\t��\t��\t��\t��");
		
		//���۳�¥
		int start = 1;
		//������ ��¥
		int end = getLastDay(year, month);
		//������ ����
		int dayOfWeek = getCount(year,month,1)%7;
		
		
		//�������̸� dayOfWeek => 1
		//ȭ�����̸� dayOfWeek => 2
		//.....................
		//������̸� dayOfWeek => 6
		//�Ͽ����̸� dayOfWeek => 0
		
		//���ϼ� ��ŭ ��ó��
		for(int i=0;i<dayOfWeek;i++){
			System.out.print("\t");			
		}
		
		
		for(int i=start;i<=end;i++){
			System.out.print(i+"\t");
			//dayOfWeek�� �����ؼ�
			dayOfWeek++;
			//dayOfWeek�� 7�̵Ǹ� ������ ���ش�.
			if (dayOfWeek%7==0){
				System.out.println();
			}
		}
		System.out.println();
	}
		
	

	public void print(int year, int month, int day) {
		
		
			
		
	
		int totalCnt = getCount(year,month,day);
		int rest = totalCnt % 7;
		String dayOfWeek = "";
		switch(rest){
		case Calendar.MONDAY : dayOfWeek = "������"; break;
		case Calendar.TUESDAY : dayOfWeek = "ȭ����"; break;
		case Calendar.WEDNESDAY : dayOfWeek = "������"; break;
		case Calendar.THURSDAY : dayOfWeek = "�����"; break;
		case Calendar.FRIDAY : dayOfWeek = "�ݿ���"; break;
		case Calendar.SATURDAY : dayOfWeek = "�����"; break;
		case Calendar.SUNDAY : dayOfWeek = "�Ͽ���"; break;
		}
		
		System.out.println(year+ "��" + month+ "��"+ day + "��"+dayOfWeek+"�Դϴ�.");
		}
		}


		
		

