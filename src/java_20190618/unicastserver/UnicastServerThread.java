package java_20190618.unicastserver;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.Socket;

public class UnicastServerThread implements Runnable {
	private Socket socket;

	public UnicastServerThread(Socket socket) {
		this.socket = socket;
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		boolean isStop = false;
		BufferedReader br = null;
		PrintWriter pw = null;
		try {
			InputStream in = socket.getInputStream();
			br = new BufferedReader(new InputStreamReader(socket.getInputStream()));

			OutputStream out = socket.getOutputStream();
			pw = new PrintWriter(new BufferedWriter(new OutputStreamWriter(out)), true);

		} catch (IOException e) {
			e.printStackTrace();
		}
		while(!isStop){
		try {
			
		try {
			if(br !=null) br.close();
			if(pw !=null) pw.close();
			if(socket !=null) socket.close();
		} catch (Exception e) {
			// TODO: handle exception
		}
		
			
				String readLine = br.readLine();
				if(readLine)
				System.out.println(readLine);
				pw.println(readLine);
			}

		} catch (IOException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}
}
