package pageObjects;

import org.openqa.selenium.WebDriver;

import commons.AbstractPage;
import pageUIs.PresenterPageUI;

public class PresenterPageObject extends AbstractPage {

private WebDriver driver;
	
	public PresenterPageObject (WebDriver mappingdriver) {
		driver = mappingdriver;
	}
	
	public void clickPresenterMenu() {
		waitToElementVisible(driver, PresenterPageUI.PRESNETER_MENU);
		clickToElement(driver, PresenterPageUI.PRESNETER_MENU);
	}
	public void clearPresenterName() {
		waitToElementVisible(driver, PresenterPageUI.NAME_PRESENTER_TEXTBOX);
		clearElement(driver, PresenterPageUI.NAME_PRESENTER_TEXTBOX);
	}
	public void inputPresenterName(String name) {
		waitToElementVisible(driver, PresenterPageUI.NAME_PRESENTER_TEXTBOX);
		sendkeyToElement(driver, PresenterPageUI.NAME_PRESENTER_TEXTBOX, name);
	}
	public void clickSelectImage() {
		waitToElementVisible(driver, PresenterPageUI.SELECT_IMAGE_BUTTON);
		clickToElement(driver, PresenterPageUI.SELECT_IMAGE_BUTTON);
	}
	public void inputUrlImage(String url) {
		waitToElementVisibleIconLoading(driver);
		waitToElementInvisibleIconLoading(driver);
		
		sendkeyToElement(driver, PresenterPageUI.LOCATOR_FILE, url);
		
		waitToElementVisible(driver, PresenterPageUI.MESSAGE_SUCCESS);
		clickToElement(driver, PresenterPageUI.ICON_CLOSE_MESSAGE);
	}
	public void clickConfirm() {
		clickToElement(driver, PresenterPageUI.COMFIRM_BUTTON);
		
		waitToElementVisible(driver, PresenterPageUI.MESSAGE_SUCCESS);
		clickToElement(driver, PresenterPageUI.ICON_CLOSE_MESSAGE);
	}
}
