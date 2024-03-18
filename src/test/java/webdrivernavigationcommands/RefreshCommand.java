package webdrivernavigationcommands;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class RefreshCommand {
	protected static String url = "https://automationexercise.com/";
	WebDriver driver;

	@BeforeSuite
	public void startChromeBrowser() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
	}

	@Test(priority = 0)
	public void refreshCommand() throws InterruptedException {
		driver.get(url);
		Thread.sleep(3000);
		driver.navigate().to("https://parabank.parasoft.com/parabank/index.htm");
		Thread.sleep(3000);
		driver.navigate().refresh();
		Thread.sleep(3000);
	}

	@AfterSuite
	public void closeChromeBrowser() {
		driver.quit();
	}
}
