package TestScripts2;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NavigationsCloseQuit {

	public static void main(String[] args) throws InterruptedException {
		// add path driver for chrome browser self navigate to project root lib
		// folder
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "/drivers/chromedriver.exe");

		// The main interface to use for testing, which represents an idealised
		// web browser.
		WebDriver driver = new ChromeDriver();
		driver.get("http://hdfcbank.com");
		//maximize window
		driver.manage().window().maximize();
		// specifies the amount of time the driver should wait when searching
		// for an element if it is not immediately present.
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//*[@id='loginsubmit']")).click();

		// closes current browser opened by driver and destroys driver
		driver.close();
		// closes all browserers opened by driver and destroys driver
		driver.quit();

		// driver.navigate("http://")
	}

}
