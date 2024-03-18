package locators.dynamicxpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LocateByPosition {
	protected static String url = "https://automationexercise.com/";
	WebDriver driver;

	@BeforeSuite
	public void startChromeBrowser() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
	}

	@Test(priority = 0)
	public void locateByPosition() throws InterruptedException {
		driver.get(url);
		WebElement xpathByPosition = driver.findElement(By.xpath("//div[@class='shop-menu pull-right']/ul/li[4]"));
		xpathByPosition.click();
		Thread.sleep(3000);
	}

	@AfterSuite
	public void closeChromeBrowser() {
		driver.quit();
	}
}
