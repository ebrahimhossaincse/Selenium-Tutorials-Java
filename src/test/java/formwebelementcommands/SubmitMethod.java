package formwebelementcommands;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SubmitMethod {
	protected static String url = "https://www.facebook.com/";
	WebDriver driver;

	@BeforeSuite
	public void startChromeBrowser() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
	}

	@Test
	public void submitMethod() throws InterruptedException {
		driver.get(url);
		WebElement email = driver.findElement(By.id("email"));
		email.sendKeys("abc@gmail.com");
		WebElement pass = driver.findElement(By.id("pass"));
		pass.sendKeys("123456");
		// submitting form with submit()
		WebElement submit = driver.findElement(By.id("pass"));
		submit.submit();
		Thread.sleep(5000);
	}

	@AfterSuite
	public void closeChromeBrowser() {
		driver.quit();
	}
}
