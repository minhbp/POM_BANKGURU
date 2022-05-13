package pageUIs;

public class PreviewPageUI {
	public static final String PREVIEW_MENU = "//span[normalize-space()='Preview']/parent::button";
	public static final String PREVIEW_OPTIONS = "(//div[@class='v-select__slot'])[3]";
	public static final String PREVIEW_ITEM = "(//div[@class='v-list-item__title'])[%s]";
	public static final String PREVIEW_ITEM_TEXT = "//div[contains(text(),'%s')]";
	public static final String PREVIEW_BUTTON = "//span[normalize-space()='Open preview']/parent::button";
	
	public static final String ROOM_PARTICIPANT = "//h5[normalize-space()='Participants:']";
	public static final String CHAT_TEXTAREA = "//div[@class='v-text-field__slot']//textarea";
	public static final String SEND_BUTTON = "//span[contains(text(),'Send')]";
	public static final String ON_SOUND = "//span[contains(text(),'Yes - I want to join the webinar')]";
	public static final String WEBINARIS_FOOTER = "//a[normalize-space()='Webinaris']";

	
	public static final String ALLOW_ALL_BUTTON = "//span[normalize-space()='Allow all']/parent::button";
	public static final String ALLOW_SELECTION_BUTTON = "//span[normalize-space()='Allow selection']/parent::button";

	public static final String BUTTON_TOP_VERIFY = "//a[@class='room-bnr bnr-top box-shadow']//span";
	public static final String BUTTON_TOP_RIGHT_VERIFY = "//a[@class='room-bnr']//span";
	public static final String BUTTON_BOT_VERIFY = "//a[@class='room-bnr bnr-bottom box-shadow']//span";
	
	
}
