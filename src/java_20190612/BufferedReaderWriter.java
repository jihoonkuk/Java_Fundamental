package java_20190612;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class BufferedReaderWriter {
	public static void main(String[] args) {
		FileReader fr = null;
		BufferedReader br= null;
		FileWriter fw= null;
		BufferedWriter bw = null;
		try {
			fr = new FileReader("c:\\down\\HelloWorld.java");
			br = new BufferedReader (fr);
			fw = new FileWriter ("c:\\down\\2019\\HelloWorld.java");
			bw = new BufferedWriter (fw);
			String readLine = null;
			
			//br.readLine()은 개행을 포함하지 않은 한줄을 반환한다.
			while ((readLine = br.readLine()) != null) {
				bw.write(readLine);
				bw.newLine();
			}
			bw.flush();
		} catch (IOException e) {
			// TODO: handle exception
		} finally {
			try {
				if (fr != null) fr.close();
				if (br != null) br.close();
				if (fw != null) fw.close();
				if (bw != null) bw.close();
			} catch (Exception e2) {
				// TODO: handle exception
				e2.printStackTrace();
			}
		}
	}

}
