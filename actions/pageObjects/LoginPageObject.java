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
	
		waitToEnableButton(driver, LoginPageUI.LOGIN_BUTTON);
		clickToElement(driver, LoginPageUI.LOGIN_BUTTON);

		waitToElementInvisibleIconLoading(driver);
	
		waitToElementVisible(driver, LoginPageUI.LOGIN_TEXT);		
	}
	
	public void openUrlLogin() {
		openAnyUrl(driver, LoginPageUI.LOGIN_PAGE_URL);
	}
	
	public void clickLanguage() {
		waitToElementVisible(driver, LoginPageUI.LOGIN_LANGUAGE_DE);
		clickToElement(driver, LoginPageUI.LOGIN_LANGUAGE_DE);
	}
	
	public void selectEnLanguage() {
		waitToElementVisible(driver, LoginPageUI.LOGIN_LANGUAGE_EN);
		clickToElement(driver, LoginPageUI.LOGIN_LANGUAGE_EN);
	}
	
	public void inputEmailLogin() {
		waitToElementVisible(driver, LoginPageUI.EMAIL_TEXTBOX);
		sendkeyToElement(driver, LoginPageUI.EMAIL_TEXTBOX, LoginPageUI.EMAIL_ACCOUNT_MINH101);
	}
	
	public void inputPasswordLoginWrong() {
		waitToElementVisible(driver, LoginPageUI.PASSWORD_TEXTBOX);
		sendkeyToElement(driver, LoginPageUI.PASSWORD_TEXTBOX, LoginPageUI.PASSWORD_WRONG_MINH101);
	}
	
	public String getTextErrorPassword() {
		waitToElementVisible(driver, LoginPageUI.PASSWORD_WRONG_VERIFY);
		return getTextElement(driver, LoginPageUI.PASSWORD_WRONG_VERIFY);
	}
	
	public void clickLoginButton() {
		waitToEnableButton(driver, LoginPageUI.LOGIN_BUTTON);
		clickToElement(driver, LoginPageUI.LOGIN_BUTTON);
	}
	
	public void clickForgotPassword() {
		waitToElementVisible(driver, LoginPageUI.FORGOT_PASSWORD_TEXT);
		clickToElement(driver, LoginPageUI.FORGOT_PASSWORD_TEXT);
	}
	
	public String getTextTitleForgot() {
		waitToElementVisible(driver, LoginPageUI.FORGOT_PASSWORD_TITLE);
		return getTextElement(driver, LoginPageUI.FORGOT_PASSWORD_TITLE);
	}
	
	public String getTextSubTitleForgot() {
		waitToElementVisible(driver, LoginPageUI.FORGOT_PASSWORD_SUBTITLE);
		return getTextElement(driver, LoginPageUI.FORGOT_PASSWORD_SUBTITLE);
	}
	
	public void inputEmailForgot(String email) {
		waitToElementVisible(driver, LoginPageUI.FORGOT_EMAIL_TEXTBOX);
		sendkeyToElement(driver, LoginPageUI.FORGOT_EMAIL_TEXTBOX, email);
	}
	
	public void clickResetButton() {
		waitToEnableButton(driver, LoginPageUI.FORGOT_RESET_BUTTON);
		clickToElement(driver, LoginPageUI.FORGOT_RESET_BUTTON);
	}
	
	public void clickBackToLoginButton() {
		waitToEnableButton(driver, LoginPageUI.FORGOT_RESET_BUTTON);
		clickToElement(driver, LoginPageUI.FORGOT_RESET_BUTTON);
	}
	
	public void ClickSignUpNow() {
		waitToElementVisible(driver, LoginPageUI.SIGN_UP);
		clickToElement(driver, LoginPageUI.SIGN_UP);
	}
	
	public String getTextTitleSignUp() {
		waitToElementVisible(driver, LoginPageUI.SIGN_UP_TITLE);
		return getTextElement(driver, LoginPageUI.SIGN_UP_TITLE);
	}
	
	public void clickFooter(String footer) {
		waitToElementVisible(driver, LoginPageUI.LOGIN_FOOTER, footer);
		clickToElement(driver, LoginPageUI.LOGIN_FOOTER, footer);
	}
	
}