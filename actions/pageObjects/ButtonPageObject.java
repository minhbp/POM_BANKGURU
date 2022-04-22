package pageObjects;

import org.openqa.selenium.WebDriver;

import commons.AbstractPage;
import pageUIs.ButtonPageUI;

public class ButtonPageObject extends AbstractPage {
private WebDriver driverGlobal;
	
	public ButtonPageObject (WebDriver driverLocal) {
		driverGlobal = driverLocal;
	}
	
	public void clickMenuButton() {
		waitToElementVisible(driverGlobal, ButtonPageUI.MENU_BUTTON);
		clickToElement(driverGlobal, ButtonPageUI.MENU_BUTTON);
	}
	
	public void clickNewButton() {
		waitToElementVisible(driverGlobal, ButtonPageUI.NEW_BUTTON);
		waitToEnableButton(driverGlobal, ButtonPageUI.NEW_BUTTON);
		clickToElement(driverGlobal, ButtonPageUI.NEW_BUTTON);
	}
	
	public void inputNameTop() {
		waitToElementVisible(driverGlobal, ButtonPageUI.NAME_TXT);
		sendkeyToElement(driverGlobal, ButtonPageUI.NAME_TXT, ButtonPageUI.NAME_TOP);
	}
	
	public void inputNameBottom() {
		waitToElementVisible(driverGlobal, ButtonPageUI.NAME_TXT);
		sendkeyToElement(driverGlobal, ButtonPageUI.NAME_TXT, ButtonPageUI.NAME_BOTTOM);
	}
	
	public void inputNameFullScreen() {
		waitToElementVisible(driverGlobal, ButtonPageUI.NAME_TXT);
		sendkeyToElement(driverGlobal, ButtonPageUI.NAME_TXT, ButtonPageUI.NAME_FULLSCREEN);
	}
	
	public void inputNameTopRight() {
		waitToElementVisible(driverGlobal, ButtonPageUI.NAME_TXT);
		sendkeyToElement(driverGlobal, ButtonPageUI.NAME_TXT, ButtonPageUI.NAME_TOP_RIGHT);
	}
	
	public void inputNameTransparent() {
		waitToElementVisible(driverGlobal, ButtonPageUI.NAME_TXT);
		sendkeyToElement(driverGlobal, ButtonPageUI.NAME_TXT, ButtonPageUI.NAME_TRANSPARENT);
	}

	public void inputTargetUrl() {
		waitToElementVisible(driverGlobal, ButtonPageUI.TARGET_URL_TXT);
		sendkeyToElement(driverGlobal, ButtonPageUI.TARGET_URL_TXT, ButtonPageUI.BUTTON_URL_TARGET);
	}
	
	public void clickPositionTop() {
		waitToElementVisible(driverGlobal, ButtonPageUI.POSITION_TOP);
		clickToElement(driverGlobal, ButtonPageUI.POSITION_TOP);
	}
	
	public void clickPositionBottom() {
		waitToElementVisible(driverGlobal, ButtonPageUI.POSITION_BOTTOM);
		clickToElement(driverGlobal, ButtonPageUI.POSITION_BOTTOM);
	}
	
	public void clickPositionFullscreen() {
		waitToElementVisible(driverGlobal, ButtonPageUI.POSITION_FULLSCREEN);
		clickToElement(driverGlobal, ButtonPageUI.POSITION_FULLSCREEN);
	}
	
	public void clickPositionTopRight() {
		waitToElementVisible(driverGlobal, ButtonPageUI.POSITION_TOP_RIGHT);
		clickToElement(driverGlobal, ButtonPageUI.POSITION_TOP_RIGHT);
	}
	
	public void clickPositionTransparent() {
		waitToElementVisible(driverGlobal, ButtonPageUI.POSITION_TRANSPARENT);
		clickToElement(driverGlobal, ButtonPageUI.POSITION_TRANSPARENT);
	}

	public void clickStartTime() {
		waitToElementVisible(driverGlobal, ButtonPageUI.TIME_START_OPEN_POPUP);
		clickToElement(driverGlobal, ButtonPageUI.TIME_START_OPEN_POPUP);
	}
	
	public void clickEndTime() {
		waitToElementVisible(driverGlobal, ButtonPageUI.TIME_END_OPEN_POPUP);
		clickToElement(driverGlobal, ButtonPageUI.TIME_END_OPEN_POPUP);
	}
	
	public void setStartTime(String h, String m, String s) {
		waitToElementVisible(driverGlobal, ButtonPageUI.TIME_HOUSES);
		sendkeyToElement(driverGlobal, ButtonPageUI.TIME_HOUSES, h);
		sendkeyToElement(driverGlobal, ButtonPageUI.TIME_MINUTES, m);
		sendkeyToElement(driverGlobal, ButtonPageUI.TIME_SECONDS, s);
	}
	
	public void setEndTime(String h, String m, String s) {
		waitToElementVisible(driverGlobal, ButtonPageUI.TIME_HOUSES);
		sendkeyToElement(driverGlobal, ButtonPageUI.TIME_HOUSES, h);
		sendkeyToElement(driverGlobal, ButtonPageUI.TIME_MINUTES, m);
		sendkeyToElement(driverGlobal, ButtonPageUI.TIME_SECONDS, s);
	}
	
	public void clickSaveTime() {
		waitToElementVisible(driverGlobal, ButtonPageUI.SAVE_TIME);
		clickToElement(driverGlobal,ButtonPageUI.SAVE_TIME);
	}
	
	public void clearAndInputTextButton(String textButton) {
		clearElement(driverGlobal, ButtonPageUI.BUTTON_TEXT_TXT);
		sendkeyToElement(driverGlobal, ButtonPageUI.BUTTON_TEXT_TXT, textButton);
	}
	
	public void clickSaveButton() {
		waitToEnableButton(driverGlobal, ButtonPageUI.BUTTON_SAVE);
		clickToElement(driverGlobal,ButtonPageUI.BUTTON_SAVE);
		
		waitToElementVisible(driverGlobal, ButtonPageUI.MESSAGE_SUCCESS);
		clickToElement(driverGlobal, ButtonPageUI.ICON_CLOSE_MESSAGE);
	}
	
	

}
