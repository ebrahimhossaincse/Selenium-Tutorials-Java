package windowhandling;

import java.util.Iterator;
import java.util.Set;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SwitchingOneWindowToAnother {

	protected static String url = "https://demoqa.com/browser-windows";
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

	@SuppressWarnings("unused")
	@Test
	public void switchingWindow() throws InterruptedException {
		Set<String> allWindowHandles = driver.getWindowHandles();
		System.out.println("Count of Window :" + allWindowHandles.size());

		driver.findElement(By.id("windowButton")).click();

		Set<String> newAllWindowHandles = driver.getWindowHandles();
		System.out.println("New Count of Window :" + newAllWindowHandles.size());

		String ParentHandle = driver.getWindowHandle();

		Iterator<String> iterator = newAllWindowHandles.iterator();
		String mainWindow = iterator.next();
		String childWindow = iterator.next();

		driver.switchTo().window(childWindow);
		Thread.sleep(3000);
		
		WebElement text = driver.findElement(By.id("sampleHeading"));
        System.out.println("Child_Title :" + text.getText());
 
        // Close Child window
        driver.close();
 
        // Switch back to parent window
        driver.switchTo().window(ParentHandle);
        System.out.println("Parent Title :" + driver.getTitle());
		Thread.sleep(5000);
	}

	@AfterSuite
	public void closeChromeBrowser() {
		driver.quit();
	}
}
