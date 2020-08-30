package testNGFramework;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class OpenmrsDemo {
	WebDriver driver;

	@Test
	public void a_pageLoad() {
		System.setProperty("webdriver.chrome.driver", "chromedriver");
		driver = new ChromeDriver();
		driver.get("https://demo.openmrs.org/openmrs/login.htm");
		driver.manage().window().maximize();
	}

	@Test
	public void b_loginFlow() {
		driver.findElement(By.id("username")).sendKeys("admin");
		driver.findElement(By.id("password")).sendKeys("Admin123");
		driver.findElement(By.xpath("//li[@id='Pharmacy']")).click();
		driver.findElement(By.id("loginButton")).click();
	}

	@Test
	public void c_printLogin() {
		String print = driver.findElement(By.xpath("//h4[contains(text(),'Logged in as')]")).getText();
		System.out.println(print);
	}

	@Test
	public void d_findPatient() throws InterruptedException {
		driver.findElement(By.xpath("//i[@class='icon-search']")).click();
		String title = driver.getTitle();
		System.out.println(title);
		driver.findElement(By.id("patient-search")).sendKeys("Mary");
		Actions act = new Actions(driver);
		act.sendKeys(Keys.ENTER).build().perform();
		for (int i = 0; i <= 2; i++) {
			act.sendKeys(Keys.ARROW_DOWN).build().perform();
			Thread.sleep(1000);
		}
		act.sendKeys(Keys.ENTER).build().perform();
		Thread.sleep(5000);
		String vitals = driver.findElement(By.xpath("//h3[contains(text(),'VITALS')]")).getText();
		System.out.println(vitals);
		Thread.sleep(5000);
		String details = driver.findElement(By.id("vitals")).getText();
		System.out.println(details);
	}

	@Test
	public void e_recentVisit() throws InterruptedException {
		String visit = driver.findElement(By.xpath("//h3[contains(text(),'RECENT VISITS')]")).getText();
		System.out.println(visit);
		Thread.sleep(5000);

	}

	@Test
	public void f_homePage() throws InterruptedException {
		driver.findElement(By.xpath("//ul[@id='breadcrumbs']/descendant::i[1]")).click();
	}

	@Test
	public void g_captureVitals() throws InterruptedException {
		Thread.sleep(2000);
		driver.findElement(By.xpath("//i[@class='icon-vitals']")).click();
		driver.findElement(By.id("patient-search")).sendKeys("mary");
		Actions act = new Actions(driver);
		act.sendKeys(Keys.ENTER).build().perform();
		for (int i = 1; i <= 3; i++) {
			act.sendKeys(Keys.ARROW_DOWN).build().perform();
			Thread.sleep(1000);
		}
		act.sendKeys(Keys.ENTER).build().perform();
	}

	@Test
	public void h_verifyPatient() throws InterruptedException {
		String verify = driver.findElement(By.xpath("//h1[contains(text(),'checked-in')]")).getText();
		System.out.println(verify);
		driver.findElement(By.className("name")).click();
		Thread.sleep(5000);
		driver.navigate().to("https://demo.openmrs.org/openmrs/index.htm");
	}

	@Test
	public void i_registerPatient() throws InterruptedException {
		driver.findElement(By.xpath("//i[@class='icon-user']")).click();
		driver.findElement(By.name("givenName")).sendKeys("Sweety");
		Actions act = new Actions(driver);
		act.sendKeys(Keys.TAB, "Kutty").build().perform();
		act.sendKeys(Keys.TAB, "S").build().perform();
		act.sendKeys(Keys.TAB, "Female").build().perform();
		act.sendKeys(Keys.TAB, "09").build().perform();
		Select month = new Select(driver.findElement(By.name("birthdateMonth")));
		month.selectByVisibleText("March");
		Thread.sleep(5000);
		driver.findElement(By.name("birthdateYear")).sendKeys("2010");
		act.sendKeys(Keys.TAB).build().perform();
		act.sendKeys(Keys.TAB).build().perform();
		Actions act1 = new Actions(driver);
		act1.sendKeys(Keys.TAB, "chennai area").build().perform();
		act1.sendKeys(Keys.TAB, "Porur").build().perform();
		Thread.sleep(5000);
		act1.sendKeys(Keys.TAB, "Madras").build().perform();
		act1.sendKeys(Keys.TAB, "TN").build().perform();
		act1.sendKeys(Keys.TAB, "India").build().perform();
		act1.sendKeys(Keys.TAB, "600099").build().perform();
		Thread.sleep(5000);
		act1.sendKeys(Keys.TAB, "9876543210").build().perform();
		Thread.sleep(5000);
		act1.sendKeys(Keys.TAB).build().perform();
		Select relation = new Select(driver.findElement(By.name("relationship_type")));
		relation.selectByVisibleText("Doctor");
		driver.findElement(By.xpath("//select[@id='relationship_type']/following::input[1]")).sendKeys("SirSir");
	}

	@Test
	public void j_submitRegistration() throws InterruptedException {
		Thread.sleep(5000);
		Actions act2 = new Actions(driver);
		act2.sendKeys(Keys.TAB).build().perform();
		act2.sendKeys(Keys.TAB).build().perform();
		driver.findElement(By.xpath("//input[@id='submit']")).click();
		Thread.sleep(2000);
	}

	@Test
	public void k_logoutFlow() throws InterruptedException {
		Thread.sleep(5000);
		driver.findElement(By.xpath("//a[contains(text(),'Logout')]")).click();
	}
}
