package java_20190528;

public class OperatorDemo {
	public static void main (String[] args){
		/*달력만들기
		 * 1. 1년 1월 1일 월요일
		 * 2. 윤년은 4년마다 발생, 100년의 배수는 제외하나 400년의 배수는 제외하지않는다
		 * 3. 2019년 5월 28일의 요일을 구하려면 2018녀 까지 일수를 구하고 , 1월~4월까지의 일수를 구하고 28일 더하면 총일수가 나옴.
		 * 4. 총일수 7로나는 나머지가 1이면 월요일, 2이면 화요일, 6이면 토요일, 0이면 일요일
		 */
		int year = 2019;
		int month = 5;
		int date = 28;
		
		int preYear = year - 1;
		int preMonth = month - 1;
		int totalCnt = 0;
	
		//2018년도 일수 구함
		
		totalCnt = preYear * 365 + (preYear/4 - preYear/100 + preYear/400);
		
		//2019년 1월 1일 부터 4월 30일까지 일수 구하기
		
		totalCnt += 31+28+31+30;
		
		//totalCnt++;
		
		totalCnt += date;
		
		int rest = totalCnt % 7;
		System.out.println(rest);
		
		
		
		//스위치 케이스
		int temp = 123;
				int share = temp%10==0 ? temp/10 : temp/10 + 1;
				//if문 
				
				if(temp%10==0){
					share = temp/10;
				}else{
					share=temp/10+1;
					
					
					System.out.println(share);
				}
	}

}



