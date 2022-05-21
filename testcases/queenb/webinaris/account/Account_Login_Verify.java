package queenb.webinaris.account;

import java.util.ArrayList;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import commons.AbstractTest;
import pageObjects.LoginPageObject;

public class Account_Login_Verify extends AbstractTest {
	WebDriver driver;
	
	private LoginPageObject loginPage;
	
	@Parameters("browser")
	@BeforeClass
	public void beforeClass(String browserName) {
		driver = openMultiBrowser(browserName);
		
		loginPage = new LoginPageObject(driver);
	}
	
	@Test
	public void TC_01_Forgot_Password() {
		log("============TC_01_Forgot_Password=============");
		log("Step 01: Open URL Login");
		loginPage.openUrlLogin();
		log("Step 02: click language");
		loginPage.clickLanguage();
		log("Step 03: select language En");
		loginPage.selectEnLanguage();
		log("Step 04: click Forgot Password");
		loginPage.clickForgotPassword();
		log("Step 05: verify text wrong password");
		Assert.assertEquals(loginPage.getTextTitleForgot(), "Reset Password");
		Assert.assertEquals(loginPage.getTextSubTitleForgot(), "Please enter your email address");
		loginPage.inputEmailForgot("minhbp252+101@gmail.com");
//		loginPage.clickResetButton();
//		loginPage.clickBackToLoginButton();
	}
	
	@Test
	public void TC_02_SignUpNow() {
		log("============TC_02_SignUpNow=============");
		log("Step 01: Open URL Login");
		loginPage.openUrlLogin();
		log("Step 02: click signup now");
		loginPage.ClickSignUpNow();
		log("Step 03: verify title text webinar");
		Assert.assertEquals(loginPage.getTextTitleSignUp(), "WEBINARIS ist Ihr neuer perfekter Mitarbeiter!");
	}
	
	@Test
	public void TC_03_Verify_Footer() {
		log("============TC_03_Verify_Footer=============");
		log("Step 01: open url login");
		loginPage.openUrlLogin();
		log("Step 02: set oldtab");
		String oldTab = driver.getWindowHandle();
		log("Step 03: click footer 1");
		loginPage.clickFooter("1");
		log("Step 04: switch to oldtab");
		driver.switchTo().window(oldTab);
		log("Step 05: click footer 2");
		loginPage.clickFooter("2");
		log("Step 06: switch to old tab");
		driver.switchTo().window(oldTab);
		log("Step 07: click footer 3");
		loginPage.clickFooter("3");
		log("Step 08: switch to oldtab");
		driver.switchTo().window(oldTab);
		log("Step 09: click footer 4");
		loginPage.clickFooter("4");
		log("Step 10: switch to oldtab");
		driver.switchTo().window(oldTab);
		log("Step 11: click footer 5");
		loginPage.clickFooter("5");
		log("Step 12: switch to oldtab");
		driver.switchTo().window(oldTab);
		ArrayList<String> newTab = new ArrayList<String>(driver.getWindowHandles());
		log("Step 13: switch tab footer 1");
		driver.switchTo().window(newTab.get(1));
		log("Step 14: verify url footer 1");
		Assert.assertEquals(getCurrentPageUrl(driver), "https://www.webinaris.com/");
		log("Step 15: switch tab footer 2");
		driver.switchTo().window(newTab.get(2));
		log("Step 16: verify url footer 2");
		Assert.assertEquals(getCurrentPageUrl(driver), "https://support.webinaris.com/hc/en-001/requests/new");
		log("Step 17: switch tab footer 3");
		driver.switchTo().window(newTab.get(3));
		log("Step 18: verify url footer 3");
		Assert.assertEquals(getCurrentPageUrl(driver), "https://www.webinaris.com/agb/");
		log("Step 19: switch tab footer 4");
		driver.switchTo().window(newTab.get(4));
		log("Step 20: verify url footer 4");
		Assert.assertEquals(getCurrentPageUrl(driver), "https://www.webinaris.com/");
		log("Step 21: switch tab footer 5");
		driver.switchTo().window(newTab.get(5));
		log("Step 22: verify url footer 5");
		Assert.assertEquals(getCurrentPageUrl(driver), "https://support.webinaris.com/hc/en-001");
	}
	
	@Test
	public void TC_04_Wrong_Password() {
		log("============TC_04_Wrong_Password=============");
		log("Step 01: open url login");
		loginPage.openUrlLogin();
		log("Step 02: input email");
		loginPage.inputEmailLogin();
		log("Step 03: input password wrong");
		loginPage.inputPasswordLoginWrong();
		log("Step 04: click to button login");
		loginPage.clickLoginButton();
		log("Step 05: verify text error");
		Assert.assertEquals(loginPage.getTextErrorPassword(), "Your account is inactive or there is no account to the email address you provided.");
	}
	
	@AfterClass
	public void afterClass() {
		driver.quit();
	}
}
