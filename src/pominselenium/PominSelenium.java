package pominselenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class PominSelenium {
	
	WebDriver driver;
	public PominSelenium(WebDriver driver) {
		this.driver= driver;	
	}
	@FindBy(how=How.ID, using="txtUsername")
	WebElement UserName;
	
	@FindBy(how =How.ID,using="txtPassword")
	WebElement Password;
	
	@FindBy(how=How.XPATH,using="//*[@id=\"btnLogin\"]")
	WebElement LoginButton;
	public void LoginHRM(String Uname, String Psd) {
		UserName.sendKeys(Uname);
		Password.sendKeys(Psd);
		LoginButton.click();
		
	}

}
