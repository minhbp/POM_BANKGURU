package queenb.webinaris.project;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import commons.AbstractTest;
import pageObjects.EmailsPageObject;
import pageObjects.LoginPageObject;
import pageObjects.NewProjectObject;

public class Project_Mail_Setting extends AbstractTest {
	WebDriver driver;

	public LoginPageObject loginPage;
	public NewProjectObject newProject;
	public EmailsPageObject emailsPage;

	String nameSender, mailAddress;

	@Parameters("browser")
	@BeforeClass
	public void beforeClass(String browserName) throws Exception {

		driver = openMultiBrowser(browserName);

		nameSender = "Lionel Messi";
		mailAddress = "minhbp252+213232@gmail.com";

		loginPage = new LoginPageObject(driver);
		newProject = new NewProjectObject(driver);
		emailsPage = new EmailsPageObject(driver);

		loginPage.login();
		newProject.createNewProject();
		Thread.sleep(2000);
	}

	@Test
	public void TC_01_Setting_Mail_Sender() {
		emailsPage.clickEmailMenu();
		emailsPage.clickSenderMenu();
		emailsPage.clearNameSender();
		emailsPage.inputNameSender(nameSender);
		emailsPage.clearMailAddress();
		emailsPage.inputMailAddress(mailAddress);
		emailsPage.clickConfirmButton();
	}

	@Test
	public void TC_02_Setting_Mail_Setting() {
		emailsPage.clickSettingMenu();
		emailsPage.clickDoiOptions();
		emailsPage.selectDoiIsNo();
		emailsPage.clickConfirmButton();

		emailsPage.clickDoiOptions();
		emailsPage.selectDoiIsYes();
		emailsPage.clickSave();
		emailsPage.clickDoiOptions();
		emailsPage.selectDoiForUnsubcribe();
		emailsPage.clickSave();

		emailsPage.clickReRegistrationOptions();
		emailsPage.selectReRegistrationisYes();
		emailsPage.clickSave();
		emailsPage.clickReRegistrationOptions();
		emailsPage.selectReRegistrationisNo();
		emailsPage.clickSave();

	}

	@Test
	public void TC_03_Delete_Email_Template() {
		emailsPage.clickEmailEmailMenu();
		emailsPage.clickOptionMailLoginInfo();
		emailsPage.clickDeleteOption();
		emailsPage.clickConfirmDelete();
	}

	@Test
	public void TC_04_Load_Email_Template() throws Exception {
		emailsPage.clickNewEmailButton();
		emailsPage.clickSelectTemplateButotn();
		emailsPage.clickLoadTemplateButton();
		emailsPage.clickSave();
	}

	@AfterClass
	public void afterClass() {
		driver.close();
	}
}
