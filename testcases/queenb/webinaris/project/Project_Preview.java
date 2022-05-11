package queenb.webinaris.project;

import java.util.ArrayList;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import commons.AbstractTest;
import pageObjects.LoginPageObject;
import pageObjects.NewProjectObject;
import pageObjects.PreviewPageObject;
import pageObjects.RegisterPageObject;

public class Project_Preview extends AbstractTest {
	WebDriver driver;

	public LoginPageObject loginPage;
	public NewProjectObject newProject;
	public PreviewPageObject previewPage;
	public RegisterPageObject regist;

	String nameTop, nameBottom, nameFullScreen, nameTopRight, nameTransparent;
	String headcode, bodycodeafter, bodycodebefore;
	String openLP, submitForm, openConfirm, openComlete, openRoom, openRoomTime, clickButton, clickDownload;

	@Parameters("browser")
	@BeforeClass
	public void beforeClass(String browserName) throws Exception {

		driver = openMultiBrowser(browserName);
		
		loginPage = new LoginPageObject(driver);
		newProject = new NewProjectObject(driver);
		previewPage = new PreviewPageObject(driver);
		regist = new RegisterPageObject(driver);

		loginPage.login();
		newProject.createNewProject();
		Thread.sleep(2000);
	}
	
	@Test 
	public void TC_01_Preview_Room() throws Exception {
		
		String oldTab = driver.getWindowHandle();
		ArrayList<String> newTab = new ArrayList<String>(driver.getWindowHandles());
		newTab.remove(oldTab);
		
		previewPage.clickPreviewMenu();
		
		previewPage.openOptionsPreview();
		previewPage.selectItemPreview("1");
		previewPage.clickOpenPreview();
		Thread.sleep(1000);
		driver.switchTo().window(oldTab);
		
		previewPage.openOptionsPreview();
		previewPage.selectItemPreview("2");
		previewPage.clickOpenPreview();
		Thread.sleep(1000);
		driver.switchTo().window(oldTab);
		
		previewPage.openOptionsPreview();
		previewPage.selectItemPreview("3");
		previewPage.clickOpenPreview();
		Thread.sleep(1000);
		driver.switchTo().window(oldTab);
		
		previewPage.openOptionsPreview();
		previewPage.selectItemPreview("4");
		previewPage.clickOpenPreview();
		Thread.sleep(1000);
		driver.switchTo().window(oldTab);
		
		previewPage.openOptionsPreview();
		previewPage.selectItemPreview("5");
		previewPage.clickOpenPreview();
		
		String oldTab1 = driver.getWindowHandle();
		ArrayList<String> newTab1 = new ArrayList<String>(driver.getWindowHandles());
		newTab.remove(oldTab1);
		
//		driver.switchTo().window(newTab1.get(1));
//		Thread.sleep(3000);
//		driver.switchTo().window(newTab1.get(2));
//		Thread.sleep(3000);
//		driver.switchTo().window(newTab1.get(3));
//		Thread.sleep(3000);
//		driver.switchTo().window(newTab1.get(4));
//		Thread.sleep(3000);
		driver.switchTo().window(newTab1.get(5));
		
		Assert.assertTrue(previewPage.isDisplayParticipant());
		
		previewPage.clickOnSound();
		
		previewPage.inputChatMessage("123 2313 3");
		previewPage.clickSendButton();
		
		previewPage.inputChatMessage(" dfsfdsfdsfsadas");
		previewPage.clickSendButton();
		
		previewPage.inputChatMessage(" #$#@$#@ $ $#@$ # @$# $@");
		previewPage.clickSendButton();
		
		driver.switchTo().window(newTab1.get(1));
		
		Assert.assertEquals(regist.getTextHeader(), "EXPERT WEBINAR: Learn from the best!");
		Assert.assertEquals(regist.getTextTitle(), "The 5-step formula");
		/*
		 * String oldTab1 = driver.getWindowHandle(); ArrayList<String> newTab1 = new
		 * ArrayList<String>(driver.getWindowHandles()); newTab1.remove(oldTab1); //
		 * change focus to new tab
		 * 
		 * driver.switchTo().window(newTab1.get(1)); Thread.sleep(3000);
		 * Assert.assertEquals(getCurrentPageUrl(driver), "https://www.webinaris.com/");
		 * driver.close(); driver.switchTo().window(newTab1.get(0)); driver.close();
		 * driver.switchTo().window(oldTab);
		 */
		driver.switchTo().window(oldTab1);
	}
	
	//@Test
	public void TC_02_Preview_Registration_Page() {
		refreshCurrentPage(driver);
		previewPage.clickPreviewMenu();
		previewPage.clickOpenPreview();
	}
	
	@AfterClass
	public void afterClass() {
		driver.close();
	}
}
