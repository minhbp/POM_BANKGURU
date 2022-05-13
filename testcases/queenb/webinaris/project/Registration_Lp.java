package queenb.webinaris.project;

import java.util.ArrayList;
import java.util.Random;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import commons.AbstractTest;
import pageObjects.EmailsPageObject;
import pageObjects.LoginPageObject;
import pageObjects.NewProjectObject;
import pageObjects.RegisterPageObject;
import pageObjects.ShowtimePageObject;

public class Registration_Lp extends AbstractTest {
	WebDriver driver;

	public LoginPageObject loginPage;
	public NewProjectObject newProject;
	public ShowtimePageObject showtimePage;
	public RegisterPageObject registerPage;
	public EmailsPageObject emailsPage;

	String firstName, lastNam, email;

	@Parameters("browser")
	@BeforeClass
	public void beforeClass(String browserName) throws Exception {

		driver = openMultiBrowser(browserName);

		loginPage = new LoginPageObject(driver);
		newProject = new NewProjectObject(driver);
		showtimePage = new ShowtimePageObject(driver);
		emailsPage = new EmailsPageObject(driver);
		loginPage.login();
		newProject.createNewProject();
		Thread.sleep(2000);
	}

	public int randomNumber() {
		Random random = new Random();
		return random.nextInt(999);
	}

	@Test
	public void TC_01_Setting_Showtimes() {
		showtimePage.clickShowtimeMenu();
		showtimePage.clickOption();
		showtimePage.clickOptionMyself();
		showtimePage.clickOption60Minutes();
		showtimePage.clickOption5Minutes();
		showtimePage.clickOptionNo();
		showtimePage.clickOptionYes();
		showtimePage.clickButtonSave();
		showtimePage.closeMessageSuccess();
	}
	
	@Test
	public void TC_02_Setting_Email() throws Exception {
		emailsPage.clickEmailMenu();
		emailsPage.clickSettingMenu();
		emailsPage.clickDoiOptions();
		emailsPage.selectDoiIsNo();
		emailsPage.clickConfirmButton();
		showtimePage.closeMessageSuccess();
	}
	
	@Test
	public void TC_03_Register() throws Exception {

		firstName = "automation";
		lastNam = "testing";
		email = "minhbp252+" + randomNumber() + "@gmail.com";

		String urlBasicSetting = getCurrentPageUrl(driver);
		String fb050 = urlBasicSetting.substring(41);
		openAnyUrl(driver, "https://20071.webinaris.co/" + fb050 + "/selenium.html?mode=N&v=4"); //20288
		String oldTab = driver.getWindowHandle();

		registerPage = new RegisterPageObject(driver);
		registerPage.clickButton();
		delay(1);
		registerPage.inputFirtname(firstName);
		delay(1);
		registerPage.inputLastname(lastNam);
		delay(1);
		registerPage.inputEmail(email);
		delay(1);
		registerPage.clickButtonSubmit();

		ArrayList<String> newTab = new ArrayList<String>(driver.getWindowHandles());
		newTab.remove(oldTab);
		// change focus to new tab
		driver.switchTo().window(newTab.get(0));

		delay(2);
		Assert.assertEquals(driver.findElement(By.xpath("//h1[@class='allow-color']")).getText(), "Congratulations!");
		delay(2);
		driver.close();

		driver.switchTo().window(oldTab);
		delay(2);
	}

	@AfterClass
	public void afterClass() {
		driver.close();
	}
}
