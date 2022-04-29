package pageObjects;

import org.openqa.selenium.WebDriver;

import commons.AbstractPage;
import pageUIs.ExpertUI;

public class ExpertPageObject extends AbstractPage {
	private WebDriver driver;

	public ExpertPageObject(WebDriver mappingdriver) {
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

	public void clickLanguage() {
		waitToElementVisible(driver, ExpertUI.LANGUAGE_OPTIONS);
		clickToElement(driver, ExpertUI.LANGUAGE_OPTIONS);
	}
	
	public void selectLanguageGerman() {
		waitToElementVisible(driver, ExpertUI.LANGUAGE_GERMAN);
		scrollToElement(driver, ExpertUI.LANGUAGE_GERMAN);
		clickToElement(driver, ExpertUI.LANGUAGE_GERMAN);
	}
	
	public void selectLanguageVietNam() {
		waitToElementVisible(driver, ExpertUI.LANGUAGE_VIETNAM);
		scrollToElement(driver, ExpertUI.LANGUAGE_VIETNAM);
		clickToElement(driver, ExpertUI.LANGUAGE_VIETNAM);
	}
	
	public void selectLanguageEnglish() {
		waitToElementVisible(driver, ExpertUI.LANGUAGE_ENGLISH);
		scrollToElement(driver, ExpertUI.LANGUAGE_ENGLISH);
		clickToElement(driver, ExpertUI.LANGUAGE_ENGLISH);
	}
	
	public void selectLanguageFrench() {
		waitToElementVisible(driver, ExpertUI.LANGUAGE_FRENCH);
		scrollToElement(driver, ExpertUI.LANGUAGE_FRENCH);
		clickToElement(driver, ExpertUI.LANGUAGE_FRENCH);
	}
	
	public void selectLanguageItalian() {
		waitToElementVisible(driver, ExpertUI.LANGUAGE_ITALIAN);
		scrollToElement(driver, ExpertUI.LANGUAGE_ITALIAN);
		clickToElement(driver, ExpertUI.LANGUAGE_ITALIAN);
	}
	
	public void selectLanguagePortuguese() {
		waitToElementVisible(driver, ExpertUI.LANGUAGE_PORTUGUESE);
		scrollToElement(driver, ExpertUI.LANGUAGE_PORTUGUESE);
		clickToElement(driver, ExpertUI.LANGUAGE_PORTUGUESE);
	}
	
	public void selectLanguageTurkish() {
		waitToElementVisible(driver, ExpertUI.LANGUAGE_TURKISH);
		scrollToElement(driver, ExpertUI.LANGUAGE_TURKISH);
		clickToElement(driver, ExpertUI.LANGUAGE_TURKISH);
	}
	
	public void selectLanguageDutch() {
		waitToElementVisible(driver, ExpertUI.LANGUAGE_DUTCH);
		scrollToElement(driver, ExpertUI.LANGUAGE_DUTCH);
		clickToElement(driver, ExpertUI.LANGUAGE_DUTCH);
	}
	
	public void selectLanguageRussian() {
		waitToElementVisible(driver, ExpertUI.LANGUAGE_RUSSIAN);
		scrollToElement(driver, ExpertUI.LANGUAGE_RUSSIAN);
		clickToElement(driver, ExpertUI.LANGUAGE_RUSSIAN);
	}
	
	public void selectLanguageRomanian() {
		waitToElementVisible(driver, ExpertUI.LANGUAGE_ROMANIAN);
		scrollToElement(driver, ExpertUI.LANGUAGE_ROMANIAN);
		clickToElement(driver, ExpertUI.LANGUAGE_ROMANIAN);
	}
	
	public void selectLanguageHungarian() {
		waitToElementVisible(driver, ExpertUI.LANGUAGE_HUNGARIAN);
		scrollToElement(driver, ExpertUI.LANGUAGE_HUNGARIAN);
		clickToElement(driver, ExpertUI.LANGUAGE_HUNGARIAN);
	}
	
	public void selectLanguageNorwegian() {
		waitToElementVisible(driver, ExpertUI.LANGUAGE_NORWEGIAN);
		scrollToElement(driver, ExpertUI.LANGUAGE_NORWEGIAN);
		clickToElement(driver, ExpertUI.LANGUAGE_NORWEGIAN);
	}
	
	public void selectLanguageLatvian() {
		waitToElementVisible(driver, ExpertUI.LANGUAGE_LATVIAN);
		scrollToElement(driver, ExpertUI.LANGUAGE_LATVIAN);
		clickToElement(driver, ExpertUI.LANGUAGE_LATVIAN);
	}
	
	public void selectLanguageFinnish() {
		waitToElementVisible(driver, ExpertUI.LANGUAGE_FINNISH);
		scrollToElement(driver, ExpertUI.LANGUAGE_FINNISH);
		clickToElement(driver, ExpertUI.LANGUAGE_FINNISH);
	}
	
	public void selectLanguageSlovak() {
		waitToElementVisible(driver, ExpertUI.LANGUAGE_SLOVAK);
		scrollToElement(driver, ExpertUI.LANGUAGE_SLOVAK);
		clickToElement(driver, ExpertUI.LANGUAGE_SLOVAK);
	}
	
	public void selectLanguageCzech() {
		waitToElementVisible(driver, ExpertUI.LANGUAGE_CZECH);
		scrollToElement(driver, ExpertUI.LANGUAGE_CZECH);
		clickToElement(driver, ExpertUI.LANGUAGE_CZECH);
	}
	
	public void selectLanguageSwedish() {
		waitToElementVisible(driver, ExpertUI.LANGUAGE_SWEDISH);
		scrollToElement(driver, ExpertUI.LANGUAGE_SWEDISH);
		clickToElement(driver, ExpertUI.LANGUAGE_SWEDISH);
	}
	
	public void selectLanguageSerbian() {
		waitToElementVisible(driver, ExpertUI.LANGUAGE_SERBIAN);
		scrollToElement(driver, ExpertUI.LANGUAGE_SERBIAN);
		clickToElement(driver, ExpertUI.LANGUAGE_SERBIAN);
	}
	
	public void selectLanguageDanish() {
		waitToElementVisible(driver, ExpertUI.LANGUAGE_DANISH);
		scrollToElement(driver, ExpertUI.LANGUAGE_DANISH);
		clickToElement(driver, ExpertUI.LANGUAGE_DANISH);
	}
	
	public void clickTimezone() {
		waitToElementVisible(driver, ExpertUI.REGION_TIMEZONE);
		clickToElement(driver, ExpertUI.REGION_TIMEZONE);
	}
	
	public void selectTimezone1() throws Exception {
		int a = countItemDropdown(driver, "(//div[@class='v-list-item__title'])");
		scrollToElement(driver, "(//div[@class='v-list-item__title'])" + "[" + " " + a + "" + "]" + "");
		Thread.sleep(500);
		int b = countItemDropdown(driver, "(//div[@class='v-list-item__title'])");
		scrollToElement(driver, "(//div[@class='v-list-item__title'])" + "[" + " " + b + "" + "]" + "");
		Thread.sleep(500);
		int c = countItemDropdown(driver, "(//div[@class='v-list-item__title'])");
		scrollToElement(driver, "(//div[@class='v-list-item__title'])" + "[" + " " + c + "" + "]" + "");
		Thread.sleep(500);
		scrollToElement(driver, ExpertUI.REGION_TIMEZONE_01);
		Thread.sleep(1000);
		clickToElement(driver, ExpertUI.REGION_TIMEZONE_01);
	}
	
	public void selectTimezone2() throws Exception {
		scrollToElement(driver, ExpertUI.REGION_TIMEZONE_02);
		Thread.sleep(500);
		clickToElement(driver, ExpertUI.REGION_TIMEZONE_02);
	}
	
	public void selectTimezone3() throws Exception {
		scrollToElement(driver, ExpertUI.REGION_TIMEZONE_03);
		Thread.sleep(500);
		clickToElement(driver, ExpertUI.REGION_TIMEZONE_03);
	}
	
	public void selectTimezone4() throws Exception {
		scrollToElement(driver, ExpertUI.REGION_TIMEZONE_04);
		Thread.sleep(500);
		clickToElement(driver, ExpertUI.REGION_TIMEZONE_04);
	}
	
	public void selectTimezone5() throws Exception {
		scrollToElement(driver, ExpertUI.REGION_TIMEZONE_05);
		Thread.sleep(500);
		clickToElement(driver, ExpertUI.REGION_TIMEZONE_05);
	}
	
	public void selectTimezone6() throws Exception {
		scrollToElement(driver, ExpertUI.REGION_TIMEZONE_06);
		Thread.sleep(500);
		clickToElement(driver, ExpertUI.REGION_TIMEZONE_06);
	}
	
	public void selectTimezone7() throws Exception {
		scrollToElement(driver, ExpertUI.REGION_TIMEZONE_07);
		Thread.sleep(500);
		clickToElement(driver, ExpertUI.REGION_TIMEZONE_07);
	}
	
	public void selectTimezone8() throws Exception {
		scrollToElement(driver, ExpertUI.REGION_TIMEZONE_08);
		Thread.sleep(500);
		clickToElement(driver, ExpertUI.REGION_TIMEZONE_08);
	}
	
	public void selectTimezone9() throws Exception {
		scrollToElement(driver, ExpertUI.REGION_TIMEZONE_09);
		Thread.sleep(500);
		clickToElement(driver, ExpertUI.REGION_TIMEZONE_09);
	}
	
	public void selectTimezone10() throws Exception {
		scrollToElement(driver, ExpertUI.REGION_TIMEZONE_10);
		Thread.sleep(500);
		clickToElement(driver, ExpertUI.REGION_TIMEZONE_10);
	}
	
	public void selectTimezone11() throws Exception {
		scrollToElement(driver, ExpertUI.REGION_TIMEZONE_11);
		Thread.sleep(500);
		clickToElement(driver, ExpertUI.REGION_TIMEZONE_11);
	}
	
	public void selectTimezone12() throws Exception {
		scrollToElement(driver, ExpertUI.REGION_TIMEZONE_12);
		Thread.sleep(500);
		clickToElement(driver, ExpertUI.REGION_TIMEZONE_12);
	}
	
	public void selectTimezone13() throws Exception {
		scrollToElement(driver, ExpertUI.REGION_TIMEZONE_13);
		Thread.sleep(500);
		clickToElement(driver, ExpertUI.REGION_TIMEZONE_13);
	}
	
	public void selectTimezone14() throws Exception {
		scrollToElement(driver, ExpertUI.REGION_TIMEZONE_14);
		Thread.sleep(500);
		clickToElement(driver, ExpertUI.REGION_TIMEZONE_14);
	}
	
	public void selectTimezone15() throws Exception {
		scrollToElement(driver, ExpertUI.REGION_TIMEZONE_15);
		Thread.sleep(500);
		clickToElement(driver, ExpertUI.REGION_TIMEZONE_15);
	}
	
	public void selectTimezone16() throws Exception {
		scrollToElement(driver, ExpertUI.REGION_TIMEZONE_16);
		Thread.sleep(500);
		clickToElement(driver, ExpertUI.REGION_TIMEZONE_16);
	}
	
	public void selectTimezone17() throws Exception {
		scrollToElement(driver, ExpertUI.REGION_TIMEZONE_17);
		Thread.sleep(500);
		clickToElement(driver, ExpertUI.REGION_TIMEZONE_17);
	}
	
	public void selectTimezone18() throws Exception {
		scrollToElement(driver, ExpertUI.REGION_TIMEZONE_18);
		Thread.sleep(500);
		clickToElement(driver, ExpertUI.REGION_TIMEZONE_18);
	}
	
	public void selectTimezone19() throws Exception {
		scrollToElement(driver, ExpertUI.REGION_TIMEZONE_19);
		Thread.sleep(500);
		clickToElement(driver, ExpertUI.REGION_TIMEZONE_19);
	}
	
	public void selectTimezone20() throws Exception {
		scrollToElement(driver, ExpertUI.REGION_TIMEZONE_20);
		Thread.sleep(500);
		clickToElement(driver, ExpertUI.REGION_TIMEZONE_20);
	}
	
	public void selectTimezone21() throws Exception {
		scrollToElement(driver, ExpertUI.REGION_TIMEZONE_21);
		Thread.sleep(500);
		clickToElement(driver, ExpertUI.REGION_TIMEZONE_21);
	}
	
	public void selectTimezone22() throws Exception {
		scrollToElement(driver, ExpertUI.REGION_TIMEZONE_22);
		Thread.sleep(500);
		clickToElement(driver, ExpertUI.REGION_TIMEZONE_22);
	}
	
	public void selectTimezone23() throws Exception {
		scrollToElement(driver, ExpertUI.REGION_TIMEZONE_23);
		Thread.sleep(500);
		clickToElement(driver, ExpertUI.REGION_TIMEZONE_23);
	}
	
	public void selectTimezone24() throws Exception {
		scrollToElement(driver, ExpertUI.REGION_TIMEZONE_24);
		Thread.sleep(500);
		clickToElement(driver, ExpertUI.REGION_TIMEZONE_24);
	}
	
	public void selectTimezone25() throws Exception {
		scrollToElement(driver, ExpertUI.REGION_TIMEZONE_25);
		Thread.sleep(500);
		clickToElement(driver, ExpertUI.REGION_TIMEZONE_25);
	}
	
	public void selectTimezone26() throws Exception {
		scrollToElement(driver, ExpertUI.REGION_TIMEZONE_26);
		Thread.sleep(500);
		clickToElement(driver, ExpertUI.REGION_TIMEZONE_26);
	}
	
	public void selectTimezone27() throws Exception {
		scrollToElement(driver, ExpertUI.REGION_TIMEZONE_27);
		Thread.sleep(500);
		clickToElement(driver, ExpertUI.REGION_TIMEZONE_27);
	}
	
	public void selectTimezone28() throws Exception {
		scrollToElement(driver, ExpertUI.REGION_TIMEZONE_28);
		Thread.sleep(500);
		clickToElement(driver, ExpertUI.REGION_TIMEZONE_28);
	}
	
	public void selectTimezone29() throws Exception {
		scrollToElement(driver, ExpertUI.REGION_TIMEZONE_29);
		Thread.sleep(500);
		clickToElement(driver, ExpertUI.REGION_TIMEZONE_29);
	}
	
	public void selectTimezone30() throws Exception {
		scrollToElement(driver, ExpertUI.REGION_TIMEZONE_30);
		Thread.sleep(500);
		clickToElement(driver, ExpertUI.REGION_TIMEZONE_30);
	}
	
	public void selectTimezone31() throws Exception {
		scrollToElement(driver, ExpertUI.REGION_TIMEZONE_31);
		Thread.sleep(500);
		clickToElement(driver, ExpertUI.REGION_TIMEZONE_31);
	}
	
	public void selectTimezone32() throws Exception {
		scrollToElement(driver, ExpertUI.REGION_TIMEZONE_32);
		Thread.sleep(500);
		clickToElement(driver, ExpertUI.REGION_TIMEZONE_32);
	}
	
	public void selectTimezone33() throws Exception {
		scrollToElement(driver, ExpertUI.REGION_TIMEZONE_33);
		Thread.sleep(500);
		clickToElement(driver, ExpertUI.REGION_TIMEZONE_33);
	}
	
	public void selectTimezone34() throws Exception {
		scrollToElement(driver, ExpertUI.REGION_TIMEZONE_34);
		Thread.sleep(500);
		clickToElement(driver, ExpertUI.REGION_TIMEZONE_34);
	}
	
	public void selectTimezone35() throws Exception {
		scrollToElement(driver, ExpertUI.REGION_TIMEZONE_35);
		Thread.sleep(500);
		clickToElement(driver, ExpertUI.REGION_TIMEZONE_35);
	}
	
	public void selectTimezone36() throws Exception {
		scrollToElement(driver, ExpertUI.REGION_TIMEZONE_36);
		Thread.sleep(500);
		clickToElement(driver, ExpertUI.REGION_TIMEZONE_36);
	}
	
	public void selectTimezone37() throws Exception {
		scrollToElement(driver, ExpertUI.REGION_TIMEZONE_37);
		Thread.sleep(500);
		clickToElement(driver, ExpertUI.REGION_TIMEZONE_37);
	}
	
	public void selectTimezone38() throws Exception {
		scrollToElement(driver, ExpertUI.REGION_TIMEZONE_38);
		Thread.sleep(500);
		clickToElement(driver, ExpertUI.REGION_TIMEZONE_38);
	}
	
	public void selectTimezone39() throws Exception {
		scrollToElement(driver, ExpertUI.REGION_TIMEZONE_39);
		Thread.sleep(500);
		clickToElement(driver, ExpertUI.REGION_TIMEZONE_39);
	}
	
	public void selectTimezone40() throws Exception {
		scrollToElement(driver, ExpertUI.REGION_TIMEZONE_40);
		Thread.sleep(500);
		clickToElement(driver, ExpertUI.REGION_TIMEZONE_40);
	}
	

	public void clickTimeFormat() {
		waitToElementVisible(driver, ExpertUI.REGION_TIME_FORMAT);
		clickToElement(driver, ExpertUI.REGION_TIME_FORMAT);
	}

	public void selectTimeAmPm() {
		waitToElementVisible(driver, ExpertUI.REGION_TIME_FORMAT_AM_PM);
		clickToElement(driver, ExpertUI.REGION_TIME_FORMAT_AM_PM);
	}
	
	public void selectTime24h() {
		waitToElementVisible(driver, ExpertUI.REGION_TIME_FORMAT_24H);
		clickToElement(driver, ExpertUI.REGION_TIME_FORMAT_24H);
	}
	
	public void clickDateFormat() throws Exception {
		waitToElementVisible(driver, ExpertUI.REGION_DATE_FORMAT);
		clickToElement(driver, ExpertUI.REGION_DATE_FORMAT);
	}
	
	public void selectOption1DateFormat() {
		waitToElementVisible(driver, ExpertUI.REGION_DATE_FORMAT_OPTION_1);
		clickToElement(driver, ExpertUI.REGION_DATE_FORMAT_OPTION_1);
	}
	
	public void selectOption2DateFormat() {
		waitToElementVisible(driver, ExpertUI.REGION_DATE_FORMAT_OPTION_2);
		clickToElement(driver, ExpertUI.REGION_DATE_FORMAT_OPTION_2);
	}
	
	public void selectOption3DateFormat() {
		waitToElementVisible(driver, ExpertUI.REGION_DATE_FORMAT_OPTION_3);
		clickToElement(driver, ExpertUI.REGION_DATE_FORMAT_OPTION_3);
	}
	
	public void selectOption4DateFormat() {
		waitToElementVisible(driver, ExpertUI.REGION_DATE_FORMAT_OPTION_4);
		clickToElement(driver, ExpertUI.REGION_DATE_FORMAT_OPTION_4);
	}
	
	public void selectOption5DateFormat() {
		waitToElementVisible(driver, ExpertUI.REGION_DATE_FORMAT_OPTION_5);
		clickToElement(driver, ExpertUI.REGION_DATE_FORMAT_OPTION_5);
	}
	
	public void selectOption6DateFormat() {
		waitToElementVisible(driver, ExpertUI.REGION_DATE_FORMAT_OPTION_6);
		clickToElement(driver, ExpertUI.REGION_DATE_FORMAT_OPTION_6);
	}
	
	public void selectOption7DateFormat() {
		waitToElementVisible(driver, ExpertUI.REGION_DATE_FORMAT_OPTION_7);
		clickToElement(driver, ExpertUI.REGION_DATE_FORMAT_OPTION_7);
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
	
	public void selectStatusAtLogin() {
		waitToElementVisible(driver, ExpertUI.PARTICIPANT_STATUS_AT_LOGIN);
		clickToElement(driver, ExpertUI.PARTICIPANT_STATUS_AT_LOGIN);
	}
	
	public void selectStatus5() {
		waitToElementVisible(driver, ExpertUI.PARTICIPANT_STATUS_5);
		clickToElement(driver, ExpertUI.PARTICIPANT_STATUS_5);
	}
	
	public void selectStatus10() {
		waitToElementVisible(driver, ExpertUI.PARTICIPANT_STATUS_10);
		clickToElement(driver, ExpertUI.PARTICIPANT_STATUS_10);
	}
	
	public void selectStatus15() {
		waitToElementVisible(driver, ExpertUI.PARTICIPANT_STATUS_15);
		clickToElement(driver, ExpertUI.PARTICIPANT_STATUS_15);
	}
	
	public void selectStatus20() {
		waitToElementVisible(driver, ExpertUI.PARTICIPANT_STATUS_20);
		clickToElement(driver, ExpertUI.PARTICIPANT_STATUS_20);
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
	
	public void selectMobileNo() {
		waitToElementVisible(driver, ExpertUI.MOBILE_ALLOW_NO);
		clickToElement(driver, ExpertUI.MOBILE_ALLOW_NO);
	}
	
	public void clickDelay() {
		waitToElementVisible(driver, ExpertUI.DELAY_START);
		clickToElement(driver, ExpertUI.DELAY_START);
	}

	public void selectDelayNo() {
		waitToElementVisible(driver, ExpertUI.DELAY_START_NO);
		clickToElement(driver, ExpertUI.DELAY_START_NO);
	}
	
	public void selectDelay1Minutes() {
		waitToElementVisible(driver, ExpertUI.DELAY_START_1_MINUTE);
		clickToElement(driver, ExpertUI.DELAY_START_1_MINUTE);
	}
	
	public void selectDelay2Minutes() {
		waitToElementVisible(driver, ExpertUI.DELAY_START_2_MINUTES);
		clickToElement(driver, ExpertUI.DELAY_START_2_MINUTES);
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
	// end webianr details

	// start redirect
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
	// end replay
	
	//start vacation
	public void clickVacationMenu() {
		waitToElementVisible(driver, ExpertUI.VACATION_MENU);
		clickToElement(driver, ExpertUI.VACATION_MENU);
	}
	
	public void clickNewVacationButton() {
		waitToEnableButton(driver, ExpertUI.NEW_VACATION_BUTTON);
		clickToElement(driver, ExpertUI.NEW_VACATION_BUTTON);
	}
	
	public void clickVacationSetting() {
		waitToElementVisible(driver, ExpertUI.VACATION_REPEAT);
		clickToElement(driver, ExpertUI.VACATION_REPEAT);
	}
	
	public void selectVacationOnce() {
		waitToElementVisible(driver, ExpertUI.VACATION_REPEAT_ONCE);
		clickToElement(driver, ExpertUI.VACATION_REPEAT_ONCE);
	}
	
	public void selectVacationAnnual() {
		waitToElementVisible(driver, ExpertUI.VACATION_REPEAT_ANNUAL);
		clickToElement(driver, ExpertUI.VACATION_REPEAT_ANNUAL);
	}
	// end vacation
	
	//start delay showtime
	public void clickPreparationMenu() {
		waitToElementVisible(driver, ExpertUI.PREPARATION_MENU);
		clickToElement(driver, ExpertUI.PREPARATION_MENU);
	}
	
	public void clickPreparationOptions() {
		waitToElementVisible(driver, ExpertUI.PREPARATION_OPTIONS);
		clickToElement(driver, ExpertUI.PREPARATION_OPTIONS);
	}
	
	public void selectOptionPreparationNo() {
		waitToElementVisible(driver, ExpertUI.DELAY_SHOWTIME_NO);
		clickToElement(driver, ExpertUI.DELAY_SHOWTIME_NO);
	}
	
	public void selectOptionPreparationYes() {
		waitToElementVisible(driver, ExpertUI.DELAY_SHOWTIME_YES);
		clickToElement(driver, ExpertUI.DELAY_SHOWTIME_YES);
	}
	
	public void clearTimeDay() {
		waitToElementVisible(driver, ExpertUI.DELAY_SHOWTIME_YES_DAY_TEXTBOX);
		clearElement(driver, ExpertUI.DELAY_SHOWTIME_YES_DAY_TEXTBOX);
	}
	
	public void inputDayDelay(String days) {
		waitToElementVisible(driver, ExpertUI.DELAY_SHOWTIME_YES_DAY_TEXTBOX);
		sendkeyToElement(driver, ExpertUI.DELAY_SHOWTIME_YES_DAY_TEXTBOX, days);
	}
	// end delay showtime
	
	// start participant limit
	public void clickParticipantMenu() {
		waitToElementVisible(driver, ExpertUI.PARTICIPANT_MENU);
		clickToElement(driver, ExpertUI.PARTICIPANT_MENU);
	}
	
	public void clickParticipantLoadBalancing() {
		waitToElementVisible(driver, ExpertUI.PARTICIPANT_LOAD_BALANCING);
		clickToElement(driver, ExpertUI.PARTICIPANT_LOAD_BALANCING);
	}
	
	public void selectNextHour() {
		waitToElementVisible(driver, ExpertUI.PARTICIPANT_LOAD_BALANCING_NEXT_HOUR);
		clickToElement(driver, ExpertUI.PARTICIPANT_LOAD_BALANCING_NEXT_HOUR);
	}
	
	public void selectNextShowtime() {
		waitToElementVisible(driver, ExpertUI.PARTICIPANT_LOAD_BALANCING_NEXT_SHOWTIME);
		clickToElement(driver, ExpertUI.PARTICIPANT_LOAD_BALANCING_NEXT_SHOWTIME);
	}
	
	public void clickMaximum() {
		waitToElementVisible(driver, ExpertUI.PARTICIPANT_MAXIMUM);
		clickToElement(driver, ExpertUI.PARTICIPANT_MAXIMUM);
	}
	
	public void clickMaximum10() {
		waitToElementVisible(driver, ExpertUI.PARTICIPANT_MAXIMUM_10);
		clickToElement(driver, ExpertUI.PARTICIPANT_MAXIMUM_10);
	}
	
	public void clickMaximum25() {
		waitToElementVisible(driver, ExpertUI.PARTICIPANT_MAXIMUM_25);
		clickToElement(driver, ExpertUI.PARTICIPANT_MAXIMUM_25);
	}
	
	public void clickMaximum50() {
		waitToElementVisible(driver, ExpertUI.PARTICIPANT_MAXIMUM_50);
		clickToElement(driver, ExpertUI.PARTICIPANT_MAXIMUM_50);
	}
	
	public void clickMaximum100() {
		waitToElementVisible(driver, ExpertUI.PARTICIPANT_MAXIMUM_100);
		clickToElement(driver, ExpertUI.PARTICIPANT_MAXIMUM_100);
	}
	
	public void clickMaximum250() {
		waitToElementVisible(driver, ExpertUI.PARTICIPANT_MAXIMUM_250);
		clickToElement(driver, ExpertUI.PARTICIPANT_MAXIMUM_250);
	}
	
	public void clickMaximum500() {
		waitToElementVisible(driver, ExpertUI.PARTICIPANT_MAXIMUM_500);
		clickToElement(driver, ExpertUI.PARTICIPANT_MAXIMUM_500);
	}
	// end participant
	
	// start reports
	public void clickReportMenu() {
		waitToElementVisible(driver, ExpertUI.REPORTS_MENU);
		clickToElement(driver, ExpertUI.REPORTS_MENU);
	}
	
	public void clickIconeDelete() {
		waitToElementVisible(driver, ExpertUI.ICON_CLOSE_RECORD_DEFAULT);
		clickToElement(driver, ExpertUI.ICON_CLOSE_RECORD_DEFAULT);
	}
	
	public void clickNewReport() {
		waitToElementVisible(driver, ExpertUI.NEW_REPORT_BUTTON);
		clickToElement(driver, ExpertUI.NEW_REPORT_BUTTON);
	}
	
	public void clearAndInputEmailReport(String emailReport) {
		waitToElementVisible(driver, ExpertUI.EMAIL_REPORT_TEXTBOX);
		clearElement(driver, ExpertUI.EMAIL_REPORT_TEXTBOX);
		sendkeyToElement(driver, ExpertUI.EMAIL_REPORT_TEXTBOX, emailReport);
	}
	
	public void selectAllReports() {
		clickToElement(driver, ExpertUI.REPORT_LOGIN_CHECKBOX);
		clickToElement(driver, ExpertUI.REPORT_LOGOUT_CHECKBOX);
		clickToElement(driver, ExpertUI.REPORT_SINGLE_CHAT_CHECKBOX);
		clickToElement(driver, ExpertUI.REPORT_ALL_CHAT_CHECKBOX);
	}
	
	public void unselectAllReports() {
		clickToElement(driver, ExpertUI.REPORT_REGIST_CHECKBOX);
		clickToElement(driver, ExpertUI.REPORT_LOGIN_CHECKBOX);
		clickToElement(driver, ExpertUI.REPORT_LOGOUT_CHECKBOX);
		clickToElement(driver, ExpertUI.REPORT_SINGLE_CHAT_CHECKBOX);
		clickToElement(driver, ExpertUI.REPORT_ALL_CHAT_CHECKBOX);
		clickToElement(driver, ExpertUI.REPORT_SUMMARY_CHECKBOX);
		clickToElement(driver, ExpertUI.REPORT_REPLAY_CHAT_CHECKBOX);
	}
	// end reports
	
	//start facebook share imgae
	public void clickFacebookMenu() {
		waitToElementVisible(driver, ExpertUI.FACEBOOK_SHARE_IMAGE_MENU);
		clickToElement(driver, ExpertUI.FACEBOOK_SHARE_IMAGE_MENU);
	}
	
	public void clickSelectFacebookImageButton() {
		waitToElementVisible(driver, ExpertUI.SELECT_FACEBOOK_IMAGE_BUTTON);
		clickToElement(driver, ExpertUI.SELECT_FACEBOOK_IMAGE_BUTTON);
	}
	
	public void selectlImageLocal() {
		waitToEnableButton(driver, ExpertUI.SELECT_IMAGE_BUTTON);
		clickToElement(driver, ExpertUI.SELECT_IMAGE_BUTTON);
	}
	//end facebook share image
	
	// start list of participant
	public void clickListOfParticipantMenu() {
		waitToElementVisible(driver, ExpertUI.LIST_PARTICIPANTS_MENU);
		clickToElement(driver, ExpertUI.LIST_PARTICIPANTS_MENU);
	}
	
	public void clickListOfParticipantStyle() {
		waitToElementVisible(driver, ExpertUI.LIST_PARTICIPANTS_STYLE);
		clickToElement(driver, ExpertUI.LIST_PARTICIPANTS_STYLE);
	}
	
	public void selectListOfParticipantStyleFullList() {
		waitToElementVisible(driver, ExpertUI.LIST_PARTICIPANTS_STYLE_FULL_LIST);
		clickToElement(driver, ExpertUI.LIST_PARTICIPANTS_STYLE_FULL_LIST);
	}
	
	public void selectListOfParticipantStyleNoList() {
		waitToElementVisible(driver, ExpertUI.LIST_PARTICIPANTS_STYLE_NO);
		clickToElement(driver, ExpertUI.LIST_PARTICIPANTS_STYLE_NO);
	}
	
	public void selectListOfParticipantStyleOnlyNumber() {
		waitToElementVisible(driver, ExpertUI.LIST_PARTICIPANTS_STYLE_ONLY_NUMBER);
		clickToElement(driver, ExpertUI.LIST_PARTICIPANTS_STYLE_ONLY_NUMBER);
	}
	
	public void clickListOfParticipantName() {
		waitToElementVisible(driver, ExpertUI.FULL_LIST_NAMES);
		clickToElement(driver, ExpertUI.FULL_LIST_NAMES);
	}
	
	public void selectListOfParticipantFullName() {
		waitToElementVisible(driver, ExpertUI.FULL_LIST_NAMES_FULL_NAME);
		clickToElement(driver, ExpertUI.FULL_LIST_NAMES_FULL_NAME);
	}
	
	public void selectListOfParticipantFullFirstName() {
		waitToElementVisible(driver, ExpertUI.FULL_LIST_NAMES_FULL_FIRSTNAME_ONLY);
		clickToElement(driver, ExpertUI.FULL_LIST_NAMES_FULL_FIRSTNAME_ONLY);
	}
	
	public void selectListOfParticipantLastName() {
		waitToElementVisible(driver, ExpertUI.FULL_LIST_NAMES_FULL_LASTNAME_ONLY);
		clickToElement(driver, ExpertUI.FULL_LIST_NAMES_FULL_LASTNAME_ONLY);
	}
	
	public void selectListOfParticipantNickName() {
		waitToElementVisible(driver, ExpertUI.FULL_LIST_NAMES_FULL_NICKNAME);
		clickToElement(driver, ExpertUI.FULL_LIST_NAMES_FULL_NICKNAME);
	}
	
	
	
	public void clickListOfParticipantType() {
		waitToElementVisible(driver, ExpertUI.FULL_LIST_TYPE);
		clickToElement(driver, ExpertUI.FULL_LIST_TYPE);
	}
	
	public void selectListOfParticipantFakeViewer() {
		waitToElementVisible(driver, ExpertUI.FULL_LIST_TYPE_FAKE_VIEWER_ONLY);
		clickToElement(driver, ExpertUI.FULL_LIST_TYPE_FAKE_VIEWER_ONLY);
	}
	
	public void selectListOfParticipantRealViewer() {
		waitToElementVisible(driver, ExpertUI.FULL_LIST_TYPE_REAL_VIEWER_ONLY);
		clickToElement(driver, ExpertUI.FULL_LIST_TYPE_REAL_VIEWER_ONLY);
	}
	
	public void selectListOfParticipantAllViewer() {
		waitToElementVisible(driver, ExpertUI.FULL_LIST_TYPE_ALL_VIEWER);
		clickToElement(driver, ExpertUI.FULL_LIST_TYPE_ALL_VIEWER);
	}
	
	public void inputNumberViewers(String numberViewer) {
		waitToElementVisible(driver, ExpertUI.FULL_LIST_NUMBER_VIEWERS);
		clearElement(driver, ExpertUI.FULL_LIST_NUMBER_VIEWERS);
		sendkeyToElement(driver, ExpertUI.FULL_LIST_NUMBER_VIEWERS, numberViewer);
	}
	
	
	
	
	public void clickListOfParticipantGender() {
		waitToElementVisible(driver, ExpertUI.FULL_LIST_GENDER);
		clickToElement(driver, ExpertUI.FULL_LIST_GENDER);
	}
	
	public void selectGenderAll() {
		waitToElementVisible(driver, ExpertUI.FULL_LIST_GENDER_ALL);
		clickToElement(driver, ExpertUI.FULL_LIST_GENDER_ALL);
	}
	
	public void selectGenderFemale() {
		waitToElementVisible(driver, ExpertUI.FULL_LIST_FEMALE_ONLY);
		clickToElement(driver, ExpertUI.FULL_LIST_FEMALE_ONLY);
	}
	
	public void selectGenderMale() {
		waitToElementVisible(driver, ExpertUI.FULL_LIST_MALE_ONLY);
		clickToElement(driver, ExpertUI.FULL_LIST_MALE_ONLY);
	}
	
	public void clickListOfParticipantLanguage() {
		waitToElementVisible(driver, ExpertUI.FULL_LIST_LANGUAGE);
		clickToElement(driver, ExpertUI.FULL_LIST_LANGUAGE);
	}
	
	public void selectLanguageGermany() {
		waitToElementVisible(driver, ExpertUI.FULL_LIST_LANGUAGE_GERMANY);
		clickToElement(driver, ExpertUI.FULL_LIST_LANGUAGE_GERMANY);
	}
	
	public void selectLanguageUk() {
		waitToElementVisible(driver, ExpertUI.FULL_LIST_LANGUAGE_UK);
		clickToElement(driver, ExpertUI.FULL_LIST_LANGUAGE_UK);
	}
	
	public void selectLanguageFrance() {
		waitToElementVisible(driver, ExpertUI.FULL_LIST_LANGUAGE_FRANCE);
		clickToElement(driver, ExpertUI.FULL_LIST_LANGUAGE_FRANCE);
	}
	
	public void selectLanguageItaly() {
		waitToElementVisible(driver, ExpertUI.FULL_LIST_LANGUAGE_ITALY);
		clickToElement(driver, ExpertUI.FULL_LIST_LANGUAGE_ITALY);
	}
	
	public void selectLanguageVietNamViewerList() {
		waitToElementVisible(driver, ExpertUI.FULL_LIST_LANGUAGE_VIETNAM);
		clickToElement(driver, ExpertUI.FULL_LIST_LANGUAGE_VIETNAM);
	}
	
	public void selectLanguagePoland() {
		waitToElementVisible(driver, ExpertUI.FULL_LIST_LANGUAGE_POLAND);
		clickToElement(driver, ExpertUI.FULL_LIST_LANGUAGE_POLAND);
	}
	
	public void selectLanguageSpain() {
		waitToElementVisible(driver, ExpertUI.FULL_LIST_LANGUAGE_SPAIN);
		clickToElement(driver, ExpertUI.FULL_LIST_LANGUAGE_SPAIN);
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	public void clickSave() {
		waitToEnableButton(driver, ExpertUI.BUTTON_SAVE);
		clickToElement(driver, ExpertUI.BUTTON_SAVE);
		
		waitToElementVisible(driver, ExpertUI.MESSAGE_SUCCESS);
		clickToElement(driver, ExpertUI.ICON_CLOSE_MESSAGE);
	}
}



















