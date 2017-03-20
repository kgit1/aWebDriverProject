package TestScripts1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AdvanceXPathCSSSelectors {

	public static void main(String[] args) {
		// add path driver for chrome browser self navigate to project root lib
		// folder
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "/drivers/chromedriver.exe");

		// The main interface to use for testing, which represents an idealised
		// web browser.
		WebDriver driver = new ChromeDriver();

		driver.get("http://rediffmail.com");
		// driver.get("http://google.com");
		driver.manage().window().maximize();

		driver.findElement(By.xpath("//*[@id='signin_info']")).click();

		// access field by css selector using field id
		// driver.findElement(By.cssSelector("input[id='login1'")).sendKeys("buba");

		// access field by css selector using field id but partial an "^" will
		// mean same as starts-with()
		// driver.findElement(By.cssSelector("input[id^='logi'")).sendKeys("buba");

		// access field by css selector using field id but partial an "*" will
		// mean same as contains()
		driver.findElement(By.cssSelector("input[id*='ogi'")).sendKeys("buba");

		// access field by css selector using field id short cut
		// driver.findElement(By.cssSelector("#login1")).sendKeys("buba");

		// access field by css selector using near by field class selector and
		// than navigate to target
		// driver.findElement(By.cssSelector("div[class='login-form'] div
		// input[id='login1']")).sendKeys("buba");

		// access field by css selector short cut using near by field class
		// selector and than navigate to target
		// driver.findElement(By.cssSelector(".login-form div
		// #login1")).sendKeys("buba");

		// "div class =1 div" - will access every divs inside div class=1
		// "div class =1>div" - will access only level 1 inside divs inside div
		// class=1

	}

}
