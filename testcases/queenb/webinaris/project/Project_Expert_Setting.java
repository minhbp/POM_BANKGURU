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
import pageObjects.ExpertPageObject;
import pageObjects.LoginPageObject;
import pageObjects.NewProjectObject;

public class Project_Expert_Setting extends AbstractPage {
	WebDriver driver;
	WebDriverWait explicitWait;
	WebDriverWait waitExplicit;

	public LoginPageObject loginPage;
	public NewProjectObject newProject;
	public ExpertPageObject expertPage;
	
	String closeRoom, urlRedirect;

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
		
		closeRoom = "50";
		urlRedirect = "google.com.vn";

		loginPage = new LoginPageObject(driver);
		newProject = new NewProjectObject(driver);
		expertPage = new ExpertPageObject(driver);

		loginPage.login();
		newProject.createNewProject();
		Thread.sleep(2000);
	}
	
	@Test
	public void TC_01_Region_Setting() throws Exception {
		expertPage.clickExpertMenu();
		expertPage.clickRegionMenu();
		expertPage.clickTimezone();
		expertPage.selectTimezone7();
		expertPage.clickTimeFormat();
		expertPage.selectTimeAmPm();
		expertPage.clickDateFormat();
		expertPage.selectOption7DateFormat();
		expertPage.clickSave();
	}
	
	@Test
	public void TC_02_Deails_Setting() throws Exception {
		expertPage.clickDetailMenu();
		expertPage.clickStatusParticipant();
		expertPage.selectStatus25();
		expertPage.clickMobileDevices();
		expertPage.selectMobileYes();
		expertPage.clickDelay();
		expertPage.selectDelay3Minutes();
		expertPage.clearCloseRoom();
		expertPage.inputCloseRoom(closeRoom);
		expertPage.clickSave();
	}
	
	@Test
	public void TC_03_Redirect_Setting() throws Exception {
		expertPage.clickRedirectMenu();
		expertPage.inputUrlRedirect(urlRedirect);
		expertPage.clickSave();
	}
	
	@Test
	public void TC_04_Replay_Setting() throws Exception {
		expertPage.clickReplayMenu();
		expertPage.clickOptionReplay();
		expertPage.selectOptionYes();
		expertPage.clickSave();
		expertPage.clickOptionReplay();
		expertPage.selectOptionNo();
		expertPage.clickSave();
	}
	
	@AfterClass
	public void afterClass() {
		driver.close();
	}
}
