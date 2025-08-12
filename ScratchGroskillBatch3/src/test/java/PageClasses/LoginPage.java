package PageClasses;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import Utilities.FetchDataFromExcel;

public class LoginPage {
	
	public static String enterUserID()
	{
		String uid="//input[@name='uid']";
		return uid;
	}
	
	
	public static String enterPassword()
	{
		String password="//input[@name='password']";
		return password;
	}
	
	public static String loginBtn()
	{
		String loginbtn="//input[@name='btnLogin']";
		return loginbtn ;
	}
	
	
	
	
	
	

}
