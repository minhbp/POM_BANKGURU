package pageUIs;

import java.util.Random;

public class NewProjectPageUI {

	public static final String NEW_PROJECT_URL = "https://app.webinaris.co/new-webinar";
	public static final String NEW_PROJECT_TITLE_TEXTBOX = "//input[@id='nameTxt']";
	public static final String NEW_PROJECT_INPUT_TITLE = "Automation testing " + randomNumber();
	public static final String NEW_PROJECT_SUBTITLE_TEXTBOX = "//input[@id='internalTxt']";
	public static final String NEW_PROJECT_INPUT_SUBTITLE = "Internal title " + randomNumber();
	public static final String NEW_PROJECT_BUTTON = "//button[normalize-space()='Create webinar']";
	
	public static final String MESSAGE_SUCCESS = "//span[@class='w-snackbar-text']";
	public static final String ICON_CLOSE_MESSAGE = "//i[@class='v-icon notranslate fwbn fwbn-cancel theme--dark']";
	public static final String BASIC_SETTINGS_TITLE_TEXT = "//h1[normalize-space()='Basic settings']";
	
	public static int randomNumber() {
		Random random = new Random();
		return random.nextInt(9999);
	}
}
