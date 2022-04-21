package queenb.webinaris.account;

import java.util.Random;
import java.util.concurrent.TimeUnit;

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

public class Level_03_LP_Registration_Page_Object_Pattern extends AbstractPage {
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

//		driver.manage().window().setPosition(new Point(1020, 0)); // set start point browser
//		Dimension d = new Dimension(500, 500); // set width height browser
//		driver.manage().window().setSize(d);
		driver.manage().window().maximize();

	}

	public int randomNumber() {
		Random random = new Random();
		return random.nextInt(999);
	}

	@Test
	public void TC_01_Login() {

		loginPage = new LoginPageObject(driver);
		loginPage.getLoginPageUrl();
		loginPage.setLanguage();
		loginPage.inputEmailTextbox();
		loginPage.inputPasswordTextbox();
		loginPage.clickButtonLogin();

	}

	@Test
	public void TC_02_New_Project() throws Exception {

		newProject = new NewProjectObject(driver);
		newProject.getNewProjectPageUrl();
		newProject.inputTitleProject();
		newProject.inputSubTitleProject();
		newProject.clickButtonCreate();
		newProject.waitLoadingIconInvisible();

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

	public void delay(int x) throws Exception {
		Thread.sleep(x * 1000);
	}

	@AfterClass
	public void afterClass() {
		driver.close();
	}
}
