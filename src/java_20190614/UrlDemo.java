package java_20190614;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.MalformedURLException;

public class UrlDemo {
	public static void main (String [] args) throws IOException{

	URL url = new URL(
			"https://sports.news.naver.com/kbaseball/news/read.nhn?oid=109&aid=0004029269");
	String protocol = url.getProtocol();
	String host = url.getHost();
	int port = url.getPort();
	String path = url.getPath();
	String query = url.getQuery();
	String ref = url.getRef();
	
	System.out.println("protocol : "+protocol);
	System.out.println("host : "+host);
	System.out.println("port : "+ port);
	System.out.println("path : "+ query);
	System.out.println("query : "+ query);
	System.out.println("ref : "+ref);
	
	
	
	//페이지 소스보기 
	InputStream in = url.openStream();
	
	BufferedReader br = new BufferedReader (new InputStreamReader (in, "utf-8"));
	String readLine = null ;
	while((readLine = br.readLine()) != null){
		System.out.println(readLine);
		
	}	
	
	}
}
