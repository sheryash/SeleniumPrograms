package automationFramework;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class SimilarElements {

	        public static void main(String[] args) {
		    System.setProperty("webdriver.chrome.driver", "chromedriver");
		    ChromeDriver driver = new ChromeDriver();
		    driver.get("https://en.wikipedia.org/wiki/Rajinikanth");
		    driver.manage().window().maximize();
		    int linkscount = driver.findElements(By.tagName("a")).size();
		    System.out.println(linkscount);
		    int images = driver.findElements(By.tagName("img")).size();
		    System.out.println(images);
		    
	}
	

}