package testCases;

import java.io.IOException;
import java.util.Properties;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import excel_Interaction.ReadExcelKeywords;
import operation.ReadObject;
import operation.UIOperations;

public class TestCaseExecute {
  
	
	@Test
  public void inputValidationCheck() throws Exception {
  
	System.setProperty("webdriver.chrome.driver", "E:\\software\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	
	ReadExcelKeywords file = new ReadExcelKeywords();
	ReadObject object = new ReadObject();
	
	Properties allObjects = object.getProperties();
	UIOperations operation = new UIOperations(driver);
	
	Sheet sheet = file.readExcel("C:\\Users\\user\\eclipse-workspace\\KeywordDrivenTestAutomation_demo2\\", "TestCase.xlsx", "KeywordFramework");
	
	
	for (int i = 1; i <= sheet.getLastRowNum(); i++) {
		Row row = sheet.getRow(i);
		if(row.getCell(0).toString().length() == 0) {
			System.out.println("Operation: " + row.getCell(1).toString() + " Object Name: "+ row.getCell(2).toString() + " Locator Type or Object Type: "+ row.getCell(3).toString() + " Value from cell: "+ row.getCell(4).toString());
			//We got the actions/methods from excel, now perform it on web driver
			operation.execute(allObjects, row.getCell(1).toString(), row.getCell(2).toString(), row.getCell(3).toString(), row.getCell(4).toString());
			Thread.sleep(2000);
		}
	}
	
	}
}
