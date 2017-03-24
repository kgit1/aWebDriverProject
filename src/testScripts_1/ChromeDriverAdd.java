package testScripts_1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChromeDriverAdd {

	public static void main(String[] args) {
		
		//add path driver for chrome browser hardcoded
		// System.setProperty("webdriver.chrome.driver",
		// "D:/JavaProjects/selenium-java-3.3.1/chromedriver.exe");
		
		//add path driver for chrome browser self navigate to project root lib folder
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"/drivers/chromedriver.exe");
		
		// public interface WebDriver
		// extends SearchContext
		// The main interface to use for testing, which represents an idealised
		// web browser. 
		WebDriver driver = new ChromeDriver();
		
		//visit google.com(don't forget http:// at begining)
		// void get(java.lang.String url)
		// Load a new web page in the current browser window. This is done using
		// an HTTP GET operation, and the method will block until the load is
		// complete. This will follow redirects issued either by the server or
		// as a meta-redirect from within the returned HTML. Should a
		// meta-redirect "rest" for any duration of time, it is best to wait
		// until this timeout is over, since should the underlying page change
		// whilst your test is executing the results of future calls against
		// this interface will be against the freshly loaded page. Synonym for
		// WebDriver.Navigation.to(String).
		// Parameters:
		// url - The URL to load. It is best to use a fully qualified URL
		driver.get("http://www.google.com");
		
		//maximize opened window
		driver.manage().window().maximize();		
	}
}
