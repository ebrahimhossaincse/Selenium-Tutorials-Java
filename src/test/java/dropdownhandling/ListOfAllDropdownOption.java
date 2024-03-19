package dropdownhandling;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;
import io.github.bonigarcia.wdm.WebDriverManager;

public class ListOfAllDropdownOption {
	protected static String url = "https://demoqa.com/select-menu";
	WebDriver driver;

	@BeforeSuite
	public void startChromeBrowser() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
	}

	@Test(priority = 0)
	public void selectByVisibleText() throws InterruptedException {
		driver.get(url);
		WebElement locator = driver.findElement(By.id("oldSelectMenu"));
		Select select = new Select(locator);
		List<WebElement> listElements = select.getOptions();
        System.out.println("List of options in dropdown: " );
        for(WebElement options: listElements)
            System.out.println(options.getText());
		Thread.sleep(3000);
	}

	@AfterSuite
	public void closeChromeBrowser() {
		driver.quit();
	}
}
