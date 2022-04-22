package pageObjects;

import org.openqa.selenium.WebDriver;

import commons.AbstractPage;
import pageUIs.UploadPageUI;

public class UploadPageObject extends AbstractPage {

private WebDriver driverGlobal;
	
	public UploadPageObject (WebDriver driverLocal) {
		driverGlobal = driverLocal;
	}
	
	public void getUploadUrl() {
		openAnyUrl(driverGlobal, UploadPageUI.UPLOAD_PAGE_URL);
	}
	
	public void clickNewFileButton() {
		waitToElementVisible(driverGlobal, UploadPageUI.BUTTON_NEW_FILE);
		waitToEnableButton(driverGlobal, UploadPageUI.BUTTON_NEW_FILE);
		clickToElement(driverGlobal, UploadPageUI.BUTTON_NEW_FILE);
	}
	
	public void clickVideoButton() {
		waitToElementVisible(driverGlobal, UploadPageUI.BUTTON_VIDEO);
		waitToEnableButton(driverGlobal, UploadPageUI.BUTTON_VIDEO);
		clickToElement(driverGlobal, UploadPageUI.BUTTON_VIDEO);
	}
	
	public void clickVideoSourceButton() {
		waitToEnableButton(driverGlobal, UploadPageUI.BUTTON_VIDEO_SOUCRE);
		clickToElement(driverGlobal, UploadPageUI.BUTTON_VIDEO_SOUCRE);
	}
	
	public void newVideoLyser() {
		waitToElementVisible(driverGlobal, UploadPageUI.VIDEO_SOUCRE_NAME);
		sendkeyToElement(driverGlobal, UploadPageUI.VIDEO_SOUCRE_NAME, UploadPageUI.VIDEO_SOUCRE_INPUT_VIDEOLYSER_NAME_TXT);
	
		waitToElementVisible(driverGlobal, UploadPageUI.VIDEO_SOUCRE_STYLE);
		clickToElement(driverGlobal, UploadPageUI.VIDEO_SOUCRE_STYLE);
	
		waitToElementVisible(driverGlobal, UploadPageUI.VIDEO_SOUCRE_STYLE_VIDEOLYSER);
		clickToElement(driverGlobal, UploadPageUI.VIDEO_SOUCRE_STYLE_VIDEOLYSER);
	
		waitToElementVisible(driverGlobal, UploadPageUI.VIDEO_SOUCRE_URL);
		sendkeyToElement(driverGlobal, UploadPageUI.VIDEO_SOUCRE_URL, UploadPageUI.VIDEO_SOUCRE_INPUT_VIDEOLYSER_URL_TXT);
	}
	public void newVimeo() {
		waitToElementVisible(driverGlobal, UploadPageUI.VIDEO_SOUCRE_NAME);
		sendkeyToElement(driverGlobal, UploadPageUI.VIDEO_SOUCRE_NAME, UploadPageUI.VIDEO_SOUCRE_INPUT_VIMEO_NAME_TXT);
	
		waitToElementVisible(driverGlobal, UploadPageUI.VIDEO_SOUCRE_URL);
		sendkeyToElement(driverGlobal, UploadPageUI.VIDEO_SOUCRE_URL, UploadPageUI.VIDEO_SOUCRE_STYLE_VIMEO_URL_TXT);
	}
	
	public void newMp4() {
		waitToElementVisible(driverGlobal, UploadPageUI.VIDEO_SOUCRE_NAME);
		sendkeyToElement(driverGlobal, UploadPageUI.VIDEO_SOUCRE_NAME, UploadPageUI.VIDEO_SOUCRE_INPUT_MP4_NAME_TXT);
		
		waitToElementVisible(driverGlobal, UploadPageUI.VIDEO_SOUCRE_STYLE);
		clickToElement(driverGlobal, UploadPageUI.VIDEO_SOUCRE_STYLE);
		
		waitToElementVisible(driverGlobal, UploadPageUI.VIDEO_SOUCRE_STYLE_MP4);
		clickToElement(driverGlobal, UploadPageUI.VIDEO_SOUCRE_STYLE_MP4);
	
		waitToElementVisible(driverGlobal, UploadPageUI.VIDEO_SOUCRE_URL);
		sendkeyToElement(driverGlobal, UploadPageUI.VIDEO_SOUCRE_URL, UploadPageUI.VIDEO_SOUCRE_STYLE_MP4_URL_TXT);
	}
	
