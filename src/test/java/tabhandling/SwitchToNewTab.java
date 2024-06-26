package tabhandling;

import java.util.Iterator;
import java.util.Set;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SwitchToNewTab {

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

	@SuppressWarnings("unused")
	@Test
	public void switchToTab() throws InterruptedException {
		Set<String> allWindowHandles = driver.getWindowHandles();
		System.out.println("Count of Tab :" + allWindowHandles.size());

		driver.findElement(By.id("tabButton")).click();

		Set<String> newAllTabHandles = driver.getWindowHandles();
		System.out.println("New Count of Tab :" + newAllTabHandles.size());

		String ParentHandle = driver.getWindowHandle();

		Iterator<String> iterator = newAllTabHandles.iterator();
		String mainTab = iterator.next();
		String childTab = iterator.next();

		driver.switchTo().window(childTab);
		Thread.sleep(5000);
	}

	@AfterSuite
	public void closeChromeBrowser() {
		driver.quit();
	}
}
