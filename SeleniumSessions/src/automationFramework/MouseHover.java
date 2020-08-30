package automationFramework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseHover {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "chromedriver");
	    WebDriver driver = new ChromeDriver();
	    driver.get("https://www.flipkart.com/");
	    driver.manage().window().maximize();
	    driver.findElement(By.xpath("//button[@class='_2AkmmA _29YdH8']")).click();
	    WebElement home = driver.findElement(By.xpath("//span[contains(text(),'Home & Furniture')]"));
	    Thread.sleep(1000);
	    Actions act = new Actions(driver);
	    act.moveToElement(home).build().perform();
	    Thread.sleep(1000);
	    driver.findElement(By.xpath("//a[text()='Paintings']")).click();
	    Thread.sleep(1000);
	    driver.findElement(By.xpath("//a[contains(text(),'SAF 7 Horses Sunrise FRAMED UV COATED Digital Repr')]")).click();
	    
	}

}
