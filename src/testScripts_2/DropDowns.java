package testScripts_2;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DropDowns {
	public static void main(String[] args) {
		// add path driver for chrome browser self navigate to project root lib
		// folder
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "/drivers/chromedriver.exe");

		// The main interface to use for testing, which represents an idealised
		// web browser.
		WebDriver driver = new ChromeDriver();

		// open http://rediff.com
		driver.get("http://rediff.com");
		// maximize window
		driver.manage().window().maximize();
		// specifies the amount of time the driver should wait when searching
		// for an element if it is not immediately present.
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

		driver.findElement(By.xpath("//*[@id='signin_info']/a[2]")).click();

		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

		driver.findElement(By.xpath("//*[@id='wrapper']/table[2]/tbody/tr[3]/td[3]/input")).sendKeys("fullName");
		driver.findElement(By.xpath("//*[@id='wrapper']/table[2]/tbody/tr[7]/td[3]/input[1]")).sendKeys("userName");
		driver.findElement(By.xpath("//*[@id='wrapper']/table[2]/tbody/tr[9]/td[3]/input")).sendKeys("password123");
		driver.findElement(By.xpath("//*[@id='wrapper']/table[2]/tbody/tr[11]/td[3]/input")).sendKeys("password123");
		driver.findElement(By.xpath("//*[@id='div_altemail']/table/tbody/tr[1]/td[3]/input"))
				.sendKeys("altermail@google.com");

		WebElement dropdown;
		List<WebElement> option;
		// select day
		dropdown = driver.findElement(By.xpath("//*[@id='wrapper']/table[2]/tbody/tr[23]/td[3]/select[1]"));
		option = dropdown.findElements(By.tagName("option"));
		System.out.println(option.size());
		option.get(5).click();

		// select month
		dropdown = driver.findElement(By.xpath("//*[@id='wrapper']/table[2]/tbody/tr[23]/td[3]/select[2]"));
		option = dropdown.findElements(By.tagName("option"));
		System.out.println(option.size());
		option.get(2).click();

		// select year
		dropdown = driver.findElement(By.xpath("//*[@id='wrapper']/table[2]/tbody/tr[23]/td[3]/select[3]"));
		option = dropdown.findElements(By.tagName("option"));
		System.out.println(option.size());
		option.get(35).click();

		// select gender
		driver.findElement(By.xpath("//*[@id='wrapper']/table[2]/tbody/tr[25]/td[3]/input[2]")).click();

		// select country
		dropdown = driver.findElement(By.xpath("//*[@id='country']"));
		option = dropdown.findElements(By.tagName("option"));
		System.out.println(option.size());
		option.get(216).click();
	}

}
