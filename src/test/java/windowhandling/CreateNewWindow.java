package windowhandling;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CreateNewWindow {

	protected static String url = "https://demoqa.com/browser-windows";
	WebDriver driver;

	@BeforeSuite
	public void startChromeBrowser() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
	}

	@BeforeClass
	public void openUrl() {
		driver.get(url);
	}

	@Test
	public void createNewWindow() throws InterruptedException {
		driver.switchTo().newWindow(WindowType.WINDOW);
		Thread.sleep(5000);
	}

	@AfterSuite
	public void closeChromeBrowser() {
		driver.quit();
	}
}
