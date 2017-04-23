package webDriverPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class GooglesearchHerndonweather {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Step 1 Launch Web Browser
		WebDriver browser = new FirefoxDriver ();
		
		// Step 2 Enter https://www.google.com/ and click on Enter button
		browser.get("https://www.google.com/");
		
		// Step 3 Enter "Herndon VA" and click on search button 
		WebElement element = browser.findElement(By.name("q")); 
		element.sendKeys("Herndon VA");
		
		// Step 4 
		browser.findElement(By.name("btnG")) .click();
		
		
		
		
	}

}
