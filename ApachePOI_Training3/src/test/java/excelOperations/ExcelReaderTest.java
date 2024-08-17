package excelOperations;

import java.io.FileInputStream; 
import java.io.FileOutputStream;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelReaderTest {
	String filePath;
	String fullPath;
	XSSFWorkbook workbook;
	XSSFSheet sheet;
	XSSFRow row;
	FileInputStream fileIn = null; // actual reading of the data from the files
	FileOutputStream fileOut = null;// actual writing/adding of the data in the file
	int rowCount = 0;
	int columnCount = 0;

	public void getData(String filePath, String excelName, String sheetName, int rowNumber) {
		this.filePath = filePath; // global var = local var
		fullPath = filePath + excelName;
		try {
			fileIn = new FileInputStream(fullPath);
			workbook = new XSSFWorkbook(fileIn);
			sheet = workbook.getSheet(sheetName);
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
