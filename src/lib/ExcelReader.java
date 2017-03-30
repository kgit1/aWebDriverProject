package lib;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelReader {
	// FileInputStream obtains input bytes from a file in a file system
	private FileInputStream inputStream = null;

	// A file output stream is an output stream for writing data to a File or to
	// a FileDescriptor
	private FileOutputStream outputStream = null;

	// object for excel file
	private XSSFWorkbook workbook = null;

	// object for excel file's sheet
	private XSSFSheet sheet = null;

	// object for excel file's sheet's row
	private XSSFRow row = null;

	// object for excel file's sheet's row's cell
	private XSSFCell cell = null;

	// path to file
	private String path = null;

	// constructor
	public ExcelReader() throws IOException {
		// path
		// path = System.getProperty("user.dir") + "\\testData\\testData.xlsx";
		path = "D:\\J\\workspace\\aWebDriverProject\\testData\\testData.xlsx";

		// stream from file
		inputStream = new FileInputStream(path);

		// workbook
		workbook = new XSSFWorkbook(inputStream);

		// first sheet of workbook
		sheet = workbook.getSheetAt(0);
	}

	// method gets sheetName and provides number of rows on the sheet
	public int getSheetRows(String sheetName) {
		// index of the sheet in the excel file, return -1 if incorrect name
		int index = workbook.getSheetIndex(sheetName);
		// sheet from file by index of the sheet
		sheet = workbook.getSheetAt(index);

		// getLasRow returns index of last row and we add +1 to get count of
		// rows, because index count starts from 0
		return sheet.getLastRowNum() + 1;
	}

	// method gets sheetName and provides number of columns on the sheet
	public int getSheetColumns(String sheetName) {
		// index of the sheet in the excel file, return -1 if incorrect name
		int index = workbook.getSheetIndex(sheetName);
		// index of the sheet in the excel file, return -1 if incorrect name
		sheet = workbook.getSheetAt(index);
		// get first row of the sheet
		row = sheet.getRow(0);

		// getLastCellNumreturns index of last cell in the row and we add +1 to
		// get count of columns, because index count starts from 0
		return row.getLastCellNum() + 1;
	}

	// method gets sheetName, column and row number and provides value of the
	// certain cell
	public String getCellData(String sheetName, int columnNumber, int rowNumber) {
		// index of the sheet in the excel file, return -1 if incorrect name
		int index = workbook.getSheetIndex(sheetName);
		// index of the sheet in the excel file, return -1 if incorrect name
		sheet = workbook.getSheetAt(index);
		// get row of the sheet
		row = sheet.getRow(rowNumber);
		// get cell of the row
		cell = row.getCell(columnNumber);

		// return cell's string value
		return cell.getStringCellValue();
	}

	// method gets sheetName, column and row number and provides value of the
	// certain cell
	public String getCellData(String sheetName, String colName, int rowNumber) {
		// index of the sheet in the excel file, return -1 if incorrect name
		int index = workbook.getSheetIndex(sheetName);
		// index of the sheet in the excel file, return -1 if incorrect name
		sheet = workbook.getSheetAt(index);

		for (int i = 0; i < getSheetColumns(sheetName); i++) {
			// get row of the sheet
			row = sheet.getRow(0);
			// get cell of the row
			cell = row.getCell(i);
			if (cell.getStringCellValue().equals(colName)) {
				row = sheet.getRow(rowNumber);
				cell = row.getCell(i);
				return cell.getStringCellValue();
			}
		}
		return null;
	}

	public void setCellData(String sheetName, String newData, int columnNumber, int rowNumber) {
		// index of the sheet in the excel file, return -1 if incorrect name
		int index = workbook.getSheetIndex(sheetName);
		// index of the sheet in the excel file, return -1 if incorrect name
		sheet = workbook.getSheetAt(index);
		// get row of the sheet
		row = sheet.getRow(rowNumber);
		System.out.println("workbook: " + workbook);
		System.out.println("sheet: " + sheet);
		System.out.println("row: " + rowNumber);
		System.out.println("row: " + row);
		// create cell object of the row
		cell = row.createCell(columnNumber);
		// set value to cell object
		cell.setCellValue(newData);

		try {
			// Creates a file output stream to write to the file with the
			// specified name
			outputStream = new FileOutputStream(path);
			// write data stream to excel file
			workbook.write(outputStream);
			// close stream
			outputStream.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public static void main(String[] args) throws IOException {
		ExcelReader reader = new ExcelReader();
		// System.out.println("LoginTest rows " +
		// reader.getSheetRows("LoginTest"));
		// System.out.println("SignInTest rows " +
		// reader.getSheetRows("SignUpTest"));
		//
		// System.out.println("LoginTest columns " +
		// reader.getSheetColumns("LoginTest"));
		// System.out.println("SignUpTest columns " +
		// reader.getSheetColumns("LoginTest"));
		//
		// System.out.println("Cell 0 1: " + reader.getCellData("LoginTest", 0,
		// 1));
		// System.out.println("Cell 1 1: " + reader.getCellData("LoginTest", 1,
		// 1));
		//
		// System.out.println(reader.getCellData("LoginTest", "password", 2));
		// System.out.println(reader.getCellData("SignUpTest", "firstname", 1));

		reader.setCellData("LoginTest", "newLogin1", 0, 2);
		reader.setCellData("LoginTest", "newPassword1", 1, 2);

	}

}
