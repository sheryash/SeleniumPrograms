package automationFramework;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class RediffUsingKeyboardActions {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","chromedriver");
	    WebDriver driver=new ChromeDriver();
	    driver.get("https://www.rediff.com/");
	    driver.manage().window().maximize();
	    driver.findElement(By.xpath("//a[contains(text(),'Create Account')]")).click();
	    WebElement name = driver.findElement(By.xpath("//td[contains(text(),'Full Name')]/following::input[1]"));
	    name.sendKeys("Ashwin");
	   // driver.findElement(By.xpath("//td[contains(text(),'Choose a Rediffmail ID')]/following::input[1]"));
	    Actions act = new Actions(driver);
		act.sendKeys(Keys.TAB,"dr.aug978").build().perform();
		//act.sendKeys(Keys.ENTER).build().perform();
	    //driver.findElement(By.className("btn_checkavail"));
	    Actions act1 = new Actions(driver);
	    act1.sendKeys(Keys.ENTER).build().perform();
	    //Thread.sleep(10000);
	    
		//driver.findElement(By.xpath("//td[contains(text(),'Password')]/following::input[1]")).sendKeys("Ab34353*&^j5");
		Actions password = new Actions(driver);
	    //Thread.sleep(5000);

		password.sendKeys(Keys.TAB,"Ab34353*&^j5").build().perform();
		
		//driver.findElement(By.xpath("//td[contains(text(),'Retype password')]/following::input[1]"));
		Actions act3 = new Actions(driver);
		act3.sendKeys(Keys.TAB,"Ab34353*&^j5").build().perform();
		//driver.findElement(By.xpath("//td[contains(text(),'Alternate Email Address')]/following::input[1]"));
		Actions act4 = new Actions(driver);
		act4.sendKeys(Keys.TAB,"ash@yopmail.com").build().perform();
		
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
