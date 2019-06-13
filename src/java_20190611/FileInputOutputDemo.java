package java_20190611;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileInputOutputDemo {
	public static void main(String[] args) {
		FileInputStream fin = null;
		FileOutputStream fos = null;
		try {
			
			
			
			//c:\\down\\jdk.exe ��ο� ������ ������ FileNotFoundException ���ܸ� �߻���Ų��.
			fin = new FileInputStream("c:\\down\\jdk.exe");
			//c:\\down\\2019\\06\\11\\jdk.exe ��ο� ���丮�� ������ ���丮 �� ������ �������ش�.
			fos = new FileOutputStream("c:\\down\\2019\\06\\11\\jdk.exe");
			
/*			//������ 3�� �߿�	�����ϰ� �ܿ���
			//-1�� �ƴϸ� 1����Ʈ�� �а� ����
			int readByte = 0;
			//fin.read() �ż���� �� ����Ʈ�� �д´�.
			//���� ���̻� ���� ����Ʈ�� ������ -1�� ��ȯ�Ѵ�
			while((readByte = fin.read()) !=-1){
				//fos.writer(readByte) �ż���� �� ����Ʈ�� ��
				fos.write(readByte);
			}*/
			
			//����Ʈ�� �迭�� �ٲ㼭 ����
			int readByte = 0;
			int readByteCnt = 0;
			byte [] b = new byte [1024*40];
			while ((readByteCnt = fin.read(b)) != -1) {
				fos.write(b,0,readByteCnt);
			}
			long start = System.currentTimeMillis();
			System.out.println("����ð�: "+(end-start));
					
				
			
		} catch (FileNotFoundException e) {
			
			e.printStackTrace();
		} catch (IOException e) {
				
				e.printStackTrace();
		}finally{
			try{
				if(fin != null) fin.close();
				if(fos != null) fos.close();
			}catch (IOException e) {
				e.printStackTrace();
			}
		}

	}

}
