package pageObjects;

import org.openqa.selenium.WebDriver;

import commons.AbstractPage;
import pageUIs.PreviewPageUI;

public class PreviewPageObject extends AbstractPage{
	private WebDriver driver;

	public PreviewPageObject(WebDriver mappingdriver) {
		driver = mappingdriver;
	}
	public void clickPreviewMenu() {
		waitToEnableButton(driver, PreviewPageUI.PREVIEW_MENU);
		clickToElement(driver, PreviewPageUI.PREVIEW_MENU);
		
	}
	
	public void openOptionsPreview() throws Exception {
		waitToEnableButton(driver, PreviewPageUI.PREVIEW_BUTTON);
		waitToElementVisible(driver, PreviewPageUI.PREVIEW_OPTIONS);
		clickToElement(driver, PreviewPageUI.PREVIEW_OPTIONS);
	}
	
	public void selectItemPreview(String item) throws Exception {
		waitToElementVisible(driver, PreviewPageUI.PREVIEW_ITEM, item);
		Thread.sleep(1000);
		clickToElement(driver, PreviewPageUI.PREVIEW_ITEM, item);
	}
	
	public void selectItemTextPreview(String text) throws Exception {
		waitToElementVisible(driver, PreviewPageUI.PREVIEW_ITEM_TEXT, text);
		Thread.sleep(1000);
		clickToElement(driver, PreviewPageUI.PREVIEW_ITEM_TEXT, text);
	}
	
	public void clickOpenPreview() {
		waitToEnableButton(driver, PreviewPageUI.PREVIEW_BUTTON);
		clickToElement(driver, PreviewPageUI.PREVIEW_BUTTON);
	}
	
	public boolean isDisplayParticipant() throws Exception {
		waitToElementVisible(driver, PreviewPageUI.SEND_BUTTON);
		Thread.sleep(1000);
		return isDisplayElement(driver, PreviewPageUI.ROOM_PARTICIPANT);
	}
	
	public void inputChatMessage(String message) {
		waitToElementVisible(driver, PreviewPageUI.CHAT_TEXTAREA);
		sendkeyToElement(driver, PreviewPageUI.CHAT_TEXTAREA, message);
	}
	
	public void clickSendButton() {
		waitToElementVisible(driver, PreviewPageUI.SEND_BUTTON);
		clickToElement(driver, PreviewPageUI.SEND_BUTTON);
	}
	
	public void clickOnSound() {
		waitToElementVisible(driver, PreviewPageUI.ON_SOUND);
		clickToElement(driver, PreviewPageUI.ON_SOUND);
	}
	
	public void clickWebinarisFooter() {
		waitToElementVisible(driver, PreviewPageUI.WEBINARIS_FOOTER);
		clickToElement(driver, PreviewPageUI.WEBINARIS_FOOTER);
	}
	
	public void clickAllowAllCookieBanner() throws Exception {
		waitToEnableButton(driver, PreviewPageUI.ALLOW_ALL_BUTTON);
		Thread.sleep(1000);
		clickToElement(driver, PreviewPageUI.ALLOW_ALL_BUTTON);
	}
	
	public void clickAllowSelectionCookieBanner() {
		waitToEnableButton(driver, PreviewPageUI.ALLOW_SELECTION_BUTTON);
		clickToElement(driver, PreviewPageUI.ALLOW_SELECTION_BUTTON);
	}
	
	public String getTextButtonTop() {
		return getTextElement(driver, PreviewPageUI.BUTTON_TOP_VERIFY);
	}
	
	public String getTextButtonTopRight() {
		return getTextElement(driver, PreviewPageUI.BUTTON_TOP_RIGHT_VERIFY);
	}
	
	public String getTextButtonBottom() {
		return getTextElement(driver, PreviewPageUI.BUTTON_BOT_VERIFY);
	}
	
}
