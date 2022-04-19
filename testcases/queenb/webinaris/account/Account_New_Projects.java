package queenb.webinaris.account;

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

import commons.AbstractTest;

public class Account_New_Projects{
	
	public AbstractTest abstractTest;

	WebDriver driver;
	WebDriverWait explicitWait;

	String link, email, password;
	String title, subtitle;

	@BeforeClass
	public void beforeClass() {
		System.setProperty("webdriver.chrome.driver", "D:\\WEBDRIVER_API_MinhDV\\browser\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		driver.manage().window().setPosition(new Point(510, 0)); // set start point browser
		Dimension d = new Dimension(500, 500); // set width height browser
		driver.manage().window().setSize(d);		
		driver.manage().window().maximize();

		title = "Selenium "; // title project
		subtitle = "Internal title Autumation Minh test"; // internal title project
		
	}

	public void new_b050() throws Exception {
		driver.get("https://app.webinaris.co/new-webinar");
		driver.findElement(By.xpath("//p[contains(text(),'The perfect solution for recurring marketing event')]"))
				.isDisplayed();
		driver.findElement(By.xpath("//input[@id='nameTxt']")).sendKeys(title);
		driver.findElement(By.xpath("//input[@id='internalTxt']")).sendKeys(subtitle);
		driver.findElement(By.xpath("//button[normalize-space()='Create webinar']")).click();

		driver.findElement(By.xpath("//p[contains(text(),'Set your webinar title and choose a video for your')]"))
				.isDisplayed();
		delay(1);
		driver.findElement(By.xpath("//body/div[@id='app']/div/div/div/div/button[@type='button']/span/i[1]")).click();
	}

	@Test
	public void TC_01_new_N_projects() throws Exception {
		
		

		for (int i = 0, n = 1; i < n; i++) { // create new n projects | Selenium 0 -> Selenium n
			String s = String.valueOf(i);
			title = title + s;
			new_b050();
			title = "Selenium ";
		}
	}

	public void delay(int x) throws Exception {
		Thread.sleep(x * 1000);
	}

	@AfterClass
	public void afterClass() {
		driver.close();
	}
}