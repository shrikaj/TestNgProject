package PageObjectModel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginSignUp {
	
	
		public WebDriver driver;
		
	
	By userName=By.xpath("//input[@name='UserLastName']");
	
	
	public LoginSignUp(WebDriver driver2) {
		this.driver=driver2;
		// TODO Auto-generated constructor stub
	}
	
	public WebElement name() 
	{
		return driver.findElement(userName);
	}

	
	
}
