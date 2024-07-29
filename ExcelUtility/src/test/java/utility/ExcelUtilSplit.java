package utility;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelUtilSplit {

	static XSSFSheet sheet;
	static XSSFWorkbook workbook;

	public  ExcelUtilSplit(String excelPath,String sheetName ) {
		try {
			workbook = new XSSFWorkbook(excelPath);
			sheet =workbook.getSheet(sheetName);

		}
		catch (Exception exp) {
			System.out.println(exp.getCause());
			exp.getStackTrace();
			System.out.println(exp.getMessage());

		}
	}


	public static void getRowCount() {	   

		int rowCount=sheet.getPhysicalNumberOfRows();
		System.out.println("Total no of rows  :"+rowCount);
	}


	public static void getCellData(int rowNum,int colNum) {

		System.out.println(sheet.getRow(rowNum).getCell(colNum));
	}

}
