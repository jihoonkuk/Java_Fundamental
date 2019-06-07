package java_20190607;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class MapDemo {
	public static void main (String[] args){
		HashMap<String, String> map = new HashMap<String, String>();
		
		map.put("a", "1");
		map.put("b", "2");
		map.put("c", "3");
		map.put("d", "4");
		map.put("a", "1");
		
		String temp1 = map.get("a");
		String temp2 = map.get("b");
		String temp3 = map.get("c");
		String temp4 = map.get("d");
		
		System.out.printf("%s , %s, %s, %s", temp1, temp2, temp3, temp4);
		//ㄴ키값을 알고 개수가 적기때문에 이런식으로 끄집어 낼수있다 하지만 많은 경우 이런방식은 사용하기 힘들다
		
		//많을 경우 이렇게 
		//KeySet() 매서드는 HashMap에 있는 모든 키값을 Set으로 반환
		Set<String> keys = map.keySet();
		Iterator<String> i = keys.iterator();
		while(i.hasNext()){
			String key = i.next();
			String value = map.get(key);
			System.out.printf("key : %s, value : %s %n", key, value);
		}
		
		
	}

}
