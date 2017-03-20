package TestScripts;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindingElements {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "/drivers/chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		// open page
		driver.get("http://w3schools.com");
		// maximize
		driver.manage().window().maximize();

		// find all elements with certain tag
		List<WebElement> list = driver.findElements(By.tagName("a"));
		// iterate through list
		for (WebElement webElement : list) {
			System.out.println("here");
			// if text on certain element equals to Web Templates
			if (webElement.getText().equals("Web Templates")) {
				System.out.println("there");
				// click element
				webElement.click();
				break;
			}
			// System.out.println("|"+webElement.getText());
		}
	}

}
