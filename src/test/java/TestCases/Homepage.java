package TestCases;

import java.io.IOException;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import Pageobject.LandingPage;
import Pageobject.LoginPage;
import resouces.BaseClass;

public class Homepage extends BaseClass {

@Test(dataProvider ="getData")
public void pagenavigation(String username, String Password) throws IOException
{
	driver =initilizeDriver();
	driver.get("http://www.qaclickacademy.com/");
	LandingPage pg = new LandingPage(driver);
	pg.getLogin().click();
	LoginPage lp = new LoginPage(driver);
	lp.getEmail().sendKeys(username);
	lp.getPasswod().sendKeys(Password);
	lp.getlogged().click();
	
	
}
	@DataProvider
	public Object[][] getData()
	{
		Object[][] data = new Object[1][2];
		data[0][0] ="agarg.eng@gmail.com";
		data[0][1] ="122345";
		return data;
	}
}
