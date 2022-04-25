package pageObjects;

import org.openqa.selenium.WebDriver;

import commons.AbstractPage;
import pageUIs.DeleteProjectPageUI;

public class DeletePageObject extends AbstractPage{

private WebDriver driver;
	
	public DeletePageObject (WebDriver mappingdriver) {
		driver = mappingdriver;
	}
	
	public void getMyWebinar() {
		openAnyUrl(driver, DeleteProjectPageUI.MY_WEBINAR_URL);
	}
	
	public void deleteProject() throws Exception {
		waitToElementVisible(driver, DeleteProjectPageUI.AUTO_TITLE);
		Thread.sleep(1000);
		
		waitToElementVisible(driver, DeleteProjectPageUI.OPTIONS_CLICK);
		clickToElement(driver, DeleteProjectPageUI.OPTIONS_CLICK);
		
		waitToElementVisible(driver, DeleteProjectPageUI.OPTION_DELETE);
		clickToElement(driver, DeleteProjectPageUI.OPTION_DELETE);
		
		waitToElementVisible(driver, DeleteProjectPageUI.INPUT_TEXTBOX);
		sendkeyToElement(driver, DeleteProjectPageUI.INPUT_TEXTBOX, "webinaris");
		
		waitToEnableButton(driver, DeleteProjectPageUI.CONFIRM_BUTTON);
		clickToElement(driver, DeleteProjectPageUI.CONFIRM_BUTTON);
		
		waitToElementVisible(driver, DeleteProjectPageUI.SUCCESS_MESSAGE);
		clickToElement(driver, DeleteProjectPageUI.SUCCESS_MESSAGE);
		clickToElement(driver, DeleteProjectPageUI.CLOSE_MESSAGE_ICON);
		
	}
}
