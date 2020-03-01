package pageobject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Homepage {
WebDriver driver;	

@FindBy(id="email")
WebElement userid;

@FindBy(id="pass")
WebElement password1;

@FindBy(id="u_0_b")
WebElement loginbuton;


	public Homepage(WebDriver driver) {
	this.driver=driver;
	PageFactory.initElements(driver, this);
		

}

public void userid(String entereidmail) {
	
  userid.sendKeys("enteremail");
}

public void password1 (String enterpassword) {
	
	password1.sendKeys("enterpassword");
	
}

public void loginbuton () {
	
	loginbuton.click();
	
	
}
  



	
	

}
