package queenb.webinaris.account;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pageObjects.DeletePageObject;
import pageObjects.LoginPageObject;

public class Account_Delete_Project {

	WebDriver driver;
	WebDriverWait explicitWait;
	WebDriverWait waitExplicit;
	
	public LoginPageObject loginPage;
	public DeletePageObject deletePage;
	
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
		deletePage = new DeletePageObject(driver);
		loginPage.login();
	}
	
	@Test
	public void delProject() {
		deletePage.deleteProject();
	}
}
