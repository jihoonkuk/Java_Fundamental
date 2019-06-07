package java_20190607;

import java.util.ArrayList;

public class ListDemo {
	public static void main(String[] args) {
		// 데이터의 중복을 허용하고, 순서를 관리한다.
		ArrayList<String> list = new ArrayList<String>();
		
		//입력 add(객체)
		list.add("1");
		list.add("2");
		list.add("3");
		list.add("4");
		
		
/*		//출력 get (index)
		for(int i=0;i<list.size();i++){
			String temp = list.get(i);
			System.out.println(temp);
		}*/
		for(String temp : list){
			System.out.println(temp);
		}
		
		list.remove(1);
		
		//1가 지워지면 그 위의 숫자배열이 한칸씩 이동
		String temp = list.get(2);
		System.out.println(temp);
		
		
	}

}
