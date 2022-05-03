package pageUIs;

public class ButtonPageUI {

	public static final String MENU_BUTTON = "//span[normalize-space()='Buttons']";
	public static final String NEW_BUTTON = "//span[normalize-space()='New button']/parent::button";
	public static final String NAME_TXT = "(//input[@type='text'])[1]";
	public static final String TARGET_URL_TXT = "(//input[@type='text'])[2]";

	public static final String BUTTON_POSITION = "//p[normalize-space()='%s']/parent::div//div[@class='context']";

	public static final String TIME_START_OPEN_POPUP = "(//i[@class='fwbn-arrow-down'])[1]";
	public static final String TIME_END_OPEN_POPUP = "(//i[@class='fwbn-arrow-down'])[2]";

	public static final String TIME_HOUSES = "//div[@class='time-wheel hh']//input[@type='text']";
	public static final String TIME_MINUTES = "//div[@class='time-wheel mm']//input[@type='text']";
	public static final String TIME_SECONDS = "//div[@class='time-wheel ss']//input[@type='text']";
	public static final String SAVE_TIME = "//span[normalize-space()='OK']";

	public static final String BUTTON_TEXT_TXT = "(//input[@type='text'])[4]";
	public static final String BUTTON_SAVE = "//button[contains(text(),'Save')]";

	public static final String MESSAGE_SUCCESS = "//span[@class='w-snackbar-text']";
	public static final String ICON_CLOSE_MESSAGE = "//i[@class='v-icon notranslate fwbn fwbn-cancel theme--dark']";

	public static final String VERIFY_BUTTON = "//p[normalize-space()='%s']";

}
