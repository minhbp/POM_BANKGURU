package pageObjects;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import commons.AbstractPage;

import pageUIs.ExpertUI;

public class ExpertPageObject extends AbstractPage{
private WebDriver driver;
	
	public ExpertPageObject (WebDriver mappingdriver) {
		driver = mappingdriver;
	}
	
	public void clickExpertMenu() {
		waitToElementVisible(driver, ExpertUI.EXPERT_MENU);
		clickToElement(driver, ExpertUI.EXPERT_MENU);
	}
	
	
	// start Region
	public void clickRegionMenu() {
		waitToElementVisible(driver, ExpertUI.REGION_MENU);
		clickToElement(driver, ExpertUI.REGION_MENU);
	}
	
	public void clickTimezone() {
		waitToElementVisible(driver, ExpertUI.REGION_TIMEZONE);
		clickToElement(driver, ExpertUI.REGION_TIMEZONE);
	}
	
	public void selectTimezone7() throws Exception {
		int a = countItemDropdown(driver, "(//div[@class='v-list-item__title'])");
		scrollToElement(driver, "(//div[@class='v-list-item__title'])" + "[" + " " + a + "" + "]" + "");
		Thread.sleep(500);
		int b = countItemDropdown(driver, "(//div[@class='v-list-item__title'])");
		scrollToElement(driver, "(//div[@class='v-list-item__title'])" + "[" + " " + b + "" + "]" + "");
		Thread.sleep(500);
		int c = countItemDropdown(driver, "(//div[@class='v-list-item__title'])");
		scrollToElement(driver, "(//div[@class='v-list-item__title'])" + "[" + " " + c + "" + "]" + "");
		Thread.sleep(500);
		int d = countItemDropdown(driver, "(//div[@class='v-list-item__title'])");
		Assert.assertEquals(63, d);
		scrollToElement(driver, ExpertUI.REGION_TIMEZONE_UTC_12);
		Thread.sleep(500);
		clickToElement(driver, ExpertUI.REGION_TIMEZONE_UTC_12);
	}
	
	public void clickDateFormat() {
		waitToElementVisible(driver, ExpertUI.REGION_DATE_FORMAT);
		clickToElement(driver, ExpertUI.REGION_DATE_FORMAT);
	}
	
	public void selectOption7DateFormat() {
		waitToElementVisible(driver, ExpertUI.REGION_DATE_FORMAT_OPTION_7);
		clickToElement(driver, ExpertUI.REGION_DATE_FORMAT_OPTION_7);
	}
	
	public void clickTimeFormat() {
		waitToElementVisible(driver, ExpertUI.REGION_TIME_FORMAT);
		clickToElement(driver, ExpertUI.REGION_TIME_FORMAT);
	}
	
	public void selectTimeAmPm() {
		waitToElementVisible(driver, ExpertUI.REGION_TIME_FORMAT_AM_PM);
		clickToElement(driver, ExpertUI.REGION_TIME_FORMAT_AM_PM);
	}
	
	public void clickSave() {
		waitToEnableButton(driver, ExpertUI.BUTTON_SAVE);
		clickToElement(driver, ExpertUI.BUTTON_SAVE);
		
		waitToElementVisible(driver, ExpertUI.MESSAGE_SUCCESS);
		clickToElement(driver, ExpertUI.ICON_CLOSE_MESSAGE);
	}
	// end Region
	
	// start webianr details
	public void clickDetailMenu() {
		waitToElementVisible(driver, ExpertUI.DETAILS_MENU);
		clickToElement(driver, ExpertUI.DETAILS_MENU);
	}
	
	public void clickStatusParticipant() {
		waitToElementVisible(driver, ExpertUI.PARTICIPANT_STATUS);
		clickToElement(driver, ExpertUI.PARTICIPANT_STATUS);
	}
	
	public void selectStatus25() {
		waitToElementVisible(driver, ExpertUI.PARTICIPANT_STATUS_25);
		clickToElement(driver, ExpertUI.PARTICIPANT_STATUS_25);
	}
	
	public void clickMobileDevices() {
		waitToElementVisible(driver, ExpertUI.MOBILE_ALLOW);
		clickToElement(driver, ExpertUI.MOBILE_ALLOW);
	}
	
	public void selectMobileYes() {
		waitToElementVisible(driver, ExpertUI.MOBILE_ALLOW_YES);
		clickToElement(driver, ExpertUI.MOBILE_ALLOW_YES);
	}
	
	public void clickDelay() {
		waitToElementVisible(driver, ExpertUI.DELAY_START);
		clickToElement(driver, ExpertUI.DELAY_START);
	}
	
	public void selectDelay3Minutes() {
		waitToElementVisible(driver, ExpertUI.DELAY_START_3_MINUTES);
		clickToElement(driver, ExpertUI.DELAY_START_3_MINUTES);
	}
	
	public void clearCloseRoom() {
		clearElement(driver, ExpertUI.CLOSE_ROOM_TEXTBOX);
	}
	
	public void inputCloseRoom(String mins) {
		sendkeyToElement(driver, ExpertUI.CLOSE_ROOM_TEXTBOX, mins);
	}
	//end webianr details
	
	//start redirect
	public void clickRedirectMenu() {
		waitToElementVisible(driver, ExpertUI.REDIRECT_MENU);
		clickToElement(driver, ExpertUI.REDIRECT_MENU);
	}
	
	public void inputUrlRedirect(String url) {
		waitToElementVisible(driver, ExpertUI.REDIRECT_URL_TEXTBOX);
		sendkeyToElement(driver, ExpertUI.REDIRECT_URL_TEXTBOX, url);
	}
	// end redirect
	
	// start replay
	public void clickReplayMenu() {
		waitToElementVisible(driver, ExpertUI.REPLAY_MENU);
		clickToElement(driver, ExpertUI.REPLAY_MENU);
	}
	
	public void clickOptionReplay() {
		waitToElementVisible(driver, ExpertUI.REPLAY_OPTIONS);
		clickToElement(driver, ExpertUI.REPLAY_OPTIONS);
	}
	
	public void selectOptionYes() {
		waitToElementVisible(driver, ExpertUI.REPLAY_OPTIONS_YES);
		clickToElement(driver, ExpertUI.REPLAY_OPTIONS_YES);
	}
	
	public void selectOptionNo() {
		waitToElementVisible(driver, ExpertUI.REPLAY_OPTIONS_NO);
		clickToElement(driver, ExpertUI.REPLAY_OPTIONS_NO);
	}
	
}
