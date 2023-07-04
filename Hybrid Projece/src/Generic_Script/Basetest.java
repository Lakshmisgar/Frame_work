package Generic_Script;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import Genric_POM.aftermethod;
import Genric_POM.beforemethod;

public class Basetest implements Framework_constant
{
	public WebDriver driver;
	@BeforeMethod
	public void Openapp()
	{ 
		System.setProperty(chrome_keys,chrome_value);
	    WebDriver driver=new ChromeDriver();
	    driver.manage().window().maximize();
	    driver.get(base_url);
	    driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	    }
	@AfterMethod
	public void Closeapp()
	{
		driver.close();
	}
	}
}