package mouseevents;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ClickAndHold {
	String url = "https://www.tutorialspoint.com/selenium/practice/menu.php#";
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
	public void clickAndHoldTest() throws InterruptedException {
		WebElement navbar = driver.findElement(By.xpath("/html/body/main/div/div/div[2]/nav/div/a"));

		String beforeColor = navbar.getCssValue("color");
		System.out.println("rgba code for color element: " + beforeColor);
		Thread.sleep(3000);

		Actions action = new Actions(driver);
		action.clickAndHold(navbar).build().perform();
		Thread.sleep(3000);

		String afterColor = navbar.getCssValue("color");
		System.out.println("rgba code for color for element after click and hold: " + afterColor);
	}

	@AfterSuite
	public void closeChromeBrowser() {
		driver.quit();
	}
}
