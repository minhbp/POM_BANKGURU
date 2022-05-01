package queenb.webinaris.account;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import commons.AbstractPage;
import pageObjects.LoginPageObject;
import pageObjects.ShareWebinarPageObject;

public class Account_Share_Webinar extends AbstractPage{

	WebDriver driver;
	WebDriverWait explicitWait;
	WebDriverWait waitExplicit;

	public ShareWebinarPageObject shareWebinarPage;
	public LoginPageObject loginPage;

	String nameProvider, partnerID, firstName, lastName, street, zipCode, city, phone, website, emailAddress;
	@BeforeClass
	public void beforeClass() throws Exception {
		System.setProperty("webdriver.chrome.driver", ".\\resources\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		waitExplicit = new WebDriverWait(driver, 30);

		driver.manage().window().setPosition(new Point(0, 0)); // set start point
		Dimension d = new Dimension(960, 1080); // set width height browser
		driver.manage().window().setSize(d);
		driver.manage().window().maximize();
		
		nameProvider = "provider Minh 101";
		partnerID = "partner 101";
		firstName = "Minh";
		lastName = "DV";
		street = "134 cmt8";
		zipCode = "70000";
		city = "HCM";
		phone = "0963834343";
		website = "queenb.vn";
		emailAddress = "minhvd@queenb.vn";
		
		loginPage = new LoginPageObject(driver);
		shareWebinarPage = new ShareWebinarPageObject(driver);
		
		loginPage.login();
	}
	
	@Test
	public void TC_01_Setting_Provider() throws Exception {
		shareWebinarPage.getMyWebinar();
		shareWebinarPage.clearAndInputNameProvide(nameProvider);
		shareWebinarPage.clearAndInputPartnerID(partnerID);
		shareWebinarPage.clearAndInputFirstName(firstName);
		shareWebinarPage.clearAndInputLastName(lastName);
		shareWebinarPage.clearAndInputStreet(street);
		shareWebinarPage.clearAndInputZipCode(zipCode);
		shareWebinarPage.clearAndInputCity(city);
		shareWebinarPage.clearAndInputPhone(phone);
		shareWebinarPage.clearAndInputWebsite(website);
		shareWebinarPage.clearAndInputEmailAddress(emailAddress);
		shareWebinarPage.clickSave();
		
	}

	@AfterClass
	public void afterClass() {
		driver.close();
	}
}
