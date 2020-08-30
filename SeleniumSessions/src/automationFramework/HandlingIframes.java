package automationFramework;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingIframes {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "chromedriver");
	    ChromeDriver driver = new ChromeDriver();
	    driver.get("https://nunzioweb.com/index.shtml");
	    driver.manage().window().maximize();
	    int frames = driver.findElements(By.tagName("iframe")).size();
	    System.out.println(frames);
	    driver.switchTo().frame("oddcouple");
		String frametext = driver.findElement(By.xpath("//div[contains(text(),'A television show')]")).getText();
	    System.out.println(frametext);

	}

}
