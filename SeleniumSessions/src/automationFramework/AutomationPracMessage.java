package automationFramework;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutomationPracMessage {

	public static void main(String[] args) {
    System.setProperty("webdriver.chrome.driver", "chromedriver");
    ChromeDriver driver = new ChromeDriver();
    driver.get("http://automationpractice.com/");
    driver.manage().window().maximize();
    driver.findElement(By.id("contact-link")).click();
    String pagetitle = driver.getTitle();
    System.out.println(pagetitle);
    //Select id_contact = new Select(driver.findElement(By.id(("id_contact"))));
   // id_contact.selectByValue("2");
    driver.findElement(By.id("email")).sendKeys("abc@gmail.com");
    driver.findElement(By.id("id_order")).sendKeys("12345");
    driver.findElement(By.id("message")).sendKeys("Product received in good condition");
    driver.findElement(By.name("submitMessage")).click();
    driver.close();
	}
}
