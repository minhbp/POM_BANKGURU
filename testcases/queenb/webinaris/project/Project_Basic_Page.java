package queenb.webinaris.project;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import commons.AbstractTest;
import pageObjects.BasicPageObject;
import pageObjects.LoginPageObject;
import pageObjects.NewProjectObject;

public class Project_Basic_Page extends AbstractTest {
	WebDriver driver;

	public LoginPageObject loginPage;
	public NewProjectObject newProject;
	public BasicPageObject basicPage;

	String titleProject, subtitleProject;

	@Parameters("browser")
	@BeforeClass
	public void beforeClass(String browserName) throws Exception {

		driver = openMultiBrowser(browserName);

		titleProject = "21343243";
		subtitleProject = "ds fr 234r23cdsf 23  sd";

		loginPage = new LoginPageObject(driver);
		newProject = new NewProjectObject(driver);
		basicPage = new BasicPageObject(driver);

		loginPage.login();
		newProject.createNewProject();
		Thread.sleep(2000);
	}

	@Test
	public void settingBasic() {
		basicPage.clearTitle();
		basicPage.inputTitle(titleProject);
		basicPage.clearSubTitle();
		basicPage.inputSubTitle(subtitleProject);
		basicPage.clickConfirm();
	}

	@AfterClass
	public void afterClass() {
		driver.close();
	}
}
