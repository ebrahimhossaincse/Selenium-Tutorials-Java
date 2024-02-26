package headlessbrowserhandle;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;
import io.github.bonigarcia.wdm.WebDriverManager;

public class HeadlessFirefoxBrowserInSelenium {
	protected static String url = "https://www.testingtherapy.com/";
	WebDriver driver;

	@BeforeSuite
	public void startHeadlessFirefoxBrowser() {
		WebDriverManager.chromedriver().setup();
		
		// Create an object of Firefox Options class
        FirefoxOptions options = new FirefoxOptions();
 
        // Set Firefox Headless mode as TRUE
        options.addArguments("-headless");
		
		driver = new FirefoxDriver();
	}
	
	@Test
	public void openUrl() {
		driver.get(url);
	}
	
	@AfterSuite
	public void closeFirefoxBrowser() {
		driver.quit();
	}

}
