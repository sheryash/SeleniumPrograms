package automationFramework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragandDrop {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "chromedriver");
	    ChromeDriver driver = new ChromeDriver();
	    driver.get("https://testautomationpractice.blogspot.com");
	    driver.manage().window().maximize();
	    WebElement ele1 = driver.findElement(By.id("draggable"));
	    WebElement ele2 = driver.findElement(By.id("droppable"));
	    Actions act = new Actions(driver);
	    act.dragAndDrop(ele1,ele2).build().perform();
	}
}



