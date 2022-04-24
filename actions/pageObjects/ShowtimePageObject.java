package pageObjects;

import org.openqa.selenium.WebDriver;

import commons.AbstractPage;
import pageUIs.ShowtimePageUI;

public class ShowtimePageObject extends AbstractPage {

private WebDriver driver;
	
	public ShowtimePageObject (WebDriver mappingdriver) {
		driver = mappingdriver;
	}
	
	public void clickShowtimeMenu() {
		waitToElementVisible(driver, ShowtimePageUI.SHOWTIME_MENU);
		clickToElement(driver, ShowtimePageUI.SHOWTIME_MENU);
	}

	public void clickOption() {
		waitToElementVisible(driver, ShowtimePageUI.SHOWTIME_OPTIONS);
		clickToElement(driver, ShowtimePageUI.SHOWTIME_OPTIONS);
	}
	
	public void clickOptionMyself() {
		waitToElementVisible(driver, ShowtimePageUI.SHOWTIME_OPTIONS_MYSELF);
		clickToElement(driver, ShowtimePageUI.SHOWTIME_OPTIONS_MYSELF);
	}
	
	public void clickOption60Minutes() {
		waitToElementVisible(driver, ShowtimePageUI.SHOWTIME_OPTIONS_60_MINUTES);
		clickToElement(driver, ShowtimePageUI.SHOWTIME_OPTIONS_60_MINUTES);
	}
	
	public void clickOption5Minutes() {
		waitToElementVisible(driver, ShowtimePageUI.SHOWTIME_OPTIONS_5_MINUTES);
		clickToElement(driver, ShowtimePageUI.SHOWTIME_OPTIONS_5_MINUTES);
	}
	
	public void clickOptionNo() {
		waitToElementVisible(driver, ShowtimePageUI.SHOWTIME_OPTIONS_NO);
		clickToElement(driver, ShowtimePageUI.SHOWTIME_OPTIONS_NO);
	}
	
	public void clickOptionYes() {
		waitToElementVisible(driver, ShowtimePageUI.SHOWTIME_OPTIONS_YES);
		clickToElement(driver, ShowtimePageUI.SHOWTIME_OPTIONS_YES);
	}
	
	public void clickButtonSave() {
		waitToElementVisible(driver, ShowtimePageUI.SHOWTIME_BUTTON_SAVE);
		clickToElement(driver, ShowtimePageUI.SHOWTIME_BUTTON_SAVE);
		waitToElementVisible(driver, ShowtimePageUI.SHOWTIME_SUCCESS);
	}
	
	
}
