package pageUIs;

public class TrackingCodePageUI {

	public static final String EXPERT_MENU = "//span[normalize-space()='Expert settings']";
	public static final String TRACKING_MENU = "//span[normalize-space()='Tracking codes']";
	public static final String NEW_TRACKING_BUTTON = "//span[normalize-space()='New tracking code']";
	public static final String NAME_TRACKING_TEXTBOX = "(//input[@type='text'])[1]";
	public static final String EVENT_OPTIONS = "(//div[@class='v-select__selections'])[1]";
	public static final String OPEN_REGISTRATION_PAGE = "//div[contains(text(),'When opening the registration page')]";
	public static final String SUBMIT_REGISTRATION_FORM = "//div[contains(text(),'When submitting the registration form')]";
	public static final String OPEN_COMFIRMATION_PAGE = "//div[contains(text(),'When opening the Confirmation Required page')]";
	public static final String OPEN_COMPLETED_PAGE = "//div[contains(text(),'When opening the Registration Completed page')]";
	public static final String OPEN_ROOM = "//div[contains(text(),'When opening the webinar room')]";
	
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
}
