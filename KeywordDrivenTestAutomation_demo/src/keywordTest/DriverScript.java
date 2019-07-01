package keywordTest;

public class DriverScript {

	public static void main(String[] args) throws Exception {

		String path = "C:\\Users\\user\\eclipse-workspace\\KeywordDrivenTestAutomation_demo\\ActionKeywordsTestData.xlsx";

		ReadExcelData.setExcelFile(path, "Sheet1");

		for (int iRow = 1; iRow <= 8; iRow++) {

			String sActions = ReadExcelData.getCellData(iRow, 1);

			// compare the keywords - getting fro excel file
			if (sActions.equalsIgnoreCase("openBrowser")) {

				ActionKeyword.openBrowser();

			} else if (sActions.equalsIgnoreCase("navigate")) {
				ActionKeyword.navigate();
			} else if (sActions.equalsIgnoreCase("input_userName")) {
				ActionKeyword.input_userName();
			} else if (sActions.equalsIgnoreCase("WaitTime")) {
				ActionKeyword.WaitTime();
				;
			} else if (sActions.equalsIgnoreCase("input_password")) {
				ActionKeyword.input_password();
			} else if (sActions.equalsIgnoreCase("click_login")) {
				ActionKeyword.click_login();
			} else if (sActions.equalsIgnoreCase("verifyLogin")) {
				ActionKeyword.verifyLogin();
			} else if (sActions.equalsIgnoreCase("closebrowser")) {
				ActionKeyword.closeBrowser();
			}

		}

	}

}
