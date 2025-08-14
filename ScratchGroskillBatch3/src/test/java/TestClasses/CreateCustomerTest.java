package TestClasses;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import PageClasses.CreateCustomerPage;
import Utilities.CommonFunctions;
import Utilities.DriverInitialization;
import Utilities.FetchDataFromExcel;

public class CreateCustomerTest extends DriverInitialization  {
	public static String CustomerID;
	
	@DataProvider (name="registerpatientdata")
	public Object[][] dp1() {
        return new Object[][] {
            {"Harry", "17-05-1995", "Lajpat Nagar", "Delhi", "NCR", "700055", "9765423145","abygUmA"},
            {"John", "13-04-1993", "Bandra", "Mumbai", "Maharashtra", "300045", "8764423145","abygUmA"}
        };
    }
	
	
	@Test(dataProvider="registerpatientdata")
	
	
	public void createCustomer(String uname,String dob,String add,String city,String state,String pin,String mob,String pwd) throws IOException
	{
		
		LoginTest.loginApplication();
		driver.findElement(By.xpath(CreateCustomerPage.newCust())).click();
		driver.findElement(By.xpath(CreateCustomerPage.cusName())).sendKeys(uname);
		driver.findElement(By.xpath(CreateCustomerPage.gender())).click();
		driver.findElement(By.xpath(CreateCustomerPage.dOB())).sendKeys(dob);
		driver.findElement(By.xpath(CreateCustomerPage.address())).sendKeys(add);
		driver.findElement(By.xpath(CreateCustomerPage.city())).sendKeys(city);
		driver.findElement(By.xpath(CreateCustomerPage.state())).sendKeys(state);
		driver.findElement(By.xpath(CreateCustomerPage.pin())).sendKeys(pin);
		driver.findElement(By.xpath(CreateCustomerPage.mobile())).sendKeys(mob);
		driver.findElement(By.xpath(CreateCustomerPage.email())).sendKeys(CommonFunctions.generateRandomEmail());
		driver.findElement(By.xpath(CreateCustomerPage.password())).sendKeys(pwd);
		driver.findElement(By.xpath(CreateCustomerPage.submit())).click();
		CustomerID=driver.findElement(By.xpath(CreateCustomerPage.getCustId())).getText();
		FetchDataFromExcel.setValueExcel(2, 0, CustomerID);
	   
	   
		
		
		
		
	}
		
	
	
	

}
