package pageUIs;

public class ShareWebinarPageUI {

	public static final String SHARE_WEBINAR_URL = "https://app.webinaris.co/sharing-team-settings";
	public static final String PROVIDER_NAME_TEXTBOX = "(//input[@type='text'])[1]";
	
	public static final String PARTNERID_TEXTBOX = "(//input[@type='text'])[3]";
	public static final String PARTNERID_CHECKBOX = "//label[normalize-space()='Required']/preceding-sibling::div[1]";
	
	public static final String FIRST_NAME_TEXTBOX = "(//input[@type='text'])[4]";
	public static final String FIRST_NAME_CHECKBOX = "//label[normalize-space()='Required']/preceding-sibling::div[2]";

	public static final String LAST_NAME_TEXTBOX = "(//input[@type='text'])[5]";
	public static final String LAST_NAME_CHECKBOX = "//label[normalize-space()='Required']/preceding-sibling::div[3]";
	
	public static final String STREET_TEXTBOX = "(//input[@type='text'])[6]";
	public static final String STREET_CHECKBOX = "//label[normalize-space()='Required']/preceding-sibling::div[4]";
	
	public static final String ZIP_CODE_TEXTBOX = "(//input[@type='text'])[7]";
	public static final String ZIP_CODE_CHECKBOX = "//label[normalize-space()='Required']/preceding-sibling::div[5]";

	public static final String CITY_TEXTBOX = "(//input[@type='text'])[8]";
	public static final String CITY_CHECKBOX = "//label[normalize-space()='Required']/preceding-sibling::div[6]";

	public static final String PHONE_TEXTBOX = "(//input[@type='text'])[9]";
	public static final String PHONE_CHECKBOX = "//label[normalize-space()='Required']/preceding-sibling::div[7]";

	public static final String WEBSITE_TEXTBOX = "(//input[@type='text'])[10]";
	public static final String WEBSITE_CHECKBOX = "//label[normalize-space()='Required']/preceding-sibling::div[8]";

	public static final String EMAIL_ADDRESS_TEXTBOX = "(//input[@type='text'])[11]";
	public static final String EMAIL_ADDRESS_CHECKBOX = "//label[normalize-space()='Required']/preceding-sibling::div[9]";

	public static final String SAVE_BUTTON = "//button[contains(text(),'Save')]";
	
	public static final String SUCCESS_MESSAGE = "//span[normalize-space()='Awesome - that worked!']";
	public static final String CLOSE_MESSAGE_ICON = "//i[@class='v-icon notranslate fwbn fwbn-cancel theme--dark']";
	
	
}
