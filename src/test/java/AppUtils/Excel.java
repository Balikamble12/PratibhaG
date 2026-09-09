package AppUtils;

import java.io.FileInputStream;
import java.util.Properties;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Excel {
	public String getExcelData(String filepath, String Sheetname, int rownumber, int columnnumber ) {
	try{
		FileInputStream fis= new FileInputStream(filepath);
		Workbook wb= new XSSFWorkbook(fis);
	Sheet sheetdata= wb.getSheet(Sheetname);
		Row rowdata= sheetdata.getRow(rownumber);
		Cell columndata= rowdata.getCell(columnnumber);
		String empname= columndata.getStringCellValue();
		 wb.close();
         fis.close();
		return empname;
		
}	
	catch(Exception e) {
		e.getMessage();
		return null;
	}
	
	}
	
}