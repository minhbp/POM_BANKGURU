package pageObjects;

import org.openqa.selenium.WebDriver;

import commons.AbstractPage;
import pageUIs.BasicPageUI;

public class BasicPageObject extends AbstractPage{
private WebDriver driver;
	
	public BasicPageObject (WebDriver mappingdriver) {
		driver = mappingdriver;
	}
	
	public void clearTitle() {
		clearElement(driver, BasicPageUI.TITLE_TEXTBOX);
	}
	public void inputTitle(String title) {
		sendkeyToElement(driver, BasicPageUI.TITLE_TEXTBOX, title);
	}
	public void clearSubTitle() {
		clearElement(driver, BasicPageUI.SUBTITLE_TEXTBOX);
	}
	public void inputSubTitle(String subtitle) {
		sendkeyToElement(driver, BasicPageUI.SUBTITLE_TEXTBOX, subtitle);
	}
	public void clickConfirm() {
		clickToElement(driver, BasicPageUI.CONFIRM_BUTTON);
		
		waitToElementVisible(driver, BasicPageUI.MESSAGE_SUCCESS);
		clickToElement(driver, BasicPageUI.ICON_CLOSE_MESSAGE);
	}
}
