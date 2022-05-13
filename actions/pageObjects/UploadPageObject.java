package pageObjects;

import org.openqa.selenium.WebDriver;

import commons.AbstractPage;
import pageUIs.UploadPageUI;

public class UploadPageObject extends AbstractPage {

	private WebDriver driver;

	public UploadPageObject(WebDriver mappingdriver) {
		driver = mappingdriver;
	}

	public void getUploadUrl() {
		openAnyUrl(driver, UploadPageUI.UPLOAD_PAGE_URL);
	}

	public void clickNewFileButton() {
		waitToElementVisible(driver, UploadPageUI.BUTTON_NEW_FILE);
		waitToEnableButton(driver, UploadPageUI.BUTTON_NEW_FILE);
		clickToElement(driver, UploadPageUI.BUTTON_NEW_FILE);
	}

	public void clickVideoButton() throws Exception {
		scrollToElement(driver, UploadPageUI.BUTTON_VIDEO);
		waitToEnableButton(driver, UploadPageUI.BUTTON_VIDEO);
		Thread.sleep(500);
		clickToElement(driver, UploadPageUI.BUTTON_VIDEO);
	}

	public void clickVideoSourceButton() throws Exception {
		scrollToElement(driver, UploadPageUI.BUTTON_VIDEO_SOUCRE);
		waitToEnableButton(driver, UploadPageUI.BUTTON_VIDEO_SOUCRE);
		Thread.sleep(500);
		clickToElement(driver, UploadPageUI.BUTTON_VIDEO_SOUCRE);
	}

	public void inputNameVideo(String nameVideo) {
		waitToElementVisible(driver, UploadPageUI.VIDEO_SOUCRE_NAME);
		sendkeyToElement(driver, UploadPageUI.VIDEO_SOUCRE_NAME, nameVideo);
	}

	public void clickSourceStyle() {
		waitToElementVisible(driver, UploadPageUI.VIDEO_SOUCRE_STYLE);
		clickToElement(driver, UploadPageUI.VIDEO_SOUCRE_STYLE);
	}

	public void selectVideolyser() throws Exception {
		waitToElementVisible(driver, UploadPageUI.VIDEO_SOUCRE_STYLE_VIDEOLYSER);
		Thread.sleep(500);
		clickToElement(driver, UploadPageUI.VIDEO_SOUCRE_STYLE_VIDEOLYSER);
	}

	public void selectVideoMp4() throws Exception {
		waitToElementVisible(driver, UploadPageUI.VIDEO_SOUCRE_STYLE_MP4);
		Thread.sleep(500);
		clickToElement(driver, UploadPageUI.VIDEO_SOUCRE_STYLE_MP4);
	}

	public void inputUrlVideo(String urlVideo) {
		waitToElementVisible(driver, UploadPageUI.VIDEO_SOUCRE_URL);
		sendkeyToElement(driver, UploadPageUI.VIDEO_SOUCRE_URL, urlVideo);
	}

	public void clickIconLoadingDuration() {
		waitToElementVisible(driver, UploadPageUI.ICON_LOAD_DURATION);
		clickToElement(driver, UploadPageUI.ICON_LOAD_DURATION);
	}

	public void clickButtonSave() {
		scrollToElement(driver, UploadPageUI.BUTTON_VIDEO_SOUCRE_BUTTON_SAVE);
		waitToEnableButton(driver, UploadPageUI.BUTTON_VIDEO_SOUCRE_BUTTON_SAVE);
		clickToElement(driver, UploadPageUI.BUTTON_VIDEO_SOUCRE_BUTTON_SAVE);
		waitToElementVisible(driver, UploadPageUI.UPLOAD_SUCCESS_MESSAGE);
	}

	public void uploadVideoLocal(String urlVideoLocal) {
		scrollToElement(driver, UploadPageUI.BUTTON_VIDEO_UPLOAD_STEP2);
		waitToEnableButton(driver, UploadPageUI.BUTTON_VIDEO_UPLOAD_STEP2);
		clickToElement(driver, UploadPageUI.BUTTON_VIDEO_UPLOAD_STEP2);

		waitToElementVisible(driver, UploadPageUI.VIDEO_UPLOAD_BUTTON_STEP3);
		sendkeyToElement(driver, UploadPageUI.VIDEO_UPLOAD_INPUT_DATA, urlVideoLocal);
		waitToElementVisible(driver, UploadPageUI.VIDEO_UPLOAD_100);
		waitToElementVisible(driver, UploadPageUI.UPLOAD_SUCCESS_MESSAGE);
		waitToElementInvisible(driver, UploadPageUI.UPLOAD_SUCCESS_MESSAGE);
	}

	public void uploadImage(String urlImageLocal) {
		waitToElementVisible(driver, UploadPageUI.FILE_UPLOAD_LABEL);
		sendkeyToElement(driver, UploadPageUI.FILE_UPLOAD_DATA, urlImageLocal);
		waitToElementVisible(driver, UploadPageUI.UPLOAD_SUCCESS_MESSAGE);
	}

	public void deleteVideo() throws Exception {
		waitToElementVisible(driver, UploadPageUI.UPLOAD_ICONS_SELECT);
		clickToElement(driver, UploadPageUI.UPLOAD_ICONS_SELECT);
		Thread.sleep(500);

		waitToElementVisible(driver, UploadPageUI.UPLOAD_DELETE_OPTION);
		clickToElement(driver, UploadPageUI.UPLOAD_DELETE_OPTION);
		Thread.sleep(500);

		waitToEnableButton(driver, UploadPageUI.UPLOAD_CONFIRM_BUTTON);
		clickToElement(driver, UploadPageUI.UPLOAD_CONFIRM_BUTTON);
		Thread.sleep(1000);
	}
	
	public void selectFileStyle() {
		waitToElementVisible(driver, UploadPageUI.SELECT_FILE_STYLE);
		clickToElement(driver, UploadPageUI.SELECT_FILE_STYLE);
	}
	
	public void selectItem(String item) {
		waitToElementVisible(driver, UploadPageUI.CHOOSE_ITEM, item);
		clickToElement(driver, UploadPageUI.CHOOSE_ITEM, item);
	}
	
	public void loading() {
		waitToElementVisibleIconLoading(driver);
		waitToElementInvisibleIconLoading(driver);
	}

}
