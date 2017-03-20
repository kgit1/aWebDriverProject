package TestScripts1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindingElement {

	public static void main(String[] args) {
		// add path driver for chrome browser self navigate to project root lib
		// folder
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "/drivers/chromedriver.exe");

		// The main interface to use for testing, which represents an idealised
		// web browser.
		WebDriver driver = new ChromeDriver();

		// open page
		driver.get("http://w3schools.com");
		// maximize
		driver.manage().window().maximize();

		// driver.findElement(By.className("w3-container
		// w3-padding-top")).click();

		// //find element by XPath and click on it
		// driver.findElement(By.xpath("/html/body/ul/li[5]/a")).click();
		// //find element by id and send him text
		// driver.findElement(By.id("gsc-i-id1")).sendKeys("search by id");
		// //find element by class name and click it
		// driver.findElement(By.className("gsc-search-button-v2")).click();
		//
		// //find element by text on it and click it
		// driver.findElement(By.linkText("Learn JavaScript")).click();

		// driver.findElement(By.name(name))

		// find element by partial link
		driver.findElement(By.partialLinkText("Colors")).click();
	}

}
