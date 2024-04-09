package assertions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;
import io.github.bonigarcia.wdm.WebDriverManager;

public class AssertTrue {
	String url = "https://www.tutorialspoint.com/selenium/practice/selenium_automation_practice.php";
	WebDriver driver;

	@BeforeSuite
	public void startChromeBrowser() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize(); // Maximize the screen
	}

	@BeforeClass
	public void openUrl() {
		driver.get(url);
	}

	@Test
	public void testAssertTrue() {
		WebElement element = driver.findElement(By.id("hobbies"));
        Assert.assertTrue(element.isDisplayed());
    }

	@AfterSuite
	public void closeChromeBrowser() {
		driver.quit();
	}
}
