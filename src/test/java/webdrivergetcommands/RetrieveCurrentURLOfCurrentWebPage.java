package webdrivergetcommands;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;
import io.github.bonigarcia.wdm.WebDriverManager;

public class RetrieveCurrentURLOfCurrentWebPage {
	protected static String url = "https://demoqa.com/automation-practice-form";
	WebDriver driver;

	@BeforeSuite
	public void startChromeBrowser() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
	}

	@Test(priority = 0)
	public void fetchCurrentURL() throws InterruptedException {
		driver.get(url);
		String currentURL = driver.getCurrentUrl();
		System.out.println(currentURL);
		Thread.sleep(1000);
	}

	@AfterSuite
	public void closeChromeBrowser() {
		driver.quit();
	}
}
