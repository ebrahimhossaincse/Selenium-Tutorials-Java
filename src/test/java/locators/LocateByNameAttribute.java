package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LocateByNameAttribute {

	String url = "https://www.facebook.com/";
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
	public void locateByName() throws InterruptedException {
		WebElement byName = driver.findElement(By.name("email"));
		byName.sendKeys("ebrahimhossain@noemail.com");
		Thread.sleep(5000);
	}

	@AfterSuite
	public void closeChromeBrowser() {
		driver.quit();
	}

}
