package headlessbrowserhandle;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;
import io.github.bonigarcia.wdm.WebDriverManager;

public class HeadlessChromeBrowserInSelenium {
	protected static String url = "https://www.testingtherapy.com/";
	WebDriver driver;

	@BeforeSuite
	public void startHeadlessChromeBrowser() {
		WebDriverManager.chromedriver().setup();

		// Create an object of Chrome Options class
		ChromeOptions options = new ChromeOptions();

		// Set Chrome Headless mode as TRUE
		options.addArguments("--headless=new");

		driver = new ChromeDriver(options);
	}

	@Test
	public void openUrl() {
		driver.get(url);
	}

	@AfterSuite
	public void closeChromeBrowser() {
		driver.quit();
	}

}
