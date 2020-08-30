package automationFramework;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingAlertPopup {

	public static void main(String[] args) {
    System.setProperty("webdriver.chrome.driver","chromedriver");
    WebDriver driver=new ChromeDriver();
    driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
    driver.manage().window().maximize();
    WebElement sign = driver.findElement(By.className("signinbtn"));
    sign.click();
    Alert aler = driver.switchTo().alert();
    String popup = aler.getText();
    System.out.println(popup);
    aler.accept();
    driver.quit();
    
	}

}
