package pageObjects;

import org.openqa.selenium.WebDriver;

import commons.AbstractPage;
import pageUIs.RegisterPageUI;

public class RegisterPageObject extends AbstractPage {

private WebDriver driver;
	
	public RegisterPageObject (WebDriver mappingdriver) {
		driver = mappingdriver;
	}
	
	public void clickButton() {
		waitToElementVisible(driver, RegisterPageUI.REGISTER_PAGE_BUTTON);
		clickToElement(driver, RegisterPageUI.REGISTER_PAGE_BUTTON);
	}
	
	public void inputFirtname() {
		waitToElementVisible(driver, RegisterPageUI.REGISTER_PAGE_FIRT_NAME);
		sendkeyToElement(driver, RegisterPageUI.REGISTER_PAGE_FIRT_NAME, RegisterPageUI.REGISTER_PAGE_INPUT_FIRT_NAME);
	}
	
	public void inputLastname() {
		waitToElementVisible(driver, RegisterPageUI.REGISTER_PAGE_LAST_NAME);
		sendkeyToElement(driver, RegisterPageUI.REGISTER_PAGE_LAST_NAME, RegisterPageUI.REGISTER_PAGE_INPUT_LAST_NAME);
	}
	
	public void inputEmail() {
		waitToElementVisible(driver, RegisterPageUI.REGISTER_PAGE_EMAIL);
		sendkeyToElement(driver, RegisterPageUI.REGISTER_PAGE_EMAIL, RegisterPageUI.REGISTER_INPUT_PAGE_EMAIL);
	}
	
	public void clickButtonSubmit() {
		waitToElementVisible(driver, RegisterPageUI.REGISTER_PAGE_SUBMIT_BUTTON);
		clickToElement(driver, RegisterPageUI.REGISTER_PAGE_SUBMIT_BUTTON);
		
		waitToElementVisibleIconLoading(driver);
		waitToElementInvisibleIconLoading(driver);
	}
	
	
	
}
