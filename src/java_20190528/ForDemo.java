package java_20190528;

public class ForDemo {
	public static void main( String [] args){
		
		
	/*	//1~# ���ϱ�
		int sum = 0;
		int i = 0;
		for (; i<=100;i++){
			if (i%2==0)
			sum = sum + i;
				
		}
		System.out.println("1����" +(i-1)+" ���� ���� : "+sum);
		*/
		
		
		
		
		
		//������
		for (int j=2; j<=9;j++){
			for (int k=1; k<=9; k++){
				System.out.println(j+"*"+k+"="+(j*k));
			}
		}
		
/*		//������2
		tt:for (int j=2; j<=9;j++){
			//continue��
			if (j==3) continue;
			
			for (int k=1; k<=9; k++){
				//k�� break
				if(k==4) break tt;
				
				System.out.println(j+"*"+k+"="+(j*k));
			}
		}
			*/
		
		
/*		//���Ѱ�
		for (int l=1; l<=100; l++){
			for (int n=1; n<=100; n++)
				if (l%n== int || (l==1 && l==n) )
					
					System.out.println(l+"�� �Ҽ��Դϴ�");*/
			
			
/*			//�Ҽ����ϱ�
			int primeCount = 0;
			for (int a=1; a<=100;a++){
				int count = 0;
				for(int k=1; k<=a;k++){
					if(a%k==0){
						//�������� ���ڰ� ������� +1 �Ѵ�
						count +=1;
					}
				}
				//�Ҽ��� �������� ���ڰ� 2��(�ڱ��ڽŰ� 1)
				if (count==2){
					System.out.println(a+"�� �Ҽ��Դϴ�.");
					primeCount+=1;
				}
			}
			System.out.println("�Ҽ��� ������:"+ primeCount);
			*/
			
			
			
	}
}

