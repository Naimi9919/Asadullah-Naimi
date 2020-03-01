package objectmodel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ClassOne {
	WebDriver driver;
	
	
	@FindBy(xpath="//*[@id=\"nav-logo\"]/a[2]")
	WebElement tryprime;
	
	
public ClassOne (WebDriver driver) {
	this.driver=driver;
	PageFactory.initElements(driver, this);
}
	
	public void tryprime () {
	tryprime.click();
}
	
			
	

}
