package java_20190617;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class SeverSocketScanDemo extends Thread{
	
	@Override
	public void run() {
		ServerSocket s = null;
		for(int i=0;i<65535;i++){
			try{
				//ServerSocket Ŭ������ �ش� ������ port ��ȣ�� ����Ҽ������� ServerSocket ��ü�� �����Ҽ��ְ�. ���ܸ� �߻��ϴ� ���� �ش� port�� ����ϴ� ����̴�.
				s= new ServerSocket(i);
				
				Socket socket = s.accept();
				
			} catch (IOException e){
				System.out.println(i+"��ȣ�� ����Ҽ������ϴ�");
			}
		}
	
	}
	public static void main(String[] args) {
		SeverSocketScanDemo s= new SeverSocketScanDemo();
		s.start();
	}

}
