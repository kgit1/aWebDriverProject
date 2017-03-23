package TestScripts1;

import java.io.File;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;

public class RunGoogleChromeWithExtension {

	public static void main(String[] args) {

		// add path driver for chrome browser self navigate to project root lib
		// folder
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "/drivers/chromedriver.exe");

		// The main interface to use for testing, which represents an idealised
		// web browser.
		WebDriver driver = new ChromeDriver();

		//Following code is to define Google Chrome options.
		ChromeOptions chromeOptions = new ChromeOptions();
		//Following code is to add addon/extension to Google Chrome options.
		chromeOptions.addExtensions(new File(System.getProperty("user.dir") + "/drivers/xpath.crx"));

		//Following code is to define Google Chrome capability.
		DesiredCapabilities capabilities = DesiredCapabilities.chrome();
		//Following code is to set Google Chrome capability.
		capabilities.setCapability(ChromeOptions.CAPABILITY, chromeOptions);
		//Following code is to initialize the chrome driver with capabilities
		driver = new ChromeDriver(capabilities);

		driver.get("http://www.helloselenium.com");

//		driver.quit();
	}
}

// To create .crx file for any extension install the extension in Google Chrome
// browser from Chrome Web Store.

// Access the local folder path of chrome extension and copy the complete path
// C:\Users\MYUSER\AppData\Local\Google\Chrome\User
// Data\Default\Extensions\fdmmgilgnpjigdojojpjoooidkmcomcm\0.8.4.9_0.

// Enable Developer mode on Chrome Extension page.

// Click on Pack Extension button and enter the copied local folder path of your
// desired extension in Extension Root Directory field.

// Click on Pack Extension button in pop up and verify the .crx file at location
// mentioned in confirmation pop up.
