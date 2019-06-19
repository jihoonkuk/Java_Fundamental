package java_20190617.echoclient;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.UnknownHostException;

public class EchoClient1 {
	private String ip;
	private int port;
	private Socket socket;

	public EchoClient1(String ip, int port) {
		this.ip = ip;
		this.port = port;

		try {
			// 3.4. ㅋ,ㄹ라이언트Socket객처를 생성한다
			socket = new Socket(ip, port);
			
			//4.5 서버와 TCP 커넥션이 만들어지면서 서버와 통신할수있는 Socket 객체가 생성된다
			
			//6.서버에 메세지를 보낸다.
			OutputStream out = socket.getOutputStream();
			OutputStreamWriter osw = new OutputStreamWriter(out);
			BufferedWriter bw = new BufferedWriter(osw);
			bw.write("asfasf");
			bw.newLine();
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
		new EchoClient1 ("192.168.0.159", 3001);
	}

}
