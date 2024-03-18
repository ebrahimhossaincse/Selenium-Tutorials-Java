package locators.dynamicxpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LocateByAbsoluteXPath {
	protected static String url = "https://demoqa.com/automation-practice-form";
	WebDriver driver;

	@BeforeSuite
	public void startChromeBrowser() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
	}
	
	@Test
	public void absoluteXPath() throws InterruptedException {
		driver.get(url);
		WebElement absoluteLocator = driver.findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/div[1]/div[2]/input[1]"));
		absoluteLocator.clear();
		absoluteLocator.sendKeys("Ebrahim Hossain");
		Thread.sleep(3000);
	}
	
	@AfterSuite
	public void closeChromeBrowser() {
		driver.quit();
	}
}
