package TestCases;

import java.io.IOException;

import org.apache.logging.log4j.LogManager;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import org.testng.log4testng.Logger;

import Pageobject.LandingPage;
import Pageobject.LoginPage;
import resouces.BaseClass;

public class Validatetest extends BaseClass {

public static Logger log = (Logger)LogManager.getLogger(BaseClass.class.getName());
@Test
public void pagenavigation() throws IOException
{
	driver =initilizeDriver();
	driver.get("http://www.qaclickacademy.com/");
	LandingPage pg = new LandingPage(driver);
	//Assert.assertEquals(pg.getTitles().getText(), "FEATURED COURSES");
	//public static Logger logs = LogManager.getLogger(Validatetest.class.getName());
	log.info("This is sucessfull message");

	
	
}
}