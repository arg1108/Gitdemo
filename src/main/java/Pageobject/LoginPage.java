package Pageobject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage {

	public WebDriver driver;
	
	public LoginPage(WebDriver driver) {
		// TODO Auto-generated constructor stub
this.driver=driver;
	}
	
	By Email =By.id("user_email");
	By Password = By.id("user_password");
	By Signin = By.xpath("//input[@type ='submit']");
	
	
	public  WebElement getEmail()
	{
	return driver.findElement(Email);
	}
	public WebElement getPasswod()
	{
		return driver.findElement(Password);
	}
	public WebElement getlogged()
	{
		return driver.findElement(Signin);
	}
}
