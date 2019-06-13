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
		   Sheet sheet = wb.createSheet("����");
		    if( sheet == null ){
		      /*test*/System.out.println("Sheet1 is Null!");
		      return;
		      
		
		String url = "https://coinmarketcap.com/currencies/ethereum/historical-data/?start=20170514&end=20190613";
		Document doc = null;
	
		try {

			doc = Jsoup.connect(url).get();
		} catch (IOException e) {
	
		//headElements�� Ÿ��Ʋ ���� �������� ���� Elements
		Elements headElements = doc.select(
				".table-responsive .table thead tr");
		//bodyElements�� �ǵ����� ������ �������� ���� Elements
		Elements bodyElements = doc.select(
				".table-responsive .table tbody tr");
		
		for (int i = 0; i < headElements.size(); i++){
		      Row row = sheet.createRow(0);
		      Cell cell = row.createCell(0);
		      cell.setCellValue("�׽�Ʈ ������");
		      
		}
					
		

		}
		}
	
}
