package iframehandling;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SwitchBackToMainPage {
	protected static String url = "https://www.tutorialspoint.com/selenium/practice/nestedframes.php";
	WebDriver driver;

	@BeforeSuite
	public void startChromeBrowser() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
	}

	@BeforeClass
	public void openUrl() {
		driver.get(url);
	}

	@Test
	public void backToMain() {
		driver.switchTo().frame("frame1");
		WebElement text = driver.findElement(By.xpath("//*[text()='Selenium - Automation Practice Form']"));
		System.out.println(text.getText());

		// Switch back to the main window
		driver.switchTo().defaultContent();
		
		WebElement textInMainPage = driver.findElement(By.xpath("//*[text()='Nested Frames']"));
		System.out.println(textInMainPage.getText());
	}

	@AfterSuite
	public void closeChromeBrowser() {
		driver.quit();
	}
}
