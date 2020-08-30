package automationFramework;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DoubleClick {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "chromedriver");
	    ChromeDriver driver = new ChromeDriver();
	    driver.get("http://demo.guru99.com/test/simple_context_menu.html");
	    driver.manage().window().maximize();
	    WebElement doubleclick = driver.findElement(By.xpath("//button[contains(text(),'Double-Click Me To See Alert')]"));
	    Actions act = new Actions(driver);
	    act.doubleClick(doubleclick).build().perform();
	    Thread.sleep(2000);
	    Alert aler = driver.switchTo().alert();
	    String popup = aler.getText();
	    System.out.println(popup);
	    aler.accept();
	    
	}

}
