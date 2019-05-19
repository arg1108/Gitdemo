package resouces;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;
import java.util.logging.LogManager;

import org.apache.tools.ant.types.resources.selectors.Type;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.log4testng.Logger;

public class BaseClass {
	public WebDriver driver;
	public Properties prop;

	//public static Object log = LogManager.getLogger(BaseClass.class.getName());
	
	public WebDriver initilizeDriver() throws IOException
	{
		Properties prop = new Properties();
		FileInputStream fis = new FileInputStream("C:\\Users\\erast\\FrameworkPack\\src\\main\\java\\resouces\\data.properties");
		prop.load(fis);
		String browserName =prop.getProperty("browser");
	//	String URLname = prop.getProperty("URL");
		
		
		
		if(browserName.equals("chrome"))
		{
			System.setProperty("webdriver.chrome.driver", "C://Program Files//chromedriver.exe");
driver = new ChromeDriver();
		}
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		return driver;
	}

	
	public void getScreenshot() throws IOException
	{
	
		driver.manage().window().maximize();
   		driver.get("https://www.google.com");
   	File src1 =	((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
   	FileUtils.copyFile(src1, new File ("C:\\Users\\erast\\Desktop\\creenshot.png"));
		
	
		
   	
	}
}

