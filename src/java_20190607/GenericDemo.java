package java_20190607;

import java.util.ArrayList;

public class GenericDemo {
	public static void main(String[] args) {
		ArrayList list = new ArrayList();
		list.add("1");
		list.add("2");
		list.add("3");
		//list.add(10);
		//list.add(10);-----boxing-object class만 들어갈수있으나 auto-boxing됨, 에러가 없어보이지만 실행시 에러
		//그래서 데이터 안정성을 보호하기위해 나온것이 Generic- 확인을 해준다
		
		for(int i =0; i<list.size();i++){
			String temp = (String)list.get(i);
			System.out.println(temp);
		}
		
		//Generic
		ArrayList <String> list1 = new ArrayList();
		list1.add("1");
		list1.add("2");
		list1.add("3");
		//list1.add(10);
		for(int i =0; i<list.size();i++){
			String temp = (String)list.get(i);
			System.out.println(temp);
		}
		
	}
}

	
