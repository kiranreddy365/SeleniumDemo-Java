package pkg;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class SeleniumDemo {
	
	WebDriver driver;
	String URL="https://www.google.com/";
	//comment added 
	@BeforeClass
	public void setup()
	{
		System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
		driver=new ChromeDriver();
		driver.get(URL);
		System.out.println("Browser lunched.");
	}
	
	
	@Test
	public void test1()
	{
		System.out.println("Test1 executed.");
	}
	
	@Test
	public void test2()
	{
		System.out.println("Test2 executed.");
	}
	
	@Test
	public void test3()
	{
		System.out.println("Test3 executed.");
	}
	
	@AfterClass
	public void tearDown()
	{
		driver.quit();
		System.out.println("Browser closed.");
	}
	

}
