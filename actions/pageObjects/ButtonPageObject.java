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
	
	public void clickNewButton() throws Exception {
		waitToElementVisible(driver, ButtonPageUI.NEW_BUTTON);
		waitToEnableButton(driver, ButtonPageUI.NEW_BUTTON);
		Thread.sleep(500);
		clickToElement(driver, ButtonPageUI.NEW_BUTTON);
	}
	
	public void inputNameButton(String nameButton) {
		waitToElementVisible(driver, ButtonPageUI.NAME_TXT);
		sendkeyToElement(driver, ButtonPageUI.NAME_TXT, nameButton);
	}

	public void inputTargetUrl(String urlButtonClick) {
		waitToElementVisible(driver, ButtonPageUI.TARGET_URL_TXT);
		sendkeyToElement(driver, ButtonPageUI.TARGET_URL_TXT, urlButtonClick);
	}
	
	public void clickPosition(String position) {
		clickToElement(driver, ButtonPageUI.BUTTON_POSITION, position);
	}

	public void clickStartTime() {
		waitToElementVisible(driver, ButtonPageUI.TIME_START_OPEN_POPUP);
		clickToElement(driver, ButtonPageUI.TIME_START_OPEN_POPUP);
	}
	
	public void clickEndTime() {
		waitToElementVisible(driver, ButtonPageUI.TIME_END_OPEN_POPUP);
		clickToElement(driver, ButtonPageUI.TIME_END_OPEN_POPUP);
	}
	
	public void setTime(String h, String m, String s) {
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
	
	public void refreshPage() {
		refreshCurrentPage(driver);
	}
	
	public boolean verifyButton(String buttonName) {
		return isDisplayElement(driver, ButtonPageUI.VERIFY_BUTTON, buttonName);
	}

}
