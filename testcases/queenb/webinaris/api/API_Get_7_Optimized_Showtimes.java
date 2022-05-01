package queenb.webinaris.api;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class API_Get_7_Optimized_Showtimes {
	WebDriver driver;
	WebDriverWait explicitWait;

	@BeforeClass
	public void beforeClass() {
		System.setProperty("webdriver.chrome.driver", ".\\resources\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		driver.manage().window().setPosition(new Point(1020, 0)); // set start point browser
		Dimension d = new Dimension(500, 500); // set width height browser
		driver.manage().window().setSize(d);
	}

	@Test
	public void TC_01() {
		driver.get(
				"https://app.webinaris.co/api/showtimes?webinaris_id=24044W20110&api_password=bdd13002be0948d0249695395994dcbe");

		driver.findElement(By.xpath("//body[contains(text(), '11:00')]")).isDisplayed();

		driver.findElement(By.xpath("//body[contains(text(), '19:00')]")).isDisplayed();

		driver.findElement(By.xpath("//body[contains(text(), '20:00')]")).isDisplayed();

		driver.findElement(By.xpath("//body[contains(text(), '15:00')]")).isDisplayed();
		
	}

	@AfterClass
	public void afterClass() {
		driver.close();
	}
}
