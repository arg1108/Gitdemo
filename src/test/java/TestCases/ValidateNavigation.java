package TestCases;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import Pageobject.LandingPage;
import Pageobject.LoginPage;
import resouces.BaseClass;

public class ValidateNavigation extends BaseClass {

@Test
public void pagenavigation() throws IOException
{
	driver =initilizeDriver();
	driver.get("http://www.qaclickacademy.com/");
	LandingPage pg = new LandingPage(driver);
	Assert.assertTrue(pg.getNavigation().isDisplayed());

	
	
}
}