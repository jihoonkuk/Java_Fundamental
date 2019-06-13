package java_20190613;

import java.io.IOException;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class JtbcNewsCrawling {
	public static void main(String[] args) {
		String url = "http://www.imbc.com/";
		
		//전체 HTML문서를 관리하기 위한 객체
		Document doc = null;
		
		try {
			
			//url주소에 get 방식으로 접근
			doc = Jsoup.connect(url).get();
		} catch (IOException e) {

		}
		Elements elements = doc.select(".con-wrap.notice-wrap");
		
		String title = elements.select("h3").text();
		System.out.println(title);
		
		Elements element = elements.select("li	");
		//System.out.println(elements.text());
		
		for (Element temp: elements.select("li")){
			System.out.println(temp.text());
			
			
		}
	}
}



