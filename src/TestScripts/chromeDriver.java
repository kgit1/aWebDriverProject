package TestScripts;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class chromeDriver {

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
		driver.get("http://www.google.com");
		
		//maximize opened window
		driver.manage().window().maximize();
		
		
		
		
		
	}

}
