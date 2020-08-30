package automationFramework;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingTabs {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "chromedriver");
	    ChromeDriver driver = new ChromeDriver();
	    driver.get("https://www.google.com/intl/en-GB/gmail/about/#");
	    driver.manage().window().maximize();
	    WebElement create = driver.findElement(By.xpath("(//a[contains(text(),'Create an account')])[1]"));
	    create.click();
	    ArrayList<String> gmailtabs = new ArrayList<String> (driver.getWindowHandles());
	    driver.switchTo().window(gmailtabs.get(1));
	    String window1 = driver.getTitle();
	    System.out.println(window1);
	    driver.findElement(By.id("firstName")).sendKeys("Ashwin");
	    //driver.tab
	  //  driver.findElement(By.id("lastName")).sendKeys("V");


}
}
