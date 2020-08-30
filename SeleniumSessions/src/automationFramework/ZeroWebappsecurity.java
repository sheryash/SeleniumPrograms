package automationFramework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ZeroWebappsecurity {

	public static void main(String[] args) {
    System.setProperty("webdriver.chrome.driver", "chromedriver");
    WebDriver driver=new ChromeDriver();
    driver.get("http://zero.webappsecurity.com/");
    driver.manage().window().maximize();
    driver.findElement(By.id("signin_button")).click();
    driver.findElement(By.name("user_login")).sendKeys("username");
    driver.findElement(By.xpath("//input[@id='user_password']")).sendKeys("password");
    driver.findElement(By.name("submit")).click();
    String acctsummtitle = driver.getTitle();
    System.out.println(acctsummtitle);
    String user = driver.getCurrentUrl();
    System.out.println(user);
    String text = driver.findElement(By.xpath("//a[contains(text(),'Transfer Funds']")).getText();
    System.out.println(text);
    //String cash = driver.findElement(By.xpath("//h2[contains(text(),'Investment Accounts']")).getText();
    //System.out.println(cash);
    //String attribute = driver.findElement(By.xpath("//h2[contains(text(),'Investment Accounts']")).getAttribute("class");
//System.out.println(attribute);
driver.close();
    }
	
}
