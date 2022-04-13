package pominselenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class DemoLoginVerify {
	@Test
	public void TestUser() {
		WebDriver driver = BrowserFactory.BrowserOptions("Firefox", "https://demo.opencart.com/index.php?route=account/login");
		Opencartlogin LoginOpenCart =PageFactory.initElements(driver, Opencartlogin.class);
		LoginOpenCart.LoginOpenCart("hritik1810@gmail.com", "zSAr5aAT@eXP3dz");
}
}