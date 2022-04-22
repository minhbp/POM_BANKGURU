package pageObjects;

import org.openqa.selenium.WebDriver;

import commons.AbstractPage;
import pageUIs.DeleteProjectPageUI;

public class DeletePageObject extends AbstractPage{

private WebDriver driverGlobal;
	
	public DeletePageObject (WebDriver driverLocal) {
		driverGlobal = driverLocal;
	}
	
	public void deleteProject() {
		openAnyUrl(driverGlobal, DeleteProjectPageUI.MY_WEBINAR_URL);
		
		waitToElementVisible(driverGlobal, DeleteProjectPageUI.OPTIONS_CLICK);
		clickToElement(driverGlobal, DeleteProjectPageUI.OPTIONS_CLICK);
		
		waitToElementVisible(driverGlobal, DeleteProjectPageUI.OPTION_DELETE);
		clickToElement(driverGlobal, DeleteProjectPageUI.OPTION_DELETE);
		
		waitToElementVisible(driverGlobal, DeleteProjectPageUI.INPUT_TEXTBOX);
		clickToElement(driverGlobal, DeleteProjectPageUI.INPUT_TEXTBOX);
		
		waitToElementVisible(driverGlobal, DeleteProjectPageUI.CONFIRM_BUTTON);
		clickToElement(driverGlobal, DeleteProjectPageUI.CONFIRM_BUTTON);
		
		waitToElementVisible(driverGlobal, DeleteProjectPageUI.SUCCESS_MESSAGE);
		clickToElement(driverGlobal, DeleteProjectPageUI.SUCCESS_MESSAGE);
		clickToElement(driverGlobal, DeleteProjectPageUI.CLOSE_MESSAGE_ICON);
		
	}
}
