
package webtablehandling;

import java.text.NumberFormat;
import java.text.ParseException;
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

public class GetMaximumPriceInColumn {
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

	@Test
	public void getMaximumPriceInColumn() throws ParseException {
		String max;
		double m = 0, r = 0;

		// No. of Columns
		List<WebElement> col = driver.findElements(By.xpath(".//*[@id='leftcontainer']/table/thead/tr/th"));
		System.out.println("Total No of columns are : " + col.size());
		// No.of rows
		List<WebElement> rows = driver.findElements(By.xpath(".//*[@id='leftcontainer']/table/tbody/tr/td[1]"));
		System.out.println("Total No of rows are : " + rows.size());
		for (int i = 1; i < rows.size(); i++) {
			max = driver.findElement(By.xpath("//table[@class='dataTable']/tbody/tr["+i+"]/td[4]"))
					.getText();
			System.out.println(max);
			NumberFormat f = NumberFormat.getNumberInstance();
			Number num = f.parse(max);
			max = num.toString();
			m = Double.parseDouble(max);
			if (m > r) {
				r = m;
			}
		}
		System.out.println("Maximum current price is : " + r);
	}

	@AfterSuite
	public void closeChromeBrowser() {
		driver.quit();
	}
}
