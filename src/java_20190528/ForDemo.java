package java_20190528;

public class ForDemo {
	public static void main( String [] args){
		
		
	/*	//1~# 더하기
		int sum = 0;
		int i = 0;
		for (; i<=100;i++){
			if (i%2==0)
			sum = sum + i;
				
		}
		System.out.println("1부터" +(i-1)+" 까지 합은 : "+sum);
		*/
		
		
		
		
		
		//구구단
		for (int j=2; j<=9;j++){
			for (int k=1; k<=9; k++){
				System.out.println(j+"*"+k+"="+(j*k));
			}
		}
		
/*		//구구단2
		tt:for (int j=2; j<=9;j++){
			//continue문
			if (j==3) continue;
			
			for (int k=1; k<=9; k++){
				//k를 break
				if(k==4) break tt;
				
				System.out.println(j+"*"+k+"="+(j*k));
			}
		}
			*/
		
		
/*		//망한것
		for (int l=1; l<=100; l++){
			for (int n=1; n<=100; n++)
				if (l%n== int || (l==1 && l==n) )
					
					System.out.println(l+"는 소수입니다");*/
			
			
/*			//소수구하기
			int primeCount = 0;
			for (int a=1; a<=100;a++){
				int count = 0;
				for(int k=1; k<=a;k++){
					if(a%k==0){
						//나눠지는 숫자가 있을경우 +1 한다
						count +=1;
					}
				}
				//소수는 나눠지는 숫자가 2개(자기자신과 1)
				if (count==2){
					System.out.println(a+"는 소수입니다.");
					primeCount+=1;
				}
			}
			System.out.println("소수의 갯수는:"+ primeCount);
			*/
			
			
			
	}
}

