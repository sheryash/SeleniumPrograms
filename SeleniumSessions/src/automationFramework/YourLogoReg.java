package automationFramework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class YourLogoReg {

	public static void main(String[] args) throws InterruptedException {
		 System.setProperty("webdriver.chrome.driver", "chromedriver");
		    ChromeDriver driver = new ChromeDriver();
		    driver.get("http://automationpractice.com/");
		    driver.manage().window().maximize();
		    driver.findElement(By.className("login")).click();
		    Thread.sleep(4000);
		    driver.findElement(By.id("email_create")).sendKeys("aug00@yopmail.com");
		    driver.findElement(By.id("SubmitCreate")).click();
		    Thread.sleep(4000);
		    WebElement title= driver.findElement(By.id("id_gender1"));
			title.click();
			driver.findElement(By.id("customer_firstname")).sendKeys("Ash");
			driver.findElement(By.id("customer_lastname")).sendKeys("Kutty");
			driver.findElement(By.id("passwd")).sendKeys("ashwin");
			Select date = new Select(driver.findElement(By.id("days")));
			date.selectByVisibleText("10  ");
			Select month = new Select(driver.findElement(By.id("months")));
			month.selectByVisibleText("January ");
			Select year = new Select(driver.findElement(By.id("years")));
			year.selectByVisibleText("2015  ");
			WebElement checkbox = driver.findElement(By.id("newsletter"));
			checkbox.click();
			driver.findElement(By.id("firstname")).sendKeys("Ash");
			driver.findElement(By.id("lastname")).sendKeys("Kutty");
			driver.findElement(By.id("company")).sendKeys("Mindtree");
			driver.findElement(By.id("address1")).sendKeys("Porur");
			driver.findElement(By.id("address2")).sendKeys("Manapakkam");
			driver.findElement(By.id("city")).sendKeys("Chennai");
			Select state = new Select(driver.findElement(By.id("id_state")));
			state.selectByVisibleText("Indiana");
			driver.findElement(By.id("postcode")).sendKeys("60012");
			Select country = new Select(driver.findElement(By.id("id_country")));
			country.selectByVisibleText("United States");
			driver.findElement(By.id("other")).sendKeys("Hello");
			driver.findElement(By.id("phone")).sendKeys("1234567890");
			driver.findElement(By.id("phone_mobile")).sendKeys("9234567890");
			driver.findElement(By.id("submitAccount")).click();
			driver.findElement(By.className("logout")).click();
			driver.findElement(By.id("email")).sendKeys("aug20@yopmail.com");
			driver.findElement(By.id("passwd")).sendKeys("ashwin");
		    driver.findElement(By.id("SubmitLogin")).click();
            String pagetitle = driver.getTitle();
            System.out.println(pagetitle);

				}
}

	


