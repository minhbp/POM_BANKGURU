package queenb.webinaris.account;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import commons.AbstractTest;
import pageObjects.DeletePageObject;
import pageObjects.LoginPageObject;

public class Account_Delete_Project extends AbstractTest {

	WebDriver driver;

	public LoginPageObject loginPage;
	public DeletePageObject deletePage;

	@Parameters("browser")
	@BeforeClass
	public void beforeClass(String browserName) throws Exception {

		driver = openMultiBrowser(browserName);

		loginPage = new LoginPageObject(driver);
		deletePage = new DeletePageObject(driver);
		loginPage.login();

	}

	@Test
	public void TC_01_delProject() throws Exception {
		deletePage.getMyWebinar();

		for (int i = 0, n = 1; i < n; i++) {
			deletePage.deleteProject();
		}
	}

	@AfterClass
	public void afterClass() {
		driver.close();
	}
}
