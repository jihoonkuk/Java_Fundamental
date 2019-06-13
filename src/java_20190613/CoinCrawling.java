package java_20190613;

import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class CoinCrawling {

	public static void main(String[] args) {
		   
		   Workbook wb = new HSSFWorkbook();
		   Sheet sheet = wb.createSheet("빗코");
		    if( sheet == null ){
		      /*test*/System.out.println("Sheet1 is Null!");
		      return;
		      
		
		String url = "https://coinmarketcap.com/currencies/ethereum/historical-data/?start=20170514&end=20190613";
		Document doc = null;
	
		try {

			doc = Jsoup.connect(url).get();
		} catch (IOException e) {
	
		//headElements는 타이틀 정보 가져오기 위한 Elements
		Elements headElements = doc.select(
				".table-responsive .table thead tr");
		//bodyElements는 실데이터 정보를 가져오기 위한 Elements
		Elements bodyElements = doc.select(
				".table-responsive .table tbody tr");
		
		for (int i = 0; i < headElements.size(); i++){
		      Row row = sheet.createRow(0);
		      Cell cell = row.createCell(0);
		      cell.setCellValue("테스트 데이터");
		      
		}
					
		

		}
		}
	
}
