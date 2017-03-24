package testScripts_1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestScripts {

	public static void main(String[] args) {
		// add path driver for chrome browser self navigate to project root lib
		// folder
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "/drivers/chromedriver.exe");

		// The main interface to use for testing, which represents an idealised
		// web browser.
		WebDriver driver = new ChromeDriver();

		// driver.get("http://www.rediff.com");

		// // maximize opened window
		// driver.manage().window().maximize();

		// // find element by XPath and click
		// driver.findElement(By.xpath("//*[@id='signin_info']/a[1]")).click();

		driver.get("https://www.w3schools.com/");

		driver.manage().window().maximize();
		// find element by XPath
		// driver.findElement(By.xpath("//*[@id='mySidenav']/a[1]")).click();
		// driver.findElement(By.xpath("//*[@id='leftmenuinnerinner']/a[7]")).click();
		// // find element by XPath, but except using order number of element
		// /a[7]
		// // here, we will use method text() to get /a with text 'HTML
		// Elements'
		// // on it
		// driver.findElement(By.xpath("//*[@id='leftmenuinnerinner']/a[text()='HTML
		// Elements']")).click();
		// //find preceding first sibling of element
		// driver.findElement(By.xpath("//*[@id='leftmenuinnerinner']/a[text()='HTML
		// Elements']/preceding-sibling::a[1]")).click();
		// //find following first sibling of element
		// driver.findElement(By.xpath("//*[@id='leftmenuinnerinner']/a[text()='HTML
		// Elements']/following-sibling::a[1]")).click();
		//
		// //find following third sibling of element
		// driver.findElement(By.xpath("//*[@id='leftmenuinnerinner']/a[text()='HTML
		// CSS']/following-sibling::a[3]")).click();
		//
		// not working, page changed
		// find div[1] of div[2] of parent div of element
		// driver.findElement(By.xpath("/html/body/div[2]/div[1]/a/parent::div/div[2]/div[1]/div[2]/a")).click();

	}
}
