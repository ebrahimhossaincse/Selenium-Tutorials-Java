package locators.dynamicxpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LocateByContains {
	protected static String url = "https://demoqa.com/automation-practice-form";
	WebDriver driver;

	@BeforeSuite
	public void startChromeBrowser() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
	}

	@Test(priority = 0)
	public void locateByContiansExample01() throws InterruptedException {
		driver.get(url);
		//Syntax: //*[contains(text(), 'value')]
		WebElement containsText = driver.findElement(By.xpath("//*[contains(text(),'Name')]"));
		System.out.println(containsText.getText());
	}

	@Test(priority = 1)
	public void locateByContiansExample02() throws InterruptedException {
		driver.get(url);
		//Syntax: //*[contains(@attribute, 'value')]
		WebElement byAttribue = driver.findElement(By.xpath("//*[contains(@id,'lastName')]"));
		byAttribue.sendKeys("Hossain");
		Thread.sleep(3000);
	}

	@AfterSuite
	public void closeChromeBrowser() {
		driver.quit();
	}
}
