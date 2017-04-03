package testNG_parallelExecution2;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class TestParallel {

	// create dataProvider method which returns object with data for tests
	// returns multidimensional array - test will be executet so many times how
	// many rows in array, and for each test - will take data from next row
	// add attribute parallel with value true - to let tests use different
	// threads at same time to execute data from dataProvider
	@DataProvider(parallel = true)
	public Object[][] getData() {
		return new Object[][] { { "test1" }, { "test2" } };
	}

	// bind dataProvider by adding to @Test annotation - dataProvider attribute
	// with value equal name of the method which returns object with data
	@Test(dataProvider = "getData")
	public void test_01(String value) {
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "/drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

		driver.get("http://www.w3schools.com");
		driver.findElement(By.xpath("/html/body/ul/li[5]/a/i")).click();
		driver.findElement(By.xpath("//*[@id='gsc-i-id1']")).sendKeys(value);

		driver.quit();
	}
}
