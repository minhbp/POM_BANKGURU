package pageUIs;

public class EmailsPageUI {

	public static final String EMAIL_MENU = "//span[normalize-space()='E-mails']";
	public static final String SENDER_MAIL_MENU = "//span[normalize-space()='Sender']";
	public static final String SENDER_NAME_TEXTBOX = "(//input[@type='text'])[1]";
	public static final String EMAIL_ADDRESS_TEXTBOX = "//input[@type='email']";
	public static final String CONFIRM_BUTTON = "//button[normalize-space()='Confirm']";
	public static final String SUCCESS_MESSAGE = "//span[normalize-space()='Awesome - that worked!']";
	public static final String CLOSE_MESSAGE_ICON = "//i[@class='v-icon notranslate fwbn fwbn-cancel theme--dark']";
	
	public static final String EMAIL_SETTINGS_MENU = "//div[@role='listitem']//span[contains(text(),'Settings')]";
	public static final String EMAIL_SETTINGS_DOI = "(//div[@class='v-select__selections'])[1]";
	public static final String EMAIL_SETTINGS_DOI_YES = "(//div[@class='v-list-item__title'])[1]";
	public static final String EMAIL_SETTINGS_DOI_FOR_UNSUBSCRIBE = "(//div[@class='v-list-item__title'])[2]";
	public static final String EMAIL_SETTINGS_DOI_NO = "(//div[@class='v-list-item__title'])[3]";
	public static final String EMAIL_SETTINGS_RE_INVITATION = "(//div[@class='v-select__selections'])[2]";
	public static final String EMAIL_SETTINGS_RE_INVITATION_NO = "(//div[@class='v-list-item__title'])[4]";
	public static final String EMAIL_SETTINGS_RE_INVITATION_YES = "(//div[@class='v-list-item__title'])[5]";
	
	
	public static final String EMAIL_EMAIL_MENU = "//div[@role='listitem']//span[contains(text(),'E-mails')]";
	public static final String OPTIONS_LOGIN_INFO = "//p[normalize-space()='After registration']/parent::div/following-sibling::div/descendant::a[2]";
	public static final String OPTIONS_DELETE = "//a[normalize-space()='Delete']";
	public static final String DELETE_CONFIRM_BUTTON = "//button[normalize-space()='Confirm']";
	
	public static final String NEW_EMAIL_BUTTON = "//span[normalize-space()='New e-mail']/parent::button";
	public static final String SELECT_TEMPLATE_BUTTON = "//span[normalize-space()='Select template']/parent::button";
	public static final String LOAD_TEMPLATE_BUTTON = "//span[normalize-space()='Load template']/parent::button";
	public static final String SAVE_BUTTON = "//button[contains(text(),'Save')]";
}
