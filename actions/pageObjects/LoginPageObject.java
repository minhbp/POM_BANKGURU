package pageObjects;

import org.openqa.selenium.WebDriver;

import commons.AbstractPage;
import pageUIs.LoginPageUI;

public class LoginPageObject extends AbstractPage {

	private WebDriver driverGlobal;
	
	public LoginPageObject (WebDriver driverLocal) {
		driverGlobal = driverLocal;
	}
	
	public void login() {
		openAnyUrl(driverGlobal, LoginPageUI.LOGIN_PAGE_URL);
	
		waitToElementVisible(driverGlobal, LoginPageUI.LOGIN_LANGUAGE_DE);
		clickToElement(driverGlobal, LoginPageUI.LOGIN_LANGUAGE_DE);
		
		waitToElementVisible(driverGlobal, LoginPageUI.LOGIN_LANGUAGE_EN);
		clickToElement(driverGlobal, LoginPageUI.LOGIN_LANGUAGE_EN);
	
		waitToElementVisible(driverGlobal, LoginPageUI.EMAIL_TEXTBOX);
		sendkeyToElement(driverGlobal, LoginPageUI.EMAIL_TEXTBOX, LoginPageUI.EMAIL_ACCOUNT_MINH101);
	
		waitToElementVisible(driverGlobal, LoginPageUI.PASSWORD_TEXTBOX);
		sendkeyToElement(driverGlobal, LoginPageUI.PASSWORD_TEXTBOX, LoginPageUI.PASSWORD_ACCOUNT_MINH101);
	
		waitToElementVisible(driverGlobal, LoginPageUI.LOGIN_BUTTON);
		clickToElement(driverGlobal, LoginPageUI.LOGIN_BUTTON);

		waitToElementInvisibleIconLoading(driverGlobal);
	
		waitToElementVisible(driverGlobal, LoginPageUI.LOGIN_TEXT);
	}
	
}