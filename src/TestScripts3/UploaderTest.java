package TestScripts3;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class UploaderTest {

	public static void main(String[] args) throws InterruptedException, IOException {
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "/drivers/chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("http://tinypic.com");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);

		// 1st method how to upload file through upload function on the page(but
		// works not always)
		// driver.findElement(By.xpath("//*[@id='the_file']")).sendKeys(System.getProperty("user.dir")+"/scriptAutoIt/Hanzo.jpeg");

		// 2nd method how to upload file through upload function on the page
		// AutoIt - tool to automate windows base applications

		// to close add
		// Thread.sleep(5000);
		// driver.findElement(By.xpath("//*[@id='g367CB268B1094004A3689751E7AC568FFloatingBanner0']/div[1]/div[2]/div/span")).click();

		
		WebElement element = driver.findElement(By.xpath("//*[@id='the_file']"));
		element.click();
		element.click();
		Thread.sleep(5000);
		// write full path to *.exe file
		Runtime.getRuntime().exec("D:\\J\\workspace\\aWebDriverProject\\scriptAutoIt\\uploadScript.exe");

		// Every Java application has a single instance of class Runtime that
		// allows the application to interface with the environment in which the
		// application is running. The current runtime can be obtained from the
		// getRuntime() method.
		// exec() - Executes the specified string command in a separate process.
	}

}
