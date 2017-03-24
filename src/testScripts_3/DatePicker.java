package testScripts_3;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DatePicker {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "/drivers/chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.get("http://www.tripadvisor.in/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);

		driver.findElement(By.xpath("//*[@id='HEAD']/div/div[2]/ul/li[2]/a")).click();
		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//*[@id='rt_1_airportFrom']")).sendKeys("Mumbai");
		driver.findElement(By.xpath("//*[@id='rt_1_airportTo']")).sendKeys("Delhi");

		driver.findElement(By.xpath("//*[@id='date_picker_in_0']")).click();

		String dateIn = "10-August 2017";
		String splitterIn[] = dateIn.split("-");
		String checkInMonth = splitterIn[1];
		String checkInDay = splitterIn[0];
		String dateOut = "12-October 2017";
		String splitterOut[] = dateOut.split("-");
		String checkOutMonth = splitterOut[1];
		String checkOutDay = splitterOut[0];

		WebElement month;
		List<WebElement> days;
		for (;;) {
			month = driver.findElement(By.xpath("//*[@id='overlayInnerDiv']/div/div[2]/table/thead/tr[1]/th"));
			if (month.getText().equals(checkInMonth)) {
				days = driver.findElements(By.xpath("//div[@class='month'][1]/table/tbody/tr/td"));
				for (WebElement webElement : days) {
					System.out.println(webElement.getText());
					if (webElement.getText().equals(checkInDay)) {
						webElement.click();
						break;
					}
				}
				break;
			}
			// System.out.println(month.getText());
			// System.out.println("click");
			driver.findElement(By.xpath("//*[@id='overlayInnerDiv']/div/div[1]/span[2]")).click();
			Thread.sleep(1000);
		}

		for (;;) {
			month = driver.findElement(By.xpath("//*[@id='overlayInnerDiv']/div/div[2]/table/thead/tr[1]/th"));
			if (month.getText().equals(checkOutMonth)) {
				days = driver.findElements(By.xpath("//div[@class='month'][1]/table/tbody/tr/td"));
				for (WebElement webElement : days) {
					System.out.println(webElement.getText());
					if (webElement.getText().equals(checkOutDay)) {
						webElement.click();
						break;
					}
				}
				break;
			}
			// System.out.println(month.getText());
			// System.out.println("click");
			driver.findElement(By.xpath("//*[@id='overlayInnerDiv']/div/div[1]/span[2]")).click();
			Thread.sleep(1000);
		}
	}

}
