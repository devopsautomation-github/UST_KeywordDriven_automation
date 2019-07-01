package excel_Interaction;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadExcelKeywords {

	public Sheet readExcel(String filepath, String fileName, String sheetName) throws IOException {

		File file = new File(filepath + fileName);
		FileInputStream inputstream = new FileInputStream(file);

		Workbook workbook = null;
		workbook = new XSSFWorkbook(inputstream);
		Sheet sheet = workbook.getSheet(sheetName);

		return sheet;

	}

}
