package testScripts_2;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IFrame {

	public static void main(String[] args) throws InterruptedException {
		// add path driver for chrome browser self navigate to project root lib
		// folder
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "/drivers/chromedriver.exe");

		// The main interface to use for testing, which represents an idealised
		// web browser.
		WebDriver driver = new ChromeDriver();

		// open www.jqueryui.com/draggable/
		driver.get("http://www.jqueryui.com/draggable/");
		driver.manage().window().maximize();
		// driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

		List<WebElement> list = driver.findElements(By.tagName("iframe"));

		System.out.println(list.size());

		// to switch driver to needed frame
		System.out.println("///////// 1ST METHOD ////////////");
		// 1st method
		// we have 1 frame on page - so switch to element at first position
		// transfer position of element to frame() method on the switchTo()
		// method
		driver.switchTo().frame(0);

		// select element on this iframe
		WebElement element = driver.findElement(By.xpath("//*[@id='draggable']"));

		// print text from selected element on iframe to which we switched
		System.out.println(element.getText());

		// switch back to default content
		driver.switchTo().defaultContent();

		// get element on default content with xpath
		element = driver.findElement(By.xpath("//*[@id='content']/h1"));

		// print text from element on the default content
		System.out.println(element.getText());

		System.out.println("///////// 2ND METHOD ////////////");

		// 2nd method
		// get webElement of frame and transfer it to frame() method on the
		// switchTo() method
		WebElement frame = driver.findElement(By.xpath("//*[@id='content']/iframe"));

		driver.switchTo().frame(frame);

		// select element on this iframe
		element = driver.findElement(By.xpath("//*[@id='draggable']"));

		// print text from selected element on iframe to which we switched
		System.out.println(element.getText());

		// switch back to default content
		driver.switchTo().defaultContent();

		// get element on default content with xpath
		element = driver.findElement(By.xpath("//*[@id='content']/h1"));

		// print text from element on the default content
		System.out.println(element.getText());

		// System.out.println("///////// 3RD METHOD ////////////");
		// 3rd method
		// driver.switchTo().frame("frame name or id");

		// There is also possibility to use WebDriverWait with
		// ExpectedConditions (to make sure that Frame will be available).
		//
		// With string as parameter
		// (new
		// WebDriverWait(driver,5)).until(ExpectedConditions.frameToBeAvailableAndSwitchToIt("frame-name"));
		// With locator as a parameter
		// (new WebDriverWait(driver,
		// 5)).until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(By.id("frame-id")));
	}
}
