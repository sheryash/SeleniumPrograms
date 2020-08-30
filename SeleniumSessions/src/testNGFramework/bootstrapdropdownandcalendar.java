package testNGFramework;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class bootstrapdropdownandcalendar {
WebDriver driver;
	
	//pageload//
	
	@Test
	public void a_pageLoad() {
	System.setProperty("webdriver.chrome.driver", "chromedriver");
	driver = new ChromeDriver();
	driver.get("https://www.spicejet.com/");
	driver.manage().window().maximize();
	}
	
	//selectDropdown//
	
	@Test
	public void b_dropDown() throws InterruptedException {
		Thread.sleep(50000);
		driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).click();
		ArrayList <WebElement> dropIndiafrom = new ArrayList <WebElement> (driver.findElements(By.xpath("(//td[@class='mapbg'])[1]//ul/li/a")));
		for (WebElement Indiafrom:dropIndiafrom) {
			String IndiaDropdownValuesfrom = Indiafrom.getText();
			System.out.println(IndiaDropdownValuesfrom);
			if(IndiaDropdownValuesfrom.equalsIgnoreCase("Chennai (MAA)")) {
				Indiafrom.click();
				break;
			}
		}		
	}
}
