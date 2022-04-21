package pageObjects;

import org.openqa.selenium.WebDriver;

import commons.AbstractPage;
import pageUIs.NewProjectPageUI;

public class NewProjectObject extends AbstractPage{

private WebDriver driverGlobal;
	
	public NewProjectObject (WebDriver driverLocal) {
		driverGlobal = driverLocal;
	}
	
	public void getNewProjectPageUrl() {
		openAnyUrl(driverGlobal, NewProjectPageUI.NEW_PROJECT_URL);
	}
	
	public void inputTitleProject() {
		waitToElementVisible(driverGlobal, NewProjectPageUI.NEW_PROJECT_TITLE_TEXTBOX);
		sendkeyToElement(driverGlobal, NewProjectPageUI.NEW_PROJECT_TITLE_TEXTBOX, NewProjectPageUI.NEW_PROJECT_INPUT_TITLE);
	}
	
	public void inputSubTitleProject() {
		sendkeyToElement(driverGlobal, NewProjectPageUI.NEW_PROJECT_SUBTITLE_TEXTBOX, NewProjectPageUI.NEW_PROJECT_INPUT_SUBTITLE);
	}
	
	public void clickButtonCreate() {
		clickToElement(driverGlobal, NewProjectPageUI.NEW_PROJECT_BUTTON);
	}
	
	public void waitLoadingIconInvisible() {
		waitToElementInvisibleIconLoading(driverGlobal);
	}
	
}
