package queenb.webinaris.account;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import commons.AbstractTest;
import pageObjects.LoginPageObject;
import pageObjects.ShareWebinarPageObject;

public class Account_Share_Webinar extends AbstractTest {

	WebDriver driver;

	public ShareWebinarPageObject shareWebinarPage;
	public LoginPageObject loginPage;

	String nameProvider, partnerID, firstName, lastName, street, zipCode, city, phone, website, emailAddress;

	@Parameters("browser")
	@BeforeClass
	public void beforeClass(String browserName) throws Exception {

		driver = openMultiBrowser(browserName);

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
