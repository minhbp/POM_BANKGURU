package pageObjects;

import org.openqa.selenium.WebDriver;

import commons.AbstractPage;
import pageUIs.ButtonPageUI;

public class ButtonPageObject extends AbstractPage {
private WebDriver driver;
	
	public ButtonPageObject (WebDriver mappingdriver) {
		driver = mappingdriver;
	}
	
	public void clickMenuButton() {
		waitToElementVisible(driver, ButtonPageUI.MENU_BUTTON);
		clickToElement(driver, ButtonPageUI.MENU_BUTTON);
	}
	
	public void clickNewButton() {
		waitToElementVisible(driver, ButtonPageUI.NEW_BUTTON);
		waitToEnableButton(driver, ButtonPageUI.NEW_BUTTON);
		clickToElement(driver, ButtonPageUI.NEW_BUTTON);
	}
	
	public void inputNameTop() {
		waitToElementVisible(driver, ButtonPageUI.NAME_TXT);
		sendkeyToElement(driver, ButtonPageUI.NAME_TXT, ButtonPageUI.NAME_TOP);
	}
	
	public void inputNameBottom() {
		waitToElementVisible(driver, ButtonPageUI.NAME_TXT);
		sendkeyToElement(driver, ButtonPageUI.NAME_TXT, ButtonPageUI.NAME_BOTTOM);
	}
	
	public void inputNameFullScreen() {
		waitToElementVisible(driver, ButtonPageUI.NAME_TXT);
		sendkeyToElement(driver, ButtonPageUI.NAME_TXT, ButtonPageUI.NAME_FULLSCREEN);
	}
	
	public void inputNameTopRight() {
		waitToElementVisible(driver, ButtonPageUI.NAME_TXT);
		sendkeyToElement(driver, ButtonPageUI.NAME_TXT, ButtonPageUI.NAME_TOP_RIGHT);
	}
	
	public void inputNameTransparent() {
		waitToElementVisible(driver, ButtonPageUI.NAME_TXT);
		sendkeyToElement(driver, ButtonPageUI.NAME_TXT, ButtonPageUI.NAME_TRANSPARENT);
	}

	public void inputTargetUrl() {
		waitToElementVisible(driver, ButtonPageUI.TARGET_URL_TXT);
		sendkeyToElement(driver, ButtonPageUI.TARGET_URL_TXT, ButtonPageUI.BUTTON_URL_TARGET);
	}
	
	public void clickPositionTop() {
		waitToElementVisible(driver, ButtonPageUI.POSITION_TOP);
		clickToElement(driver, ButtonPageUI.POSITION_TOP);
	}
	
	public void clickPositionBottom() {
		waitToElementVisible(driver, ButtonPageUI.POSITION_BOTTOM);
		clickToElement(driver, ButtonPageUI.POSITION_BOTTOM);
	}
	
	public void clickPositionFullscreen() {
		waitToElementVisible(driver, ButtonPageUI.POSITION_FULLSCREEN);
		clickToElement(driver, ButtonPageUI.POSITION_FULLSCREEN);
	}
	
	public void clickPositionTopRight() {
		waitToElementVisible(driver, ButtonPageUI.POSITION_TOP_RIGHT);
		clickToElement(driver, ButtonPageUI.POSITION_TOP_RIGHT);
	}
	
	public void clickPositionTransparent() {
		waitToElementVisible(driver, ButtonPageUI.POSITION_TRANSPARENT);
		clickToElement(driver, ButtonPageUI.POSITION_TRANSPARENT);
	}

	public void clickStartTime() {
		waitToElementVisible(driver, ButtonPageUI.TIME_START_OPEN_POPUP);
		clickToElement(driver, ButtonPageUI.TIME_START_OPEN_POPUP);
	}
	
	public void clickEndTime() {
		waitToElementVisible(driver, ButtonPageUI.TIME_END_OPEN_POPUP);
		clickToElement(driver, ButtonPageUI.TIME_END_OPEN_POPUP);
	}
	
	public void setStartTime(String h, String m, String s) {
		waitToElementVisible(driver, ButtonPageUI.TIME_HOUSES);
		sendkeyToElement(driver, ButtonPageUI.TIME_HOUSES, h);
		sendkeyToElement(driver, ButtonPageUI.TIME_MINUTES, m);
		sendkeyToElement(driver, ButtonPageUI.TIME_SECONDS, s);
	}
	
	public void setEndTime(String h, String m, String s) {
		waitToElementVisible(driver, ButtonPageUI.TIME_HOUSES);
		sendkeyToElement(driver, ButtonPageUI.TIME_HOUSES, h);
		sendkeyToElement(driver, ButtonPageUI.TIME_MINUTES, m);
		sendkeyToElement(driver, ButtonPageUI.TIME_SECONDS, s);
	}
	
	public void clickSaveTime() {
		waitToElementVisible(driver, ButtonPageUI.SAVE_TIME);
		clickToElement(driver,ButtonPageUI.SAVE_TIME);
	}
	
	public void clearAndInputTextButton(String textButton) {
		clearElement(driver, ButtonPageUI.BUTTON_TEXT_TXT);
		sendkeyToElement(driver, ButtonPageUI.BUTTON_TEXT_TXT, textButton);
	}
	
	public void clickSaveButton() {
		waitToEnableButton(driver, ButtonPageUI.BUTTON_SAVE);
		clickToElement(driver,ButtonPageUI.BUTTON_SAVE);
		
		waitToElementVisible(driver, ButtonPageUI.MESSAGE_SUCCESS);
		clickToElement(driver, ButtonPageUI.ICON_CLOSE_MESSAGE);
	}
	
	

}
