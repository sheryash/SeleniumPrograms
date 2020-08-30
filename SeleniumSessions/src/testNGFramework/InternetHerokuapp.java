package testNGFramework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class InternetHerokuapp {
	public static final String If = null;
	public static final String Else = null;
	WebDriver driver;

	// PageLoad//

	@Test
	public void a_pageLoad() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "ChromeDriver");
		driver = new ChromeDriver();
		driver.get("http://the-internet.herokuapp.com/checkboxes");
		driver.manage().window().maximize();
	}

	// Verifycheckbox1//

	@Test
	public void b_Verifycheckbox1() throws InterruptedException {
		WebElement Checkbox1 = driver.findElement(By.xpath("//form[@id='checkboxes']/input[1]"));
		if (Checkbox1.isSelected()) {
			System.out.println("true");
		} else {
			System.out.println("false");
			Thread.sleep(10000);
			WebElement check1 = Checkbox1;
			check1.click();
		}
	}

	// Verifycheckbox2//

	@Test
	public void c_Verifycheckbox2() throws InterruptedException {
		WebElement Checkbox2 = driver.findElement(By.xpath("//form[@id='checkboxes']/input[2]"));
		if (Checkbox2.isSelected()) {
			System.out.println("true");
			Thread.sleep(7000);
		} else {
			System.out.println("false");
			WebElement check2 = Checkbox2;
			check2.click();
		}
	}
}
