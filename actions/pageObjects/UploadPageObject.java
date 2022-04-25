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

	public void clickNewFileButton() throws Exception {
		waitToElementVisible(driver, UploadPageUI.BUTTON_NEW_FILE);
		waitToEnableButton(driver, UploadPageUI.BUTTON_NEW_FILE);
		clickToElement(driver, UploadPageUI.BUTTON_NEW_FILE);
		Thread.sleep(1000);
	}

	public void clickVideoButton() throws Exception {
		waitToElementVisible(driver, UploadPageUI.BUTTON_VIDEO);
		waitToEnableButton(driver, UploadPageUI.BUTTON_VIDEO);
		clickToElement(driver, UploadPageUI.BUTTON_VIDEO);
		waitToEnableButton(driver, UploadPageUI.BUTTON_VIDEO_SOUCRE);
		Thread.sleep(1000);
	}

	public void clickVideoSourceButton() throws Exception {
		waitToEnableButton(driver, UploadPageUI.BUTTON_VIDEO_SOUCRE);
		clickToElement(driver, UploadPageUI.BUTTON_VIDEO_SOUCRE);
		Thread.sleep(1000);
	}

	public void inputNameVideo(String nameVideo) {
		waitToElementVisible(driver, UploadPageUI.VIDEO_SOUCRE_NAME);
		sendkeyToElement(driver, UploadPageUI.VIDEO_SOUCRE_NAME, nameVideo);
	}

	public void clickSourceStyle() throws Exception {
		waitToElementVisible(driver, UploadPageUI.VIDEO_SOUCRE_STYLE);
		clickToElement(driver, UploadPageUI.VIDEO_SOUCRE_STYLE);
		Thread.sleep(1000);
	}

	public void selectVimeo() {
		waitToElementVisible(driver, UploadPageUI.VIDEO_SOUCRE_STYLE_VIDEOLYSER);
		clickToElement(driver, UploadPageUI.VIDEO_SOUCRE_STYLE_VIDEOLYSER);
	}

	public void selectVideolyser() {
		waitToElementVisible(driver, UploadPageUI.VIDEO_SOUCRE_STYLE_VIDEOLYSER);
		clickToElement(driver, UploadPageUI.VIDEO_SOUCRE_STYLE_VIDEOLYSER);
	}

	public void selectVideoMp4() {
		waitToElementVisible(driver, UploadPageUI.VIDEO_SOUCRE_STYLE_MP4);
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
		waitToElementVisible(driver, UploadPageUI.BUTTON_VIDEO_SOUCRE_BUTTON_SAVE);
		waitToEnableButton(driver, UploadPageUI.BUTTON_VIDEO_SOUCRE_BUTTON_SAVE);
		clickToElement(driver, UploadPageUI.BUTTON_VIDEO_SOUCRE_BUTTON_SAVE);
		waitToElementVisible(driver, UploadPageUI.UPLOAD_SUCCESS_MESSAGE);
		clickToElement(driver, UploadPageUI.CLOSE_MESSAGE_ICON);
	}

	public void uploadVideoLocal(String urlVideoLocal) {
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
		clickToElement(driver, UploadPageUI.CLOSE_MESSAGE_ICON);
	}

	public void deleteVideo() {
		waitToElementVisible(driver, UploadPageUI.UPLOAD_ICONS_SELECT);
		clickToElement(driver, UploadPageUI.UPLOAD_ICONS_SELECT);

		waitToElementVisible(driver, UploadPageUI.UPLOAD_DELETE_OPTION);
		clickToElement(driver, UploadPageUI.UPLOAD_DELETE_OPTION);

		waitToEnableButton(driver, UploadPageUI.UPLOAD_CONFIRM_BUTTON);
		clickToElement(driver, UploadPageUI.UPLOAD_CONFIRM_BUTTON);

		waitToElementVisible(driver, UploadPageUI.UPLOAD_SUCCESS_MESSAGE);
		clickToElement(driver, UploadPageUI.CLOSE_MESSAGE_ICON);

		waitToElementVisibleIconLoading(driver);
		waitToElementInvisibleIconLoading(driver);
	}

}
