package TestScripts3;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Wait {

	public static void main(String[] args) throws InterruptedException {
		// add path driver for chrome browser self navigate to project root lib
		// folder
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "/drivers/chromedriver.exe");
		// The main interface to use for testing, which represents an idealised
		// web browser.
		WebDriver driver = new ChromeDriver();

		driver.get("http://rediff.com");
		// maximize window
		driver.manage().window().maximize();
		// to wait for the page to load we can use implicitlyWait()
		// specifies the amount of time the driver should wait when searching
		// for an element if it is not immediately present.
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		// or we can use Thread.sleep()
		// Thread.sleep(5000);

		driver.findElement(By.xpath("//*[@id='signin_info']/a[1]")).click();
		driver.findElement(By.xpath("//*[@id='login1']")).sendKeys("appautomator@rediffmail.com");
		driver.findElement(By.xpath("//*[@id='password']")).sendKeys("Appium123");
		driver.findElement(By.xpath("//div/div[2]/div[2]/div[1]/div/form/div/div[6]/div[1]/input")).click();
		// driver.findElement(By.xpath("")).click();

		// but smarter way to use WebDriverWait object because it can have
		// condition not only to wait but to start working before time runs out
		// - if condition is complete

		WebDriverWait wait = new WebDriverWait(driver, 15);
		//wait until() condition presence of certain element is true
		wait.until(ExpectedConditions
				.presenceOfElementLocated(By.xpath("//*[@id='97_3431_newsletters']/span[@class='rd_subject']")));
		driver.findElement(By.xpath("//*[@id='97_3431_newsletters']/span[@class='rd_subject']")).click();
	}

}
