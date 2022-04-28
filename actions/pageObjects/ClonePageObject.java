package pageObjects;

import org.openqa.selenium.WebDriver;

import commons.AbstractPage;
import pageUIs.ClonePageUI;

public class ClonePageObject extends AbstractPage {
	private WebDriver driver;

	public ClonePageObject(WebDriver mappingdriver) {
		driver = mappingdriver;
	}

	public void getMyWebinar() {
		openAnyUrl(driver, ClonePageUI.MY_WEBINAR_URL);
	}

	public void clickNewProject() throws Exception {
		waitToEnableButton(driver, ClonePageUI.NEW_WEBINAR_BUTTON);
		Thread.sleep(1000);
		clickToElement(driver, ClonePageUI.NEW_WEBINAR_BUTTON);
	}

	public void clickCloneProject() {
		waitToEnableButton(driver, ClonePageUI.CLONE_WEBINAR_BUTTON);
		clickToElement(driver, ClonePageUI.CLONE_WEBINAR_BUTTON);

		waitToElementVisibleIconLoading(driver);
		waitToElementInvisibleIconLoading(driver);
	}

	public void clickOpenListProjects() {
		waitToElementVisible(driver, ClonePageUI.OPEN_LIST_PROJECTS);
		clickToElement(driver, ClonePageUI.OPEN_LIST_PROJECTS);
	}

	public void selectFirstProject() {
		waitToElementVisible(driver, ClonePageUI.FIRST_PROJECT);
		clickToElement(driver, ClonePageUI.FIRST_PROJECT);
	}

	public void clickButtonClone() {
		waitToEnableButton(driver, ClonePageUI.BUTTON_CLONE);
		clickToElement(driver, ClonePageUI.BUTTON_CLONE);

		waitToElementVisible(driver, ClonePageUI.SUCCESS_MESSAGE);
		clickToElement(driver, ClonePageUI.CLOSE_MESSAGE_ICON);
	}

	public void clickEnterCodeButton() {
		waitToEnableButton(driver, ClonePageUI.ENTER_CODE_WEBINAR_BUTTON);
		clickToElement(driver, ClonePageUI.ENTER_CODE_WEBINAR_BUTTON);
	}

	public void inputCode(String code) {
		waitToEnableButton(driver, ClonePageUI.COPY_BUTTON);
		sendkeyToElement(driver, ClonePageUI.CODE_TEXTBOX, code);
	}

	public void clickCopy() {
		waitToEnableButton(driver, ClonePageUI.COPY_BUTTON);
		clickToElement(driver, ClonePageUI.COPY_BUTTON);

		waitToElementVisible(driver, ClonePageUI.SUCCESS_MESSAGE);
		clickToElement(driver, ClonePageUI.CLOSE_MESSAGE_ICON);
	}

}
