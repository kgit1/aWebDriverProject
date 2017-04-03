package testNG_parallelExecution1;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class TestWebSite extends SeleniumInitialization {

	@Test
	public void test_01() throws InterruptedException {
		getWebDriver().get("http://w3schools.com");
		Thread.sleep(5000);
		getWebDriver().findElement(By.xpath("//*[@id='mySidenav']/a[2]")).click();
		Thread.sleep(5000);
		getWebDriver().findElement(By.xpath("//*[@id='topnav']/div/ul/li[3]/a")).click();
		Thread.sleep(5000);
	}

	@Test
	public void test_02() throws InterruptedException {
		getWebDriver().get("http://w3schools.com");
		Thread.sleep(5000);
		getWebDriver().findElement(By.xpath("//*[@id='mySidenav']/a[2]")).click();
		Thread.sleep(5000);
		getWebDriver().findElement(By.xpath("//*[@id='topnav']/div/ul/li[3]/a")).click();
		Thread.sleep(5000);
	}

}
