package Testcases;

import java.io.IOException;

import org.testng.annotations.Test;

import PageObjectModel.LoginPageObject;
import PageObjectModel.LoginSignUp;
import Resources.baseClass;

public class verifySignup extends baseClass  {
@Test	
	public void Signup() throws IOException, InterruptedException{

		
		LoginPageObject obj2=new LoginPageObject(driver);
		obj2.clickOnTry().click();
		Thread.sleep(3000);
		LoginSignUp obj1=new LoginSignUp(driver);
		Thread.sleep(9000);
		obj1.name().sendKeys("Raju");
	}

}
