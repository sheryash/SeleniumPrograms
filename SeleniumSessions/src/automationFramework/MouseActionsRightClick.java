package automationFramework;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseActionsRightClick {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "chromedriver");
	    ChromeDriver driver = new ChromeDriver();
	    driver.get("http://demo.guru99.com/test/simple_context_menu.html");
	    driver.manage().window().maximize();
	    WebElement right = driver.findElement(By.xpath("//span[contains(text(),'right click me')]"));
	    Actions act = new Actions(driver);
	    act.contextClick(right).build().perform();
	    driver.findElement(By.xpath("//span[contains(text(),'Cut')]")).click();
	    Alert aler = driver.switchTo().alert();
	    String popup = aler.getText();
	    System.out.println(popup);
	    aler.accept();
	    
	  //  WebElement double = driver.findElement(By.id("authentication"));
	   
	    
	    
	}

}
