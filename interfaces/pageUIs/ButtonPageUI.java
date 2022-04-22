package pageUIs;

import java.util.Random;

public class ButtonPageUI {
	
	static String nameTop = "Button Top" + randomNumber();
	static String nameBottom = "Button Bottom" + randomNumber();
	static String nameFullscreen = "Button Fullscreen" + randomNumber();
	static String nameTopRight = "Button TopRight" + randomNumber();
	static String nameTransparent = "Button Transparent" + randomNumber();
	
	static String targetUrl = "google.com.vn";

	public static final String MENU_BUTTON = "//span[normalize-space()='Buttons']";
	public static final String NEW_BUTTON = "//span[normalize-space()='New button']/parent::button";
	public static final String NAME_TXT = "(//input[@type='text'])[1]";
	public static final String TARGET_URL_TXT = "(//input[@type='text'])[2]";

	public static final String NAME_TOP = nameTop;
	public static final String NAME_BOTTOM = nameBottom;
	public static final String NAME_FULLSCREEN = nameFullscreen;
	public static final String NAME_TOP_RIGHT = nameTopRight;
	public static final String NAME_TRANSPARENT = nameTransparent;
	
	public static final String BUTTON_URL_TARGET = targetUrl;
	
	public static final String POSITION_TOP = "//p[normalize-space()='Top']/parent::div//div[@class='context']";
	public static final String POSITION_BOTTOM = "//p[normalize-space()='Bottom']/parent::div//div[@class='context']";
	public static final String POSITION_FULLSCREEN = "//p[normalize-space()='Fullscreen']/parent::div//div[@class='context']";
	public static final String POSITION_TOP_RIGHT = "//p[normalize-space()='Top right']/parent::div//div[@class='context']";
	public static final String POSITION_TRANSPARENT = "//p[normalize-space()='Transparent']/parent::div//div[@class='context']";
	
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
	
	public static int randomNumber() {
		Random random = new Random();
		return random.nextInt(9999);
	}
}
