package pageUIs;

public class UploadPageUI {

	public static final String UPLOAD_PAGE_URL = "https://app.webinaris.co/media";
	public static final String BUTTON_NEW_FILE = "//button[contains(text(),'New file')]";
	public static final String BUTTON_VIDEO = "(//span[@class='v-btn__content'][normalize-space()='Continue'])[1]/parent::button";
	public static final String BUTTON_VIDEO_SOUCRE = "(//button[@type='button'])[4]";
	public static final String VIDEO_SOUCRE_NAME = "(//input[@type='text'])[4]";
	public static final String VIDEO_SOUCRE_STYLE = "(//div[@class='v-select__slot'])[3]";

	public static final String VIDEO_SOUCRE_STYLE_VIDEOLYSER = "//div[contains(text(),'Videolyser')]";

	public static final String VIDEO_SOUCRE_STYLE_VIMEO = "//div[@class='v-list-item__title'][normalize-space()='Vimeo']";

	public static final String VIDEO_SOUCRE_STYLE_MP4 = "//div[contains(text(),'mp4 file on custom server')]";

	public static final String VIDEO_SOUCRE_URL = "(//input[@type='text'])[6]";
	public static final String ICON_LOAD_DURATION = "//i[@class='v-icon notranslate fwbn fwbn-reload theme--light']";
	public static final String BUTTON_VIDEO_SOUCRE_BUTTON_SAVE = "//span[normalize-space()='Save']/parent::button";

	public static final String BUTTON_VIDEO_UPLOAD_STEP2 = "(//span[@class='v-btn__content'][normalize-space()='Continue'])[3]/parent::button";
	public static final String VIDEO_UPLOAD_BUTTON_STEP3 = "//label[normalize-space()='Upload']";
	public static final String VIDEO_UPLOAD_INPUT_DATA = "//input[@accept='video/*,.mkv']";
	public static final String VIDEO_UPLOAD_100 = "//span[normalize-space()='100%']";

	public static final String FILE_UPLOAD_LABEL = "//label[normalize-space()='Select file']";
	public static final String FILE_UPLOAD_DATA = "//input[@id='idFileOther']";

	public static final String UPLOAD_SUCCESS_MESSAGE = "//span[normalize-space()='Awesome - that worked!']";
	public static final String MEDIA_TEXT = "//p[normalize-space()='Manage your videos, documents and files']";
	public static final String CLOSE_MESSAGE_ICON = "//i[@class='v-icon notranslate fwbn fwbn-cancel theme--dark']";

	public static final String UPLOAD_ICONS_SELECT = "(//i[@class='_icon fwbn-ellipsis-v'])";
	public static final String UPLOAD_DELETE_OPTION = "//a[normalize-space()='Delete']";
	public static final String UPLOAD_CONFIRM_BUTTON = "//button[normalize-space()='Confirm']";
	
	public static final String SELECT_FILE_STYLE = "(//div[@class='v-select__slot'])[1]";
	public static final String CHOOSE_ITEM = "(//div[@class='v-list-item__content'])[%s]";
	

}
