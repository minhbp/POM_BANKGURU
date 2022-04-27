package pageObjects;

import org.openqa.selenium.WebDriver;

import commons.AbstractPage;
import pageUIs.NewProjectPageUI;
import pageUIs.PagesSettingPageUI;

public class NewProjectObject extends AbstractPage{

private WebDriver driver;
	
	public NewProjectObject (WebDriver mappingdriver) {
		driver = mappingdriver;
	}
	
	public void createNewProject() {
		openAnyUrl(driver, NewProjectPageUI.NEW_PROJECT_URL);
	
		waitToElementVisible(driver, NewProjectPageUI.NEW_PROJECT_TITLE_TEXTBOX);
		sendkeyToElement(driver, NewProjectPageUI.NEW_PROJECT_TITLE_TEXTBOX, NewProjectPageUI.NEW_PROJECT_INPUT_TITLE);
	
		sendkeyToElement(driver, NewProjectPageUI.NEW_PROJECT_SUBTITLE_TEXTBOX, NewProjectPageUI.NEW_PROJECT_INPUT_SUBTITLE);
	
		clickToElement(driver, NewProjectPageUI.NEW_PROJECT_BUTTON);
	
		waitToElementVisible(driver, NewProjectPageUI.MESSAGE_SUCCESS);
		clickToElement(driver, NewProjectPageUI.ICON_CLOSE_MESSAGE);
		
		waitToEnableButton(driver, PagesSettingPageUI.CONFIRM_BUTTTON);
	}
	
}
