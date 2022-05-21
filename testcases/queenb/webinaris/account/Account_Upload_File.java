package queenb.webinaris.account;

import java.util.Random;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import commons.AbstractTest;
import pageObjects.LoginPageObject;
import pageObjects.UploadPageObject;

public class Account_Upload_File extends AbstractTest {
	WebDriver driver;
	WebDriverWait waitExplicit;

	public UploadPageObject uploadPage;
	public LoginPageObject loginPage;

	String VIDEOLYSER_NAME, VIDEOLYSER_LINK, VIMEO_NAME, VIDEOMEO_LINK, MP4_NAME, MP4_LINK, LOCAL_VIDEO_URL,
			LOCAL_IMG_URL, LOCAL_DOCUMENT_URL;

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

		LOCAL_VIDEO_URL = "D:\\videos\\123.mp4";
		LOCAL_IMG_URL = "D:\\images\\img01.jpg";
		LOCAL_DOCUMENT_URL = "D:\\images\\test1.txt";

		uploadPage = new UploadPageObject(driver);
		loginPage = new LoginPageObject(driver);
		loginPage.login();

	}

	public static int randomNumber() {
		Random random = new Random();
		return random.nextInt(9999);
	}

	@Test
	public void TC_01_Upload_Videolyser() throws Exception {
		log("===========TC_01_Upload_Videolyser==========");
		log("step 01: open url login");
		uploadPage.getUploadUrl();
		log("step 02: click button new file");
		uploadPage.clickNewFileButton();
		log("step 03: click button Video");
		uploadPage.clickVideoButton();
		log("step 04: click button External video source");
		uploadPage.clickVideoSourceButton();
		log("step 05: input name videolyser");
		uploadPage.inputNameVideo(VIDEOLYSER_NAME);
		log("step 06: click source style");
		uploadPage.clickSourceStyle();
		log("step 07: select video lyser");
		uploadPage.selectVideolyser();
		log("step 08: input url video lyser");
		uploadPage.inputUrlVideo(VIDEOLYSER_LINK);
		log("step 09: click icon load duration video");
		uploadPage.clickIconLoadingDuration();
		log("step 10: click button save");
		uploadPage.clickButtonSave();
	}

	@Test
	public void TC_02_Upload_VimeoM3u8() throws Exception {
		log("===========TC_02_Upload_VimeoM3u8==========");
		log("step 01: open url login");
		uploadPage.getUploadUrl();
		log("step 02: click button new file");
		uploadPage.clickNewFileButton();
		log("step 03: click button Video");
		uploadPage.clickVideoButton();
		log("step 04: click button External video source");
		uploadPage.clickVideoSourceButton();
		log("step 05: input name vimeo");
		uploadPage.inputNameVideo(VIMEO_NAME);
		log("step 06: input url video lyser");
		uploadPage.inputUrlVideo(VIDEOMEO_LINK);
		log("step 07: click icon load duration video");
		uploadPage.clickIconLoadingDuration();
		log("step 08: click button save");
		uploadPage.clickButtonSave();
		
	}

	@Test
	public void TC_03_Upload_VideoMp4() throws Exception {
		log("===========TC_03_Upload_VideoMp4==========");
		log("step 01: open url login");
		uploadPage.getUploadUrl();
		log("step 02: click button new file");
		uploadPage.clickNewFileButton();
		log("step 03: click button Video");
		uploadPage.clickVideoButton();
		log("step 04: click button External video source");
		uploadPage.clickVideoSourceButton();
		log("step 05: input name video mp4");
		uploadPage.inputNameVideo(MP4_NAME);
		log("step 06: click source style");
		uploadPage.clickSourceStyle();
		log("step 07: select video mp4");
		uploadPage.selectVideoMp4();
		log("step 08: input url video mp4");
		uploadPage.inputUrlVideo(MP4_LINK);
		log("step 09: click icon load duration video");
		uploadPage.clickIconLoadingDuration();
		log("step 10: click button save");
		uploadPage.clickButtonSave();
		
	}

	@Test
	public void TC_04_Upload_Local() throws Exception {
		waitExplicit = new WebDriverWait(driver, 200);
		driver.manage().timeouts().implicitlyWait(200, TimeUnit.SECONDS);
		log("===========TC_04_Upload_Local==========");
		log("step 01: open url login");
		uploadPage.getUploadUrl();
		log("step 02: click button new file");
		uploadPage.clickNewFileButton();
		log("step 03: click button Video");
		uploadPage.clickVideoButton();
		log("step 04: input url video local");
		uploadPage.uploadVideoLocal(LOCAL_VIDEO_URL);
	}

	@Test
	public void TC_05_Upload_Image() throws Exception {
		waitExplicit = new WebDriverWait(driver, 20);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		log("===========TC_05_Upload_Image==========");
		log("step 01: open url login");
		uploadPage.getUploadUrl();
		log("step 02: click button new file");
		uploadPage.clickNewFileButton();
		log("step 03: input url image local");
		uploadPage.uploadImage(LOCAL_IMG_URL);
		
	}

	@Test
	public void TC_06_Upload_Document() throws Exception {
		log("===========TC_06_Upload_Document==========");
		log("step 01: open url login");
		uploadPage.getUploadUrl();
		log("step 02: click button new file");
		uploadPage.clickNewFileButton();
		log("step 03: input url document local");
		uploadPage.uploadImage(LOCAL_DOCUMENT_URL);
		
	}

	public void Delete_Video() throws Exception {
		uploadPage.deleteVideo();
		// uploadPage.loading();
	}

	@Test
	public void TC_07_Delete_Videos() throws Exception {
		uploadPage.getUploadUrl();
		for (int i = 0, n = 3; i < n; i++) {
			Delete_Video();
		}
	}

	@Test
	public void TC_08_Delete_image() throws Exception {
		uploadPage.selectFileStyle();
		uploadPage.selectItem("2");
		uploadPage.loading();

		for (int i = 0, n = 1; i < n; i++) {
			Delete_Video();
		}
	}

	@Test
	public void TC_09_Delete_Document() throws Exception {
		uploadPage.selectFileStyle();
		uploadPage.selectItem("4");
		uploadPage.loading();

		for (int i = 0, n = 1; i < n; i++) {
			Delete_Video();
		}
	}

	@AfterClass
	public void afterClass() {
		driver.close();
	}
}
