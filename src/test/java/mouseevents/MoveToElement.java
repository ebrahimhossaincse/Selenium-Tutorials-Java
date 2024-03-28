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

public class MoveToElement {
	String url = "https://www.daraz.com.bd/";
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
	public void moveToElement() throws InterruptedException {
		Actions action = new Actions(driver);

		WebElement lifeStyle = driver.findElement(By.xpath("//span[contains(text(),'Home & Lifestyle')]"));
		action.moveToElement(lifeStyle).perform();
		Thread.sleep(2000);

		WebElement craft = driver.findElement(By.xpath(
				"//body/div[@id='J_7459419030']/div[@id='J_LzdSiteNav']/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/ul[1]/ul[10]/li[10]/a[1]/span[1]"));
		action.moveToElement(craft).perform();
		Thread.sleep(2000);

		WebElement art = driver.findElement(By.xpath("//span[contains(text(),'Artworks')]"));
		art.click();
		Thread.sleep(3000);
	}

	@AfterSuite
	public void closeChromeBrowser() {
		driver.quit();
	}
}
