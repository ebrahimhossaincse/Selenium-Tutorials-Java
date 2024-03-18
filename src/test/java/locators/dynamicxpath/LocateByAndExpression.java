package locators.dynamicxpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LocateByAndExpression {
	protected static String url = "https://demoqa.com/automation-practice-form";
	WebDriver driver;

	@BeforeSuite
	public void startChromeBrowser() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
	}

	@Test(priority = 0)
	public void locateByAND() throws InterruptedException {
		driver.get(url);
		//Syntax: //*[first condition and second condition and ....]
		WebElement xpathByAND = driver
				.findElement(By.xpath("//*[contains(@id,'lastName') and @placeholder='Last Name'] "));
		xpathByAND.sendKeys("Hossain");
		Thread.sleep(3000);
	}

	@AfterSuite
	public void closeChromeBrowser() {
		driver.quit();
	}
}
