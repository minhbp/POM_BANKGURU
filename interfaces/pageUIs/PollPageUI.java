package pageUIs;

public class PollPageUI {

	public static final String MENU_EXPERT = "//span[normalize-space()='Expert settings']";
	public static final String MENU_POLL = "//span[normalize-space()='Polls']";
	public static final String BUTTON_NEW_POLL = "//span[normalize-space()='New poll']";
	public static final String NAME_POLL_TXT = "(//input[@type='text'])[1]";
	public static final String TIME_START_OPEN_QUESTION_POPUP = "(//i[@class='fwbn-arrow-down'])[1]";
	public static final String TIME_END_OPEN_QUESTION_POPUP = "(//i[@class='fwbn-arrow-down'])[2]";
	public static final String TIME_START_OPEN_RESULT_POPUP = "(//i[@class='fwbn-arrow-down'])[3]";
	public static final String TIME_END_OPEN_RESULT_POPUP = "(//i[@class='fwbn-arrow-down'])[4]";

	public static final String TIME_HOURS = "//div[@class='time-wheel hh']//input[@type='text']";
	public static final String TIME_MINUTES = "//div[@class='time-wheel mm']//input[@type='text']";
	public static final String TIME_SECONDS = "//div[@class='time-wheel ss']//input[@type='text']";
	public static final String SAVE_TIME = "//span[normalize-space()='OK']";

	public static final String POLL_QUESTION_TXT = "(//input[@type='text'])[2]";
	public static final String ANSWER_A = "(//input[@type='text'])[3]";
	public static final String RESULT_A = "(//input[@type='text'])[4]";

	public static final String ANSWER_B = "(//input[@type='text'])[5]";
	public static final String RESULT_B = "(//input[@type='text'])[6]";

	public static final String BUTTON_SAVE = "//button[contains(text(),'Save')]";

	public static final String MESSAGE_SUCCESS = "//span[@class='w-snackbar-text']";
	public static final String ICON_CLOSE_MESSAGE = "//i[@class='v-icon notranslate fwbn fwbn-cancel theme--dark']";

}
