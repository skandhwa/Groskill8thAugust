package TestClasses;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import PageClasses.LoginPage;
import Utilities.DriverInitialization;
import Utilities.FetchDataFromExcel;

public class LoginTest extends DriverInitialization {
	
	
	static FetchDataFromExcel ex1=new FetchDataFromExcel();
	
	
	
	
	
	@Test
	public static void loginApplication() throws IOException
	{
		
		driver.findElement(By.xpath(LoginPage.enterUserID())).sendKeys(ex1.getValueExcel(1, 0));
		driver.findElement(By.xpath(LoginPage.enterPassword())).sendKeys(ex1.getValueExcel(1, 1));
		driver.findElement(By.xpath(LoginPage.loginBtn())).click();
		
	}
	
	
	
	
	
	

}
