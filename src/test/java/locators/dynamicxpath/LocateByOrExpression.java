package locators.dynamicxpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LocateByOrExpression {
	protected static String url = "https://demoqa.com/automation-practice-form";
	WebDriver driver;

	@BeforeSuite
	public void startChromeBrowser() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
	}

	@Test(priority = 0)
	public void locateByOR() throws InterruptedException {
		driver.get(url);
		//Syntax: //*[first condition or second condition or ....]
		WebElement xpathByOR = driver
				.findElement(By.xpath("//*[contains(@id,'lastName') or @placeholder='Last Name'] "));
		xpathByOR.sendKeys("Hossain");
	}

	@AfterSuite
	public void closeChromeBrowser() {
		driver.quit();
	}
}
