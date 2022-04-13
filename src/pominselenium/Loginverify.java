package pominselenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class Loginverify {
	@Test
	public void TestUser() {
		WebDriver driver = BrowserFactory.BrowserOptions("Chrome", "https://opensource-demo.orangehrmlive.com/");
		PominSelenium LoginHRM =PageFactory.initElements(driver, PominSelenium.class);
		LoginHRM.LoginHRM("Admin", "admin123");
				
	}

}
