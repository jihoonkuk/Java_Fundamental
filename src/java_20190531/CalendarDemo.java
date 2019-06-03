package java_20190531;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CalendarDemo {
	public static String console() throws IOException{
		BufferedReader br = new BufferedReader (new InputStreamReader (System.in));
		return br.readLine();
	}
	

	public static void main (String[] arges) throws IOException{
		Calendar c = null;
		
		
	while(true){	
		System.out.print("��¥�� �Է��ϼ���>");
		String readLine = console();
		if(readLine.equals("bye")) break; 
		//readLine => 2019 5 31
		//split(" ") ���鹮�ڷ� ���ڿ��� �и��ؼ� �迭�� ��ȯ
		//data[0] = "2019" , data[1] = "5", data[2] ="31"
		
		String[] data = readLine.split(" ");
		//Calendar ��ü�� �����ؼ� �Ʒ��� ��� ��쿡 ����� �� �ִ�.
		c = new Calendar ();
		
		//data.length �迭�� ����
		if(data.length == 1){
			//year = 2019;
			//Integer.parseInt("2019") => 2019
			//Integer.parseInt() �޼ҵ�� ���ڿ��� int�� ��ȯ�ϴ� �޼���
			
			int year = Integer.parseInt(data[0]);
			//c = new Calendar();
			c.print(year);
		}else if(data.length == 2){
			int year = Integer.parseInt(data[0]);
			int month = Integer.parseInt(data[1]);
			//c = new Calendar();
			c.print(year,month);
		}else if (data.length == 3){
			int year = Integer.parseInt(data[0]);
			int month = Integer.parseInt(data[1]);
			int day = Integer.parseInt(data[2]);
			//c = new Calendar();
			c.print(year,month,day);
		}else{
		}
	}
	}
}