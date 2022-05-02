package queenb.webinaris.account;

import java.util.Random;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import commons.AbstractTest;
import pageObjects.LoginPageObject;
import pageObjects.UploadPageObject;

public class Account_Upload_File extends AbstractTest {
	WebDriver driver;

	public UploadPageObject uploadPage;
	public LoginPageObject loginPage;

	String VIDEOLYSER_NAME, VIDEOLYSER_LINK, VIMEO_NAME, VIDEOMEO_LINK, MP4_NAME, MP4_LINK, LOCAL_VIDEO_LINK,
			LOCAL_IMG_LINK;

	@Parameters("browser")
	@BeforeClass
	public void beforeClass(String browserName) throws Exception {

		driver = openMultiBrowser(browserName);

		VIDEOLYSER_NAME = "video lyser " + randomNumber();
		VIDEOLYSER_LINK = "https://www.videolyser.de/m3u8/26588638.m3u8";

		VIMEO_NAME = "vimeo " + randomNumber();
		VIDEOMEO_LINK = "https://player.vimeo.com/external/475909882.m3u8?s=dd7aca275b34f1a1b979996592c176f929861037";

		MP4_NAME = "mp4 " + randomNumber();
		MP4_LINK = "https://2bewebinaris-fra.s3.amazonaws.com/20062/1644914150425.mp4";

		LOCAL_VIDEO_LINK = "D:\\videos\\123.mp4";
		LOCAL_IMG_LINK = "D:\\images\\img01.jpg";

	}

	public static int randomNumber() {
		Random random = new Random();
		return random.nextInt(9999);
	}

	@Test
	public void TC_01_Login() {
		loginPage = new LoginPageObject(driver);
		loginPage.login();
	}

	@Test
	public void TC_02_Upload_Videolyser() throws Exception {
		uploadPage = new UploadPageObject(driver);
		uploadPage.getUploadUrl();
		uploadPage.clickNewFileButton();
		uploadPage.clickVideoButton();
		uploadPage.clickVideoSourceButton();
		uploadPage.inputNameVideo(VIDEOLYSER_NAME);
		uploadPage.clickSourceStyle();
		uploadPage.selectVideolyser();
		uploadPage.inputUrlVideo(VIDEOLYSER_LINK);
		uploadPage.clickIconLoadingDuration();
		uploadPage.clickButtonSave();
	}

	@Test
	public void TC_03_Upload_VimeoM3u8() throws Exception {
		uploadPage = new UploadPageObject(driver);
		uploadPage.getUploadUrl();
		uploadPage.clickNewFileButton();
		uploadPage.clickVideoButton();
		uploadPage.clickVideoSourceButton();
		uploadPage.inputNameVideo(VIMEO_NAME);
		uploadPage.inputUrlVideo(VIDEOMEO_LINK);
		uploadPage.clickIconLoadingDuration();
		uploadPage.clickButtonSave();
	}

	@Test
	public void TC_04_Upload_VideoMp4() throws Exception {
		uploadPage = new UploadPageObject(driver);
		uploadPage.getUploadUrl();
		uploadPage.clickNewFileButton();
		uploadPage.clickVideoButton();
		uploadPage.clickVideoSourceButton();
		uploadPage.inputNameVideo(MP4_NAME);
		uploadPage.clickSourceStyle();
		uploadPage.selectVideoMp4();
		uploadPage.inputUrlVideo(MP4_LINK);
		uploadPage.clickIconLoadingDuration();
		uploadPage.clickButtonSave();
	}

	@Test
	public void TC_05_Upload_Local() throws Exception {
		uploadPage = new UploadPageObject(driver);
		uploadPage.getUploadUrl();
		uploadPage.clickNewFileButton();
		uploadPage.clickVideoButton();
		uploadPage.uploadVideoLocal(LOCAL_VIDEO_LINK);
	}

	@Test
	public void TC_06_Upload_Image() throws Exception {
		uploadPage = new UploadPageObject(driver);
		uploadPage.getUploadUrl();
		uploadPage.clickNewFileButton();
		uploadPage.uploadImage(LOCAL_IMG_LINK);
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
