package queenb.webinaris.project;

import java.util.ArrayList;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import commons.AbstractTest;
import pageObjects.ButtonPageObject;
import pageObjects.LoginPageObject;
import pageObjects.NewProjectObject;
import pageObjects.PollPageObject;
import pageObjects.PreviewPageObject;
import pageObjects.TrackingPageObject;

public class Project_Actions_Setting extends AbstractTest {
	WebDriver driver;

	public LoginPageObject loginPage;
	public NewProjectObject newProject;
	public ButtonPageObject buttonPage;
	public PollPageObject pollPage;
	public TrackingPageObject trackingPage;
	public PreviewPageObject previewPage;

	String nameTop, nameBottom, nameFullScreen, nameTopRight, nameTransparent;
	String buttonTopText, buttonBotText, buttonTopRightText;
	String headcode, bodycodeafter, bodycodebefore;
	String openLP, submitForm, openConfirm, openComlete, openRoom, openRoomTime, clickButton, clickDownload;

	@Parameters("browser")
	@BeforeClass
	public void beforeClass(String browserName) throws Exception {

		driver = openMultiBrowser(browserName);

		nameTop = "top 001";
		nameBottom = "bot 001";
		nameFullScreen = "full screen 001";
		nameTopRight = "top right 001";
		nameTransparent = "transparent 001";

		buttonTopText = "button top top";
		buttonBotText = "button bot bot";
		buttonTopRightText = "button top right";

		headcode = "<script>alert('headcode');</script>";
		bodycodeafter = "<script>alert('bodycodeafter');</script>";
		bodycodebefore = "<script>alert('bodycodebefore');</script>";

		openLP = "When opening the registration page";
		submitForm = "When submitting the registration form";
		openConfirm = "When opening the Confirmation Required page";
		openComlete = "When opening the Registration Completed page";
		openRoom = "When opening the webinar room";
		openRoomTime = "After a certain amount of time in the webinar room";
		clickButton = "When the participant clicks a button";
		clickDownload = "When the participant downloads a download file";

		loginPage = new LoginPageObject(driver);
		newProject = new NewProjectObject(driver);
		buttonPage = new ButtonPageObject(driver);
		pollPage = new PollPageObject(driver);
		trackingPage = new TrackingPageObject(driver);
		previewPage = new PreviewPageObject(driver);

		loginPage.login();
		newProject.createNewProject();
		Thread.sleep(2000);
	}

	@Test
	public void TC_01_New_Button_Top() throws Exception {
		buttonPage.clickMenuButton();
		buttonPage.clickNewButton();
		buttonPage.inputNameButton(nameTop);
		buttonPage.inputTargetUrl("google.com");
		buttonPage.clickPosition("Top");
		buttonPage.clickStartTime();
		buttonPage.setTime("0", "0", "0");
		buttonPage.clickSaveTime();
		buttonPage.clickEndTime();
		buttonPage.setTime("0", "5", "0");
		buttonPage.clickSaveTime();
		buttonPage.clearAndInputTextButton(buttonTopText);
		buttonPage.clickSaveButton();

	}

	@Test
	public void TC_02_New_Button_Bottom() throws Exception {
		buttonPage.clickNewButton();
		buttonPage.inputNameButton(nameBottom);
		buttonPage.inputTargetUrl("google.com");
		buttonPage.clickPosition("Bottom");
		buttonPage.clickStartTime();
		buttonPage.setTime("0", "0", "0");
		buttonPage.clickSaveTime();
		buttonPage.clickEndTime();
		buttonPage.setTime("0", "15", "0");
		buttonPage.clickSaveTime();
		buttonPage.clearAndInputTextButton(buttonBotText);
		buttonPage.clickSaveButton();

	}

	@Test
	public void TC_03_New_Button_FullScreen() throws Exception {
		buttonPage.clickNewButton();
		buttonPage.inputNameButton(nameFullScreen);
		buttonPage.inputTargetUrl("google.com");
		buttonPage.clickPosition("Fullscreen");
		buttonPage.clickStartTime();
		buttonPage.setTime("0", "0", "0");
		buttonPage.clickSaveTime();
		buttonPage.clickEndTime();
		buttonPage.setTime("0", "5", "0");
		buttonPage.clickSaveTime();
		buttonPage.clearAndInputTextButton("Automation testing");
		buttonPage.clickSaveButton();

	}

	@Test
	public void TC_04_New_Button_Top_Right() throws Exception {
		buttonPage.clickNewButton();
		buttonPage.inputNameButton(nameTopRight);
		buttonPage.inputTargetUrl("google.com");
		buttonPage.clickPosition("Top right");
		buttonPage.clickStartTime();
		buttonPage.setTime("0", "0", "0");
		buttonPage.clickSaveTime();
		buttonPage.clickEndTime();
		buttonPage.setTime("0", "5", "0");
		buttonPage.clickSaveTime();
		buttonPage.clearAndInputTextButton(buttonTopRightText);
		buttonPage.clickSaveButton();

	}

	@Test
	public void TC_05_New_Button_Transparent() throws Exception {
		buttonPage.clickNewButton();
		buttonPage.inputNameButton(nameTransparent);
		buttonPage.inputTargetUrl("google.com");
		buttonPage.clickPosition("Transparent");
		buttonPage.clickStartTime();
		buttonPage.setTime("0", "5", "0");
		buttonPage.clickSaveTime();
		buttonPage.clickEndTime();
		buttonPage.setTime("0", "15", "0");
		buttonPage.clickSaveTime();
		buttonPage.clickSaveButton();
		//
//		buttonPage.refreshPage();
//		buttonPage.verifyButton(nameTop);
//		buttonPage.verifyButton(nameBottom);
//		buttonPage.verifyButton(nameFullScreen);
//		buttonPage.verifyButton(nameTopRight);
//		buttonPage.verifyButton(nameTransparent);
	}

