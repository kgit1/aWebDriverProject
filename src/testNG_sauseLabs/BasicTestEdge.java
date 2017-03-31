package testNG_sauseLabs;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

public class BasicTestEdge {

	public static final String USERNAME = "alexandrivanov1983";
	public static final String ACCESS_KEY = "ff243ca9-1906-4a4d-8251-814a0fc5b1b4";
	public static final String URL = "https://" + USERNAME + ":" + ACCESS_KEY + "@ondemand.saucelabs.com:443/wd/hub";

	WebDriver driver;

	@Test
	public void loginTest() throws MalformedURLException, InterruptedException {

		System.setProperty("webdriver.edge.driver",
				System.getProperty("user.dir") + "/drivers/MicrosoftWebDriverInsider.exe");

		// DesiredCapabilities help to set properties for the WebDriver
		// Capabilities: Describes a series of key/value pairs that encapsulate
		// aspects of a browser
		DesiredCapabilities caps = DesiredCapabilities.edge();
		caps.setCapability("platform", "Windows 10");
		caps.setCapability("version", "13.10586");

		WebDriver driver = new RemoteWebDriver(new URL(URL), caps);

		Thread.sleep(5000);
		driver.get("http://rediff.com");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

		driver.findElement(By.xpath("//*[@id='signin_info']/a[1]")).click();

		driver.quit();
	}

}
