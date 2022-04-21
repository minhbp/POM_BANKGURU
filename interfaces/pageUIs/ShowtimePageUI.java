package pageUIs;

public class ShowtimePageUI {

	public static final String SHOWTIME_MENU = "//span[normalize-space()='Showtimes']";
	public static final String SHOWTIME_OPTIONS = "(//div[@class='v-select__selections'])[1]";
	public static final String SHOWTIME_OPTIONS_MYSELF = "//div[contains(text(),'I create the showtimes myself')]";
	public static final String SHOWTIME_OPTIONS_60_MINUTES = "//div[contains(text(),'Every 60 minutes (recommended)')]";
	public static final String SHOWTIME_OPTIONS_5_MINUTES = "//div[contains(text(),'Every 5 minutes')]";
	public static final String SHOWTIME_OPTIONS_NO = "//div[contains(text(),'No (recommended)')]";
	public static final String SHOWTIME_OPTIONS_YES = "//div[contains(text(),'Yes')]";
	public static final String SHOWTIME_BUTTON_SAVE = "//div[@class='_btns']//button[@type='button']";
	public static final String SHOWTIME_SUCCESS = "//span[normalize-space()='Awesome - that worked!']";
	
}
