package automationFramework;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class GoogleKeyBoardActions {

	public static void main(String[] args) throws InterruptedException {
    System.setProperty("webdriver.chrome.driver", "chromedriver");
    WebDriver driver = new ChromeDriver();
    driver.get("https://www.google.co.in/");
    driver.manage().window().maximize();
    driver.findElement(By.name("q")).sendKeys("Sachin Tendulkar");
    Actions act = new Actions(driver);
    for(int i=1;i<=8;i++)
    { 
    	act.sendKeys(Keys.ARROW_DOWN).build().perform();
    	Thread.sleep(1000);
    }
	   act.sendKeys(Keys.ENTER).build().perform();
    	
	}
}
