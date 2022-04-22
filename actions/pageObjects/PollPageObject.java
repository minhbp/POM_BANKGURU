package pageObjects;

import org.openqa.selenium.WebDriver;

import commons.AbstractPage;
import pageUIs.PollPageUI;

public class PollPageObject extends AbstractPage {
	private WebDriver driverGlobal;

	public PollPageObject(WebDriver driverLocal) {
		driverGlobal = driverLocal;
	}
	
	public void clickPollMenu() {
		waitToElementVisible(driverGlobal, PollPageUI.MENU_EXPERT);
		clickToElement(driverGlobal, PollPageUI.MENU_EXPERT);
		
		waitToElementVisible(driverGlobal, PollPageUI.MENU_POLL);
		clickToElement(driverGlobal, PollPageUI.MENU_POLL);
	}

	public void newPoll(String namePoll, String startQuestionHour, String startQuestionMinute,String startQuestionSecond, 
			String endQuestionHour, String endQuestionMinute, String endQuestionSecond,
			String startResultHour, String startResultMinute, String startResultSecond, 
			String endResultHour,String endResultMinute, String endResultSecond, 
			String question, 
			String answerA, String resultA,
			String answerB, String resultB) {

		waitToElementVisible(driverGlobal, PollPageUI.BUTTON_NEW_POLL);
		waitToEnableButton(driverGlobal, PollPageUI.BUTTON_NEW_POLL);
		clickToElement(driverGlobal, PollPageUI.BUTTON_NEW_POLL);

		waitToElementVisible(driverGlobal, PollPageUI.NAME_POLL_TXT);
		sendkeyToElement(driverGlobal, PollPageUI.NAME_POLL_TXT, namePoll);

		waitToElementVisible(driverGlobal, PollPageUI.TIME_START_OPEN_QUESTION_POPUP);
		clickToElement(driverGlobal, PollPageUI.TIME_START_OPEN_QUESTION_POPUP);

		waitToElementVisible(driverGlobal, PollPageUI.TIME_HOURS);
		sendkeyToElement(driverGlobal, PollPageUI.TIME_HOURS, startQuestionHour);

		waitToElementVisible(driverGlobal, PollPageUI.TIME_MINUTES);
		sendkeyToElement(driverGlobal, PollPageUI.TIME_MINUTES, startQuestionMinute);

		waitToElementVisible(driverGlobal, PollPageUI.TIME_SECONDS);
		sendkeyToElement(driverGlobal, PollPageUI.TIME_SECONDS, startQuestionSecond);

		waitToElementVisible(driverGlobal, PollPageUI.SAVE_TIME);
		clickToElement(driverGlobal, PollPageUI.SAVE_TIME);

		waitToElementVisible(driverGlobal, PollPageUI.TIME_END_OPEN_QUESTION_POPUP);
		clickToElement(driverGlobal, PollPageUI.TIME_END_OPEN_QUESTION_POPUP);

		waitToElementVisible(driverGlobal, PollPageUI.TIME_HOURS);
		sendkeyToElement(driverGlobal, PollPageUI.TIME_HOURS, endQuestionHour);

		waitToElementVisible(driverGlobal, PollPageUI.TIME_MINUTES);
		sendkeyToElement(driverGlobal, PollPageUI.TIME_MINUTES, endQuestionMinute);

		waitToElementVisible(driverGlobal, PollPageUI.TIME_SECONDS);
		sendkeyToElement(driverGlobal, PollPageUI.TIME_SECONDS, endQuestionSecond);

		waitToElementVisible(driverGlobal, PollPageUI.SAVE_TIME);
		clickToElement(driverGlobal, PollPageUI.SAVE_TIME);

		waitToElementVisible(driverGlobal, PollPageUI.TIME_START_OPEN_RESULT_POPUP);
		clickToElement(driverGlobal, PollPageUI.TIME_START_OPEN_RESULT_POPUP);

		waitToElementVisible(driverGlobal, PollPageUI.TIME_HOURS);
		sendkeyToElement(driverGlobal, PollPageUI.TIME_HOURS, startResultHour);

		waitToElementVisible(driverGlobal, PollPageUI.TIME_MINUTES);
		sendkeyToElement(driverGlobal, PollPageUI.TIME_MINUTES, startResultMinute);

		waitToElementVisible(driverGlobal, PollPageUI.TIME_SECONDS);
		sendkeyToElement(driverGlobal, PollPageUI.TIME_SECONDS, startResultSecond);

		waitToElementVisible(driverGlobal, PollPageUI.SAVE_TIME);
		clickToElement(driverGlobal, PollPageUI.SAVE_TIME);
		
		waitToElementVisible(driverGlobal, PollPageUI.TIME_END_OPEN_RESULT_POPUP);
		clickToElement(driverGlobal, PollPageUI.TIME_END_OPEN_RESULT_POPUP);

		waitToElementVisible(driverGlobal, PollPageUI.TIME_HOURS);
		sendkeyToElement(driverGlobal, PollPageUI.TIME_HOURS, endResultHour);

		waitToElementVisible(driverGlobal, PollPageUI.TIME_MINUTES);
		sendkeyToElement(driverGlobal, PollPageUI.TIME_MINUTES, endResultMinute);

		waitToElementVisible(driverGlobal, PollPageUI.TIME_SECONDS);
		sendkeyToElement(driverGlobal, PollPageUI.TIME_SECONDS, endResultSecond);

		waitToElementVisible(driverGlobal, PollPageUI.SAVE_TIME);
		clickToElement(driverGlobal, PollPageUI.SAVE_TIME);

		waitToElementVisible(driverGlobal, PollPageUI.POLL_QUESTION_TXT);
		sendkeyToElement(driverGlobal, PollPageUI.POLL_QUESTION_TXT, question);

		clearElement(driverGlobal, PollPageUI.ANSWER_A);
		waitToElementVisible(driverGlobal, PollPageUI.ANSWER_A);
		sendkeyToElement(driverGlobal, PollPageUI.ANSWER_A, answerA);

		clearElement(driverGlobal, PollPageUI.RESULT_A);
		waitToElementVisible(driverGlobal, PollPageUI.RESULT_A);
		sendkeyToElement(driverGlobal, PollPageUI.RESULT_A, resultA);

		clearElement(driverGlobal, PollPageUI.ANSWER_B);
		waitToElementVisible(driverGlobal, PollPageUI.ANSWER_B);
		sendkeyToElement(driverGlobal, PollPageUI.ANSWER_B, answerB);

		clearElement(driverGlobal, PollPageUI.RESULT_B);
		waitToElementVisible(driverGlobal, PollPageUI.RESULT_B);
		sendkeyToElement(driverGlobal, PollPageUI.RESULT_B, resultB);

		waitToEnableButton(driverGlobal, PollPageUI.BUTTON_SAVE);
		clickToElement(driverGlobal, PollPageUI.BUTTON_SAVE);

		waitToElementVisible(driverGlobal, PollPageUI.MESSAGE_SUCCESS);
		clickToElement(driverGlobal, PollPageUI.ICON_CLOSE_MESSAGE);
	}
}
