package excelOperations;

import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class CreatingExcelSheet {
	private static XSSFWorkbook workbook = new XSSFWorkbook();
	private static XSSFSheet sheet = workbook.createSheet();
	private static XSSFRow row;

	public static void setRows(int rowNumber) {
		row = sheet.createRow(rowNumber);
	}

	public static void setCellsAndDays(int rowData, String dayNumber) {
		row.createCell(rowData).setCellValue(dayNumber);
	}

	public static void main(String[] args) throws IOException {

		System.out.println("Hello World ");

		FileOutputStream file = new FileOutputStream(System.getProperty("user.dir") + "//testdata//myExcelSheet.xlsx");
		setRows(0);
		setCellsAndDays(0, "Day1");
		setCellsAndDays(1, "Day2");
		setCellsAndDays(2, "Day3");
		setRows(1);
		setCellsAndDays(0, "Test1");
		setCellsAndDays(1, "Test2");
		setCellsAndDays(2, "Test3");
		workbook.write(file);

	}
}
