package testNG_grid;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

public class SeleniumInitialization {
	// This class provides thread-local variables. These variables differ from
	// their normal counterparts in that each thread that accesses one (via its
	// get or set method) has its own, independently initialized copy of the
	// variable. ThreadLocal instances are typically private static fields in
	// classes that wish to associate state with a thread (e.g., a user ID or
	// Transaction ID).
	// with threadlocal we get local copy of webDriver for every thread
	// to do this use set() method of ThreadLocal which returns threadlocal copy
	// of given variable
	public static ThreadLocal<RemoteWebDriver> dr = new ThreadLocal<>();

	@BeforeMethod
	@Parameters("myBrowser")
	public void beforeMethod(String myBrowser) throws MalformedURLException {
		// selenium grid has own drivers path in node start command
		// System.setProperty("webdriver.chrome.driver",
		// System.getProperty("user.dir") + "/drivers/chromedriver.exe");
		// System.setProperty("webdriver.gecko.driver",
		// "D:/JavaProjects/selenium-java-3.3.1/webDrivers/geckodriver.exe");

		// create webDriver
		RemoteWebDriver driver = null;

		if (myBrowser.equals("chrome")) {
			DesiredCapabilities capability = new DesiredCapabilities().chrome();
			capability.setBrowserName("chrome");
			capability.setPlatform(Platform.WIN10);
			driver = new RemoteWebDriver(new URL("http://localhost:4444/wd/hub"), capability);
		}
		if (myBrowser.equals("firefox")) {
			DesiredCapabilities capability = new DesiredCapabilities().firefox();
			capability.setBrowserName("firefox");
			capability.setPlatform(Platform.WIN10);
			driver = new RemoteWebDriver(new URL("http://localhost:4444/wd/hub"), capability);
		}

		// give to thread-local to get back copy of it
		setWebDriver(driver);

		// with get method we get local copy of object given to thread local -
		// in our case - we get WebDriver
		getWebDriver().manage().window().maximize();
		getWebDriver().manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	}

	@AfterMethod
	public void afterMethod() {
		getWebDriver().close();
	}

	public WebDriver getWebDriver() {
		return dr.get();
	}

	// method to set variable which be copied by thread-local
	public void setWebDriver(RemoteWebDriver driver) {
		dr.set(driver);
	}
}
