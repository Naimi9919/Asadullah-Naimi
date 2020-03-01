package Piit.mavenproject;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;

public class TestNG1 {
	
	WebDriver driver;
	
  @Test
  public void f() {
	  
	  driver.findElement(By.xpath("/html/body/div[1]/header/div/div[1]/div[2]/div/a[2]/span[2]")).click();
	  
	  driver.findElement(By.xpath("//*[@id=\"ap_email\"]")).sendKeys("asad.naimi@gmail.com");
	  driver.findElement(By.xpath("//*[@id=\"continue\"]")).click();
	  driver.findElement(By.xpath("//*[@id=\"auth-error-message-box\"]/div/div/ul/li/span")).getText();
	  System.out.println("We cannot find an account with that email address");
	  
	  
	  
	  
	  
	  
  }
  
  
  @BeforeMethod
  public void beforeMethod() {
	  
	  System.setProperty("webdriver.gecko.driver", "C:\\Users\\asadu\\Downloads\\geckodriver-v0.26.0-win64//geckodriver.exe");
		driver = new FirefoxDriver();
		driver.navigate().to("https://www.facebook.com");
		driver.manage().window().maximize();
		
		
  }

  @AfterMethod
  public void afterMethod() {
  }

}