	@Test
	public void TC_06_New_Poll_01() throws Exception {
		pollPage.clickPollMenu();
		pollPage.clickNewPoll();
		pollPage.inputNamePoll("poll 1");

		pollPage.clickTimeStartQuestion();
		pollPage.inputTime("0", "0", "5");
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
	public void TC_08_New_Tracking_Code_Open_Registration_Page() throws Exception {
		trackingPage.clickTrackingMenu();
		trackingPage.clickNewTrackingButton();
		trackingPage.inputTrackingName("Open Registration");
		trackingPage.clickEvent();
		trackingPage.selectEvent(openLP);
		trackingPage.inputTrackingBeforeHead(headcode);
		trackingPage.inputTrackingAfterBody(bodycodeafter);
		trackingPage.inputTrackingBeforeBody(bodycodebefore);
		trackingPage.clickSaveButton();
		trackingPage.verifyTrackingCode("Open Registration");
	}

	@Test
	public void TC_09_New_Tracking_Code_Submit_Form() throws Exception {
		trackingPage.clickNewTrackingButton();
		trackingPage.inputTrackingName("Submit Form");
		trackingPage.clickEvent();
		trackingPage.selectEvent(submitForm);
		trackingPage.inputTrackingBeforeHead(headcode);
		trackingPage.inputTrackingAfterBody(bodycodeafter);
		trackingPage.inputTrackingBeforeBody(bodycodebefore);
		trackingPage.clickSaveButton();
		trackingPage.verifyTrackingCode("Submit Form");

	}

	@Test
	public void TC_10_New_Tracking_Code_Open_Comfirmation_Page() throws Exception {
		trackingPage.clickNewTrackingButton();
		trackingPage.inputTrackingName("Open Comfirm Page");
		trackingPage.clickEvent();
		trackingPage.selectEvent(openConfirm);
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
	public void TC_11_New_Tracking_Code_Open_Completed_Page() throws Exception {
		trackingPage.clickNewTrackingButton();
		trackingPage.inputTrackingName("Open Completed Page");
		trackingPage.clickEvent();
		trackingPage.selectEvent(openComlete);
		trackingPage.selectCookies();
		trackingPage.selectCookiesNo();
		trackingPage.inputTrackingBeforeHead(headcode);
		trackingPage.inputTrackingAfterBody(bodycodeafter);
		trackingPage.inputTrackingBeforeBody(bodycodebefore);
		trackingPage.clickSaveButton();
		trackingPage.verifyTrackingCode("Open Completed Page");
	}

	@Test
	public void TC_12_New_Tracking_Code_Open_Room() throws Exception {
		trackingPage.clickNewTrackingButton();
		trackingPage.inputTrackingName("Open Room");
		trackingPage.clickEvent();
		trackingPage.selectEvent(openRoom);
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

	@Test
	public void TC_13_New_Tracking_Code_Open_Room_Time() throws Exception {
		trackingPage.clickNewTrackingButton();
		trackingPage.inputTrackingName("Open Room Time");
		trackingPage.clickEvent();
		trackingPage.selectEvent(openRoomTime);
		trackingPage.roomTimePicker();
		trackingPage.roomTimePickerH("0");
		trackingPage.roomTimePickerM("25");
		trackingPage.roomTimePickerS("30");
		trackingPage.roomTimePickerOK();
		trackingPage.selectCookies();
		trackingPage.selectCookiesYes();
		trackingPage.checkCookiesStatistics();
		trackingPage.checkCookiesMarketing();
		trackingPage.inputTrackingBeforeHead(headcode);
		trackingPage.inputTrackingAfterBody(bodycodeafter);
		trackingPage.inputTrackingBeforeBody(bodycodebefore);
		trackingPage.clickSaveButton();
		trackingPage.verifyTrackingCode("Open Room Time");
	}

	@Test
	public void TC_14_Open_Room() throws Exception {
		previewPage.clickPreviewMenu();
		previewPage.openOptionsPreview();
		previewPage.selectItemTextPreview("Webinar room");
		previewPage.clickOpenPreview();

		// String oldTab = driver.getWindowHandle();
		ArrayList<String> newTab = new ArrayList<String>(driver.getWindowHandles());
		// newTab.remove(oldTab);

		driver.switchTo().window(newTab.get(1));

		previewPage.clickAllowAllCookieBanner();
		delay(3);
		Assert.assertEquals(getTextAlert(driver), "headcode");

		accepAlert(driver);
		delay(1);
		accepAlert(driver);
		delay(1);
		accepAlert(driver);
		delay(1);

		previewPage.clickOnSound();

		previewPage
				.inputChatMessage("Perform a specific action for all customers that are selected via selectbox below");

		previewPage.clickSendButton();

		previewPage.inputChatMessage(
				"Internal name: Under which internal name do you want to manage the webinar in Webinaris?");

		previewPage.clickSendButton();

		previewPage.inputChatMessage("Webinar video: Which video do you want to use for your webinar? ");

		previewPage.clickSendButton();

		Assert.assertEquals(previewPage.getTextButtonTop(), buttonTopText);
		Assert.assertEquals(previewPage.getTextButtonBottom(), buttonBotText);
		Assert.assertEquals(previewPage.getTextButtonTopRight(), buttonTopRightText);

		driver.close();

		driver.switchTo().window(newTab.get(0));

	}

	@AfterClass
	public void afterClass() {
		driver.close();
	}
}
