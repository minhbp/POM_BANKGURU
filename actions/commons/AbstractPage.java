package commons;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AbstractPage {

	public void openAnyUrl(WebDriver driver, String urlValue) {
		driver.get(urlValue);
	}
	
	public String openPageTitle(WebDriver driver) {
		return driver.getTitle();
	}
	
	public String getCurrentPageUrl(WebDriver driver) {
		return driver.getCurrentUrl();
	}
	
	public void backToPage(WebDriver driver) {
		driver.navigate().back();
	}
	
	public void refreshCurrentPage(WebDriver driver) {
		driver.navigate().refresh();
	}
	
	public void forwardToPage(WebDriver driver) {
		driver.navigate().forward();
	}
	
	
	// web element
	
	
	public void clickToElement(WebDriver driver, String locator) {
		element = driver.findElement(By.xpath(locator));
		element.click();
	}
	
	public void sendkeyToElement(WebDriver driver, String locator, String value) {
		element = driver.findElement(By.xpath(locator));
		element.sendKeys(value);
	}
	
	public boolean isDisplayElement(WebDriver driver, String locator) {
		element = driver.findElement(By.xpath(locator));
		return element.isDisplayed();
	}
	
	public void waitToElementInvisibleIconLoading(WebDriver driver) {
		waitExplicit = new WebDriverWait(driver, 30);
		waitExplicit.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//div[@class='w-loading-overlay']//*[name()='svg']")));
	}
	
	public void waitToElementVisible(WebDriver driver, String locator) {
		waitExplicit = new WebDriverWait(driver, 30);
		waitExplicit.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(locator)));
	}
	
	WebElement element;
	WebDriverWait waitExplicit;
}
