package TestScripts2;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

//to hide our password to be stored in open condition in program, we can
// store just encoded version and use method password() where we need the
// password, which decodes and returns password value
//to do this we have password class with password() method
public class PasswordEncodeDecode {

	public static void main(String[] args) {
		// add path driver for chrome browser self navigate to project root lib
		// folder
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "/drivers/chromedriver.exe");
		// The main interface to use for testing, which represents an idealised
		// web browser.
		WebDriver driver = new ChromeDriver();

		// open http://rediff.com
		driver.get("http://rediff.com");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

		driver.findElement(By.xpath("//*[@id='signin_info']/a[1]")).click();
		driver.findElement(By.xpath("//*[@id='login1']")).sendKeys("appautomator@rediffmail.com");
		driver.findElement(By.xpath("//*[@id='password']")).sendKeys(Password.password());
		driver.findElement(By.xpath("//div/div[2]/div[2]/div[1]/div/form/div/div[6]/div[1]/input")).click();
	}

}
