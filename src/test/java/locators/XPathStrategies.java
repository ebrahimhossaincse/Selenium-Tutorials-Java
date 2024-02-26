package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class XPathStrategies {

	WebDriver driver;

	@BeforeSuite
	public void startChromeBrowser() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
	}

	@Test(priority = 0)
	public void absoluteXPath() throws InterruptedException {
		driver.get("https://demoqa.com/automation-practice-form");
		WebElement absoluteLocator = driver.findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/div[1]/div[2]/input[1]"));
		absoluteLocator.clear();
		absoluteLocator.sendKeys("Ebrahim Hossain");
		Thread.sleep(3000);
	}
	
	@Test(priority = 1)
	public void relativeXPath() throws InterruptedException {
		driver.get("https://demoqa.com/automation-practice-form");
		WebElement absoluteLocator = driver.findElement(By.xpath("//input[@id='firstName']"));
		absoluteLocator.clear();
		absoluteLocator.sendKeys("Ebrahim Hossain");
		Thread.sleep(3000);
	}
	
	@Test(priority = 2)
	public void exampleOfXPathContains() throws InterruptedException {
		driver.get("https://demoqa.com/automation-practice-form");
		//Sample-1 - Format: //*[contains(text(), 'value')]
		WebElement containsText = driver.findElement(By.xpath("//*[contains(text(),'Name')]"));
		System.out.println(containsText.getText());
		
		//Sameple-2 - Format: //*[contains(@attribute, 'value')]
		WebElement byAttribue = driver.findElement(By.xpath("//*[contains(@id,'lastName')]"));
		byAttribue.sendKeys("Hossain");
		Thread.sleep(3000);
	}


	public void exampleOfXPathOR() {
		driver.get("https://demoqa.com/automation-practice-form");
		//Sample-1 - Format: //*[first condition or second condition or ....]
		WebElement xpathByOR = driver.findElement(By.xpath("//*[contains(@id,'lastName') or @placeholder='Last Name'] "));
		xpathByOR.sendKeys("Hossain");
	}
	

	public void exampleOfXPathAND() throws InterruptedException {
		driver.get("https://demoqa.com/automation-practice-form");
		//Sample-1 - Format: //*[first condition and second condition and ....]
		WebElement xpathByAND = driver.findElement(By.xpath("//*[contains(@id,'lastName') and @placeholder='Last Name'] "));
		xpathByAND.sendKeys("Hossain");
		Thread.sleep(3000);
	}


	public void exampleOfXPathStartsWith() throws InterruptedException {
		driver.get("https://demoqa.com/automation-practice-form");
		//Sample-1 - Format: //*[first condition and second condition and ....]
		WebElement xpathByStartWith = driver.findElement(By.xpath("//*[starts-with(@id,'last')]"));
		xpathByStartWith.sendKeys("Hossain");
		Thread.sleep(3000);
	}
	
	public void exampleOfXPathTextFunction() throws InterruptedException {
		driver.get("https://demoqa.com/automation-practice-form");
		WebElement xpathByTextFunction = driver.findElement(By.xpath("//*[text()='Student Registration Form']"));
		System.out.println(xpathByTextFunction.getText());
		Thread.sleep(3000);
	}

	@AfterSuite
	public void closeChromeBrowser() {
		driver.quit();
	}

}
