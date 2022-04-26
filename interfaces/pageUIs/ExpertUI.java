package pageUIs;

public class ExpertUI {
	public static final String EXPERT_MENU = "//span[normalize-space()='Expert settings']";
	public static final String REGION_MENU = "//span[normalize-space()='Region']";
	public static final String REGION_TIMEZONE = "(//div[@class='v-select__selections'])[2]";
	public static final String ALL_ITEM_TIMEZONE = "(//div[@class='v-list-item__title'])";
	
	
	public static final String REGION_TIMEZONE_UTC_10_HAWAII = "//div[contains(text(),'UTC-10: Hawaii Standard Time')]";
	public static final String REGION_TIMEZONE_UTC_7 = "//div[contains(text(),'UTC+7: Bangkok, Hanoi, Jakarta')]";
	public static final String REGION_TIMEZONE_UTC_12 = "//div[contains(text(),'UTC+12: Petropavlovsk-Kamtchatski Time (PETT)')]";
	public static final String REGION_TIME_FORMAT = "(//div[@class='v-select__selections'])[3]";
	public static final String REGION_TIME_FORMAT_AM_PM = "//div[contains(text(),'AM/PM')]";
	public static final String REGION_DATE_FORMAT = "(//div[@class='v-select__selections'])[4]";
	public static final String REGION_DATE_FORMAT_OPTION_7 = "//div[contains(text(),'mm/dd/yyyy')]";

	public static final String DETAILS_MENU = "//span[normalize-space()='Webinar details']";
	public static final String PARTICIPANT_STATUS = "(//div[@class='v-select__selections'])[1]";
	public static final String PARTICIPANT_STATUS_25 = "//div[contains(text(),'25%')]";
	public static final String MOBILE_ALLOW = "(//div[@class='v-select__selections'])[2]";
	public static final String MOBILE_ALLOW_YES = "//div[@class='v-list-item__title'][normalize-space()='Yes (recommended)']";
	public static final String MOBILE_ALLOW_NO = "//div[@class='v-list-item__title'][normalize-space()='No']";
	public static final String DELAY_START = "(//div[@class='v-select__selections'])[3]";
	public static final String DELAY_START_NO = "//div[@class='v-list-item__title'][normalize-space()='No (recommended)']";
	public static final String DELAY_START_1_MINUTE = "//div[contains(text(),'1 minute')]";
	public static final String DELAY_START_2_MINUTES = "//div[contains(text(),'2 minute')]";
	public static final String DELAY_START_3_MINUTES = "//div[contains(text(),'3 minute')]";
	public static final String CLOSE_ROOM_TEXTBOX = "//input[@class='w-input']";
	
	public static final String REDIRECT_MENU = "//span[normalize-space()='Redirect']";
	public static final String REDIRECT_URL_TEXTBOX = "(//input[@type='text'])[1]";
	
	public static final String REPLAY_MENU = "//span[normalize-space()='Replay']";
	public static final String REPLAY_OPTIONS = "(//div[@class='v-select__selections'])[1]";
	public static final String REPLAY_OPTIONS_YES = "//div[@class='v-list-item__title'][normalize-space()='Yes (recommended)']";
	public static final String REPLAY_OPTIONS_NO = "//div[contains(text(),'No')]";
	
	public static final String VACATION_MENU = "//span[normalize-space()='Vacation']";
	public static final String PREPARATION_MENU = "//span[normalize-space()='Preparation time']";
	public static final String PARTICIPANT_MENU = "//span[normalize-space()='Participant limit']";
	public static final String REPORTS_MENU = "//span[normalize-space()='Reports']";
	public static final String FACEBOOK_SHARE_IMAGE_MENU = "//span[normalize-space()='Facebook share image']";
	public static final String LIST_PARTICIPANTS_MENU = "//span[normalize-space()='List of participants']";
	public static final String LEGAL_TEXTS_MENU = "//span[normalize-space()='Legal texts']";
	public static final String REGISTRATION_NOTES_MENU = "//span[normalize-space()='Registration notes']";
	public static final String COOKIE_BANNER_MENU = "//span[normalize-space()='Cookie banner']";

	public static final String BUTTON_SAVE = "//button[contains(text(),'Save')]";

	public static final String MESSAGE_SUCCESS = "//span[@class='w-snackbar-text']";
	public static final String ICON_CLOSE_MESSAGE = "//i[@class='v-icon notranslate fwbn fwbn-cancel theme--dark']";

}
