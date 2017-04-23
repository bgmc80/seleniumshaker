package webDriverPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.WebElement;

	


public class PhpTravelRegistration {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver = new FirefoxDriver();
		
		driver.get("http://phptravels.net/");

		WebElement MyAccount = driver.findElement(By.linkText ( "My Account" ));
         MyAccount.click();
	   WebElement Login = driver.findElement(By.linkText ( "Login" ));
	   Login.click();
	   WebElement SignUp = driver.findElement(By.linkText ( "Sign Up" ));
		SignUp.click();
		WebElement firstname = driver.findElement(By.name("firstname"));
		   firstname.sendKeys("bahaa");
		WebElement lastname = driver.findElement(By.name("lastname"));
		   lastname.sendKeys("Shaker1");
		WebElement Mobilenumber = driver.findElement(By.name("phone"));
			Mobilenumber.sendKeys("5645652323");
			
		WebElement Email = driver.findElement(By.name("email"));
			Email.sendKeys("lite-226@hotmail.com");
		WebElement Password = driver.findElement(By.name("password"));
			Password.sendKeys("asdfjkl");
		WebElement ConfirmPw = driver.findElement(By.name("confirmpassword"));
			ConfirmPw.sendKeys("asdfjkl");
			
	WebElement signup = driver.findElement(By.xpath ("html/body/section/div/div/div/div/div[2]/div/form/div[9]/button"));
			signup.click();
			
			
		//driver.get("http://www.google.com");
			
			
			//WebElement Logout = driver.findElement(By.linkText("Logout"));
			//Logout.click();
			
			//signup.clear();
			
	    
	   /* // driver.findElement (By .xpath("html/body/div[2]/div/div/div[2]/ul[2]/li[2]/a"));
		driver.findElement(By .xpath("html/body/div[2]/div/div/div[2]/ul[2]/li[2]/ul/li[1]/a"));
		
		driver.findElement (By .name("firstname")) .sendKeys("Baha");
		driver.findElement(By .name("lastname")) .sendKeys("Shaker");
		driver.findElement (By .name("signupbtn btn_full btn btn-action btn-block btn-lg"));
		
		*/
	}

}
