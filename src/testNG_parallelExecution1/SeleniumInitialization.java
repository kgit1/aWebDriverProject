package testNG_parallelExecution1;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

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
	public static ThreadLocal<WebDriver> dr = new ThreadLocal<>();

	@BeforeMethod
	public void beforeMethod() {
//		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "/drivers/chromedriver.exe");

		// create webDriver
		WebDriver driver = new ChromeDriver();

		// give to thread-local to get back copy of it
		setWebDriver(driver);

		// with get method we get local copy of object given to thread local -
		// in our case - we get WebDriver
		getWebDriver().manage().window().maximize();
		getWebDriver().manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	}
//
//	@AfterMethod
//	public void afterMethod() {
//		getWebDriver().close();
//	}

	public WebDriver getWebDriver() {
		return dr.get();
	}

	// method to set variable which be copied by thread-local
	public void setWebDriver(WebDriver driver) {
		dr.set(driver);
	}
}
