package PageObjectModel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPageObject {
	
	public WebDriver driver;// this driver dont have scope
	
	By username =By.xpath("//input[@id='username']");
	By password =By.xpath("//input[@id='password']");
	By login=By.xpath("//input[@id='Login']");
	By tryForFree=By.xpath("//a[@class='button secondary']");
	

	public LoginPageObject(WebDriver driver2) {
		// TODO Auto-generated constructor stub
		this.driver=driver2;
	}

	public WebElement enterUserName() 
	{
	  return driver.findElement(username);	
	}
	
	public WebElement enterPassword() 
	{
	  return driver.findElement(password);	
	}
	public WebElement clickOnLogin() 
	{
		
		return driver.findElement(login);
	}
	public WebElement clickOnTry() 
	{
		return driver.findElement(tryForFree);
	}
}
