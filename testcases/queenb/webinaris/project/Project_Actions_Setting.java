package queenb.webinaris.project;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import commons.AbstractTest;
import pageObjects.ButtonPageObject;
import pageObjects.LoginPageObject;
import pageObjects.NewProjectObject;
import pageObjects.PollPageObject;
import pageObjects.TrackingPageObject;

public class Project_Actions_Setting extends AbstractTest {
	WebDriver driver;

	public LoginPageObject loginPage;
	public NewProjectObject newProject;
	public ButtonPageObject buttonPage;
	public PollPageObject pollPage;
	public TrackingPageObject trackingPage;

	String headcode, bodycodeafter, bodycodebefore;

	@Parameters("browser")
	@BeforeClass
	public void beforeClass(String browserName) throws Exception {

		driver = openMultiBrowser(browserName);

		headcode = "<script>alert('headcode');</script>";
		bodycodeafter = "<script>alert('bodycodeafter');</script>";
		bodycodebefore = "<script>alert('bodycodebefore');</script>";

		loginPage = new LoginPageObject(driver);
		newProject = new NewProjectObject(driver);
		buttonPage = new ButtonPageObject(driver);
		pollPage = new PollPageObject(driver);
		trackingPage = new TrackingPageObject(driver);

		loginPage.login();
		newProject.createNewProject();
		Thread.sleep(2000);
	}

	@Test
	public void TC_01_New_Button_Top() throws Exception {
		buttonPage.clickMenuButton();
		buttonPage.clickNewButton();
		buttonPage.inputNameTop();
		buttonPage.inputTargetUrl();
		buttonPage.clickPositionTop();
		buttonPage.clickStartTime();
		buttonPage.setStartTime("0", "0", "0");
		buttonPage.clickSaveTime();
		buttonPage.clickEndTime();
		buttonPage.setEndTime("0", "5", "0");
		buttonPage.clickSaveTime();
		buttonPage.clearAndInputTextButton("Automation testing");
		buttonPage.clickSaveButton();
	}

	@Test
	public void TC_02_New_Button_Bottom() throws Exception {
		buttonPage.clickNewButton();
		buttonPage.inputNameBottom();
		buttonPage.inputTargetUrl();
		buttonPage.clickPositionBottom();
		buttonPage.clickStartTime();
		buttonPage.setStartTime("0", "1", "0");
		buttonPage.clickSaveTime();
		buttonPage.clickEndTime();
		buttonPage.setEndTime("0", "10", "0");
		buttonPage.clickSaveTime();
		buttonPage.clearAndInputTextButton("Automation testing");
		buttonPage.clickSaveButton();
	}

	@Test
	public void TC_03_New_Button_FullScreen() throws Exception {
		buttonPage.clickNewButton();
		buttonPage.inputNameFullScreen();
		buttonPage.inputTargetUrl();
		buttonPage.clickPositionFullscreen();
		buttonPage.clickStartTime();
		buttonPage.setStartTime("0", "5", "0");
		buttonPage.clickSaveTime();
		buttonPage.clickEndTime();
		buttonPage.setEndTime("0", "12", "0");
		buttonPage.clickSaveTime();
		buttonPage.clearAndInputTextButton("Automation testing");
		buttonPage.clickSaveButton();
	}

	@Test
	public void TC_04_New_Button_Top_Right() throws Exception {
		buttonPage.clickNewButton();
		buttonPage.inputNameTopRight();
		buttonPage.inputTargetUrl();
		buttonPage.clickPositionTopRight();
		buttonPage.clickStartTime();
		buttonPage.setStartTime("0", "2", "0");
		buttonPage.clickSaveTime();
		buttonPage.clickEndTime();
		buttonPage.setEndTime("0", "7", "0");
		buttonPage.clickSaveTime();
		buttonPage.clearAndInputTextButton("Automation testing");
		buttonPage.clickSaveButton();
	}

	@Test
	public void TC_05_New_Button_Transparent() throws Exception {
		buttonPage.clickNewButton();
		buttonPage.inputNameTransparent();
		buttonPage.inputTargetUrl();
		buttonPage.clickPositionTransparent();
		buttonPage.clickStartTime();
		buttonPage.setStartTime("0", "0", "0");
		buttonPage.clickSaveTime();
		buttonPage.clickEndTime();
		buttonPage.setEndTime("1", "0", "0");
		buttonPage.clickSaveTime();
		buttonPage.clickSaveButton();
	}

	@Test
	public void TC_06_New_Poll_01() throws Exception {
		pollPage.clickPollMenu();
		pollPage.clickNewPoll();
		pollPage.inputNamePoll("poll 1");

		pollPage.clickTimeStartQuestion();
		pollPage.inputTime("0", "0", "15");
		pollPage.clickSaveTime();

		pollPage.clickTimeEndQuestion();
		pollPage.inputTime("0", "5", "0");
		pollPage.clickSaveTime();

		pollPage.clickTimeStartResult();
		pollPage.inputTime("0", "5", "0");
		pollPage.clickSaveTime();

		pollPage.clickTimeEndResult();
		pollPage.inputTime("0", "30", "00");
		pollPage.clickSaveTime();

		pollPage.inputQuestion("em ăn cơm chưa?");
		pollPage.inputAnswerA("chưa");
		pollPage.inputResultA("90");
		pollPage.inputAnswerB("vẫn chưa nhưng là đáp án khác");
		pollPage.inputResultB("10");

		pollPage.clickSavePoll();

	}

