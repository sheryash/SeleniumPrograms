package automationFramework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class AutomationPractice {

	public static void main(String[] args) throws InterruptedException {
    System.setProperty("webdriver.chrome.driver", "chromedriver");
    WebDriver driver = new ChromeDriver();
    driver.get("http://automationpractice.com/index.php");
    driver.manage().window().maximize();
    driver.findElement(By.id("search_query_top")).sendKeys("Shirts");
    driver.findElement(By.name("submit_search")).click();
    String pagetitle = driver.getTitle();
    System.out.println(pagetitle);
    Thread.sleep(5000);
    Select dropdown = new Select(driver.findElement(By.id(("selectProductSort"))));
    dropdown.selectByVisibleText("In stock"); 
    driver.findElement(By.id("list")).click();
    driver.findElement(By.id("color_1")).click();
    driver.findElement(By.xpath("Add to cart")).click();
    Thread.sleep(4000);

   // WebElement pdt = driver.findElement(By.xpath("cart_quantity_up_1_1_0_0"));
    //WebElement product = driver.findElement(By.xpath("product product-1 product-faded-short-sleeve-tshirts category-5 category-tshirts hide-left-column hide-right-column lang_en);
   // product.isSelected();
    driver.findElement(By.id("quantity_wanted_p")).click();
    Select group_1 = new Select(driver.findElement(By.id(("group_1"))));
    group_1.selectByVisibleText("M"); 
   	driver.findElement(By.name("Orange")).click();
    Thread.sleep(5000);
    driver.findElement(By.id("add_to_cart")).click();
    //driver.quit();
	}
  }
