package testNGFramework;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class googleImplicitWait {
WebDriver driver;


//pageLoad//

@Test
public void a_pageLoad(){
	System.setProperty("webdriver.chrome.driver", "ChromeDriver");
	driver = new ChromeDriver();
	driver.get("https://www.google.co.in/");
}


@Test
public void b_searchPage() throws InterruptedException {
driver.manage().window().maximize();
Thread.sleep(1000);
driver.findElement(By.name("q")).sendKeys("Ashwin");
Actions act = new Actions(driver);
Thread.sleep(1000);
act.sendKeys(Keys.ENTER).build().perform();
	
}

@Test
public void c_navigatetoPage() {
driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
driver.findElement(By.xpath("//h3[contains(text(),'Ravichandran Ashwin Profile - ICC Ranking, Age, Ca')]")).click();
}
}
