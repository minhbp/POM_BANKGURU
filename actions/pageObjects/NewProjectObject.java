package pageObjects;

import org.openqa.selenium.WebDriver;

import commons.AbstractPage;
import pageUIs.NewProjectPageUI;

public class NewProjectObject extends AbstractPage{

private WebDriver driverGlobal;
	
	public NewProjectObject (WebDriver driverLocal) {
		driverGlobal = driverLocal;
	}
	
	public void createNewProject() {
		openAnyUrl(driverGlobal, NewProjectPageUI.NEW_PROJECT_URL);
	
		waitToElementVisible(driverGlobal, NewProjectPageUI.NEW_PROJECT_TITLE_TEXTBOX);
		sendkeyToElement(driverGlobal, NewProjectPageUI.NEW_PROJECT_TITLE_TEXTBOX, NewProjectPageUI.NEW_PROJECT_INPUT_TITLE);
	
		sendkeyToElement(driverGlobal, NewProjectPageUI.NEW_PROJECT_SUBTITLE_TEXTBOX, NewProjectPageUI.NEW_PROJECT_INPUT_SUBTITLE);
	
		clickToElement(driverGlobal, NewProjectPageUI.NEW_PROJECT_BUTTON);
	
		waitToElementVisible(driverGlobal, NewProjectPageUI.MESSAGE_SUCCESS);
		clickToElement(driverGlobal, NewProjectPageUI.ICON_CLOSE_MESSAGE);
	}
	
}
