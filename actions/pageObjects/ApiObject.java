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
	
	public boolean isDisplayShowtime(String house) {
		return isDisplayElement(driver, ApiUI.DYNAMIC_SHOWTIMES_H, house);
	}
	
}
