package testScripts_3;

import java.awt.AWTException;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

public class SameIdElements {
	
	@Test
	public void startGG() throws InterruptedException, AWTException {
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "/drivers/chromedriver.exe");

		ChromeOptions options = new ChromeOptions();
		options.addArguments("--mute-audio");

		WebDriver driver = new ChromeDriver(options);
		driver.get("http://seleniumpractise.blogspot.in/2016/08/how-to-automate-radio-button-in.html");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);

		List<WebElement> list = driver.findElements(By.xpath("//*[@id='male']"));

		for (WebElement webElement : list) {
			System.out.println(webElement);
			if (webElement.getLocation().getX() != 0) {
				webElement.click();
			}
		}
	}
}
