package utility;

public class ExcelUtilTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String excelPath= "./Data/InputData.xlsx";
		String sheetName="Sheet1";

		ExcelUtilSplit excel = new ExcelUtilSplit(excelPath, sheetName);

		excel.getRowCount();
		excel.getCellData(1, 0);	
		excel.getCellData(1, 1);		
		excel.getCellData(1, 2);		
		excel.getCellData(1, 3);		
		excel.getCellData(1, 4);		
		excel.getCellData(1, 5);		
		excel.getCellData(1, 6);		

	}

}
