package testNGFramework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class FlipKartDeals {
	WebDriver driver;

	// PageLoad//

	@Test
	public void a_pageLoad() {
		System.setProperty("webdriver.chrome.driver", "chromedriver");
		driver = new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();
	}

	// Closedefaultlayer//

	@Test
	public void b_closelogin() throws InterruptedException {
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@class='_2AkmmA _29YdH8']")).click();
	}

	// Dealsofthesday//

	@Test
	public void c_navigationtodeals() throws InterruptedException {
		Thread.sleep(5000);
		WebElement women = driver.findElement(By.xpath("//span[text()='Women']"));
		Actions act = new Actions(driver);
		act.moveToElement(women).build().perform();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//a[contains(text(),'Sarees')]")).click();
        Thread.sleep(4000);
        String title = driver.getTitle();
	    System.out.println(title);
	    
	}

	//Addtocart//
	
	@Test
	public void d_selectProduct() throws InterruptedException
	{
			driver.findElement(By.xpath("(//div[@class='_2B_pmu'])[10]")).click();
			Thread.sleep(6000);
			driver.findElement(By.xpath("//button[contains(text(),'BUY NOW')]")).click();
			Thread.sleep(4000);
		}
		
	// Navigatetohomepage//

	@Test
	public void e_closedealstab() throws InterruptedException {
		driver.navigate().to("https://www.flipkart.com/");
		Thread.sleep(3000);
		String title = driver.getTitle();
	    System.out.println(title);
	}

}
