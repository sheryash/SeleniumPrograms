package automationFramework;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DemoAutomationTestingAlerts {

	public static void main(String[] args) throws InterruptedException {
    System.setProperty("webdriver.chrome.driver",  "chromedriver");
    WebDriver driver = new ChromeDriver();
    driver.get("http://demo.automationtesting.in/Alerts.html");
    driver.manage().window().maximize();
    
    //Alert with OK//
    
    driver.findElement(By.className("analystic")).click();
    WebElement alert1 = driver.findElement(By.id("OKTab"));
    alert1.click();
    Thread.sleep(2000);
    Alert aler1 = driver.switchTo().alert();
    String popup1 = aler1.getText();
    System.out.println(popup1);
    aler1.accept();
    Thread.sleep(2000);

    //Alert with OK and Cancel//

    driver.findElement(By.className("analystic")).click();
    WebElement alert2 = driver.findElement(By.xpath("//a[contains(text(),'Alert with OK & Cancel')]"));
    alert2.click();
    Thread.sleep(2000);
    WebElement alert3 = driver.findElement(By.xpath("//button[contains(text(),'click the button to display a confirm box ')]"));
    alert3.click();
    Alert alert31 = driver.switchTo().alert();
    String popup2 = alert31.getText();
    System.out.println(popup2);
    alert31.accept();
    String textmsg = driver.findElement(By.id("demo")).getText();
    System.out.println(textmsg); 
    
    //Alert with Text box//
    
    WebElement prompt = driver.findElement(By.xpath("//a[contains(text(),'Alert with Textbox ')]"));
    prompt.click();
    WebElement prompt1 = driver.findElement(By.xpath("//button[contains(text(),'click the button to demonstrate the prompt box ')]"));
    prompt1.click();
    Alert prompt3 = driver.switchTo().alert();
    prompt3.sendKeys("Ashwin");
    String popup3 = prompt3.getText();
    System.out.println(popup3);
    prompt3.accept();
    String textmsg1 = driver.findElement(By.id("demo1")).getText();
    System.out.println(textmsg1); 
    
   // driver.close();
    
    }

}
