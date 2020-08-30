package automationFramework;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingPopups {

	public static void main(String[] args) throws InterruptedException {
    System.setProperty("webdriver.chrome.driver",  "chromedriver");
    WebDriver driver=new ChromeDriver();
    driver.get("https://www.seleniumeasy.com/test/javascript-alert-box-demo.html");
    driver.manage().window().maximize();
    
    //alert popup//
    WebElement alert1 = driver.findElement(By.xpath("//button[text()= 'Click me!'][1]"));
    alert1.click();
    Thread.sleep(2000);
    Alert aler = driver.switchTo().alert();
    String popup = aler.getText();
    System.out.println(popup);
    aler.accept();
  
    //clickme 2//
    
    WebElement alert2 = driver.findElement(By.xpath("//button[@class='btn btn-default']"));
    alert2.click();
    Thread.sleep(2000);
    Alert aler2 = driver.switchTo().alert();
    String popup2 = aler2.getText();
    System.out.println(popup2);
    aler2.accept();
    
    //alert3//
    
    WebElement alert3 = driver.findElement(By.xpath("//button[contains(text(),'Click for Prompt Box')]"));
    alert3.click();
    Thread.sleep(2000);
    Alert aler3 = driver.switchTo().alert();
    String popup3 = aler3.getText();
    System.out.println(popup3);
    aler3.sendKeys("Hi");
    aler3.accept();
 
	}

}
