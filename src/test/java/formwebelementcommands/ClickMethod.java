package formwebelementcommands;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ClickMethod {
	protected static String url = "https://automationexercise.com/";
	WebDriver driver;

	@BeforeSuite
	public void startChromeBrowser() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
	}

	@Test(priority = 0)
	public void clickMethod() throws InterruptedException {
		driver.get(url);
		WebElement locator = driver.findElement(By.xpath("//div[@class='shop-menu pull-right']/ul/li[last()]"));
		locator.click();
		Thread.sleep(3000);
	}

	@AfterSuite
	public void closeChromeBrowser() {
		driver.quit();
	}
}
