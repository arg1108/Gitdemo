package Pageobject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LandingPage {

	
	public WebDriver driver;
	By SignIn =By.cssSelector("a[href*='sign_in']");
	By Tittle =By.xpath("//*[@id=\"content\"]/div/div/h2");
	By Menu =By.cssSelector("#homepage > header > div.navbar.navbar-default.navbar-static-top > div > nav");
	
	
	public LandingPage(WebDriver driver) {
		
		// TODO Auto-generated constructor stub
		this.driver =driver;
	}

	

	public WebElement getLogin()
	{
		return driver.findElement(SignIn);
	}
	public WebElement getTitles()
	{
		return driver.findElement(Tittle);
	}
	
	public WebElement getNavigation()
	{
		return driver.findElement(Menu);
	}
}
