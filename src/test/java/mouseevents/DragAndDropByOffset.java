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

public class DragAndDropByOffset {
	String url = "https://selenium08.blogspot.com/2020/01/drag-me.html";
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
	public void dragAndDropByOffset() throws InterruptedException {
		WebElement src = driver.findElement(By.id("draggable"));
		
		Actions actions = new Actions(driver);
		actions.dragAndDropBy(src, 200, 150);
		actions.build().perform();
		
		Thread.sleep(3000);
	}

	@AfterSuite
	public void closeChromeBrowser() {
		driver.quit();
	}
}
