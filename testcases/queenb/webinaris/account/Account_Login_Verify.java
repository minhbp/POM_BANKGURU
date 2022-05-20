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
		loginPage.openUrlLogin();
		loginPage.clickLanguage();
		loginPage.selectEnLanguage();
		loginPage.clickForgotPassword();
		Assert.assertEquals(loginPage.getTextTitleForgot(), "Reset Password");
		Assert.assertEquals(loginPage.getTextSubTitleForgot(), "Please enter your email address");
		loginPage.inputEmailForgot("minhbp252+101@gmail.com");
//		loginPage.clickResetButton();
//		loginPage.clickBackToLoginButton();
	}
	
	@Test
	public void TC_02_SignUpNow() {
		loginPage.openUrlLogin();
		loginPage.ClickSignUpNow();
		Assert.assertEquals(loginPage.getTextTitleSignUp(), "WEBINARIS ist Ihr neuer perfekter Mitarbeiter!");
	}
	
	@Test
	public void TC_03_Verify_Footer() {
		loginPage.openUrlLogin();
		String oldTab = driver.getWindowHandle();
		loginPage.clickFooter("1");
		driver.switchTo().window(oldTab);
		loginPage.clickFooter("2");
		driver.switchTo().window(oldTab);
		loginPage.clickFooter("3");
		driver.switchTo().window(oldTab);
		loginPage.clickFooter("4");
		driver.switchTo().window(oldTab);
		loginPage.clickFooter("5");
		driver.switchTo().window(oldTab);
		ArrayList<String> newTab = new ArrayList<String>(driver.getWindowHandles());
		driver.switchTo().window(newTab.get(1));
		Assert.assertEquals(getCurrentPageUrl(driver), "https://www.webinaris.com/");
		driver.switchTo().window(newTab.get(2));
		Assert.assertEquals(getCurrentPageUrl(driver), "https://support.webinaris.com/hc/en-001/requests/new");
		driver.switchTo().window(newTab.get(3));
		Assert.assertEquals(getCurrentPageUrl(driver), "https://www.webinaris.com/agb/");
		driver.switchTo().window(newTab.get(4));
		Assert.assertEquals(getCurrentPageUrl(driver), "https://www.webinaris.com/");
		driver.switchTo().window(newTab.get(5));
		Assert.assertEquals(getCurrentPageUrl(driver), "https://support.webinaris.com/hc/en-001");
	}
	
	@Test
	public void TC_04_Wrong_Password() {
		loginPage.openUrlLogin();
		loginPage.inputEmailLogin();
		loginPage.inputPasswordLoginWrong();
		loginPage.clickLoginButton();
		Assert.assertEquals(loginPage.getTextErrorPassword(), "Your account is inactive or there is no account to the email address you provided.");
	}
	
	@AfterClass
	public void afterClass() {
		driver.quit();
	}
}
