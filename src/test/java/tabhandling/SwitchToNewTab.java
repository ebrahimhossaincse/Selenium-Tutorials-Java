package tabhandling;

import java.util.Iterator;
import java.util.Set;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SwitchToNewTab {

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
	public void switchToTab() throws InterruptedException {
		  //Count of window - 1
        Set<String> allWindowHandles = driver.getWindowHandles();
        System.out.println("Count of Window :" + allWindowHandles.size());
 
        driver.findElement(By.id("tabButton")).click();
 
        Set<String> newAllWindowHandles = driver.getWindowHandles();
        System.out.println("New Count of Window :" + newAllWindowHandles.size());
        
        String ParentHandle = driver.getWindowHandle();
 
        Iterator<String> iterator = newAllWindowHandles.iterator();
        String mainWindow = iterator.next();
        String childWindow = iterator.next();
 
        driver.switchTo().window(childWindow);
        Thread.sleep(5000);
	}

	@AfterSuite
	public void closeChromeBrowser() {
		driver.quit();
	}
}
