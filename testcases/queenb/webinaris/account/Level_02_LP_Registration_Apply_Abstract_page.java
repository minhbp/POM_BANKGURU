package queenb.webinaris.account;

import java.util.Random;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import commons.AbstractPage;

public class Level_02_LP_Registration_Apply_Abstract_page extends AbstractPage {
	WebDriver driver;
	WebDriverWait explicitWait;

	String link, email, password;
	String title, subtitle;

	@BeforeClass
	public void beforeClass() {
		System.setProperty("webdriver.chrome.driver", "D:\\WEBDRIVER_API_MinhDV\\browser\\chromedriver.exe");
		driver = new ChromeDriver();

		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

//		driver.manage().window().setPosition(new Point(1020, 0)); // set start point browser
//		Dimension d = new Dimension(500, 500); // set width height browser
//		driver.manage().window().setSize(d);
		driver.manage().window().maximize();

		link = "https://admin.webinaris.co/login.html"; // link login
		email = "minhbp252+101@gmail.com"; // email login
		password = "queenb72"; // password login
		title = "Selenium "; // title project
		subtitle = "Internal title Autumation Minh test"; // internal title project
	}

	public int randomNumber() {
		Random random = new Random();
		return random.nextInt(999);
	}

	public void Login() throws Exception {
//		driver.get(link);
		openAnyUrl(driver, "https://admin.webinaris.co/login.html");

//		driver.findElement(By.xpath("//h3[normalize-space()='Herzlich willkommen!']")).isDisplayed();
		isDisplayElement(driver, "//h3[normalize-space()='Herzlich willkommen!']");

//		driver.findElement(By.xpath("//button[@type='button']//span[contains(text(),'Deutsch')]")).click();
		clickToElement(driver, "//button[@type='button']//span[contains(text(),'Deutsch')]");

//		driver.findElement(By.xpath("//span[normalize-space()='English']")).click();
		clickToElement(driver, "//span[normalize-space()='English']");

//		driver.findElement(By.xpath("//input[@type='email']")).sendKeys(email);
		sendkeyToElement(driver, "//input[@type='email']", email);

//		driver.findElement(By.xpath("//input[@type='password']")).sendKeys(password);
		sendkeyToElement(driver, "//input[@type='password']", password);

//		driver.findElement(By.xpath("//button[normalize-space()='Login']")).click();
		clickToElement(driver, "//button[normalize-space()='Login']");

//		driver.findElement(By.xpath("//h1[normalize-space()='Dashboard']")).isDisplayed();
		isDisplayElement(driver, "//h1[normalize-space()='Dashboard']");
		waitToElementInvisibleIconLoading(driver);

	}

	public void new_b050() throws Exception {
//		driver.get("https://app.webinaris.co/new-webinar");
		openAnyUrl(driver, "https://app.webinaris.co/new-webinar");

//		driver.findElement(By.xpath("//p[contains(text(),'The perfect solution for recurring marketing event')]"))
//				.isDisplayed();
		isDisplayElement(driver, "//p[contains(text(),'The perfect solution for recurring marketing event')]");

//		driver.findElement(By.xpath("//input[@id='nameTxt']")).sendKeys(title);
		sendkeyToElement(driver, "//input[@id='nameTxt']", title + randomNumber());

//		driver.findElement(By.xpath("//input[@id='internalTxt']")).sendKeys(subtitle);
		sendkeyToElement(driver, "//input[@id='internalTxt']", subtitle + randomNumber());

//		driver.findElement(By.xpath("//button[normalize-space()='Create webinar']")).click();
		clickToElement(driver, "//button[normalize-space()='Create webinar']");

//		driver.findElement(By.xpath("//p[contains(text(),'Set your webinar title and choose a video for your')]"))
//				.isDisplayed();
		isDisplayElement(driver, "//p[contains(text(),'Set your webinar title and choose a video for your')]");

		delay(1);
//		driver.findElement(By.xpath("//body/div[@id='app']/div/div/div/div/button[@type='button']/span/i[1]")).click();
		clickToElement(driver, "//body/div[@id='app']/div/div/div/div/button[@type='button']/span/i[1]");
	}

	@Test
	public void TC_02() throws Exception {
		Login();
		new_b050();
		delay(1);

		String getURL = getCurrentPageUrl(driver); // lấy ra URL hiện tại
		String fb050 = getURL.substring(31); // lấy ra fb050 từ URL

		// showtimes
//		driver.findElement(By.xpath("//span[normalize-space()='Showtimes']")).click();
		clickToElement(driver, "//span[normalize-space()='Showtimes']");

//		driver.findElement(By.xpath("//p[normalize-space()='Set the showtimes for your webinar.']")).isDisplayed();
		isDisplayElement(driver, "//p[normalize-space()='Set the showtimes for your webinar.']");
		delay(1);

//		driver.findElement(By.xpath("(//div)[95]")).click();
		clickToElement(driver, "(//div)[95]");
		delay(1);

//		driver.findElement(By.xpath("//div[contains(text(),'I create the showtimes myself')]")).click();
		clickToElement(driver, "//div[contains(text(),'I create the showtimes myself')]");

//		driver.findElement(By.xpath("//div[contains(text(),'Every 60 minutes (recommended)')]")).click();
		clickToElement(driver, "//div[contains(text(),'Every 60 minutes (recommended)')]");

//		driver.findElement(By.xpath("//div[contains(text(),'Every 5 minutes')]")).click();
		clickToElement(driver, "//div[contains(text(),'Every 5 minutes')]");

//		driver.findElement(By.xpath("//div[contains(text(),'No (recommended)')]")).click();
		clickToElement(driver, "//div[contains(text(),'No (recommended)')]");

//		driver.findElement(By.xpath("//div[contains(text(),'Yes')]")).click();
		clickToElement(driver, "//div[contains(text(),'Yes')]");

//		driver.findElement(By.xpath("//div[@class='_btns']//button[@type='button']")).click();
		clickToElement(driver, "//div[@class='_btns']//button[@type='button']");

		waitToElementInvisibleIconLoading(driver);

//		driver.get("https://20071.webinaris.co/" + fb050 + "/selenium.html?mode=N&v=4");
		openAnyUrl(driver, "https://20071.webinaris.co/" + fb050 + "/selenium.html?mode=N&v=4");

		waitToElementInvisibleIconLoading(driver);

		// data regist
		String Fname = "Minh";
		String Lname = "252";
		String EmailReg = "minhbp252+" + randomNumber() + "@gmail.com";

//		driver.findElement(By.xpath("//span[@class='header-context']")).click();
		clickToElement(driver, "//span[@class='header-context']");

//		driver.findElement(By.xpath("//input[@placeholder='First name']")).sendKeys(Fname);
		sendkeyToElement(driver, "//input[@placeholder='First name']", Fname);

//		driver.findElement(By.xpath("//input[@placeholder='Last name']")).sendKeys(Lname);
		sendkeyToElement(driver, "//input[@placeholder='Last name']", Lname);

//		driver.findElement(By.xpath("//input[@placeholder='E-mail address']")).sendKeys(EmailReg);
		sendkeyToElement(driver, "//input[@placeholder='E-mail address']", EmailReg);

//		driver.findElement(By.xpath("//span[@class='btn-text']")).click();
		clickToElement(driver, "//span[@class='btn-text']");

		waitToElementInvisibleIconLoading(driver);

	}

	public void delay(int x) throws Exception {
		Thread.sleep(x * 1000);
	}

	@AfterClass
	public void afterClass() {
		driver.close();
	}
}
