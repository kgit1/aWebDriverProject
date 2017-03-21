package TestScripts2;

import java.io.File;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.ClickAction;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.Select;

public class RadioButtonsCheckBoxes {

	public static void main(String[] args) throws InterruptedException {
		// add path driver for chrome browser self navigate to project root lib
		// folder
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "/drivers/chromedriver.exe");

		// The main interface to use for testing, which represents an idealised
		// web browser.
		WebDriver driver = new ChromeDriver();

		// open www.echoecho.com/htmlforms10.htm
		driver.get("http://www.echoecho.com/htmlforms10.htm");
		driver.manage().window().maximize();
		// driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

		// get web element by xpath
		WebElement el = driver
				.findElement(By.xpath("//*/table[3]/tbody/tr/td/table/tbody/tr/td[@class='table5']/input[1]"));

		// get list of elements with back on 1 level xpath
		List<WebElement> list = driver
				.findElements(By.xpath("//*/table[3]/tbody/tr/td/table/tbody/tr/td[@class='table5']/input"));

		// text on element if exists
		System.out.println("| " + el.getText());
		// string value of elements attribute "value"
		System.out.println("| " + el.getAttribute("value"));

		// size of the list of webelements
		System.out.println(list.size());

		// print string value of attribute of certain element of the list of web
		// elements
		System.out.println("| " + list.get(1).getAttribute("value"));

		// get list of elements with back on 1 level xpath with refirement on
		// input - [@name='group1']
		list = driver.findElements(
				By.xpath("//*/table[3]/tbody/tr/td/table/tbody/tr/td[@class='table5']/input[@name='group1']"));
		for (WebElement webElement : list) {
			System.out.println(" - " + webElement.getAttribute("value"));
		}
		System.out.println("=============");

		// get list of elements with back on 1 level xpath with refirement on
		// input - [@name='group2']
		list = driver.findElements(
				By.xpath("//*/table[3]/tbody/tr/td/table/tbody/tr/td[@class='table5']/input[@name='group2']"));
		for (WebElement webElement : list) {
			System.out.println(" - " + webElement.getAttribute("value"));
		}

		//return selected webElement from list(radio buttons in example)
		// xpath short version
		// get list of elements with back on 1 level xpath with refinement on
		// input - [@name='group2']
		list = driver.findElements(By.xpath("//*/input[@name='group2']"));
		for (WebElement webElement : list) {
			if (webElement.isSelected()) {
				System.out.println(" selected " + webElement.getAttribute("value"));
			}
		}
		
		//find webElement with attribute value = Water and click it
		list = driver.findElements(By.xpath("//*/input[@name='group2']"));
		for (WebElement webElement : list) {
			if (webElement.getAttribute("value").equals("Water")) {
				webElement.click();
			}
		}
		
		//recheck which webElement selected now
		list = driver.findElements(By.xpath("//*/input[@name='group2']"));
		for (WebElement webElement : list) {
			if (webElement.isSelected()) {
				System.out.println(" selected " + webElement.getAttribute("value"));
			}
		}

	}
}
