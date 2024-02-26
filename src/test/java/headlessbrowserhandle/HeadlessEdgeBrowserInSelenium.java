package headlessbrowserhandle;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;
import io.github.bonigarcia.wdm.WebDriverManager;

public class HeadlessEdgeBrowserInSelenium {
	protected static String url = "https://www.testingtherapy.com/";
	WebDriver driver;

	@BeforeSuite
	public void startHeadlessEdgeBrowser() {
		WebDriverManager.chromedriver().setup();
		
		// Create an object of Edge Options class
        EdgeOptions edgeOptions = new EdgeOptions();
 
        // Set Edge Headless mode as TRUE
        edgeOptions.addArguments("--headless");
        
		driver = new EdgeDriver();
	}
	
	@Test
	public void openUrl() {
		driver.get(url);
	}
	
	@AfterSuite
	public void closeEdgeBrowser() {
		driver.quit();
	}

}
