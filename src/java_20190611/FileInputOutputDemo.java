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
			
			
			
			//c:\\down\\jdk.exe 경로에 파일이 없으면 FileNotFoundException 예외를 발생시킨다.
			fin = new FileInputStream("c:\\down\\jdk.exe");
			//c:\\down\\2019\\06\\11\\jdk.exe 경로와 디렉토리가 없으면 디렉토리 및 파일을 생성해준다.
			fos = new FileOutputStream("c:\\down\\2019\\06\\11\\jdk.exe");
			
/*			//밑으로 3줄 중요	이해하고 외우자
			//-1이 아니면 1바이트씩 읽고 쓰자
			int readByte = 0;
			//fin.read() 매서드는 한 바이트씩 읽는다.
			//만약 더이상 읽을 바이트가 없으면 -1을 반환한다
			while((readByte = fin.read()) !=-1){
				//fos.writer(readByte) 매서드는 한 바이트씩 씀
				fos.write(readByte);
			}*/
			
			//바이트를 배열로 바꿔서 쓴다
			int readByte = 0;
			int readByteCnt = 0;
			byte [] b = new byte [1024*40];
			while ((readByteCnt = fin.read(b)) != -1) {
				fos.write(b,0,readByteCnt);
			}
			long start = System.currentTimeMillis();
			System.out.println("경과시간: "+(end-start));
					
				
			
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