	public void clickIconLoadingDuration() {
		waitToElementVisible(driverGlobal, UploadPageUI.BUTTON_VIDEO_SOUCRE_ICON_LOAD_DURATION);
		clickToElement(driverGlobal, UploadPageUI.BUTTON_VIDEO_SOUCRE_ICON_LOAD_DURATION);
	}
	
	public void clickButtonSave() {
		waitToElementVisible(driverGlobal, UploadPageUI.BUTTON_VIDEO_SOUCRE_BUTTON_SAVE);
		waitToEnableButton(driverGlobal, UploadPageUI.BUTTON_VIDEO_SOUCRE_BUTTON_SAVE);
		clickToElement(driverGlobal, UploadPageUI.BUTTON_VIDEO_SOUCRE_BUTTON_SAVE);
		waitToElementVisible(driverGlobal, UploadPageUI.UPLOAD_SUCCESS_MESSAGE);
		clickToElement(driverGlobal, UploadPageUI.CLOSE_MESSAGE_ICON);
	}
	
	public void uploadVideoLocal() {
		waitToEnableButton(driverGlobal, UploadPageUI.BUTTON_VIDEO_UPLOAD_STEP2);
		clickToElement(driverGlobal, UploadPageUI.BUTTON_VIDEO_UPLOAD_STEP2);
		
		waitToElementVisible(driverGlobal, UploadPageUI.VIDEO_UPLOAD_BUTTON_STEP3);
		sendkeyToElement(driverGlobal, UploadPageUI.VIDEO_UPLOAD_INPUT_DATA, UploadPageUI.VIDEO_UPLOAD_INPUT_DATA_LOCAL);
		waitToElementVisible(driverGlobal, UploadPageUI.VIDEO_UPLOAD_100);
		waitToElementVisible(driverGlobal, UploadPageUI.UPLOAD_SUCCESS_MESSAGE);
		waitToElementInvisible(driverGlobal, UploadPageUI.UPLOAD_SUCCESS_MESSAGE);
	}
	
	public void uploadImage() {
		waitToElementVisible(driverGlobal, UploadPageUI.FILE_UPLOAD_LABEL);
		sendkeyToElement(driverGlobal, UploadPageUI.FILE_UPLOAD_DATA, UploadPageUI.FILE_UPLOAD_DATA_LOCAL);
		waitToElementVisible(driverGlobal, UploadPageUI.VIDEO_UPLOAD_100);
		waitToElementVisible(driverGlobal, UploadPageUI.UPLOAD_SUCCESS_MESSAGE);
		clickToElement(driverGlobal, UploadPageUI.CLOSE_MESSAGE_ICON);
	}
	
	public void deleteVideo() {
		waitToElementVisible(driverGlobal, UploadPageUI.UPLOAD_ICONS_SELECT);
		clickToElement(driverGlobal, UploadPageUI.UPLOAD_ICONS_SELECT);
		
		waitToElementVisible(driverGlobal, UploadPageUI.UPLOAD_DELETE_OPTION);
		clickToElement(driverGlobal, UploadPageUI.UPLOAD_DELETE_OPTION);
		
		waitToEnableButton(driverGlobal, UploadPageUI.UPLOAD_CONFIRM_BUTTON);
		clickToElement(driverGlobal, UploadPageUI.UPLOAD_CONFIRM_BUTTON);
		
		waitToElementVisible(driverGlobal, UploadPageUI.UPLOAD_SUCCESS_MESSAGE);
		clickToElement(driverGlobal, UploadPageUI.CLOSE_MESSAGE_ICON);
		
		waitToElementVisibleIconLoading(driverGlobal);
		waitToElementInvisibleIconLoading(driverGlobal);
	}
	
}
