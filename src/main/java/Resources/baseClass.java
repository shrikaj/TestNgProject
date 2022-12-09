package Resources;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;

import io.github.bonigarcia.wdm.WebDriverManager;


public class baseClass {
	public WebDriver driver; //global driver scope
	public Properties prop;
	
	public void intializeDriver() throws IOException {
		//to read file
		FileInputStream fis= new FileInputStream("C:\\Users\\hp\\eclipse-workspace\\Java\\pranavi\\TestngSeleniumProject\\src\\main\\java\\Resources\\data.properties");
		//FileInputStream fis= new FileInputStream(System.getProperty("user.dir")+"\\C:\\Users\\hp\\eclipse-workspace\\Java\\pranavi\\TestngSeleniumProject\\src\\main\\java\\Resources\\data.properties");
		
		//access data.properties file
		
	 prop=new Properties();
	prop.load(fis);
	
	//prop.containsKey("browser"); gives true or value
	String browserName=prop.getProperty("browser");
	
	if(browserName.equalsIgnoreCase("chrome")) {
		WebDriverManager.chromedriver().setup();
		System.setProperty("webdriver.chrome.driver","C:\\Users\\hp\\OneDrive\\Desktop\\chromedriver\\chromedriver.exe");
		 driver = new ChromeDriver();
	}
	else if(browserName.equalsIgnoreCase("firefox")){
		//firefox code
		
	}
	else
	{System.out.println("pls enter proper bowser value");}
		
	}
	@BeforeMethod
	public void launchURL() throws IOException {
		
		
		intializeDriver();
		String url=prop.getProperty("url");
		driver.get(url);//this driver have scope as it is executed properly
	}

}
