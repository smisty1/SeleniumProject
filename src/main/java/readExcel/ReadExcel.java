package readExcel;

import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadExcel {

	public static void main(String[] args) throws IOException {
		
//Open/Enter the Workbook
		
//Create obj(wb) of wrokbook - XSSFWorkbook wb= new XSSFWorkbook();
		
//Then locate the path of data. To go any data under the project 
///we have to use project path that is " ./ "
//Then type folder (data) name "Data"
//After that type the file name with extension  
//that is workbook name "ReadExcel.xlsx" here, xlsx is extension.
		
	//	so Here.   "./Data/ReadExcel.xlsx"
		
		//Open/Enter the Workbook
		XSSFWorkbook wb = new XSSFWorkbook ("./Data/ReadData.xlsx"); 
		
		
		//Get Sheet
		XSSFSheet sheet = wb.getSheet("Sheet1");
		
		//Get row
		XSSFRow row = sheet.getRow(2);
				
		//Get column 
		XSSFCell cell = row.getCell(1);
		XSSFCell cell1 = row.getCell(2);
		XSSFCell cell2 = row.getCell(3);
		
				
		//Action- Read/print particular CellValue
		String Svalue = cell.getStringCellValue();
		System.out.println(Svalue);
		
		String Svalue1 = cell1.getStringCellValue();
		System.out.println(Svalue1);
		
		String Svalue2 = cell2.getStringCellValue();
		System.out.println(Svalue2);
		
		

	
	}

}
