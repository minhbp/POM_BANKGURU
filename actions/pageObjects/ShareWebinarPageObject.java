package pageObjects;

import org.openqa.selenium.WebDriver;

import commons.AbstractPage;
import pageUIs.ShareWebinarPageUI;

public class ShareWebinarPageObject extends AbstractPage {
	private WebDriver driver;

	public ShareWebinarPageObject (WebDriver mappingdriver) {
		driver = mappingdriver;
	}
	
	public void getMyWebinar() {
		openAnyUrl(driver, ShareWebinarPageUI.SHARE_WEBINAR_URL);
		waitToEnableButton(driver, ShareWebinarPageUI.SAVE_BUTTON);
	}
	
	public void clearAndInputNameProvide(String nameProvider) {
		waitToElementVisible(driver, ShareWebinarPageUI.PROVIDER_NAME_TEXTBOX);
		clearElement(driver, ShareWebinarPageUI.PROVIDER_NAME_TEXTBOX);
		sendkeyToElement(driver, ShareWebinarPageUI.PROVIDER_NAME_TEXTBOX, nameProvider);
	}
	
	public void clearAndInputPartnerID(String namePartner) {
		waitToElementVisible(driver, ShareWebinarPageUI.PARTNERID_TEXTBOX);
		clearElement(driver, ShareWebinarPageUI.PARTNERID_TEXTBOX);
		sendkeyToElement(driver, ShareWebinarPageUI.PARTNERID_TEXTBOX, namePartner);
	}
	
	public void checkRequiedPartner() {
		clickToElement(driver, ShareWebinarPageUI.PARTNERID_CHECKBOX);
	}
	
	public void clearAndInputFirstName(String firstName) {
		waitToElementVisible(driver, ShareWebinarPageUI.FIRST_NAME_TEXTBOX);
		clearElement(driver, ShareWebinarPageUI.FIRST_NAME_TEXTBOX);
		sendkeyToElement(driver, ShareWebinarPageUI.FIRST_NAME_TEXTBOX, firstName);
	}
	
	public void checkRequiedFirstName() {
		clickToElement(driver, ShareWebinarPageUI.FIRST_NAME_CHECKBOX);
	}
	
	public void clearAndInputLastName(String lastName) {
		waitToElementVisible(driver, ShareWebinarPageUI.LAST_NAME_TEXTBOX);
		clearElement(driver, ShareWebinarPageUI.LAST_NAME_TEXTBOX);
		sendkeyToElement(driver, ShareWebinarPageUI.LAST_NAME_TEXTBOX, lastName);
	}
	
	public void checkRequiedLastName() {
		waitToElementVisible(driver, ShareWebinarPageUI.LAST_NAME_CHECKBOX);
		clickToElement(driver, ShareWebinarPageUI.LAST_NAME_CHECKBOX);
	}
	
	public void clearAndInputStreet(String street) {
		waitToElementVisible(driver, ShareWebinarPageUI.STREET_TEXTBOX);
		clearElement(driver, ShareWebinarPageUI.STREET_TEXTBOX);
		sendkeyToElement(driver, ShareWebinarPageUI.STREET_TEXTBOX, street);
	}
	
	public void checkRequiedStreet() {
		waitToElementVisible(driver, ShareWebinarPageUI.STREET_CHECKBOX);
		clickToElement(driver, ShareWebinarPageUI.STREET_CHECKBOX);
	}
	
	public void clearAndInputZipCode(String zipCode) {
		waitToElementVisible(driver, ShareWebinarPageUI.ZIP_CODE_TEXTBOX);
		clearElement(driver, ShareWebinarPageUI.ZIP_CODE_TEXTBOX);
		sendkeyToElement(driver, ShareWebinarPageUI.ZIP_CODE_TEXTBOX, zipCode);
	}
	
	public void checkRequiedZipCode() {
		waitToElementVisible(driver, ShareWebinarPageUI.ZIP_CODE_CHECKBOX);
		clickToElement(driver, ShareWebinarPageUI.ZIP_CODE_CHECKBOX);
	}
	
	public void clearAndInputCity(String city) {
		waitToElementVisible(driver, ShareWebinarPageUI.CITY_TEXTBOX);
		clearElement(driver, ShareWebinarPageUI.CITY_TEXTBOX);
		sendkeyToElement(driver, ShareWebinarPageUI.CITY_TEXTBOX, city);
	}
	
	public void checkRequiedCity() {
		waitToElementVisible(driver, ShareWebinarPageUI.CITY_CHECKBOX);
		clickToElement(driver, ShareWebinarPageUI.CITY_CHECKBOX);
	}
	
	public void clearAndInputPhone(String phone) {
		waitToElementVisible(driver, ShareWebinarPageUI.PHONE_TEXTBOX);
		clearElement(driver, ShareWebinarPageUI.PHONE_TEXTBOX);
		sendkeyToElement(driver, ShareWebinarPageUI.PHONE_TEXTBOX, phone);
	}
	
	public void checkRequiedPhone() {
		waitToElementVisible(driver, ShareWebinarPageUI.PHONE_CHECKBOX);
		clickToElement(driver, ShareWebinarPageUI.PHONE_CHECKBOX);
	}
	
	public void clearAndInputWebsite(String website) {
		waitToElementVisible(driver, ShareWebinarPageUI.WEBSITE_TEXTBOX);
		clearElement(driver, ShareWebinarPageUI.WEBSITE_TEXTBOX);
		sendkeyToElement(driver, ShareWebinarPageUI.WEBSITE_TEXTBOX, website);
	}
	
	public void checkRequiedWebsite() {
		waitToElementVisible(driver, ShareWebinarPageUI.WEBSITE_CHECKBOX);
		clickToElement(driver, ShareWebinarPageUI.WEBSITE_CHECKBOX);
	}
	
	public void clearAndInputEmailAddress(String emaiAddress) {
		waitToElementVisible(driver, ShareWebinarPageUI.EMAIL_ADDRESS_TEXTBOX);
		clearElement(driver, ShareWebinarPageUI.EMAIL_ADDRESS_TEXTBOX);
		sendkeyToElement(driver, ShareWebinarPageUI.EMAIL_ADDRESS_TEXTBOX, emaiAddress);
	}
	
	public void checkRequiedEmailAddress() {
		waitToElementVisible(driver, ShareWebinarPageUI.EMAIL_ADDRESS_CHECKBOX);
		clickToElement(driver, ShareWebinarPageUI.EMAIL_ADDRESS_CHECKBOX);
	}
	
	public void clickSave() {
		waitToEnableButton(driver, ShareWebinarPageUI.SAVE_BUTTON);
		clickToElement(driver, ShareWebinarPageUI.SAVE_BUTTON);
		
		waitToElementVisible(driver, ShareWebinarPageUI.SUCCESS_MESSAGE);
		clickToElement(driver, ShareWebinarPageUI.CLOSE_MESSAGE_ICON);
	}
	
	
	
}
