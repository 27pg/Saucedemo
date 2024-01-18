package Tests;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class login {
	WebDriver driver;
	
	public login(WebDriver d)
	{
	this.driver=d;	
	}
	public void username()
	{
		//driver.findElement(By.xpath("//input[@id='user-name']")).sendKeys("standard_user");
		WebDriverWait w = new WebDriverWait(driver,Duration.ofSeconds(10));
		w.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@id='user-name']")));
		driver.findElement(By.xpath("//input[@id='user-name']")).sendKeys("standard_user");
		
	}
	public void invalidUsername()
	{
		//driver.findElement(By.xpath("//input[@id='user-name']")).sendKeys("standard_user");
		WebDriverWait w = new WebDriverWait(driver,Duration.ofSeconds(10));
		w.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@id='user-name']"))).sendKeys("user");
		
	}
	public void invalidPassword()
	{
		WebDriverWait w = new WebDriverWait(driver,Duration.ofSeconds(10));
		w.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@id='password']"))).sendKeys("sauce");
		
	}
	
	public void password()
	{
		WebDriverWait w = new WebDriverWait(driver,Duration.ofSeconds(10));
		w.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@id='password']")));
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("secret_sauce");
		
	}
	public void loginbtn()
	{
		WebDriverWait w = new WebDriverWait(driver,Duration.ofSeconds(15));
		w.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@id='login-button']"))).click();
	}
	public void menubtn()
	{
		WebDriverWait w = new WebDriverWait(driver,Duration.ofSeconds(15));
		w.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[@id='react-burger-menu-btn']"))).click();
	}
	public void allItems()
	{
		WebDriverWait w = new WebDriverWait(driver,Duration.ofSeconds(15));
		w.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[@id='inventory_sidebar_link']"))).click();
	}
	public void logout()
	{
		WebDriverWait w = new WebDriverWait(driver,Duration.ofSeconds(15));
		w.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[@id='logout_sidebar_link']"))).click();
	}
	public void addProduct1()
	{
		WebDriverWait w = new WebDriverWait(driver,Duration.ofSeconds(15));
		w.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[@id='add-to-cart-sauce-labs-backpack']"))).click();
		
	}
	public void addProduct2()
	{
		WebDriverWait w = new WebDriverWait(driver,Duration.ofSeconds(15));
		w.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[@id='add-to-cart-sauce-labs-bike-light']"))).click();
	}
	public void addProduct3()
	{
		WebDriverWait w = new WebDriverWait(driver,Duration.ofSeconds(15));
		w.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[@id='add-to-cart-sauce-labs-bolt-t-shirt']"))).click();
	}
	public void addProduct4()
	{
		WebDriverWait w = new WebDriverWait(driver,Duration.ofSeconds(15));
		w.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[@id='add-to-cart-sauce-labs-fleece-jacket']"))).click();
	}
	public void addProduct5()
	{
		WebDriverWait w = new WebDriverWait(driver,Duration.ofSeconds(15));
		w.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[@id='add-to-cart-sauce-labs-onesie']"))).click();
	}
	public void addProduct6()
	{
		WebDriverWait w = new WebDriverWait(driver,Duration.ofSeconds(15));
		w.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[@id='add-to-cart-test.allthethings()-t-shirt-(red)']"))).click();
	}
	public void removeProduct1()
	{
		WebDriverWait w = new WebDriverWait(driver,Duration.ofSeconds(15));
		w.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[@id='remove-sauce-labs-backpack']"))).click();
	}
	public void removeProduct2()
	{
		WebDriverWait w = new WebDriverWait(driver,Duration.ofSeconds(15));
		w.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[@id='remove-sauce-labs-bike-light']']"))).click();
	}
	public void removeProduct3()
	{
		WebDriverWait w = new WebDriverWait(driver,Duration.ofSeconds(15));
		w.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[@id='remove-sauce-labs-bolt-t-shirt"))).click();
	}
	public void removeProduct4()
	{
		WebDriverWait w = new WebDriverWait(driver,Duration.ofSeconds(15));
		w.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[@id='remove-sauce-labs-fleece-jacket"))).click();
	}
	public void removeProduct5()
	{
		WebDriverWait w = new WebDriverWait(driver,Duration.ofSeconds(15));
		w.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[@id='remove-sauce-labs-onesie']"))).click();
	}
	public void removeProduct6()
	{
		WebDriverWait w = new WebDriverWait(driver,Duration.ofSeconds(15));
		w.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[@id='remove-test.allthethings()-t-shirt-(red)']"))).click();
	}
	
	public void prductSortBy1()
	{
		WebDriverWait w = new WebDriverWait(driver,Duration.ofSeconds(15));
		WebElement dropdown = w.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//select[@class='product_sort_container']")));
		Select s=new Select(dropdown);
		s.selectByIndex(1);
	}
	public void prductSortBy2()
	{
		WebDriverWait w = new WebDriverWait(driver,Duration.ofSeconds(15));
		WebElement dropdown = w.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//select[@class='product_sort_container']")));
		Select s=new Select(dropdown);
		s.selectByIndex(2);
	}
	public void prductSortBy3()
	{
		WebDriverWait w = new WebDriverWait(driver,Duration.ofSeconds(15));
		WebElement dropdown = w.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//select[@class='product_sort_container']")));
		Select s=new Select(dropdown);
		s.selectByIndex(3);
	}
	
	public void cartBtn()
	{
		WebDriverWait w = new WebDriverWait(driver,Duration.ofSeconds(15));
		w.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[@class='shopping_cart_link']"))).click();
	}
	public void continueshop()
	{
		WebDriverWait w = new WebDriverWait(driver,Duration.ofSeconds(15));
		w.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[@id='continue-shopping']"))).click();
	}
	public void checkout()
	{
		WebDriverWait w = new WebDriverWait(driver,Duration.ofSeconds(15));
		w.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[@id='checkout']"))).click();
	}
	public void checkoutFirstname()
	{
		WebDriverWait w = new WebDriverWait(driver,Duration.ofSeconds(15));
		w.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@id='first-name']"))).sendKeys("Henry");
	}
	public void checkoutLastname()
	{
		WebDriverWait w = new WebDriverWait(driver,Duration.ofSeconds(15));
		w.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@id='last-name']"))).sendKeys("Wilson");
	}
	public void checkoutzipcode()
	{
		WebDriverWait w = new WebDriverWait(driver,Duration.ofSeconds(15));
		w.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@id='postal-code']"))).sendKeys("55344");
	}
	public void checkoutcontinue()
	{
		WebDriverWait w = new WebDriverWait(driver,Duration.ofSeconds(15));
		w.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@id='continue']"))).click();
	}
	public void finishBtn()
	{
		WebDriverWait w = new WebDriverWait(driver,Duration.ofSeconds(15));
		w.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[@id='finish']"))).click();
	}
	public void cancel()
	{
		WebDriverWait w = new WebDriverWait(driver,Duration.ofSeconds(15));
		w.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[@id='cancel']"))).click();
	}
	public void backHomeBtn()
	{
		WebDriverWait w = new WebDriverWait(driver,Duration.ofSeconds(15));
		w.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[@id='back-to-products']"))).click();
	}
}

























