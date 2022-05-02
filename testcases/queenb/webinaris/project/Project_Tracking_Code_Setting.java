package queenb.webinaris.project;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import commons.AbstractTest;
import pageObjects.LoginPageObject;
import pageObjects.NewProjectObject;
import pageObjects.TrackingPageObject;

public class Project_Tracking_Code_Setting extends AbstractTest {

	WebDriver driver;

	public LoginPageObject loginPage;
	public NewProjectObject newProject;
	public TrackingPageObject trackingPage;

	String nameTracking, headcode, bodycodeafter, bodycodebefore;

	@Parameters("browser")
	@BeforeClass
	public void beforeClass(String browserName) throws Exception {

		driver = openMultiBrowser(browserName);

		nameTracking = "tracking 01";
		headcode = "<script>alert('headcode');</script>";
		bodycodeafter = "<script>alert('bodycodeafter');</script>";
		bodycodebefore = "<script>alert('bodycodebefore');</script>";

		loginPage = new LoginPageObject(driver);
		newProject = new NewProjectObject(driver);
		trackingPage = new TrackingPageObject(driver);

		loginPage.login();
		newProject.createNewProject();
		Thread.sleep(2000);
	}

	@Test
	public void TC_01_New_Tracking_Code() {
		trackingPage.clickExpertMenu();
		trackingPage.clickTrackingMenu();
		trackingPage.clickNewTrackingButton();
		trackingPage.inputTrackingName(nameTracking);
		trackingPage.clickEvent();
		trackingPage.selectEvetnOpenRegistrationPage();
		trackingPage.inputTrackingBeforeHead(headcode);
		trackingPage.inputTrackingAfterBody(bodycodeafter);
		trackingPage.inputTrackingBeforeBody(bodycodebefore);
		trackingPage.clickSaveButton();
	}

	@AfterClass
	public void afterClass() {
		driver.close();
	}
}
