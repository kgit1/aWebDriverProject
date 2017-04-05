package testNG_grid;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class ParallelTest extends SeleniumInitialization {

	@Test
	public void testLogin() {
		getWebDriver().get("http://www.w3schools.com");

		getWebDriver().findElement(By.xpath("//*[@id='mySidenav']/a[2]")).click();
	}

}
