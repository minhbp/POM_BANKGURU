package queenb.webinaris.account;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import commons.AbstractPage;
import pageObjects.LoginPageObject;
import pageObjects.UploadPageObject;

public class Level_03_Account_Upload_File extends AbstractPage {
	WebDriver driver;
	WebDriverWait explicitWait;
	WebDriverWait waitExplicit;

	public UploadPageObject uploadPage;
	public LoginPageObject loginPage;

	@BeforeClass
	public void beforeClass() throws Exception {
		System.setProperty("webdriver.chrome.driver", "D:\\WEBDRIVER_API_MinhDV\\browser\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		waitExplicit = new WebDriverWait(driver, 30);

		// driver.manage().window().setPosition(new Point(1020, 0)); // set start point
		// browser
		// Dimension d = new Dimension(500, 500); // set width height browser
		// driver.manage().window().setSize(d);
		driver.manage().window().maximize();
	}

	@Test
	public void TC_01_Login() {
		loginPage = new LoginPageObject(driver);
		loginPage.getLoginPageUrl();
		loginPage.setLanguage();
		loginPage.inputEmailTextbox();
		loginPage.inputPasswordTextbox();
		loginPage.clickButtonLogin();
		loginPage.isDisplayText();
	}

	@Test
	public void TC_02_Upload_Videolyser() {
		uploadPage = new UploadPageObject(driver);
		uploadPage.getUploadUrl();
		uploadPage.clickNewFileButton();
		uploadPage.clickVideoButton();
		uploadPage.clickVideoSoucreButton();
		uploadPage.newVideoLyser();
		uploadPage.clickIconLoadingDuration();
		uploadPage.clickButtonSave();
	}

	@Test
	public void TC_03_Upload_VimeoM3u8() {
		uploadPage = new UploadPageObject(driver);
		uploadPage.getUploadUrl();
		uploadPage.clickNewFileButton();
		uploadPage.clickVideoButton();
		uploadPage.clickVideoSoucreButton();
		uploadPage.newVimeo();
		uploadPage.clickIconLoadingDuration();
		uploadPage.clickButtonSave();
	}

	@Test
	public void TC_04_Upload_VideoMp4() {
		uploadPage = new UploadPageObject(driver);
		uploadPage.getUploadUrl();
		uploadPage.clickNewFileButton();
		uploadPage.clickVideoButton();
		uploadPage.clickVideoSoucreButton();
		uploadPage.newMp4();
		uploadPage.clickIconLoadingDuration();
		uploadPage.clickButtonSave();
	}

	@Test
	public void TC_05_Upload_Local() {
		uploadPage = new UploadPageObject(driver);
		uploadPage.getUploadUrl();
		uploadPage.clickNewFileButton();
		uploadPage.clickVideoButton();
		uploadPage.uploadVideoLocal();
	}
	
	@Test
	public void TC_06_Upload_Image() {
		uploadPage = new UploadPageObject(driver);
		uploadPage.getUploadUrl();
		uploadPage.clickNewFileButton();
		uploadPage.uploadImage();
	}

	public void Delete_Video() {
		uploadPage = new UploadPageObject(driver);
		uploadPage.deleteVideo();
	}

	@Test
	public void TC_07_Delete_Videos() {
		uploadPage = new UploadPageObject(driver);
		uploadPage.getUploadUrl();
		for (int i = 0, n = 4; i < n; i++) {
			Delete_Video();
		}
	}

	@AfterClass
	public void afterClass() {
		driver.close();
	}
}
