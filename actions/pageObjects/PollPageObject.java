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

//	public void newPoll(String namePoll, String startQuestionHour, String startQuestionMinute,String startQuestionSecond, 
//			String endQuestionHour, String endQuestionMinute, String endQuestionSecond,
//			String startResultHour, String startResultMinute, String startResultSecond, 
//			String endResultHour,String endResultMinute, String endResultSecond, 
//			String question, 
//			String answerA, String resultA,
//			String answerB, String resultB) throws Exception {

	public void clickNewPoll() throws Exception {
		waitToEnableButton(driver, PollPageUI.BUTTON_NEW_POLL);
		Thread.sleep(500);
		clickToElement(driver, PollPageUI.BUTTON_NEW_POLL);
	}

	public void inputNamePoll(String namePoll) {
		waitToElementVisible(driver, PollPageUI.NAME_POLL_TXT);
		sendkeyToElement(driver, PollPageUI.NAME_POLL_TXT, namePoll);
	}

	public void clickTimeStartQuestion() {
		waitToElementVisible(driver, PollPageUI.TIME_START_OPEN_QUESTION_POPUP);
		clickToElement(driver, PollPageUI.TIME_START_OPEN_QUESTION_POPUP);
	}

	public void clickTimeEndQuestion() {
		waitToElementVisible(driver, PollPageUI.TIME_END_OPEN_QUESTION_POPUP);
		clickToElement(driver, PollPageUI.TIME_END_OPEN_QUESTION_POPUP);
	}

	public void clickTimeStartResult() {
		waitToElementVisible(driver, PollPageUI.TIME_START_OPEN_RESULT_POPUP);
		clickToElement(driver, PollPageUI.TIME_START_OPEN_RESULT_POPUP);
	}

	public void clickTimeEndResult() {
		waitToElementVisible(driver, PollPageUI.TIME_END_OPEN_RESULT_POPUP);
		clickToElement(driver, PollPageUI.TIME_END_OPEN_RESULT_POPUP);
	}

	public void inputTime(String Hours, String Minutes, String Seconds) {

		waitToElementVisible(driver, PollPageUI.TIME_HOURS);
		sendkeyToElement(driver, PollPageUI.TIME_HOURS, Hours);

		waitToElementVisible(driver, PollPageUI.TIME_MINUTES);
		sendkeyToElement(driver, PollPageUI.TIME_MINUTES, Minutes);

		waitToElementVisible(driver, PollPageUI.TIME_SECONDS);
		sendkeyToElement(driver, PollPageUI.TIME_SECONDS, Seconds);
	}

	public void clickSaveTime() {
		waitToElementVisible(driver, PollPageUI.SAVE_TIME);
		clickToElement(driver, PollPageUI.SAVE_TIME);
	}

	public void inputQuestion(String question) {
		waitToElementVisible(driver, PollPageUI.POLL_QUESTION_TXT);
		sendkeyToElement(driver, PollPageUI.POLL_QUESTION_TXT, question);
	}

	public void inputAnswerA(String answerA) {
		clearElement(driver, PollPageUI.ANSWER_A);
		waitToElementVisible(driver, PollPageUI.ANSWER_A);
		sendkeyToElement(driver, PollPageUI.ANSWER_A, answerA);
	}

	public void inputResultA(String resultA) {
		clearElement(driver, PollPageUI.RESULT_A);
		waitToElementVisible(driver, PollPageUI.RESULT_A);
		sendkeyToElement(driver, PollPageUI.RESULT_A, resultA);
	}

	public void inputAnswerB(String answerB) {
		clearElement(driver, PollPageUI.ANSWER_B);
		waitToElementVisible(driver, PollPageUI.ANSWER_B);
		sendkeyToElement(driver, PollPageUI.ANSWER_B, answerB);
	}

	public void inputResultB(String resultB) {
		clearElement(driver, PollPageUI.RESULT_B);
		waitToElementVisible(driver, PollPageUI.RESULT_B);
		sendkeyToElement(driver, PollPageUI.RESULT_B, resultB);
	}

	public void clickSavePoll() {
		waitToEnableButton(driver, PollPageUI.BUTTON_SAVE);
		clickToElement(driver, PollPageUI.BUTTON_SAVE);

		waitToElementVisible(driver, PollPageUI.MESSAGE_SUCCESS);
		clickToElement(driver, PollPageUI.ICON_CLOSE_MESSAGE);
	}
}
