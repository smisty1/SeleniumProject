package readExcel;

import java.io.IOException;


import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;


public class How_to_Print_all_values_from_Excel{

	public static void main(String[] args) throws IOException {
	

		
		//Open/Enter the Workbook
		XSSFWorkbook wb = new XSSFWorkbook ("./Data/ReadData.xlsx");
		
		//**Get Sheet
		XSSFSheet sheet = wb.getSheet("Sheet1");
		

        //Get row count code-

		int rowCount = sheet.getLastRowNum();
		System.out.println(rowCount);
		
		//Get column count code- 
		int columnCount = sheet.getRow(0).getLastCellNum();
		System.out.println(columnCount);
		
		

for (int i = 1; i <= rowCount; i++) {
			
// Get row
XSSFRow row = sheet.getRow(i);

for (int j = 0; j < columnCount; j++) { 
	
	// Get column
	XSSFCell cell = row.getCell(j); //column 2
	
	// Actions -> Read value
	String Svalue = cell.getStringCellValue();


	System.out.println(Svalue);
}


}


		} 

		
	}
		
