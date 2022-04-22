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
import pageObjects.PollPageObject;

public class Project_Polls_Setting extends AbstractPage {

	WebDriver driver;
	WebDriverWait explicitWait;
	WebDriverWait waitExplicit;
	
	public LoginPageObject loginPage;
	public NewProjectObject newProject;
	public PollPageObject pollPage;
	
	@BeforeClass
	public void beforeClass() throws Exception {
		System.setProperty("webdriver.chrome.driver", "D:\\WEBDRIVER_API_MinhDV\\browser\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		waitExplicit = new WebDriverWait(driver, 10);

		driver.manage().window().setPosition(new Point(2880, 0)); // set start point
		Dimension d = new Dimension(960, 1080); // set width height browser
		driver.manage().window().setSize(d);
//		driver.manage().window().maximize();

		loginPage = new LoginPageObject(driver);
		newProject = new NewProjectObject(driver);
		pollPage = new PollPageObject(driver);

		loginPage.login();
		newProject.createNewProject();
		Thread.sleep(2000);
		pollPage.clickPollMenu();
	}
	
	@Test
	public void TC_01_New_Poll_01() {
		pollPage.newPoll("Poll test 01", "0", "0", "0",
				"0", "5", "0", 
				"0", "5", "0", 
				"0", "30", "0", 
				"em ăn cơm chưa?",
				"chưa", "20", 
				"vẫn chưa nhưng đáp án khác", "80");
	}
	@Test
	
	public void TC_02_New_Poll_02() {
		pollPage.newPoll("Poll test 02", "0", "5", "0",
				"0", "15", "3", 
				"0", "15", "40", 
				"0", "45", "50", 
				"nhà em có chó không?",
				"có nhưng nó không cắn đâu", "35", 
				"vẫn có và vẫn không cắn đâu", "65");
	}
	
	@AfterClass
	public void afterClass() {
		driver.close();
	}
}


