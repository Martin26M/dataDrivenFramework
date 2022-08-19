import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;



public class WritingIntoExcel {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		
		
		
		XSSFWorkbook workbook = new XSSFWorkbook();
		
		XSSFSheet sheet0 = workbook.createSheet();
		
		
		/*
		XSSFRow row0 = sheet0.createRow(0);
		
		XSSFCell cellA = row0.createCell(0);
		XSSFCell cellB = row0.createCell(1);
		
		
		cellA.setCellValue("Martin");
		cellB.setCellValue("Mathew");*/
		
		
		for (int rows=0; rows<10;rows++) {
			
			XSSFRow row = sheet0.createRow(rows);
			
			for (int cols=0;cols<10;cols++) {
				
				XSSFCell cell = row.createCell(cols);
				cell.setCellValue((int)(Math.random()*100));
			}
			
			
		}
		
		FileOutputStream fo = new FileOutputStream("C:\\Users\\HP\\OneDrive\\Desktop\\ExcelReading\\file.xlsx");
		
		workbook.write(fo);
		
		fo.close();
		System.out.println("Done");
	}

}
