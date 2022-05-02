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

public class Project_Buttons_Setting extends AbstractTest {
	WebDriver driver;

	public LoginPageObject loginPage;
	public NewProjectObject newProject;
	public ButtonPageObject buttonPage;

	@Parameters("browser")
	@BeforeClass
	public void beforeClass(String browserName) throws Exception {

		driver = openMultiBrowser(browserName);

		loginPage = new LoginPageObject(driver);
		newProject = new NewProjectObject(driver);
		buttonPage = new ButtonPageObject(driver);

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

	@AfterClass
	public void afterClass() {
		driver.close();
	}
}
