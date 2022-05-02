package queenb.webinaris.api;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import commons.AbstractTest;
import pageObjects.ApiObject;

public class Api_Get_Showtimes extends AbstractTest {
	WebDriver driver;

	public ApiObject api;

	@Parameters("browser")
	@BeforeClass
	public void beforeClass(String browserName) throws Exception {

		driver = openMultiBrowser(browserName);

		api = new ApiObject(driver);
	}

	@Test
	public void TC_01_Optimized_3_Showtimes() {
		api.openUrlApiGet3Showtimes();
		Assert.assertTrue(api.isDisplayShowtime20h());
	}

	@Test
	public void TC_02_Optimized_5_Showtimes() {
		api.openUrlApiGet5Showtimes();
		Assert.assertTrue(api.isDisplayShowtime09h());
		Assert.assertTrue(api.isDisplayShowtime19h());
		Assert.assertTrue(api.isDisplayShowtime18h());
	}

	@Test
	public void TC_03_Optimized_7_Showtimes() {
		api.openUrlApiGet7Showtimes();
		Assert.assertTrue(api.isDisplayShowtime11h());
		Assert.assertTrue(api.isDisplayShowtime19h());
		Assert.assertTrue(api.isDisplayShowtime20h());
		Assert.assertTrue(api.isDisplayShowtime15h());
	}
	
	@Test
	public void TC_04_Api_Normal() {
		api.openUrlApiNormal();
		Assert.assertTrue(api.isDisplayOK());
	}

	@AfterClass
	public void afterClass() {
		driver.close();
	}
}
