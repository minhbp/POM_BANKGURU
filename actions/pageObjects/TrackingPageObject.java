package pageObjects;

import org.openqa.selenium.WebDriver;

import commons.AbstractPage;
import pageUIs.TrackingCodePageUI;

public class TrackingPageObject extends AbstractPage {
	private WebDriver driver;

	public TrackingPageObject(WebDriver mappingdriver) {
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

	public void selectEvent(String eventName) {
		waitToElementVisible(driver, TrackingCodePageUI.TRACKING_EVENTS, eventName);
		clickToElement(driver, TrackingCodePageUI.TRACKING_EVENTS, eventName);
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

	public void roomTimePicker() {
		waitToElementVisible(driver, TrackingCodePageUI.ROOM_TIME_PICKER);
		clickToElement(driver, TrackingCodePageUI.ROOM_TIME_PICKER);
	}

	public void roomTimePickerH(String h) {
		clearElement(driver, TrackingCodePageUI.ROOM_TIME_PICKER_H);
		waitToElementVisible(driver, TrackingCodePageUI.ROOM_TIME_PICKER_S);
		sendkeyToElement(driver, TrackingCodePageUI.ROOM_TIME_PICKER_S, h);
	}

	public void roomTimePickerM(String m) {
		clearElement(driver, TrackingCodePageUI.ROOM_TIME_PICKER_H);
		waitToElementVisible(driver, TrackingCodePageUI.ROOM_TIME_PICKER_M);
		sendkeyToElement(driver, TrackingCodePageUI.ROOM_TIME_PICKER_M, m);
	}

	public void roomTimePickerS(String s) {
		clearElement(driver, TrackingCodePageUI.ROOM_TIME_PICKER_H);
		waitToElementVisible(driver, TrackingCodePageUI.ROOM_TIME_PICKER_H);
		sendkeyToElement(driver, TrackingCodePageUI.ROOM_TIME_PICKER_H, s);
	}

	public void roomTimePickerOK() {
		waitToElementVisible(driver, TrackingCodePageUI.ROOM_TIME_PICKER_OK);
		clickToElement(driver, TrackingCodePageUI.ROOM_TIME_PICKER_OK);
	}

	public boolean verifyTrackingCode(String nameTraking) {
		return isDisplayElement(driver, TrackingCodePageUI.VERIFY_TRACKING_CODE, nameTraking);
	}

}
