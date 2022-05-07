package pageUIs;

public class TrackingCodePageUI {

	public static final String EXPERT_MENU = "//span[normalize-space()='Expert settings']";
	public static final String TRACKING_MENU = "//span[normalize-space()='Tracking codes']";
	public static final String NEW_TRACKING_BUTTON = "//span[normalize-space()='New tracking code']";
	public static final String NAME_TRACKING_TEXTBOX = "(//input[@type='text'])[1]";
	public static final String EVENT_OPTIONS = "(//div[@class='v-select__selections'])[1]";
	
	public static final String TRACKING_EVENTS = "//div[contains(text(),'%s')]";
	
	public static final String COOKIES = "(//div[@class='v-input__control'])[3]";
	public static final String COOKIES_YES = "//div[@class='v-list-item__title'][contains(text(),'Yes - also recommended if you are not entirely sur')]";
	public static final String COOKIES_NO = "//div[contains(text(),'No')]";
	public static final String COOKIES_STATISTICS_CHECKBOX = "(//div[@class='v-input--selection-controls__input'])[1]";
	public static final String COOKIES_MARKETING_CHECKBOX = "(//div[@class='v-input--selection-controls__input'])[2]";
	
	public static final String BEFORE_HEAD_TAG_TEXTAREA = "(//textarea)[1]";
	public static final String AFTER_BODY_TAG_TEXTAREA = "(//textarea)[2]";
	public static final String BEFORE_BODY_TEXTAREA = "(//textarea)[3]";

	public static final String SAVE_BUTTON = "//button[contains(text(),'Save')]";
	
	public static final String SUCCESS_MESSAGE = "//span[normalize-space()='Awesome - that worked!']";
	public static final String CLOSE_MESSAGE_ICON = "//i[@class='v-icon notranslate fwbn fwbn-cancel theme--dark']";
	
	public static final String VERIFY_TRACKING_CODE = "//p[normalize-space()='%s']";
	
	public static final String ROOM_TIME_PICKER = "//div[@class='hms-picker timepicker']";
	public static final String ROOM_TIME_PICKER_H = "//div[@class='time-wheel hh']//input[@type='text']";
	public static final String ROOM_TIME_PICKER_M = "//div[@class='time-wheel mm']//input[@type='text']";
	public static final String ROOM_TIME_PICKER_S = "//div[@class='time-wheel ss']//input[@type='text']";
	public static final String ROOM_TIME_PICKER_OK = "//span[normalize-space()='OK']";
}
