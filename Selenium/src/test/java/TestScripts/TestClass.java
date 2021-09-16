package TestScripts;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestClass {
	
	WebDriver driver;
	
	public String url = "https://www.google.com/";
	
	@Test
	public void test() {
	System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\selenium-chrome-driver\\3.141.59\\chromedriver.exe");
	driver = new ChromeDriver();
	
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	driver.manage().window().maximize();
	
	driver.get(url);
	
	String Title = driver.getTitle();
	
	System.out.println("asa"+Title);
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
