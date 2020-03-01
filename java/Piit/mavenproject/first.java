package Piit.mavenproject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class first {
	WebDriver driver;
	
	
	
	@Test
	public void firstclass()
	{
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\asadu\\Desktop\\Driver_Main\\chromedriver.exe");
		driver = new ChromeDriver();
		
		driver.navigate().to("https://www.amazon.com");
	System.out.println("welcome home");

}
}