package testNGFramework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class ZeroWebAppSecurity {

    WebDriver driver;
    
    //Page load//
    
    @Test(priority=1)
	public void pageLoad() {
	System.setProperty("webdriver.chrome.driver", "chromedriver");	
    driver = new ChromeDriver();
    driver.get("http://zero.webappsecurity.com/");
    driver.manage().window().maximize();
    }
  
    //SignIn//
    
    @Test(priority=2)
    public void signin() {
    driver.findElement(By.id("signin_button")).click();
    }
    	
    
    //LoginCredentials//
    
    @Test(priority=3)
    public void loginCredentials() {
    driver.findElement(By.name("user_login")).sendKeys("username");
    driver.findElement(By.xpath("//input[@id='user_password']")).sendKeys("password");
    driver.findElement(By.name("submit")).click();    
    }

    
    //logoutUsername//
    
    @Test(priority=4)
    public void logOut() throws InterruptedException {
    driver.findElement(By.className("icon-user")).click();
    Thread.sleep(3000);
    driver.findElement(By.id("logout_link")).click();
    }
    }
    
    
    
    
	


