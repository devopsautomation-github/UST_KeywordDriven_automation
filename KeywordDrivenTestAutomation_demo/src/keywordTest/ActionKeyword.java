package keywordTest;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;



public class ActionKeyword {

	public static WebDriver driver;

	public static void openBrowser() {

		System.setProperty("webdriver.chrome.driver", "E:\\software\\chromedriver.exe");
		driver = new ChromeDriver();

	}

	public static void navigate() {

		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("http://newtours.demoaut.com");

	}
	
	public static void input_userName() {

		driver.findElement(By.name("userName")).sendKeys("mercury");

	}
	
	public static void input_password() {

		driver.findElement(By.name("password")).sendKeys("mercury");

	}
	
	public static void click_login() {

		driver.findElement(By.name("login")).click();;

	}
	
	public static void WaitTime() throws Exception {

		Thread.sleep(4000);

	}
	
	public static void verifyLogin() {

		String pageTitle = driver.getTitle();
		Assert.assertEquals(pageTitle, "Find a Flight: Mercury Tours:", "verify the page title after login.");

	}
	
	public static void closeBrowser() {

		driver.quit();

	}

}
