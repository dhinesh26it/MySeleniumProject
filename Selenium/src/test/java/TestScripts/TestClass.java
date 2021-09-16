package TestScripts;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestClass {
	
	WebDriver driver;
	String Title,Url;
	public String url = "https://www.google.com/";
	
	@Test(priority=1)
	public void test() {
	System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\selenium-chrome-driver\\3.141.59\\chromedriver.exe");
	driver = new ChromeDriver();
	
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	driver.manage().window().maximize();
	
	driver.get(url);
	
	String Title = driver.getTitle();
	
	System.out.println(Title);
	}
	
	@Test(priority=2)
	public void AssertTitle() {
		
		Title = driver.getTitle();
		System.out.println("Method2"+Title);
		Assert.assertTrue(Title.equalsIgnoreCase("Google"));
	}

	@Test(priority=3)
	public void AssertURL() {
		
		Url = driver.getCurrentUrl();
		System.out.println("Method3"+Url);
		Assert.assertTrue(Url.contentEquals("https://www.google.com/"));
	}
	
	@BeforeTest
	public void beforeTest() {
		System.out.println("****Before Test****");
	}
	
	@AfterTest
	public void afterTest() {
		System.out.println("****DriverTerminated****");
		driver.quit();
		
	}

	

}
