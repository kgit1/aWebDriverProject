package TestScripts;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

public class edgeDriver {

	public static void main(String[] args) {

		// add path driver for edge browser self navigate to project root drivers
		// folder
		System.setProperty("webdriver.edge.driver",
				System.getProperty("user.dir") + "/drivers/MicrosoftWebDriverInsider.exe");

		// public interface WebDriver
		// extends SearchContext
		// The main interface to use for testing, which represents an idealised
		// web browser.

		WebDriver driver = new EdgeDriver();
		// ??DesiredCapabilities capabilities = DesiredCapabilities.edge();
		// WebDriver driver = new EdgeDriver(capabilities);

		// visit google.com(don't forget http:// at begining)
		driver.get("http://www.google.com");

		// maximize opened window
		driver.manage().window().maximize();

	}

}
