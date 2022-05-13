package pageUIs;

public class PagesSettingPageUI {

	public static final String PAGES_MENU = "//span[normalize-space()='Pages']";
	public static final String PAGES_SETTINGS_MENU = "//div[@role='listitem']//span[contains(text(),'Settings')]";
	public static final String PAGES_COLOR_MENU = "//span[normalize-space()='Color']";
	public static final String PAGES_LOGO_MENU = "//span[normalize-space()='Logo']";
	
	public static final String PAGES_SETTINGS_TYPE = "//div[contains(text(),'The optimized Webinaris pages - recommended for be')]";
	public static final String PAGES_SETTINGS_TYPE_MY_OWN = "//div[contains(text(),'My own website - recommended for experts with webm')]";
	public static final String PAGES_SETTINGS_MY_OWN = "(//div[contains(text(),'I use the optimized Webinaris page')])[1]";
	public static final String PAGES_SETTINGS_MY_OWN_LP_WEBSITE = "(//div[@class='v-list-item__title'])[4]";
	public static final String PAGES_SETTINGS_MY_OWN_CONFIRM_WEBSITE = "(//div[@class='v-list-item__title'])[6]";
	public static final String PAGES_SETTINGS_MY_OWN_COMPLETE_WEBSITE = "(//div[@class='v-list-item__title'])[8]";
	public static final String PAGES_SETTINGS_MY_OWN_LP_WEBSITE_URL_TXT = "(//input[@type='text'])[3]";
	public static final String PAGES_SETTINGS_MY_OWN_CONFIRM_WEBSITE_URL_TXT = "(//input[@type='text'])[5]";
	public static final String PAGES_SETTINGS_MY_OWN_COMPLETE_WEBSITE_URL_TXT = "(//input[@type='text'])[7]";
	
	public static final String CONFIRM_BUTTTON = "//button[normalize-space()='Confirm']";
	public static final String MESSAGE_SUCCESS = "//span[@class='w-snackbar-text']";
	public static final String ICON_CLOSE_MESSAGE = "//i[@class='v-icon notranslate fwbn fwbn-cancel theme--dark']";
	
	public static final String LOGO_MENU = "//span[normalize-space()='Logo']";
	public static final String SELECT_LOGO_BUTTON = "//p[normalize-space()='Recommended resolution: 200x200 px']/parent::div/child::button";
	public static final String NEW_FILE_BUTTON = "//span[normalize-space()='New file']/parent::button";
	public static final String LOCATOR_FILE = "//input[@id='idFileOther']";
	
}
