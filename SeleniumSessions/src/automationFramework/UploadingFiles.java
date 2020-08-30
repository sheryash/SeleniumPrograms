package automationFramework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class UploadingFiles {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "chromedriver");
	    ChromeDriver driver = new ChromeDriver();
	    driver.get("http://demo.guru99.com/test/upload/");
	    driver.manage().window().maximize();	
	    WebElement upload = driver.findElement(By.id("uploadfile_0"));
	    upload.sendKeys("/Users/ashwin/Downloads/download.jpeg");
	    WebElement check = driver.findElement(By.id("terms"));
	    check.click();
	    WebElement button = driver.findElement(By.id("submitbutton"));
	    button.click();
	    Thread.sleep(3000);
	    String print = driver.findElement(By.xpath("//center[contains(text(),'1 file ')]")).getText();
	    System.out.println(print);
	    
	    
	}

}
