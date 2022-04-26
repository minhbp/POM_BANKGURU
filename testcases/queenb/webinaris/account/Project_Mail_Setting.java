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
import pageObjects.NewProjectObject;
import pageObjects.EmailsPageObject;

public class Project_Mail_Setting extends AbstractPage{
	WebDriver driver;
	WebDriverWait explicitWait;
	WebDriverWait waitExplicit;

	public LoginPageObject loginPage;
	public NewProjectObject newProject;
	public EmailsPageObject emailsPage;
	
	String nameSender, mailAddress;
	
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
		emailsPage.clickReRegistrationOptions();
		emailsPage.selectReRegistrationisYes();
		emailsPage.clickConfirmButton();
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
