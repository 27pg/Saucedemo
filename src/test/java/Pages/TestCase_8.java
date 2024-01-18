package Pages;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import Tests.login;
import io.github.bonigarcia.wdm.WebDriverManager;

public class TestCase_8 {
	public WebDriver driver;


	@BeforeTest
	public void BeforeTest() throws InterruptedException
	{
		WebDriverManager.chromedriver().setup();
		  driver = new ChromeDriver(); 
		  driver.manage().window().maximize(); 
		  Thread.sleep(3000);
		  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		  driver.get("https://www.saucedemo.com/"); 
	}
	@Test
		public void Test() throws InterruptedException
		{
			login log=new login(driver);
			log.username();
			log.password();
			log.loginbtn();
			log.addProduct1();
			log.cartBtn();
			log.continueshop();
			log.menubtn();
			log.logout();					
		}
	@AfterTest
	public void AfterTest() throws InterruptedException
	{
		  driver.quit();
	}
}
