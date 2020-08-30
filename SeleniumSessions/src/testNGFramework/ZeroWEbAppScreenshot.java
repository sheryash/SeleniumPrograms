package testNGFramework;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class ZeroWEbAppScreenshot {
	WebDriver driver;

	// Page load//

	@Test
	public void a_pageLoad() {
		System.setProperty("webdriver.chrome.driver", "chromedriver");
		driver = new ChromeDriver();
		driver.get("http://zero.webappsecurity.com/");
		driver.manage().window().maximize();
	}

	// SignIn//

	@Test
	public void b_signin() throws IOException {
		driver.findElement(By.id("signin_button")).click();
		getscreenshot();
	}

	// LoginCredentials//

	@Test
	public void c_loginCredentials() throws IOException {
		driver.findElement(By.name("user_login")).sendKeys("username");
		driver.findElement(By.xpath("//input[@id='user_password']")).sendKeys("password");
		driver.findElement(By.name("submit")).click();
		getscreenshot();
	}
	
	//TakeScreenshot//

	public void getscreenshot() throws IOException {
		File scrFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(scrFile, new File("Screenshot" + System.currentTimeMillis() + ".jpeg"));
	}
	
	//Show Transactions//
	
	@Test
	public void d_showTransactions() throws IOException {
		driver.findElement(By.xpath("(//a[contains(text(),'Savings')])[1]")).click();
		String title = driver.findElement(By.xpath("(//a[contains(text(),'Show Transactions')])")).getText();
		System.out.println(title);
		Select acct = new Select(driver.findElement(By.id("aa_accountId")));
		acct.selectByVisibleText("Loan");
		getscreenshot();
		//driver.navigate()
		
	}
}
