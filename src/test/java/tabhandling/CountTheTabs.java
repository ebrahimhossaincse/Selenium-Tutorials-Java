package tabhandling;

import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CountTheTabs {

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
	public void countTab() throws InterruptedException {
		driver.switchTo().newWindow(WindowType.TAB);
		Thread.sleep(5000);
		Set<String> tabs = driver.getWindowHandles();
		System.out.println("Total Tab Number: "+tabs.size());
	}

	@AfterSuite
	public void closeChromeBrowser() {
		driver.quit();
	}
}
