package pageObjects;

import org.openqa.selenium.WebDriver;

import commons.AbstractPage;
import pageUIs.RegisterPageUI;

public class RegisterPageObject extends AbstractPage {

private WebDriver driverGlobal;
	
	public RegisterPageObject (WebDriver driverLocal) {
		driverGlobal = driverLocal;
	}
	
	public void clickButton() {
		waitToElementVisible(driverGlobal, RegisterPageUI.REGISTER_PAGE_BUTTON);
		clickToElement(driverGlobal, RegisterPageUI.REGISTER_PAGE_BUTTON);
	}
	
	public void inputFirtname() {
		waitToElementVisible(driverGlobal, RegisterPageUI.REGISTER_PAGE_FIRT_NAME);
		sendkeyToElement(driverGlobal, RegisterPageUI.REGISTER_PAGE_FIRT_NAME, RegisterPageUI.REGISTER_PAGE_INPUT_FIRT_NAME);
	}
	
	public void inputLastname() {
		waitToElementVisible(driverGlobal, RegisterPageUI.REGISTER_PAGE_LAST_NAME);
		sendkeyToElement(driverGlobal, RegisterPageUI.REGISTER_PAGE_LAST_NAME, RegisterPageUI.REGISTER_PAGE_INPUT_LAST_NAME);
	}
	
	public void inputEmail() {
		waitToElementVisible(driverGlobal, RegisterPageUI.REGISTER_PAGE_EMAIL);
		sendkeyToElement(driverGlobal, RegisterPageUI.REGISTER_PAGE_EMAIL, RegisterPageUI.REGISTER_INPUT_PAGE_EMAIL);
	}
	
	public void clickButtonSubmit() {
		waitToElementVisible(driverGlobal, RegisterPageUI.REGISTER_PAGE_SUBMIT_BUTTON);
		clickToElement(driverGlobal, RegisterPageUI.REGISTER_PAGE_SUBMIT_BUTTON);
		waitToElementInvisibleIconLoading(driverGlobal);
	}
	
	
	
}
