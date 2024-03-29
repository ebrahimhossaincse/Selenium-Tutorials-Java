package webtablehandling;

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

public class FetchTableColumnValue {
	protected static String url = "https://demo.guru99.com/test/web-table-element.php";
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

	@Test(priority = 0)
	public void fetchHeading() throws InterruptedException {
		WebElement tableElement = driver.findElement(By.xpath("//table[@class='dataTable']/thead"));
		List<WebElement> rows = tableElement.findElements(By.tagName("tr"));

		for (WebElement rowElement : rows) {
			List<WebElement> cells = rowElement.findElements(By.tagName("th"));
			for (WebElement cellElement : cells) {
				String cellData = cellElement.getText();
				System.out.print("| " + cellData + " |\t");
			}
			System.out.println();
		}

		List<WebElement> rowcounts = tableElement.findElements(By.xpath("//table[@class='dataTable']/tbody/tr"));
		for (int i = 0; i < rowcounts.size(); i++) {
			List<WebElement> columns = driver
					.findElements(By.xpath("//table[@class='dataTable']/tbody/tr[" + i + "]/td"));
			for (int j = 1; j < columns.size(); j++) {
				WebElement columnValue = driver
						.findElement(By.xpath("//table[@class='dataTable']/tbody/tr[" + j + "]/td[" + j + "]"));
				String value = columnValue.getText();
				System.out.print("| " + value + " |\t");
			}
			System.out.println();
		}
	}

	@AfterSuite
	public void closeChromeBrowser() {
		driver.quit();
	}
}
