package pageObjects;

import org.openqa.selenium.WebDriver;

import commons.AbstractPage;
import pageUIs.RegisterPageUI;

public class RegisterPageObject extends AbstractPage {

	private WebDriver driver;

	public RegisterPageObject(WebDriver mappingdriver) {
		driver = mappingdriver;
	}

	public void clickButton() {
		waitToElementVisible(driver, RegisterPageUI.REGISTER_PAGE_BUTTON);
		clickToElement(driver, RegisterPageUI.REGISTER_PAGE_BUTTON);
	}

	public void inputFirtname(String firstName) {
		waitToElementVisible(driver, RegisterPageUI.REGISTER_PAGE_FIRT_NAME);
		sendkeyToElement(driver, RegisterPageUI.REGISTER_PAGE_FIRT_NAME, firstName);
	}

	public void inputLastname(String lastName) {
		waitToElementVisible(driver, RegisterPageUI.REGISTER_PAGE_LAST_NAME);
		sendkeyToElement(driver, RegisterPageUI.REGISTER_PAGE_LAST_NAME, lastName);
	}

	public void inputEmail(String email) {
		waitToElementVisible(driver, RegisterPageUI.REGISTER_PAGE_EMAIL);
		sendkeyToElement(driver, RegisterPageUI.REGISTER_PAGE_EMAIL, email);
	}

	public void clickButtonSubmit() {
		waitToElementVisible(driver, RegisterPageUI.REGISTER_PAGE_SUBMIT_BUTTON);
		clickToElement(driver, RegisterPageUI.REGISTER_PAGE_SUBMIT_BUTTON);
	}
	
	public String getTitleConfirmPage() {
		waitToElementVisible(driver, RegisterPageUI.CONFIRM_PAGE_TITLE);
		return getTextElement(driver, RegisterPageUI.CONFIRM_PAGE_TITLE);
	}
	
	public String getSubTitleConfirmPage() {
		waitToElementVisible(driver, RegisterPageUI.CONFIRM_PAGE_SUB_TITLE);
		return getTextElement(driver, RegisterPageUI.CONFIRM_PAGE_SUB_TITLE);
	}
	
	public String getTextHeaderLP() {
		return getTextElement(driver, RegisterPageUI.REGISTER_PAGE_HEADER);
	}
	
	public String getTextTitleLP() {
		return getTextElement(driver, RegisterPageUI.REGISTER_PAGE_TITLE);
	}
	
	public String getTitleComplete() {
		return getTextElement(driver, RegisterPageUI.COMPLETE_PAGE_TITLE);
	}
	
	public String getTitleWaitting() {
		return getTextElement(driver, RegisterPageUI.WAITING_PAGE_TITLE);
	}
	
}
