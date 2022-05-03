package pageObjects;

import org.openqa.selenium.WebDriver;

import commons.AbstractPage;
import pageUIs.TrackingCodePageUI;

public class TrackingPageObject extends AbstractPage{
private WebDriver driver;
	
	public TrackingPageObject (WebDriver mappingdriver) {
		driver = mappingdriver;
	}
	
	public void clickExpertMenu() {
		waitToElementVisible(driver, TrackingCodePageUI.EXPERT_MENU);
		clickToElement(driver, TrackingCodePageUI.EXPERT_MENU);
	}
	
	public void clickTrackingMenu() {
		waitToElementVisible(driver, TrackingCodePageUI.TRACKING_MENU);
		clickToElement(driver, TrackingCodePageUI.TRACKING_MENU);
	}
	
	public void clickNewTrackingButton() {
		waitToEnableButton(driver, TrackingCodePageUI.NEW_TRACKING_BUTTON);
		clickToElement(driver, TrackingCodePageUI.NEW_TRACKING_BUTTON);
	}
	
	public void inputTrackingName(String name) {
		waitToElementVisible(driver, TrackingCodePageUI.NAME_TRACKING_TEXTBOX);
		sendkeyToElement(driver, TrackingCodePageUI.NAME_TRACKING_TEXTBOX, name);
	}
	
	public void clickEvent() {
		waitToElementVisible(driver, TrackingCodePageUI.EVENT_OPTIONS);
		clickToElement(driver, TrackingCodePageUI.EVENT_OPTIONS);
	}
	
	public void selectEventOpenRegistrationPage() {
		waitToElementVisible(driver, TrackingCodePageUI.OPEN_REGISTRATION_PAGE);
		clickToElement(driver, TrackingCodePageUI.OPEN_REGISTRATION_PAGE);
	}
	
	public void selectEventSubmitForm() {
		waitToElementVisible(driver, TrackingCodePageUI.SUBMIT_REGISTRATION_FORM);
		clickToElement(driver, TrackingCodePageUI.SUBMIT_REGISTRATION_FORM);
	}
	
	public void selectEventOpenComfirmationPage() {
		waitToElementVisible(driver, TrackingCodePageUI.OPEN_COMFIRMATION_PAGE);
		clickToElement(driver, TrackingCodePageUI.OPEN_COMFIRMATION_PAGE);
	}
	
	public void selectEventOpenCompletedPage() {
		waitToElementVisible(driver, TrackingCodePageUI.OPEN_COMPLETED_PAGE);
		clickToElement(driver, TrackingCodePageUI.OPEN_COMPLETED_PAGE);
	}
	
	public void selectEventOpenRoom() {
		waitToElementVisible(driver, TrackingCodePageUI.OPEN_ROOM);
		clickToElement(driver, TrackingCodePageUI.OPEN_ROOM);
	}
	
	public void selectCookies() {
		waitToElementVisible(driver, TrackingCodePageUI.COOKIES);
		clickToElement(driver, TrackingCodePageUI.COOKIES);
	}
	
	public void selectCookiesYes() {
		waitToElementVisible(driver, TrackingCodePageUI.COOKIES_YES);
		clickToElement(driver, TrackingCodePageUI.COOKIES_YES);
	}
	
	public void selectCookiesNo() {
		waitToElementVisible(driver, TrackingCodePageUI.COOKIES_NO);
		clickToElement(driver, TrackingCodePageUI.COOKIES_NO);
	}
	
	public void checkCookiesStatistics() {
		waitToElementVisible(driver, TrackingCodePageUI.COOKIES_STATISTICS_CHECKBOX);
		clickToElement(driver, TrackingCodePageUI.COOKIES_STATISTICS_CHECKBOX);
	}
	
	public void checkCookiesMarketing() {
		waitToElementVisible(driver, TrackingCodePageUI.COOKIES_MARKETING_CHECKBOX);
		clickToElement(driver, TrackingCodePageUI.COOKIES_MARKETING_CHECKBOX);
	}
	
	public void inputTrackingBeforeHead(String headcode) {
		waitToElementVisible(driver, TrackingCodePageUI.BEFORE_HEAD_TAG_TEXTAREA);
		sendkeyToElement(driver, TrackingCodePageUI.BEFORE_HEAD_TAG_TEXTAREA, headcode);
	}
	
	public void inputTrackingAfterBody(String afterbodycode) {
		waitToElementVisible(driver, TrackingCodePageUI.AFTER_BODY_TAG_TEXTAREA);
		sendkeyToElement(driver, TrackingCodePageUI.AFTER_BODY_TAG_TEXTAREA, afterbodycode);
	}
	
	public void inputTrackingBeforeBody(String beforebodycode) {
		waitToElementVisible(driver, TrackingCodePageUI.BEFORE_BODY_TEXTAREA);
		sendkeyToElement(driver, TrackingCodePageUI.BEFORE_BODY_TEXTAREA, beforebodycode);
	}
	
	public void clickSaveButton() {
		waitToEnableButton(driver, TrackingCodePageUI.SAVE_BUTTON);
		clickToElement(driver, TrackingCodePageUI.SAVE_BUTTON);
		
		waitToElementVisible(driver, TrackingCodePageUI.SUCCESS_MESSAGE);
		clickToElement(driver, TrackingCodePageUI.CLOSE_MESSAGE_ICON);
	}
	
	public boolean verifyTrackingCode(String nameTraking) {
		return isDisplayElement(driver, TrackingCodePageUI.VERIFY_TRACKING_CODE, nameTraking);
	}
	
	
	
}
