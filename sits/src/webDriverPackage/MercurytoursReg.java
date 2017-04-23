package webDriverPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
public class MercurytoursReg {

	public static void main(String[] args) {
		// Author: Bahaa 
		// Open Firefox web browser
		WebDriver driver = new FirefoxDriver();
		// Launch Mercury Website
		driver.get("http://newtours.demoaut.com/");
		
		// Print the title of the page
		driver.getTitle();
		
		// Print 
		System.out.println(driver.getTitle());
		// Click on REGISTER link
		driver.findElement(By.linkText("REGISTER")).click();
		// Enter first name
		driver.findElement(By.name("firstName")).sendKeys("Bahaa");
		// Enter last name
		driver.findElement(By.name("lastName")).sendKeys("Shaker");
		//Enter Phone number
		driver.findElement(By.name("phone")).sendKeys("902889883883");
		// Enter Email address
		driver.findElement(By.id("userName")).sendKeys("Tester@test.com");
		//Enter Address
		driver.findElement(By.name("address1")).sendKeys("8000 W Side Dr");
		//Enter City
		driver.findElement(By.name("city")).sendKeys("Gaithersburg");
		//Enter State
		driver.findElement(By.name("state")).sendKeys("Maryland");
		//Enter Postal Code
		driver.findElement(By.name("postalCode")).sendKeys("90888");
		//Enter User name
		driver.findElement(By.name("email")).sendKeys("tester");
		//Enter Password
		driver.findElement(By.name("password")).sendKeys("Mercury");
		//Enter Confirm password
		driver.findElement(By.name("confirmPassword")).sendKeys("Mercury");
		//Click on Register Link
		driver.findElement(By.name("register")).click();
		driver.close();
	
	
	
	
	}

}
