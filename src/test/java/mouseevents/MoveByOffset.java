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

public class MoveByOffset {
	String url = "https://jqueryui.com/slider/";
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
	public void moveByOffset() throws InterruptedException {
		Actions action = new Actions(driver);
		driver.switchTo().frame(0);
        WebElement elem_slider = driver.findElement(By.cssSelector(".ui-slider-handle"));
        Thread.sleep(2000);
        
        action.clickAndHold(elem_slider).moveByOffset(100,0).release().perform();
        System.out.println("Drag & Drop test case successful");
        Thread.sleep(3000);
	}

	@AfterSuite
	public void closeChromeBrowser() {
		driver.quit();
	}
}
