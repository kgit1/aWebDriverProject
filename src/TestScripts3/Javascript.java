package TestScripts3;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Javascript {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "/drivers/chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.get("http://javascriptkit.com/javatutors/event2.shtml");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

		// go to needed iframe and click
		Thread.sleep(8000);
		List<WebElement> list = driver.findElements(By.tagName("iframe"));
		System.out.println(list.size());
		for (WebElement webElement : list) {
			System.out.println(webElement.getAttribute("id"));
		}

		driver.switchTo().frame(list.size() - 1);
		driver.findElement(By.xpath("//*[@id='close-icon']")).click();

		driver.switchTo().defaultContent();

		// call javascript function by clicking button on the page

		// driver.findElement(By.xpath("//*[@id='contentcolumn']/div[1]/table/tbody/tr/td[2]/form/input")).click();

		// if we can't use javascript function on the page with usual selenium
		// tools like findElement() and click() etc, we can call this function
		// directly

		// 1th method - call javascript function directly through driver object
		// by function name
		// (JavascriptExecutor) - Indicates that a driver can execute
		// JavaScript, providing access to the mechanism to do so.
		// executeScript() - Executes JavaScript in the context of the currently
		// selected frame or window. The script fragment provided will be
		// executed as the body of an anonymous function.
		// Within the script, use document to refer to the current document.

		// ((JavascriptExecutor) driver).executeScript("inform()");

		// 2nd method - call javascript function by using another javascript
		// function which be executed by executor
		// document.getElementsByName('fd0')[0].click()
		// getElementsByName('fd0')[0] - will return list of all elements with
		// this name from the page(document)
		// and click() - will simply click it

		((JavascriptExecutor) driver).executeScript("document.getElementsByName('fd0')[0].click()");

		//
		//
		//
		//
		// not working
		// WebDriverWait wait = new WebDriverWait(driver, 10);
		// wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(By.xpath("//iframe[starts-with(@id,'mailmunch-popover-frame']")));
		// WebElement iframe =
		// driver.findElement(By.xpath("//*[starts-with(@id,'mailmunch-popover-frame']"));
		// System.out.println(iframe);

	}

}
