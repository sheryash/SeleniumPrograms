package automationFramework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class RediffMailFollowing {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","chromedriver");
	    WebDriver driver=new ChromeDriver();
	    driver.get("https://www.rediff.com/");
	    driver.manage().window().maximize();
	    driver.findElement(By.xpath("//a[contains(text(),'Create Account')]")).click();
	    WebElement name = driver.findElement(By.xpath("//td[contains(text(),'Full Name')]/following::input[1]"));
	    name.sendKeys("Ashwin");
	    driver.findElement(By.xpath("//td[contains(text(),'Choose a Rediffmail ID')]/following::input[1]")).sendKeys("dr.aug918");
	    driver.findElement(By.className("btn_checkavail")).click();
		driver.findElement(By.xpath("//td[contains(text(),'Password')]/following::input[1]")).sendKeys("Abc34353*&^j");
		driver.findElement(By.xpath("//td[contains(text(),'Retype password')]/following::input[1]")).sendKeys("Abc34353*&^j");
		driver.findElement(By.xpath("//td[contains(text(),'Alternate Email Address')]/following::input[1]")).sendKeys("ash@yopmail.com");
		driver.findElement(By.id("mobno")).sendKeys("9810012345");
		Select day = new Select(driver.findElement(By.xpath("//td[contains(text(),'Date of Birth')]/following::select[1]")));
	    day.selectByVisibleText("10");
	    Select month = new Select(driver.findElement(By.xpath("//td[contains(text(),'Date of Birth')]/following::select[2]")));
	    month.selectByVisibleText("MAY");
	    Select year = new Select(driver.findElement(By.xpath("//td[contains(text(),'Date of Birth')]/following::select[3]")));
	    year.selectByVisibleText("2010");
	    Thread.sleep(1000);
	    WebElement gender = driver.findElement(By.xpath("//td[contains(text(),'Gender')]/following::input[2]"));
	    gender.click();
	    Thread.sleep(1000);
	    Select country = new Select(driver.findElement(By.xpath("//span[contains(text(),'Country')]/following::select[1]")));
	    country.selectByVisibleText("India");
	    Select city = new Select(driver.findElement(By.xpath("//td[contains(text(),'City')]/following::select[1]")));
	    city.selectByVisibleText("Agra"); 
	    Thread.sleep(20000);
	    driver.findElement(By.xpath("//td[contains(text(),'Enter the text shown above')]/following::input[1]"));
	    driver.findElement(By.id("Register")).click();
	    
	    
	    
	    
	    
		

		
		
		
		
	    
	}

}
