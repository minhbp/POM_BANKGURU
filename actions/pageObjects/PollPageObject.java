package pageObjects;

import org.openqa.selenium.WebDriver;

import commons.AbstractPage;
import pageUIs.PollPageUI;

public class PollPageObject extends AbstractPage {
	private WebDriver driver;

	public PollPageObject(WebDriver mappingdriver) {
		driver = mappingdriver;
	}
	
	public void clickPollMenu() {
		waitToElementVisible(driver, PollPageUI.MENU_EXPERT);
		clickToElement(driver, PollPageUI.MENU_EXPERT);
		
		waitToElementVisible(driver, PollPageUI.MENU_POLL);
		clickToElement(driver, PollPageUI.MENU_POLL);
	}

	public void newPoll(String namePoll, String startQuestionHour, String startQuestionMinute,String startQuestionSecond, 
			String endQuestionHour, String endQuestionMinute, String endQuestionSecond,
			String startResultHour, String startResultMinute, String startResultSecond, 
			String endResultHour,String endResultMinute, String endResultSecond, 
			String question, 
			String answerA, String resultA,
			String answerB, String resultB) {

		waitToElementVisible(driver, PollPageUI.BUTTON_NEW_POLL);
		waitToEnableButton(driver, PollPageUI.BUTTON_NEW_POLL);
		clickToElement(driver, PollPageUI.BUTTON_NEW_POLL);

		waitToElementVisible(driver, PollPageUI.NAME_POLL_TXT);
		sendkeyToElement(driver, PollPageUI.NAME_POLL_TXT, namePoll);

		waitToElementVisible(driver, PollPageUI.TIME_START_OPEN_QUESTION_POPUP);
		clickToElement(driver, PollPageUI.TIME_START_OPEN_QUESTION_POPUP);

		waitToElementVisible(driver, PollPageUI.TIME_HOURS);
		sendkeyToElement(driver, PollPageUI.TIME_HOURS, startQuestionHour);

		waitToElementVisible(driver, PollPageUI.TIME_MINUTES);
		sendkeyToElement(driver, PollPageUI.TIME_MINUTES, startQuestionMinute);

		waitToElementVisible(driver, PollPageUI.TIME_SECONDS);
		sendkeyToElement(driver, PollPageUI.TIME_SECONDS, startQuestionSecond);

		waitToElementVisible(driver, PollPageUI.SAVE_TIME);
		clickToElement(driver, PollPageUI.SAVE_TIME);

		waitToElementVisible(driver, PollPageUI.TIME_END_OPEN_QUESTION_POPUP);
		clickToElement(driver, PollPageUI.TIME_END_OPEN_QUESTION_POPUP);

		waitToElementVisible(driver, PollPageUI.TIME_HOURS);
		sendkeyToElement(driver, PollPageUI.TIME_HOURS, endQuestionHour);

		waitToElementVisible(driver, PollPageUI.TIME_MINUTES);
		sendkeyToElement(driver, PollPageUI.TIME_MINUTES, endQuestionMinute);

		waitToElementVisible(driver, PollPageUI.TIME_SECONDS);
		sendkeyToElement(driver, PollPageUI.TIME_SECONDS, endQuestionSecond);

		waitToElementVisible(driver, PollPageUI.SAVE_TIME);
		clickToElement(driver, PollPageUI.SAVE_TIME);

		waitToElementVisible(driver, PollPageUI.TIME_START_OPEN_RESULT_POPUP);
		clickToElement(driver, PollPageUI.TIME_START_OPEN_RESULT_POPUP);

		waitToElementVisible(driver, PollPageUI.TIME_HOURS);
		sendkeyToElement(driver, PollPageUI.TIME_HOURS, startResultHour);

		waitToElementVisible(driver, PollPageUI.TIME_MINUTES);
		sendkeyToElement(driver, PollPageUI.TIME_MINUTES, startResultMinute);

		waitToElementVisible(driver, PollPageUI.TIME_SECONDS);
		sendkeyToElement(driver, PollPageUI.TIME_SECONDS, startResultSecond);

		waitToElementVisible(driver, PollPageUI.SAVE_TIME);
		clickToElement(driver, PollPageUI.SAVE_TIME);
		
		waitToElementVisible(driver, PollPageUI.TIME_END_OPEN_RESULT_POPUP);
		clickToElement(driver, PollPageUI.TIME_END_OPEN_RESULT_POPUP);

		waitToElementVisible(driver, PollPageUI.TIME_HOURS);
		sendkeyToElement(driver, PollPageUI.TIME_HOURS, endResultHour);

		waitToElementVisible(driver, PollPageUI.TIME_MINUTES);
		sendkeyToElement(driver, PollPageUI.TIME_MINUTES, endResultMinute);

		waitToElementVisible(driver, PollPageUI.TIME_SECONDS);
		sendkeyToElement(driver, PollPageUI.TIME_SECONDS, endResultSecond);

		waitToElementVisible(driver, PollPageUI.SAVE_TIME);
		clickToElement(driver, PollPageUI.SAVE_TIME);

		waitToElementVisible(driver, PollPageUI.POLL_QUESTION_TXT);
		sendkeyToElement(driver, PollPageUI.POLL_QUESTION_TXT, question);

		clearElement(driver, PollPageUI.ANSWER_A);
		waitToElementVisible(driver, PollPageUI.ANSWER_A);
		sendkeyToElement(driver, PollPageUI.ANSWER_A, answerA);

		clearElement(driver, PollPageUI.RESULT_A);
		waitToElementVisible(driver, PollPageUI.RESULT_A);
		sendkeyToElement(driver, PollPageUI.RESULT_A, resultA);

		clearElement(driver, PollPageUI.ANSWER_B);
		waitToElementVisible(driver, PollPageUI.ANSWER_B);
		sendkeyToElement(driver, PollPageUI.ANSWER_B, answerB);

		clearElement(driver, PollPageUI.RESULT_B);
		waitToElementVisible(driver, PollPageUI.RESULT_B);
		sendkeyToElement(driver, PollPageUI.RESULT_B, resultB);

		waitToEnableButton(driver, PollPageUI.BUTTON_SAVE);
		clickToElement(driver, PollPageUI.BUTTON_SAVE);

		waitToElementVisible(driver, PollPageUI.MESSAGE_SUCCESS);
		clickToElement(driver, PollPageUI.ICON_CLOSE_MESSAGE);
	}
}
