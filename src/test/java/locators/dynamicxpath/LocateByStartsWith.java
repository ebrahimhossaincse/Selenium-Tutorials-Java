package locators.dynamicxpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LocateByStartsWith {
	protected static String url = "https://demoqa.com/automation-practice-form";
	WebDriver driver;

	@BeforeSuite
	public void startChromeBrowser() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
	}

	@Test(priority = 0)
	public void locateByStartsWith() throws InterruptedException {
		driver.get(url);
		WebElement xpathByStartWith = driver.findElement(By.xpath("//*[starts-with(@id,'last')]"));
		xpathByStartWith.sendKeys("Hossain");
		Thread.sleep(3000);
	}

	@AfterSuite
	public void closeChromeBrowser() {
		driver.quit();
	}
}
