package task1;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;


public class Filelib 
{

	public void toExcelSheet(String sheetName, int rowNum, int colNum, String value1) throws EncryptedDocumentException, IOException 
	{
		
		FileInputStream fis = new FileInputStream("./data/TestDataSheet.xls");
		Workbook wb = WorkbookFactory.create(fis);
		Sheet sh = wb.getSheet(sheetName);
		Row row = sh.createRow(rowNum);
		Cell cel=row.createCell(colNum);
		cel.setCellValue(value1);
		FileOutputStream fos=new FileOutputStream("./data/TestDataSheet.xls");
		wb.write(fos);
		wb.close();
		// TODO Auto-generated method stub
		
	}

}
