import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadingFromExcel {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		
		
		
		
		FileInputStream fi = new FileInputStream("C:\\Users\\HP\\OneDrive\\Desktop\\ExcelReading\\file.xlsx");

		XSSFWorkbook workbook = new XSSFWorkbook(fi);
		XSSFSheet sheet = workbook.getSheetAt(0);
		
		/*Row row0 = sheet0.getRow(0);
		
		Cell cella = row0.getCell(0);
		System.out.println(cella);
		
		*/
		
		for (int rows=0; rows<10; rows++) {
			
			Row row = sheet.getRow(rows);
			
			for (int cols=0;cols<10;cols++) {
				
				
			Cell cell =	row.getCell(cols);
			
	
			System.out.print(cell.getNumericCellValue()+"\t");
			
			}
			
			System.out.println(" ");
			
			
		}
		
		
		
		fi.close();

	}

}
