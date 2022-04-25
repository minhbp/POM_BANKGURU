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
import pageObjects.PagesSettingObject;

public class Project_Pages_Settings extends AbstractPage {
	WebDriver driver;
	WebDriverWait explicitWait;
	WebDriverWait waitExplicit;

	public LoginPageObject loginPage;
	public NewProjectObject newProject;
	public PagesSettingObject settingPage;
	
	String customLpUrl, customConffirmUrl, customCompleteUrl;
	
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
		
		customLpUrl = "https://translate.google.com/{partner-city}/{partner-email}/{partner-email}/{partner-firstname}/{partner-lastname}/{partner-id}/{partner-phone}/{partner-street}/{partner-website}/{partner-zipcode}";
		customConffirmUrl = "https://docs.google.com/spreadsheets/d/1WPxsinkefeCPxqpQXMLabEydIMh11FZpjSR5qDPf9Yo/edit#gid=0";
		customCompleteUrl = "https://zingnews.vn/123";

		loginPage = new LoginPageObject(driver);
		newProject = new NewProjectObject(driver);
		settingPage = new PagesSettingObject(driver);

		loginPage.login();
		newProject.createNewProject();
		Thread.sleep(2000);
	}
	
	@Test
	public void selectPageMyOwn() throws Exception {
		System.out.println("Step 01: clickPagesMenu");
		settingPage.clickPagesMenu();
		
		System.out.println("Step 02: clickPagesSettingsMenu");
		settingPage.clickPagesSettingsMenu();
		
		System.out.println("Step 03: clickPageType");
		settingPage.clickPageType();
		
		System.out.println("Step 04: selectPageMyOwn");
		settingPage.selectPageMyOwn();
		
		System.out.println("Step 05: clicPageOptions");
		settingPage.clicPageOptions();
		
		System.out.println("Step 06: clickTypePageWebsite");
		settingPage.clickTypePageWebsiteLp();
		
		System.out.println("Step 07: inputUrlLp");
		settingPage.inputUrlLp(customLpUrl);
		
		System.out.println("Step 08: clicPageOptions");
		settingPage.clicPageOptions();
		
		System.out.println("Step 09: clickTypePageWebsite");
		settingPage.clickTypePageWebsiteConfirm();
		
		System.out.println("Step 10: inputUrlConfirm");
		settingPage.inputUrlConfirm(customConffirmUrl);
		
		System.out.println("Step 11: clicPageOptions");
		settingPage.clicPageOptions();
		
		System.out.println("Step 12: clickTypePageWebsite");
		settingPage.clickTypePageWebsiteComplete();
		
		System.out.println("Step 13: inputUrlComplete");
		settingPage.inputUrlComplete(customCompleteUrl);
		
		System.out.println("Step 14: clickConfirm");
		settingPage.clickConfirm();
	}
	
	@AfterClass
	public void afterClass() {
		driver.close();
	}
}
