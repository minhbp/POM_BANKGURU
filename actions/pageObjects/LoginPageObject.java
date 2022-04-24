package pageObjects;

import org.openqa.selenium.WebDriver;

import commons.AbstractPage;
import pageUIs.LoginPageUI;

public class LoginPageObject extends AbstractPage {

	private WebDriver driver;
	
	public LoginPageObject (WebDriver mappingdriver) {
		driver = mappingdriver;
	}
	
	public void login() {
		openAnyUrl(driver, LoginPageUI.LOGIN_PAGE_URL);
	
		waitToElementVisible(driver, LoginPageUI.LOGIN_LANGUAGE_DE);
		clickToElement(driver, LoginPageUI.LOGIN_LANGUAGE_DE);
		
		waitToElementVisible(driver, LoginPageUI.LOGIN_LANGUAGE_EN);
		clickToElement(driver, LoginPageUI.LOGIN_LANGUAGE_EN);
	
		waitToElementVisible(driver, LoginPageUI.EMAIL_TEXTBOX);
		sendkeyToElement(driver, LoginPageUI.EMAIL_TEXTBOX, LoginPageUI.EMAIL_ACCOUNT_MINH101);
	
		waitToElementVisible(driver, LoginPageUI.PASSWORD_TEXTBOX);
		sendkeyToElement(driver, LoginPageUI.PASSWORD_TEXTBOX, LoginPageUI.PASSWORD_ACCOUNT_MINH101);
	
		waitToElementVisible(driver, LoginPageUI.LOGIN_BUTTON);
		clickToElement(driver, LoginPageUI.LOGIN_BUTTON);

		waitToElementInvisibleIconLoading(driver);
	
		waitToElementVisible(driver, LoginPageUI.LOGIN_TEXT);
	}
	
}