package queenb.webinaris.project;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import commons.AbstractTest;
import pageObjects.LoginPageObject;
import pageObjects.NewProjectObject;
import pageObjects.PagesSettingObject;

public class Project_Pages_Settings extends AbstractTest {
	WebDriver driver;
	

	public LoginPageObject loginPage;
	public NewProjectObject newProject;
	public PagesSettingObject settingPage;
	
	String customLpUrl, customConffirmUrl, customCompleteUrl, urlLogo;
	
	@Parameters("browser")
	@BeforeClass
	public void beforeClass(String browserName) throws Exception {

		driver = openMultiBrowser(browserName);
		
		customLpUrl = "https://translate.google.com/{partner-city}/{partner-email}/{partner-email}/{partner-firstname}/{partner-lastname}/{partner-id}/{partner-phone}/{partner-street}/{partner-website}/{partner-zipcode}";
		customConffirmUrl = "https://docs.google.com/spreadsheets/d/1WPxsinkefeCPxqpQXMLabEydIMh11FZpjSR5qDPf9Yo/edit#gid=0";
		customCompleteUrl = "https://zingnews.vn/123";
		urlLogo = "D:\\images\\luoi.jpg";

		loginPage = new LoginPageObject(driver);
		newProject = new NewProjectObject(driver);
		settingPage = new PagesSettingObject(driver);

		loginPage.login();
		newProject.createNewProject();
		Thread.sleep(2000);
	}
	
	@Test
	public void TC_01_selectPageMyOwn() throws Exception {
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
	
	@Test
	public void TC_02_Setting_Logo() {
		settingPage.clickLogoMenu();
		settingPage.clickSelectButton();
		settingPage.inputUrlLogoLocal(urlLogo);
		settingPage.visibleMessage();
		settingPage.clickConfirm();
	}
	
	@AfterClass
	public void afterClass() {
		driver.close();
	}
}
