package pageObjects;

import org.openqa.selenium.WebDriver;

import commons.AbstractPage;
import pageUIs.PagesSettingPageUI;

public class PagesSettingObject extends AbstractPage {
	private WebDriver driver;

	public PagesSettingObject(WebDriver mappingdriver) {
		driver = mappingdriver;
	}

	public void clickPagesMenu() {
		waitToElementVisible(driver, PagesSettingPageUI.PAGES_MENU);
		clickToElement(driver, PagesSettingPageUI.PAGES_MENU);
	}

	public void clickPagesSettingsMenu() {
		waitToElementVisible(driver, PagesSettingPageUI.PAGES_SETTINGS_MENU);
		clickToElement(driver, PagesSettingPageUI.PAGES_SETTINGS_MENU);
	}

	public void clickPageType() {
		waitToElementVisible(driver, PagesSettingPageUI.PAGES_SETTINGS_TYPE);
		clickToElement(driver, PagesSettingPageUI.PAGES_SETTINGS_TYPE);
	}

	public void selectPageMyOwn() {
		waitToElementVisible(driver, PagesSettingPageUI.PAGES_SETTINGS_TYPE_MY_OWN);
		clickToElement(driver, PagesSettingPageUI.PAGES_SETTINGS_TYPE_MY_OWN);
	}

	public void clicPageOptions() throws Exception {
		waitToElementVisible(driver, PagesSettingPageUI.PAGES_SETTINGS_MY_OWN);
		clickToElement(driver, PagesSettingPageUI.PAGES_SETTINGS_MY_OWN);
	}
	
	public void clickTypePageWebsiteLp() {
		waitToElementVisible(driver, PagesSettingPageUI.PAGES_SETTINGS_MY_OWN_LP_WEBSITE);
		clickToElement(driver, PagesSettingPageUI.PAGES_SETTINGS_MY_OWN_LP_WEBSITE);
	}
	
	public void clickTypePageWebsiteConfirm() {
		waitToElementVisible(driver, PagesSettingPageUI.PAGES_SETTINGS_MY_OWN_CONFIRM_WEBSITE);
		clickToElement(driver, PagesSettingPageUI.PAGES_SETTINGS_MY_OWN_CONFIRM_WEBSITE);
	}
	
	public void clickTypePageWebsiteComplete() {
		waitToElementVisible(driver, PagesSettingPageUI.PAGES_SETTINGS_MY_OWN_COMPLETE_WEBSITE);
		clickToElement(driver, PagesSettingPageUI.PAGES_SETTINGS_MY_OWN_COMPLETE_WEBSITE);
	}
	
	public void inputUrlLp(String urlLp) {
		waitToElementVisible(driver, PagesSettingPageUI.PAGES_SETTINGS_MY_OWN_LP_WEBSITE_URL_TXT);
		sendkeyToElement(driver, PagesSettingPageUI.PAGES_SETTINGS_MY_OWN_LP_WEBSITE_URL_TXT, urlLp);
	}
	
	public void inputUrlConfirm(String urlConfirm) {
		waitToElementVisible(driver, PagesSettingPageUI.PAGES_SETTINGS_MY_OWN_CONFIRM_WEBSITE_URL_TXT);
		sendkeyToElement(driver, PagesSettingPageUI.PAGES_SETTINGS_MY_OWN_CONFIRM_WEBSITE_URL_TXT, urlConfirm);
	}
	
	public void inputUrlComplete(String urlComplete) {
		waitToElementVisible(driver, PagesSettingPageUI.PAGES_SETTINGS_MY_OWN_COMPLETE_WEBSITE_URL_TXT);
		sendkeyToElement(driver, PagesSettingPageUI.PAGES_SETTINGS_MY_OWN_COMPLETE_WEBSITE_URL_TXT, urlComplete);
	}

	public void clickConfirm() {
		waitToElementVisible(driver, PagesSettingPageUI.CONFIRM_BUTTTON);
		clickToElement(driver, PagesSettingPageUI.CONFIRM_BUTTTON);
		
		waitToElementVisible(driver, PagesSettingPageUI.MESSAGE_SUCCESS);
		clickToElement(driver, PagesSettingPageUI.ICON_CLOSE_MESSAGE);
	}

}
