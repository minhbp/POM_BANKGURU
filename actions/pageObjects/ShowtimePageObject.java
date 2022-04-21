package pageObjects;

import org.openqa.selenium.WebDriver;

import commons.AbstractPage;
import pageUIs.ShowtimePageUI;

public class ShowtimePageObject extends AbstractPage {

private WebDriver driverGlobal;
	
	public ShowtimePageObject (WebDriver driverLocal) {
		driverGlobal = driverLocal;
	}
	
	public void clickShowtimeMenu() {
		waitToElementVisible(driverGlobal, ShowtimePageUI.SHOWTIME_MENU);
		clickToElement(driverGlobal, ShowtimePageUI.SHOWTIME_MENU);
	}

	public void clickOption() {
		waitToElementVisible(driverGlobal, ShowtimePageUI.SHOWTIME_OPTIONS);
		clickToElement(driverGlobal, ShowtimePageUI.SHOWTIME_OPTIONS);
	}
	
	public void clickOptionMyself() {
		waitToElementVisible(driverGlobal, ShowtimePageUI.SHOWTIME_OPTIONS_MYSELF);
		clickToElement(driverGlobal, ShowtimePageUI.SHOWTIME_OPTIONS_MYSELF);
	}
	
	public void clickOption60Minutes() {
		waitToElementVisible(driverGlobal, ShowtimePageUI.SHOWTIME_OPTIONS_60_MINUTES);
		clickToElement(driverGlobal, ShowtimePageUI.SHOWTIME_OPTIONS_60_MINUTES);
	}
	
	public void clickOption5Minutes() {
		waitToElementVisible(driverGlobal, ShowtimePageUI.SHOWTIME_OPTIONS_5_MINUTES);
		clickToElement(driverGlobal, ShowtimePageUI.SHOWTIME_OPTIONS_5_MINUTES);
	}
	
	public void clickOptionNo() {
		waitToElementVisible(driverGlobal, ShowtimePageUI.SHOWTIME_OPTIONS_NO);
		clickToElement(driverGlobal, ShowtimePageUI.SHOWTIME_OPTIONS_NO);
	}
	
	public void clickOptionYes() {
		waitToElementVisible(driverGlobal, ShowtimePageUI.SHOWTIME_OPTIONS_YES);
		clickToElement(driverGlobal, ShowtimePageUI.SHOWTIME_OPTIONS_YES);
	}
	
	public void clickButtonSave() {
		waitToElementVisible(driverGlobal, ShowtimePageUI.SHOWTIME_BUTTON_SAVE);
		clickToElement(driverGlobal, ShowtimePageUI.SHOWTIME_BUTTON_SAVE);
		waitToElementVisible(driverGlobal, ShowtimePageUI.SHOWTIME_SUCCESS);
	}
	
	
}
