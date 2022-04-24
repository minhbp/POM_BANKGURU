package queenb.webinaris.account;

import java.util.Random;
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
import pageObjects.RegisterPageObject;
import pageObjects.ShowtimePageObject;

public class Registration_Lp extends AbstractPage {
	WebDriver driver;
	WebDriverWait explicitWait;

	public LoginPageObject loginPage;
	public NewProjectObject newProject;
	public ShowtimePageObject showtimePage;
	public RegisterPageObject registerPage;

	@BeforeClass
	public void beforeClass() {
		System.setProperty("webdriver.chrome.driver", "D:\\WEBDRIVER_API_MinhDV\\browser\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		explicitWait = new WebDriverWait(driver, 20);
		
		driver.manage().window().setPosition(new Point(1920, 0)); // set start point
		Dimension d = new Dimension(960, 1080); // set width height browser
		driver.manage().window().setSize(d);
//		driver.manage().window().maximize();
	}

	public int randomNumber() {
		Random random = new Random();
		return random.nextInt(999);
	}

	@Test
	public void TC_01_Login() {
		loginPage = new LoginPageObject(driver);
		loginPage.login();
	}

	@Test
	public void TC_02_New_Project() {
		newProject = new NewProjectObject(driver);
		newProject.createNewProject();
	}

	@Test
	public void TC_03_Setting_Showtimes() throws Exception {
		showtimePage = new ShowtimePageObject(driver);
		showtimePage.clickShowtimeMenu();
		showtimePage.clickOption();
		showtimePage.clickOptionMyself();
		showtimePage.clickOption60Minutes();
		showtimePage.clickOption5Minutes();
		showtimePage.clickOptionNo();
		showtimePage.clickOptionYes();
		showtimePage.clickButtonSave();
		Thread.sleep(6000);
	}

	@Test
	public void TC_04_Register() {
		
		String urlBasicSetting = getCurrentPageUrl(driver);
		String fb050 = urlBasicSetting.substring(35);
		openAnyUrl(driver, "https://20071.webinaris.co/" + fb050 + "/selenium.html?mode=N&v=4");
		
		registerPage = new RegisterPageObject(driver);
		registerPage.clickButton();
		registerPage.inputFirtname();
		registerPage.inputLastname();
		registerPage.inputEmail();
		registerPage.clickButtonSubmit();
	}

	@AfterClass
	public void afterClass() {
		driver.close();
	}
}
