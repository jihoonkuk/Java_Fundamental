package java_20190607;

import java.util.ArrayList;

public class GenericDemo {
	public static void main(String[] args) {
		ArrayList list = new ArrayList();
		list.add("1");
		list.add("2");
		list.add("3");
		//list.add(10);
		//list.add(10);-----boxing-object class�� ���������� auto-boxing��, ������ ��������� ����� ����
		//�׷��� ������ �������� ��ȣ�ϱ����� ���°��� Generic- Ȯ���� ���ش�
		
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

	
