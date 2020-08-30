package testNGFramework;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class autoitFileUpload {
	WebDriver driver;


	//pageLoad//

	@Test
	public void a_pageLoad(){
		System.setProperty("webdriver.chrome.driver", "ChromeDriver");
		driver = new ChromeDriver();
		driver.get("http://www.tinyupload.com/");
	}

	@Test
	public void b_fileUpLoad() throws InterruptedException, IOException{
		WebElement upload = driver.findElement(By.name("uploaded_file"));
		Actions act = new Actions(driver);
		act.moveToElement(upload).click().build().perform();
		Thread.sleep(5000);
		Runtime.getRuntime().exec("/Users/ashwin/Desktop/Aug12.html");
		driver.findElement(By.name("file_description")).sendKeys("Hi");
		//driver.findElement(arg0)
	}
}
