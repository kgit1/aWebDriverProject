package testNG_Log4j;

import java.util.concurrent.TimeUnit;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TestingLog4j {

	Logger logger;

	@Test
	public void testLogs() {
		// To explicitly configure Commons Logging to use Log4J, set the
		// org.apache.commons.logging.Log property to
		// org.apache.commons.logging.impl.Log4JLogger with the following
		// statement:
		System.setProperty("org.apache.commons.logging.Log", "org.apache.commons.logging.impl.Jdk14Logger");

		logger = Logger.getLogger("devpinoyLogger");

		logger.debug("Starting of Selenium tests");

		// add path driver for chrome browser self navigate to project root lib
		// folder
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "/drivers/chromedriver.exe");

		logger.debug("Chrome browser openning");
		// The main interface to use for testing, which represents an idealised
		// web browser.
		WebDriver driver = new ChromeDriver();

		logger.debug("Navigate to google");
		driver.get("http://google.com");
		logger.debug("Maximize window");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

	}

}
