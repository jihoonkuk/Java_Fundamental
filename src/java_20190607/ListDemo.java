package java_20190607;

import java.util.ArrayList;

public class ListDemo {
	public static void main(String[] args) {
		// �������� �ߺ��� ����ϰ�, ������ �����Ѵ�.
		ArrayList<String> list = new ArrayList<String>();
		
		//�Է� add(��ü)
		list.add("1");
		list.add("2");
		list.add("3");
		list.add("4");
		
		
/*		//��� get (index)
		for(int i=0;i<list.size();i++){
			String temp = list.get(i);
			System.out.println(temp);
		}*/
		for(String temp : list){
			System.out.println(temp);
		}
		
		list.remove(1);
		
		//1�� �������� �� ���� ���ڹ迭�� ��ĭ�� �̵�
		String temp = list.get(2);
		System.out.println(temp);
		
		
	}

}
