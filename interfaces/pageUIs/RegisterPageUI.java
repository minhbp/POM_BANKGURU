package pageUIs;

import java.util.Random;

public class RegisterPageUI {
	
	static String FIRT_NAME = "Automation";
	static String LAST_NAME = "Testing";
	static String EMAIL_REGISTER = "minhbp252+" + randomNumber() + "@gmail.com";

	public static final String REGISTER_PAGE_BUTTON = "//span[@class='header-context']";
	
	public static final String REGISTER_PAGE_FIRT_NAME = "//input[@placeholder='First name']";
	public static final String REGISTER_PAGE_INPUT_FIRT_NAME = FIRT_NAME;
	
	public static final String REGISTER_PAGE_LAST_NAME = "//input[@placeholder='Last name']";
	public static final String REGISTER_PAGE_INPUT_LAST_NAME = LAST_NAME;
	
	public static final String REGISTER_PAGE_EMAIL = "//input[@placeholder='E-mail address']";
	public static final String REGISTER_INPUT_PAGE_EMAIL = EMAIL_REGISTER;
	
	public static final String REGISTER_PAGE_SUBMIT_BUTTON = "//span[@class='btn-text']";
	
	public static int randomNumber() {
		Random random = new Random();
		return random.nextInt(9999);
	}
}
