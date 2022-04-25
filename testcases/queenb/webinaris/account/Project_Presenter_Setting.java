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
import pageObjects.PresenterPageObject;

public class Project_Presenter_Setting extends AbstractPage{
	WebDriver driver;
	WebDriverWait explicitWait;
	WebDriverWait waitExplicit;

	public LoginPageObject loginPage;
	public NewProjectObject newProject;
	public PresenterPageObject presenterPage;
	
	String namePresenter, urlImage;
	
	@BeforeClass
	public void beforeClass() throws Exception {
		System.setProperty("webdriver.chrome.driver", "D:\\WEBDRIVER_API_MinhDV\\browser\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		waitExplicit = new WebDriverWait(driver, 10);

		driver.manage().window().setPosition(new Point(960, 0)); // set start point
		Dimension d = new Dimension(960, 1080); // set width height browser
		driver.manage().window().setSize(d);
//		driver.manage().window().maximize();
		
		namePresenter = "Lionel Messi";
		urlImage = "D:\\images\\img01.jpg";
		
		loginPage = new LoginPageObject(driver);
		newProject = new NewProjectObject(driver);
		presenterPage = new PresenterPageObject(driver);

		loginPage.login();
		newProject.createNewProject();
		Thread.sleep(2000);
	}
	
	@Test
	public void selectPresenter() {
		presenterPage.clickPresenterMenu();
		presenterPage.clearPresenterName();
		presenterPage.inputPresenterName(namePresenter);
		presenterPage.clickSelectImage();
		presenterPage.inputUrlImage(urlImage);
		presenterPage.clickConfirm();
	}
	

	@AfterClass
	public void afterClass() {
		driver.close();
	}
}
