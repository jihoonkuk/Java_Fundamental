package java_20190613;
import java.awt.List;
import java.io.File;
import java.io.FileOutputStream;
import java.util.HashMap;
import java.util.Map;

import org.apache.poi.ss.usermodel.CellStyle;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Calendar;
import java.util.Date;

import org.apache.poi.hssf.util.HSSFColor;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellStyle;
import org.apache.poi.ss.usermodel.CreationHelper;
import org.apache.poi.ss.usermodel.Font;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.xssf.streaming.SXSSFWorkbook;



public class CoinExcel {



   public static void main(String[] args) {
	   
	   
	   Workbook wb = new HSSFWorkbook();
	   Sheet sheet = wb.createSheet("First sheet");
	    if( sheet == null ){
	      /*test*/System.out.println("Sheet1 is Null!");
	      return;
	      Row row = sheet.createRow(0);
	      Cell cell = row.createCell(0);
	      cell.setCellValue("테스트 데이터");
	    }
   }
}