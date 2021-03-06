package java_20190531;

public class Calendar {
	public static final int SUNDAY = 0;
	public static final int MONDAY = 1;
	public static final int TUESDAY = 2;
	public static final int WEDNESDAY = 3;
	public static final int THURSDAY = 4;
	public static final int FRIDAY = 5;
	public static final int SATURDAY = 6;
	
	//5월 마지막 날짜의 요일 찾는법
	//윤년인지 아닌지를 판단하는 메서드: 매개변수가 윤년이면 true 아니면 false
	private boolean isLeapYear(int year){
		
		boolean isLeapYear = false;
		if((year%4==0 && year%100 != 0 || year%400==0)){
			isLeapYear = true;
		}
		return isLeapYear;
	}
	
	
	//1년1월1일부터 ~ 년월일의 총일수를 구한다
	public int getCount(int year, int month, int day){
		
		//총일수 구할때는 년도는 이전년도까지 일수를 구해야 하기 때문에 preYear 변수를 설정
		int preYear = year - 1;
		//해당 년도의 이전달을 저장하기 위한  변수
		int preMonth = month - 1;
		int totalCnt = 0;
	
		//2018년도 일수 구함
		totalCnt = preYear * 365 + (preYear/4 - preYear/100 + preYear/400);
		
		//2019년 1월 1일 부터 4월 30일까지 일수 구하기
		//월 배열을 생성한다
		int[] monthArray = {31,28,31,30,31,30,31,31,30,31,30,31};
		
		for (int i = 0; i < preMonth; i++) {
			
			totalCnt += monthArray[i];
		}
		
		//해당 연도가 윤년인지 판단하고 윤년인경우 3월 이상이면 1 추가해준다.
		if (month >=3 && isLeapYear(year)) {
			totalCnt++;
		}
		
		totalCnt += day;
		return totalCnt;
	}
		//년도의 매월 마지막날짜를 구하는 매서드
		public int getLastDay(int year, int month){ 
		int[] monthArray = {31,28,31,30,31,30,31,31,30,31,30,31};
		if(isLeapYear(year)){
			//윤년이면 2월을 29일로 바꿔야 한다.
			monthArray[1] = 29;
		}
			
		
		return monthArray[month-1];
	}
	
	public void print(int year) {
	}
	
	public void print (int year, int month) {
		
		System.out.println(year+"년"+month+ "월 달력입니다.");
		System.out.println("일\t월\t화\t수\t목\t금\t토");
		
		//시작날짜
		int start = 1;
		//마지막 날짜
		int end = getLastDay(year, month);
		//요일을 구함
		int dayOfWeek = getCount(year,month,1)%7;
		
		
		//월요일이면 dayOfWeek => 1
		//화요일이면 dayOfWeek => 2
		//.....................
		//토요일이면 dayOfWeek => 6
		//일요일이면 dayOfWeek => 0
		
		//요일수 만큼 탭처리
		for(int i=0;i<dayOfWeek;i++){
			System.out.print("\t");			
		}
		
		
		for(int i=start;i<=end;i++){
			System.out.print(i+"\t");
			//dayOfWeek을 증가해서
			dayOfWeek++;
			//dayOfWeek가 7이되면 개행을 해준다.
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
		case Calendar.MONDAY : dayOfWeek = "월요일"; break;
		case Calendar.TUESDAY : dayOfWeek = "화요일"; break;
		case Calendar.WEDNESDAY : dayOfWeek = "수요일"; break;
		case Calendar.THURSDAY : dayOfWeek = "목요일"; break;
		case Calendar.FRIDAY : dayOfWeek = "금요일"; break;
		case Calendar.SATURDAY : dayOfWeek = "토요일"; break;
		case Calendar.SUNDAY : dayOfWeek = "일요일"; break;
		}
		
		System.out.println(year+ "년" + month+ "월"+ day + "일"+dayOfWeek+"입니다.");
		}
		}


		
		

