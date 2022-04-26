package queenb.webinaris.project;

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
import pageObjects.NewProjectObject;
import pageObjects.TrackingPageObject;

public class Project_Tracking_Code_Setting extends AbstractPage {

	WebDriver driver;
	WebDriverWait explicitWait;
	WebDriverWait waitExplicit;
	
	public LoginPageObject loginPage;
	public NewProjectObject newProject;
	public TrackingPageObject trackingPage;
	
	String nameTracking, headcode, bodycodeafter, bodycodebefore;
	
	@BeforeClass
	public void beforeClass() throws Exception {
		System.setProperty("webdriver.chrome.driver", "D:\\WEBDRIVER_API_MinhDV\\browser\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		waitExplicit = new WebDriverWait(driver, 10);

		driver.manage().window().setPosition(new Point(0, 0)); // set start point
		Dimension d = new Dimension(960, 1080); // set width height browser
		driver.manage().window().setSize(d);
		driver.manage().window().maximize();
		
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
