package TestScripts2;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.ClickAction;

public class DynamicXPaths {

	public static void main(String[] args) throws InterruptedException {
		// add path driver for chrome browser self navigate to project root lib
		// folder
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "/drivers/chromedriver.exe");

		// The main interface to use for testing, which represents an idealised
		// web browser.
		WebDriver driver = new ChromeDriver();

		// open yahoo.com
		driver.get("http://yahoo.com");

		driver.manage().window().maximize();

		driver.findElement(By.xpath("//*[@id='uh-search-box']")).sendKeys("Selenium");
		Thread.sleep(3000);

		//get few times xpath of dynamic element by refreshing page
		// *[@id="yui_3_18_0_4_1490046045009_1253"]
		// *[@id="yui_3_18_0_4_1490046045009_1249"]
		// *[@id="yui_3_18_0_4_1490046086231_1245"]
		//*[@id="yui_3_18_0_4_1490046412869_1279"]
		
		//*[@id="yui_3_18_0_4_1490046484647_1306"]
		//*[@id="yui_3_18_0_4_1490046549257_1279"]
		//*[@id="yui_3_18_0_4_1490046568776_1295"]
		//*[@id="yui_3_18_0_4_1490046607771_1228"]
		//*[@id="yui_3_18_0_4_1490047031029_259"]
//		List<WebElement> list = driver.findElements(By.xpath("//*[contains(@class,'yui3-aclist-item')]/li"));
//		contains(@id,starts-with('uh-assist-link'))
		List<WebElement> list = driver.findElements(By.xpath("//*[@id='uh-search']/form/table/tbody/tr/td/div/div/ul/li"));


		list.get(4).click();
		for (WebElement webElement : list) {
			System.out.println("tag name: "+webElement.getTagName());
		}

	}

}
