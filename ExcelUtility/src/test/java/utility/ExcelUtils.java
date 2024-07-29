package utility;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelUtils {

	public static void main(String[] args) {
		getRowCount();
		getCellData();
	}

	public static void getRowCount() {	   
		try {
			String excelPath ="./Data/InputData.xlsx";
			XSSFWorkbook workbook = new XSSFWorkbook(excelPath);
			XSSFSheet sheet =workbook.getSheet("Sheet1");
			int rowCount=sheet.getPhysicalNumberOfRows();
			System.out.println("Total no of rows  :"+rowCount);
		}
		catch (Exception exp) {
			System.out.println(exp.getCause());
			exp.getStackTrace();
			System.out.println(exp.getMessage());

		}
	}


	public static void getCellData() {
		try {
			String excelPath ="./Data/InputData.xlsx";
			XSSFWorkbook workbook = new XSSFWorkbook(excelPath);
			XSSFSheet sheet =workbook.getSheet("Sheet1");
			System.out.println(sheet.getRow(1).getCell(0));
		}
		catch (Exception exp) {
			System.out.println(exp.getCause());
			exp.getStackTrace();
			System.out.println(exp.getMessage());

		}


	}
}
