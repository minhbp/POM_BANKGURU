package pageObjects;

import org.openqa.selenium.WebDriver;

import commons.AbstractPage;
import pageUIs.ApiUI;

public class ApiObject extends AbstractPage{
	private WebDriver driver;

	public ApiObject(WebDriver mappingdriver) {
		driver = mappingdriver;
	}
	
	public void openUrlApiGet3Showtimes() {
		openAnyUrl(driver, ApiUI.OPTIMIZED_3_SHOWTIMES_URL);
	}
	
	public void openUrlApiGet5Showtimes() {
		openAnyUrl(driver, ApiUI.OPTIMIZED_5_SHOWTIMES_URL);
	}
	
	public void openUrlApiGet7Showtimes() {
		openAnyUrl(driver, ApiUI.OPTIMIZED_7_SHOWTIMES_URL);
	}
	
	public void openUrlApiNormal() {
		openAnyUrl(driver, ApiUI.API_NORMAL_URL);
	}
	
	public boolean isDisplayOK() {
		return isDisplayElement(driver, ApiUI.OPTIMIZED_SHOWTIMES_NORMAL_OK);
	}
	
	public boolean isDisplayShowtime20h() {
		return isDisplayElement(driver, ApiUI.OPTIMIZED_SHOWTIMES_20h);
	}
	
	public boolean isDisplayShowtime09h() {
		return isDisplayElement(driver, ApiUI.OPTIMIZED_SHOWTIMES_09h);
	}
	
	public boolean isDisplayShowtime19h() {
		return isDisplayElement(driver, ApiUI.OPTIMIZED_SHOWTIMES_19h);
	}
	
	public boolean isDisplayShowtime18h() {
		return isDisplayElement(driver, ApiUI.OPTIMIZED_SHOWTIMES_18h);
	}
	
	public boolean isDisplayShowtime11h() {
		return isDisplayElement(driver, ApiUI.OPTIMIZED_SHOWTIMES_11h);
	}
	
	public boolean isDisplayShowtime15h() {
		return isDisplayElement(driver, ApiUI.OPTIMIZED_SHOWTIMES_15h);
	}
	
}
