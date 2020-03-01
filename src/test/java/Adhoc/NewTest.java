package Adhoc;

import org.testng.annotations.Test;

import pageobject.Homepage;

import org.testng.annotations.BeforeMethod;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;

public class NewTest {
	
	WebDriver driver;
	
	
	
  @Test
  public void f() {
	  
	  driver.get("http://www.facebook.com");
	  driver.manage().window().maximize();
	  
	  Homepage obj = new Homepage (driver);
	  obj.userid("naimijan");
	  obj.password1("1234567");
	  obj.loginbuton();
	  
	  driver.close();
	  
  }
  @BeforeMethod
  public void beforeMethod() {
	  
	  System.setProperty("webdriver.chrome.driver", "C:\\Users\\asadu\\eclipse-workspace\\Automation\\Drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		
		
  }

  @AfterMethod
  public void afterMethod() {
  }

}
