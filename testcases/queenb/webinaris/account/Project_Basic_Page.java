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
import pageObjects.BasicPageObject;
import pageObjects.LoginPageObject;
import pageObjects.NewProjectObject;

public class Project_Basic_Page extends AbstractPage {
	WebDriver driver;
	WebDriverWait explicitWait;
	WebDriverWait waitExplicit;

	public LoginPageObject loginPage;
	public NewProjectObject newProject;
	public BasicPageObject basicPage;
	
	String titleProject, subtitleProject;
	
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
		
		titleProject = "21343243";
		subtitleProject = "ds fr 234r23cdsf 23  sd";
		
		loginPage = new LoginPageObject(driver);
		newProject = new NewProjectObject(driver);
		basicPage = new BasicPageObject(driver);

		loginPage.login();
		newProject.createNewProject();
		Thread.sleep(2000);
	}
	
	@Test
	public void settingBasic() {
		basicPage.clearTitle();
		basicPage.inputTitle(titleProject);
		basicPage.clearSubTitle();
		basicPage.inputSubTitle(subtitleProject);
		basicPage.clickConfirm();
	}
	
	@AfterClass
	public void afterClass() {
		driver.close();
	}
}
