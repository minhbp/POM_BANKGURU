package queenb.webinaris.project;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import commons.AbstractTest;
import pageObjects.LoginPageObject;
import pageObjects.NewProjectObject;
import pageObjects.PresenterPageObject;

public class Project_Presenter_Setting extends AbstractTest {
	WebDriver driver;

	public LoginPageObject loginPage;
	public NewProjectObject newProject;
	public PresenterPageObject presenterPage;

	String namePresenter, urlImage;

	@Parameters("browser")
	@BeforeClass
	public void beforeClass(String browserName) throws Exception {

		driver = openMultiBrowser(browserName);

		namePresenter = "Lionel Messi";
		urlImage = "D:\\images\\img01.jpg";

		loginPage = new LoginPageObject(driver);
		newProject = new NewProjectObject(driver);
		presenterPage = new PresenterPageObject(driver);

		loginPage.login();
		newProject.createNewProject();
		Thread.sleep(2000);
	}

	@Test
	public void selectPresenter() {
		presenterPage.clickPresenterMenu();
		presenterPage.clearPresenterName();
		presenterPage.inputPresenterName(namePresenter);
		presenterPage.clickSelectImage();
		presenterPage.inputUrlImage(urlImage);
		presenterPage.clickConfirm();
	}

	@AfterClass
	public void afterClass() {
		driver.close();
	}
}
