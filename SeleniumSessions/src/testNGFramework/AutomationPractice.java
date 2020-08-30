package testNGFramework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class AutomationPractice {

	WebDriver driver;
	
	//pageload//
	
	@Test(priority=1)
	public void pageLoad() {
	System.setProperty("webdriver.chrome.driver", "chromedriver");
	driver = new ChromeDriver();
	driver.get("https://petstore.octoperf.com/actions/Catalog.action");
	driver.manage().window().maximize();
	}
	
	//signin//
	
	@Test(priority=2)
	public void signIn() {
	driver.findElement(By.xpath("//a[contains(text(),'Sign In')]")).click();
	}
	
	//UserInfo//
	
	@Test(priority=3)
	public void UserInfo() {
	driver.findElement(By.xpath("//a[contains(text(),'Register Now!')]")).click();
	driver.findElement(By.name("username")).sendKeys("Ash");
	driver.findElement(By.name("password")).sendKeys("August19");
	driver.findElement(By.name("repeatedPassword")).sendKeys("August19");
	}

	
	//AcctInfo//
	
	@Test(priority=4)
	public void AcctInfo() {
	driver.findElement(By.name("account.firstName")).sendKeys("Hi");
	driver.findElement(By.name("account.lastName")).sendKeys("Hello");
	driver.findElement(By.name("account.email")).sendKeys("aug15567@yopmail.com");
	driver.findElement(By.name("account.phone")).sendKeys("9876543218");
	driver.findElement(By.name("account.address1")).sendKeys("chennai");
	driver.findElement(By.name("account.address2")).sendKeys("porur");
	driver.findElement(By.name("account.city")).sendKeys("chennai");
	driver.findElement(By.name("account.state")).sendKeys("TNDU");
	driver.findElement(By.name("account.zip")).sendKeys("600098");
	driver.findElement(By.name("account.state")).sendKeys("TN");
	driver.findElement(By.name("account.country")).sendKeys("India");
	}

	//ProfileInfo//
	
	@Test(priority=5)
	public void profileInfo() {
	Select lang = new Select(driver.findElement(By.name("account.languagePreference")));
	lang.selectByVisibleText("japanese");
	Select favcategory = new Select(driver.findElement(By.name("account.favouriteCategoryId")));
	favcategory.selectByVisibleText("DOGS");
	driver.findElement(By.name("account.listOption")).click();
	driver.findElement(By.name("account.bannerOption")).click();
	driver.findElement(By.name("newAccount")).click();
	}
	
 }
	
    
	


