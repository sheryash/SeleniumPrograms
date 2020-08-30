	package automationFramework;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetText {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","chromedriver");
	    WebDriver driver=new ChromeDriver();
	    driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
	    driver.manage().window().maximize();
	    driver.findElement(By.xpath("//a[contains(text(),'Create Account')]")).click();
	    WebElement signin = driver.findElement(By.className("signinbtn"));
	    signin.click();
        Alert alert = driver.switchTo().alert();
        alert.accept();
        
	    driver.findElement(By.className("forgotlink")).click();
	    driver.findElement(By.id("txtlogin")).sendKeys("king3");
	    driver.findElement(By.name("next")).click();
	    driver.findElement(By.name("phnum")).sendKeys("989786754");
	    driver.findElement(By.name("contactid")).sendKeys("abc@yopmail.com");
	    driver.findElement(By.name("next")).click();  
	    Alert alert2 = driver.switchTo().alert();
	    alert2.accept();
	    Thread.sleep(1000);
	    //driver.findElement(By.id("hint_ques")).click();
	    driver.findElement(By.id("passwor_email")).click();
		
	    driver.findElement(By.xpath("//input[text() = 'rfloatL nextbtn f16 rWhite rbold']"));
		
	    
	}

}
