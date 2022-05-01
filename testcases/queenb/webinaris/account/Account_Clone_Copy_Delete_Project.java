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

import pageObjects.ClonePageObject;
import pageObjects.DeletePageObject;
import pageObjects.LoginPageObject;

public class Account_Clone_Copy_Delete_Project {

	WebDriver driver;
	WebDriverWait explicitWait;
	WebDriverWait waitExplicit;

	public LoginPageObject loginPage;
	public ClonePageObject clonePage;
	public DeletePageObject deletePage;

	@BeforeClass
	public void beforeClass() throws Exception {
		System.setProperty("webdriver.chrome.driver", ".\\resources\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		waitExplicit = new WebDriverWait(driver, 10);

		driver.manage().window().setPosition(new Point(0, 0)); // set start point
		Dimension d = new Dimension(960, 1080); // set width height browser
		driver.manage().window().setSize(d);
		driver.manage().window().maximize();

		loginPage = new LoginPageObject(driver);
		clonePage = new ClonePageObject(driver);
		deletePage = new DeletePageObject(driver);
		loginPage.login();
	}

	@Test
	public void TC_01_Clone_Project() throws Exception {
		clonePage.getMyWebinar();
		clonePage.clickNewProject();
		clonePage.clickCloneProject();
		clonePage.clickOpenListProjects();
		clonePage.selectFirstProject();
		clonePage.clickButtonClone();
	}
	
	@Test
	public void TC_02_Copy_Project() throws Exception {
		clonePage.getMyWebinar();
		clonePage.clickNewProject();
		clonePage.clickEnterCodeButton();
		clonePage.inputCode("11AC258A6C52E110");
		clonePage.clickCopy();
	}
	
	@Test
	public void TC_03_delProject() throws Exception {
		deletePage.getMyWebinar();

		for (int i = 0, n = 2; i < n; i++) {
			deletePage.deleteProject();
		}
	}

	@AfterClass
	public void afterClass() {
		driver.close();
	}
}
