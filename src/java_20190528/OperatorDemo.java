package java_20190528;

public class OperatorDemo {
	public static void main (String[] args){
		/*�޷¸����
		 * 1. 1�� 1�� 1�� ������
		 * 2. ������ 4�⸶�� �߻�, 100���� ����� �����ϳ� 400���� ����� ���������ʴ´�
		 * 3. 2019�� 5�� 28���� ������ ���Ϸ��� 2018�� ���� �ϼ��� ���ϰ� , 1��~4�������� �ϼ��� ���ϰ� 28�� ���ϸ� ���ϼ��� ����.
		 * 4. ���ϼ� 7�γ��� �������� 1�̸� ������, 2�̸� ȭ����, 6�̸� �����, 0�̸� �Ͽ���
		 */
		int year = 2019;
		int month = 5;
		int date = 28;
		
		int preYear = year - 1;
		int preMonth = month - 1;
		int totalCnt = 0;
	
		//2018�⵵ �ϼ� ����
		
		totalCnt = preYear * 365 + (preYear/4 - preYear/100 + preYear/400);
		
		//2019�� 1�� 1�� ���� 4�� 30�ϱ��� �ϼ� ���ϱ�
		
		totalCnt += 31+28+31+30;
		
		//totalCnt++;
		
		totalCnt += date;
		
		int rest = totalCnt % 7;
		System.out.println(rest);
		
		
		
		//����ġ ���̽�
		int temp = 123;
				int share = temp%10==0 ? temp/10 : temp/10 + 1;
				//if�� 
				
				if(temp%10==0){
					share = temp/10;
				}else{
					share=temp/10+1;
					
					
					System.out.println(share);
				}
	}

}



