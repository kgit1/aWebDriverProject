package testScripts_2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.ClickAction;

public class NavigationsBackForwardRefresh {

	public static void main(String[] args) throws InterruptedException {
		// add path driver for chrome browser self navigate to project root lib
		// folder
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "/drivers/chromedriver.exe");

		// The main interface to use for testing, which represents an idealised
		// web browser.
		WebDriver driver = new ChromeDriver();

		// 1st method - just opens page
		// open rediff.com
		// driver.get("http://rediffmail.com");
		// driver.get("http://google.com");

		// 2nd method - opens page and let us us browser navigation buttons
		driver.navigate().to("http://rediffmail.com");
		driver.manage().window().maximize();

		//find sign in button and click it
		driver.findElement(By.xpath("//*[@id='signin_info']/a[1]")).click();

		// wait for 5 seconds
		Thread.sleep(5000);

		// navigate on previous page
		driver.navigate().back();

		// wait 5 seconds
		Thread.sleep(5000);

		// navigate on forward page
		driver.navigate().forward();

		// wait 5 seconds
		Thread.sleep(5000);

		// refresh page
		driver.navigate().refresh();
	}

}
