package browserhandling;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.safari.SafariDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;
import io.github.bonigarcia.wdm.WebDriverManager;

public class SafariBrowserInSelenium {
	protected static String url = "";
	WebDriver driver;

	@BeforeSuite
	public void startSafariBrowser() {
		WebDriverManager.chromedriver().setup();
		driver = new SafariDriver();
	}
	
	@Test
	public void openUrl() {
		driver.get(url);
	}
	
	@AfterSuite
	public void closeSafariBrowser() {
		driver.quit();
	}

}
