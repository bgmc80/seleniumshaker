package webDriverPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.Firefox;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.Firefox.FirefoxDriver;

public class USPSquickTools {

	private static Object webElement;

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Open Web browser
		WebDriver browser = new FirefoxDriver ();
		
		// Enter http://usps.com/ and click on Enter button
		browser.get("http://usps.com/");
		
		// Click on Quick Tools
		WebElement element = browser.findElement (By.name("Quick Tools"));
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
