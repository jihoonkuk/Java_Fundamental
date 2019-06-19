package java_20190617.echoclient;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.Socket;
import java.net.UnknownHostException;

public class EchoClient {
	private String ip;
	private int port;
	private Socket socket;

	public EchoClient(String ip, int port) {
		this.ip = ip;
		this.port = port;

		try {
			// 3.4. Socket 객체를 생성한다.
			socket = new Socket(ip, port);
			//7. 서버와 통신할수있는 소켓을 생성
			
			//8. 서버와 통신할수있는 in, out 스트림 생성
			
			OutputStream out = socket.getOutputStream();
			OutputStreamWriter osw= new OutputStreamWriter(out);
			BufferedWriter bw = new BufferedWriter(osw);
			bw.write("ssss");
			bw.newLine();
			//buffer에 안차면 안보내지기 때문에 flush를 써야된다
			bw.flush();
			
			InputStream in = socket.getInputStream();
			InputStreamReader isr = new InputStreamReader(in);
			BufferedReader br = new BufferedReader(isr);
			String readLine = br.readLine();
			System.out.println(readLine);
			
	
			
			
		} catch (UnknownHostException e) {
			// TODO: handle exception
			e.printStackTrace();
		} catch (IOException e) {
			// TODO: handle exception
			e.printStackTrace();
		}

	}

	public static void main(String[] args) {
		// new EchoClient("127.0.0.1", 3000);
		new EchoClient("192.168.0.159", 3000);

		//new EchoClient("192.168.0.164", 3000);
	}

}