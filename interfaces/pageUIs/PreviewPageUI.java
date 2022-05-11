package pageUIs;

public class PreviewPageUI {
	public static final String PREVIEW_MENU = "//span[normalize-space()='Preview']/parent::button";
	public static final String PREVIEW_OPTIONS = "(//div[@class='v-select__slot'])[3]";
	public static final String PREVIEW_ITEM = "(//div[@class='v-list-item__title'])[%s]";
	public static final String PREVIEW_BUTTON = "//span[normalize-space()='Open preview']/parent::button";
	
	public static final String ROOM_PARTICIPANT = "//h5[normalize-space()='Participants:']";
	public static final String CHAT_TEXTAREA = "//div[@class='v-text-field__slot']//textarea";
	public static final String SEND_BUTTON = "//span[contains(text(),'Send')]";
	public static final String ON_SOUND = "//span[contains(text(),'Yes - I want to join the webinar')]";
	public static final String WEBINARIS_FOOTER = "//a[normalize-space()='Webinaris']";
}
