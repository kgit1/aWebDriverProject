package lib;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelReader {
	// FileInputStream obtains input bytes from a file in a file system
	private FileInputStream inputFile = null;

	// object for excel file
	private XSSFWorkbook workbook = null;

	// object for excel file's sheet
	private XSSFSheet sheet = null;

	// object for excel file's sheet's row
	private XSSFRow row = null;

	// path to file
	private String path = null;

	// constructor
	public ExcelReader() throws IOException {
		// path
		// path = System.getProperty("user.dir") + "\\testData\\testData.xlsx";
		path = "D:\\J\\workspace\\aWebDriverProject\\testData\\testData.xlsx";

		// stream from file
		inputFile = new FileInputStream(path);

		// workbook
		workbook = new XSSFWorkbook(inputFile);

		// first sheet of workbook
		sheet = workbook.getSheetAt(0);
	}

	// method gets sheetNmae and returns number of rows on the sheet
	public int getSheetRows(String sheetName) {
		// index of the sheet in the excel file, return -1 if incorrect name
		int index = workbook.getSheetIndex(sheetName);
		// sheet from file by index of the sheet
		sheet = workbook.getSheetAt(index);

		// getLasRow returns index of last row and we add +1 to get count of
		// rows, because index count starts from 0
		return sheet.getLastRowNum() + 1;
	}

	public int getSheetColumns(String sheetName) {
		// index of the sheet in the excel file, return -1 if incorrect name
		int index = workbook.getSheetIndex(sheetName);
		// sheet from file by index of the sheet
		sheet = workbook.getSheetAt(index);
		// get first row of the sheet
		row = sheet.getRow(0);

		// getLastCellNumreturns index of last cell in the row and we add +1 to
		// get count of columns, because index count starts from 0
		return row.getLastCellNum() + 1;
	}

	public static void main(String[] args) throws IOException {
		ExcelReader reader = new ExcelReader();
		System.out.println("LoginTest rows " + reader.getSheetRows("LoginTest"));
		System.out.println("SignInTest rows " + reader.getSheetRows("SignUpTest"));

		System.out.println("LoginTest columns " + reader.getSheetColumns("LoginTest"));
		System.out.println("SignUpTest columns " + reader.getSheetColumns("LoginTest"));
	}

}
