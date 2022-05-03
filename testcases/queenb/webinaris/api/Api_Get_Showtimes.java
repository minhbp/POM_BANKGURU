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
		Assert.assertTrue(api.isDisplayShowtime("20:00"));
	}

	@Test
	public void TC_02_Optimized_5_Showtimes() {
		api.openUrlApiGet5Showtimes();
		Assert.assertTrue(api.isDisplayShowtime("09:00"));
		Assert.assertTrue(api.isDisplayShowtime("19:00"));
		Assert.assertTrue(api.isDisplayShowtime("18:00"));
	}

	@Test
	public void TC_03_Optimized_7_Showtimes() {
		api.openUrlApiGet7Showtimes();
		Assert.assertTrue(api.isDisplayShowtime("11:00"));
		Assert.assertTrue(api.isDisplayShowtime("19:00"));
		Assert.assertTrue(api.isDisplayShowtime("20:00"));
		Assert.assertTrue(api.isDisplayShowtime("15:00"));
	}
	
	@Test
	public void TC_04_Api_Normal() {
		api.openUrlApiNormal();
		Assert.assertTrue(api.isDisplayShowtime("OK"));
	}

	@AfterClass
	public void afterClass() {
		driver.close();
	}
}