	@Test
	public void TC_07_New_Poll_02() throws Exception {

		pollPage.clickNewPoll();
		pollPage.inputNamePoll("poll 2");

		pollPage.clickTimeStartQuestion();
		pollPage.inputTime("0", "30", "00");
		pollPage.clickSaveTime();

		pollPage.clickTimeEndQuestion();
		pollPage.inputTime("0", "35", "0");
		pollPage.clickSaveTime();

		pollPage.clickTimeStartResult();
		pollPage.inputTime("0", "35", "0");
		pollPage.clickSaveTime();

		pollPage.clickTimeEndResult();
		pollPage.inputTime("0", "50", "00");
		pollPage.clickSaveTime();

		pollPage.inputQuestion("em rất ăn cơm chưa?");
		pollPage.inputAnswerA("chưa");
		pollPage.inputResultA("0");
		pollPage.inputAnswerB("vẫn chưa nhưng là đáp án khác");
		pollPage.inputResultB("100");

		pollPage.clickSavePoll();
	}

	@Test
	public void TC_08_New_Tracking_Code_Open_Registration_Page() {
		trackingPage.clickTrackingMenu();
		trackingPage.clickNewTrackingButton();
		trackingPage.inputTrackingName("Open Registration");
		trackingPage.clickEvent();
		trackingPage.selectEventOpenRegistrationPage();
		trackingPage.inputTrackingBeforeHead(headcode);
		trackingPage.inputTrackingAfterBody(bodycodeafter);
		trackingPage.inputTrackingBeforeBody(bodycodebefore);
		trackingPage.clickSaveButton();
		trackingPage.verifyTrackingCode("Open Registration");
	}

	@Test
	public void TC_09_New_Tracking_Code_Submit_Form() {
		trackingPage.clickTrackingMenu();
		trackingPage.clickNewTrackingButton();
		trackingPage.inputTrackingName("Submit Form");
		trackingPage.clickEvent();
		trackingPage.selectEventSubmitForm();
		trackingPage.inputTrackingBeforeHead(headcode);
		trackingPage.inputTrackingAfterBody(bodycodeafter);
		trackingPage.inputTrackingBeforeBody(bodycodebefore);
		trackingPage.clickSaveButton();
		trackingPage.verifyTrackingCode("Submit Form");
	}

	@Test
	public void TC_10_New_Tracking_Code_Open_Comfirmation_Page() {
		trackingPage.clickTrackingMenu();
		trackingPage.clickNewTrackingButton();
		trackingPage.inputTrackingName("Open Comfirm Page");
		trackingPage.clickEvent();
		trackingPage.selectEventOpenComfirmationPage();
		trackingPage.selectCookies();
		trackingPage.selectCookiesYes();
		trackingPage.checkCookiesStatistics();
		trackingPage.checkCookiesMarketing();
		trackingPage.inputTrackingBeforeHead(headcode);
		trackingPage.inputTrackingAfterBody(bodycodeafter);
		trackingPage.inputTrackingBeforeBody(bodycodebefore);
		trackingPage.clickSaveButton();
		trackingPage.verifyTrackingCode("Open Comfirm Page");
	}

	@Test
	public void TC_11_New_Tracking_Code_Open_Completed_Page() {
		trackingPage.clickTrackingMenu();
		trackingPage.clickNewTrackingButton();
		trackingPage.inputTrackingName("Open Completed Page");
		trackingPage.clickEvent();
		trackingPage.selectEventOpenCompletedPage();
		trackingPage.selectCookies();
		trackingPage.selectCookiesNo();
		trackingPage.inputTrackingBeforeHead(headcode);
		trackingPage.inputTrackingAfterBody(bodycodeafter);
		trackingPage.inputTrackingBeforeBody(bodycodebefore);
		trackingPage.clickSaveButton();
		trackingPage.verifyTrackingCode("Open Completed Page");
	}

	@Test
	public void TC_12_New_Tracking_Code_Open_Room() {
		trackingPage.clickTrackingMenu();
		trackingPage.clickNewTrackingButton();
		trackingPage.inputTrackingName("Open Room");
		trackingPage.clickEvent();
		trackingPage.selectEventOpenRoom();
		trackingPage.selectCookies();
		trackingPage.selectCookiesYes();
		trackingPage.checkCookiesStatistics();
		trackingPage.checkCookiesMarketing();
		trackingPage.inputTrackingBeforeHead(headcode);
		trackingPage.inputTrackingAfterBody(bodycodeafter);
		trackingPage.inputTrackingBeforeBody(bodycodebefore);
		trackingPage.clickSaveButton();
		trackingPage.verifyTrackingCode("Open Room");
	}

	@AfterClass
	public void afterClass() {
		driver.close();
	}
}
