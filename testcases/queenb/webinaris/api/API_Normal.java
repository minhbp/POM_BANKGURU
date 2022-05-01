package queenb.webinaris.api;

import java.text.SimpleDateFormat;
import java.util.Calendar;
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

public class API_Normal {
	WebDriver driver;
	WebDriverWait explicitWait;

	@BeforeClass
	public void beforeClass() {
		System.setProperty("webdriver.chrome.driver", ".\\resources\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);

		driver.manage().window().setPosition(new Point(0, 510)); // set start point browser
		Dimension d = new Dimension(500, 500); // set width height browser
		driver.manage().window().setSize(d);
	}

	@Test
	public void TC_01() {

		String timeStamp = new SimpleDateFormat("dd.MM.yyyy").format(Calendar.getInstance().getTime());

		String fname, lname, time, email, timezone, phone, note, source_id, utm_content, utm_source;
		fname = "Minh";
		lname = "api_001";
		time = "" + timeStamp + "%2018:00"; // format: dd/mm/yyyy%2Bhh:mm
		email = "minhbp252+api090401@gmail.com";
		timezone = "utc%2B2"; // utc+2
		phone = "0963212497";
		note = "selenium is the best";
		source_id = "123";
		utm_content = "content";
		utm_source = "source";
		driver.get("https://webinaris.co/api/?key=24064W20110&is_paid=YES&firstname=" + fname + "&lastname=" + lname
				+ "&ip_address=127.0.0.1&password=1bf050e3994fe2f68349aafd37dff16f&time=" + time + "&email=" + email
				+ "&timezone=" + timezone + "&phone=" + phone + "&note=" + note + "&source_id=" + source_id
				+ "&utm_content=" + utm_content + "&utm_source=" + utm_source
				+ "&utm_campaign= api campaign &utm_medium= api medium &utm_term= api term &affiliate_id= api affid");

		driver.findElement(By.xpath("//body[contains(text(), 'OK')]")).isDisplayed();

	}

	@AfterClass
	public void afterClass() {
		driver.close();
	}
}
