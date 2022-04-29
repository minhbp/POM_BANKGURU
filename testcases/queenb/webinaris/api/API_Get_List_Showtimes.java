package queenb.webinaris.api;

import java.time.LocalDate;
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

public class API_Get_List_Showtimes {
	WebDriver driver;
	WebDriverWait explicitWait;

	String link, email, password;
	String title, subtitle;

	@BeforeClass
	public void beforeClass() {
		System.setProperty("webdriver.chrome.driver", "D:\\WEBDRIVER_API_MinhDV\\browser\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		driver.manage().window().setPosition(new Point(510, 510)); // set start point browser
		Dimension d = new Dimension(500, 500); // set width height browser
		driver.manage().window().setSize(d);
	}

	@Test
	public void TC_01() throws Exception {
		LocalDate datenow = java.time.LocalDate.now();
		String s = String.valueOf(datenow);
		String dd = s.substring(8);
		System.out.print(dd);

		driver.get(
				"https://app.webinaris.co/api/showtimes?webinaris_id=23606W20110&api_password=dee0000f6a5eacae6e61037a4cf6196a");

		driver.findElement(By.xpath("//body[contains(text(), '11:00')]")).isDisplayed();
		delay(1);

		driver.findElement(By.xpath("//body[contains(text(), '19:00')]")).isDisplayed();
		delay(1);

	}

	public void delay(int x) throws Exception {
		Thread.sleep(x * 1000);
	}

	@AfterClass
	public void afterClass() {
		driver.close();
	}
}