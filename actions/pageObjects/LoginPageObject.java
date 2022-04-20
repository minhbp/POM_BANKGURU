package pageObjects;

import org.openqa.selenium.WebDriver;

import commons.AbstractPage;
import pageUIs.LoginPageUI;

public class LoginPageObject extends AbstractPage {

	WebDriver driver;
	
	public void getLoginPageUrl() {
		openAnyUrl(driver, LoginPageUI.LOGIN_PAGE_URL);
	}
	
	public void setLanguage() {
		waitToElementVisible(driver, LoginPageUI.LOGIN_LANGUAGE_DE);
		clickToElement(driver, LoginPageUI.LOGIN_LANGUAGE_DE);
		
		waitToElementVisible(driver, LoginPageUI.LOGIN_LANGUAGE_EN);
		clickToElement(driver, LoginPageUI.LOGIN_LANGUAGE_EN);
	}
	
	public void inputEmailTextbox() {
		waitToElementVisible(driver, LoginPageUI.EMAIL_TEXTBOX);
		sendkeyToElement(driver, LoginPageUI.EMAIL_TEXTBOX, LoginPageUI.EMAIL_ACCOUNT_MINH101);
	}
	
	public void inputPasswordTextbox() {
		waitToElementVisible(driver, LoginPageUI.PASSWORD_TEXTBOX);
		sendkeyToElement(driver, LoginPageUI.PASSWORD_TEXTBOX, LoginPageUI.PASSWORD_ACCOUNT_MINH101);
	}
	
	public void clickButtonLogin() {
		waitToElementVisible(driver, LoginPageUI.LOGIN_BUTTON);
		clickToElement(driver, LoginPageUI.LOGIN_BUTTON);

		waitToElementInvisibleIconLoading(driver);
	}
	
}
