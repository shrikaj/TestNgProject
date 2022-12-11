package Testcases;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import PageObjectModel.LoginPageObject;
import Resources.baseClass;

public class VerifyLogin extends baseClass {
	@Test
	public void login() throws IOException {
	
	//This is just demo for GIT	
		
		LoginPageObject run =new LoginPageObject(driver);
		
		run.enterUserName().sendKeys("test");
		
	run.enterPassword().sendKeys("paswword");
	run.clickOnLogin().click();
		
	SoftAssert s1=new SoftAssert();
	
	
	String expectedString="Please check your username password. If you still can't log in, contact your Salesforce administrator.";
	String actualString=driver.findElement(By.xpath("//div[@id='error']")).getText();
	s1.assertEquals(actualString, expectedString);
	
	s1.assertAll();
	
	}
}
