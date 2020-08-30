package automationFramework;

import java.util.ArrayList;

import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingWindows {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "chromedriver");
	    ChromeDriver driver = new ChromeDriver();
	    driver.get("https://www.naukri.com/");
	    driver.manage().window().maximize();
	   // String Mainwindowhandle =  driver.getWindowHandle();
	    //System.out.println(Mainwindowhandle);
	    ArrayList<String> naukriwindow = new ArrayList<String> (driver.getWindowHandles());
	    for (String naukriwindowslist:naukriwindow)
	    {
	    System.out.println(naukriwindowslist);
	    }
	    driver.switchTo().window(naukriwindow.get(0));
	    String window1 = driver.getTitle();
	    System.out.println(window1);
	    driver.switchTo().window(naukriwindow.get(1));
	    String secondwindow = driver.getTitle();
	    System.out.println(secondwindow);
	    driver.switchTo().window(naukriwindow.get(2));
	    String secondwindow1 = driver.getTitle();
	    System.out.println(secondwindow1);
	    driver.switchTo().window(naukriwindow.get(3));
	    String secondwindow2 = driver.getTitle();
	    System.out.println(secondwindow2);
	}

}
