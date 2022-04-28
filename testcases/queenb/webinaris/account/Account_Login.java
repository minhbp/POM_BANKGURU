package queenb.webinaris.account;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import commons.AbstractPage;
import pageUIs.LoginPageUI;

public class Account_Login extends AbstractPage{

	WebDriver driver;
	WebDriverWait explicitWait;
	WebDriverWait waitExplicit;
	
	@BeforeClass
	public void beforeClass() throws Exception {
		System.setProperty("webdriver.chrome.driver", "D:\\WEBDRIVER_API_MinhDV\\browser\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		driver.manage().window().setPosition(new Point(0, 0)); // set start point
		Dimension d = new Dimension(0, 0); // set width height browser
		driver.manage().window().setSize(d);
		driver.manage().window().maximize();

	}
	
	public void login() {
		openAnyUrl(driver, LoginPageUI.LOGIN_PAGE_URL);
	
		waitToElementVisible(driver, LoginPageUI.LOGIN_LANGUAGE_DE);
		clickToElement(driver, LoginPageUI.LOGIN_LANGUAGE_DE);
		
		waitToElementVisible(driver, LoginPageUI.LOGIN_LANGUAGE_EN);
		clickToElement(driver, LoginPageUI.LOGIN_LANGUAGE_EN);
	
		waitToElementVisible(driver, LoginPageUI.EMAIL_TEXTBOX);
		sendkeyToElement(driver, LoginPageUI.EMAIL_TEXTBOX, LoginPageUI.EMAIL_ACCOUNT_MINH101);
	
		waitToElementVisible(driver, LoginPageUI.PASSWORD_TEXTBOX);
		sendkeyToElement(driver, LoginPageUI.PASSWORD_TEXTBOX, LoginPageUI.PASSWORD_ACCOUNT_MINH101);
	
		waitToElementVisible(driver, LoginPageUI.LOGIN_BUTTON);
		clickToElement(driver, LoginPageUI.LOGIN_BUTTON);

		waitToElementInvisibleIconLoading(driver);
	
		waitToElementVisible(driver, LoginPageUI.LOGIN_TEXT);
	}
	
	@AfterClass
	public void afterClass() {
		driver.close();
	}
}
