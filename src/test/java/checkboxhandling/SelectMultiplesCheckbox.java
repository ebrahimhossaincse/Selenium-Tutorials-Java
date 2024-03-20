package checkboxhandling;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;
import io.github.bonigarcia.wdm.WebDriverManager;

public class SelectMultiplesCheckbox {
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
	public void checks() throws InterruptedException {
		List<WebElement> checkboxs = driver.findElements(By.xpath("//input[@type='checkbox']"));
		for ( WebElement el : checkboxs ) {
		    if ( !el.isSelected() ) {
		        el.click();
		    }
		}
		Thread.sleep(10000);
	}

	@AfterSuite
	public void closeChromeBrowser() {
		driver.quit();
	}
}
