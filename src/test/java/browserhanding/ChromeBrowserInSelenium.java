package browserhanding;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;
import io.github.bonigarcia.wdm.WebDriverManager;

public class ChromeBrowserInSelenium {
	protected static String url = "https://www.testingtherapy.com/";
	WebDriver driver;

	@BeforeSuite
	public void startChromeBrowser() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
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
