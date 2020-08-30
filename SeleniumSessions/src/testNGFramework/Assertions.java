package testNGFramework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Assertions {
	 WebDriver driver;
	    
	    //Page load//
	    
	    @Test
		public void a_pageLoad() {
		System.setProperty("webdriver.chrome.driver", "chromedriver");	
	    driver = new ChromeDriver();
	    driver.get("http://zero.webappsecurity.com/");
	    driver.manage().window().maximize();
	    }
	  
	    //Assertion Equals//
	    
	    @Test
	    public void b_assertequals() {
	    String element1 = driver.findElement(By.xpath("//strong[contains(text(),'Online Banking')]")).getText();
	    Assert.assertEquals(element1, "ONLINE BANKING");
	    System.out.println("Assert Equals pass");
	    }
	    
	  //Assertion Not Equals//
	    
	    @Test
	    public void c_assertnotequals() {
	    String element1 = driver.findElement(By.xpath("//strong[contains(text(),'Online Banking')]")).getText();
	    Assert.assertNotEquals(element1, "ONLINE BANKINGG");
	    System.out.println("Assert NotEquals pass");
	    }
	    
//Assertion True//
	    
	    @Test
	    public void d_asserttrue() {
	    Assert.assertTrue("ONLINE BANKING".equals(driver.findElement(By.xpath("//strong[contains(text(),'Online Banking')]")).getText()));
	    System.out.println("Assert True Pass");
	    }
	    
//Assertion False//
	    
	    @Test
	    public void e_assertfalse() {
		//String element1 = driver.findElement(By.xpath("//strong[contains(text(),'Online Banking')]")).getText();
	    Assert.assertFalse("ONLINE BANKINGG".equals(driver.findElement(By.xpath("//strong[contains(text(),'Online Banking')]")).getText()));
	    System.out.println("Assert False Pass");
	    }
	    
//Assertion Not Null//
	    
	    @Test
	    public void f_assertnotnull() {
		Object obj1 = driver.getTitle();
		Assert.assertNotNull(obj1);
	    System.out.println("Assert Notnull Pass");

	    }
	    
//Assertion Null//
	    
	    @Test
	    public void g_assertnull() {
		Object obj1 = null;
		Assert.assertNull(obj1);
	    System.out.println("Assert Null Pass");

	    }
}
