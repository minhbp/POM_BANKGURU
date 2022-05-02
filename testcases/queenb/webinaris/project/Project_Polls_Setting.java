package queenb.webinaris.project;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import commons.AbstractTest;
import pageObjects.LoginPageObject;
import pageObjects.NewProjectObject;
import pageObjects.PollPageObject;

public class Project_Polls_Setting extends AbstractTest {

	WebDriver driver;

	public LoginPageObject loginPage;
	public NewProjectObject newProject;
	public PollPageObject pollPage;

	@Parameters("browser")
	@BeforeClass
	public void beforeClass(String browserName) throws Exception {

		driver = openMultiBrowser(browserName);

		loginPage = new LoginPageObject(driver);
		newProject = new NewProjectObject(driver);
		pollPage = new PollPageObject(driver);

		loginPage.login();
		newProject.createNewProject();
		Thread.sleep(2000);
		pollPage.clickPollMenu();
	}

	@Test
	public void TC_01_New_Poll_01() throws Exception {
		pollPage.newPoll("Poll test 01", "0", "0", "0", "0", "5", "0", "0", "5", "0", "0", "30", "0", "em ăn cơm chưa?",
				"chưa", "20", "vẫn chưa nhưng đáp án khác", "80");
	}

	@Test
	public void TC_02_New_Poll_02() throws Exception {
		pollPage.newPoll("Poll test 02", "0", "5", "0", "0", "15", "3", "0", "15", "40", "0", "45", "50",
				"nhà em có chó không?", "có nhưng nó không cắn đâu", "35", "vẫn có và vẫn không cắn đâu", "65");
	}

	@AfterClass
	public void afterClass() {
		driver.close();
	}
}
