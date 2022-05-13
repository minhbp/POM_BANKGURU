package queenb.webinaris.account;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import commons.AbstractTest;
import pageObjects.ClonePageObject;
import pageObjects.DeletePageObject;
import pageObjects.LoginPageObject;

public class Account_Clone_Copy_Delete_Project extends AbstractTest {

	WebDriver driver;

	public LoginPageObject loginPage;
	public ClonePageObject clonePage;
	public DeletePageObject deletePage;

	@Parameters("browser")
	@BeforeClass
	public void beforeClass(String browserName) throws Exception {

		driver = openMultiBrowser(browserName);

		loginPage = new LoginPageObject(driver);
		clonePage = new ClonePageObject(driver);
		deletePage = new DeletePageObject(driver);
		loginPage.login();
	}

	@Test
	public void TC_01_Clone_Project() throws Exception {
		clonePage.getMyWebinar();
		delay(1);
		clonePage.clickNewProject();
		delay(1);
		clonePage.clickCloneProject();
		delay(1);
		clonePage.clickOpenListProjects();
		delay(1);
		clonePage.selectFirstProject();
		delay(1);
		clonePage.clickButtonClone();
		delay(1);
	}

	@Test
	public void TC_02_Copy_Project() throws Exception {
		clonePage.getMyWebinar();
		delay(1);
		clonePage.clickNewProject();
		delay(1);
		clonePage.clickEnterCodeButton();
		delay(1);
		clonePage.inputCode("11AC258A6C52E110");
		delay(1);
		clonePage.clickCopy();
		delay(1);
	}

	@Test
	public void TC_03_delProject() throws Exception {
		deletePage.getMyWebinar();

		for (int i = 0, n = 2; i < n; i++) {
			deletePage.deleteProject();
		}
	}

	@AfterClass
	public void afterClass() {
		driver.close();
	}
}
