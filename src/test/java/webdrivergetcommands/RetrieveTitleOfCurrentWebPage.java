package webdrivergetcommands;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;
import io.github.bonigarcia.wdm.WebDriverManager;

public class RetrieveTitleOfCurrentWebPage {
	protected static String url = "https://demoqa.com/automation-practice-form";
	WebDriver driver;

	@BeforeSuite
	public void startChromeBrowser() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
	}

	@Test(priority = 0)
	public void fetchTitle() throws InterruptedException {
		driver.get(url);
		String title = driver.getTitle();
		System.out.println(title);
		Thread.sleep(1000);
	}

	@AfterSuite
	public void closeChromeBrowser() {
		driver.quit();
	}
}
