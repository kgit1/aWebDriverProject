package testScripts_2;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MoveSliderAndResizable {

	public static void main(String[] args) throws InterruptedException {
		// add path driver for chrome browser self navigate to project root lib
		// folder
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "/drivers/chromedriver.exe");

		// The main interface to use for testing, which represents an idealised
		// web browser.
		WebDriver driver = new ChromeDriver();

		// open www.jqueryui.com/draggable/
		driver.get("http://www.jqueryui.com/slider/");
		driver.manage().window().maximize();
		// specifies the amount of time the driver should wait when searching
		// for an element if it is not immediately present.
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

		driver.switchTo().frame(driver.findElement(By.tagName("iframe")));

		WebElement slider = driver.findElement(By.xpath("//*[@id='slider']/span"));

		// to drag element we need Actions object
		// transfer our driver to Actions object
		Actions action = new Actions(driver);

		// use method moveTo() of actions to select our drag element
		// use method dragAndDropBy to take chosen element and drag it by 150px
		// x direction and 50 y direction
		// use methods build() to build our action and perform() to perform
		// programmed action

		//move slider 250 right
		action.moveToElement(slider).dragAndDropBy(slider, 250, 0).build().perform();
		Thread.sleep(5000);
		//move slider 250 left
		action.moveToElement(slider).dragAndDropBy(slider, -250, 0).build().perform();
		Thread.sleep(5000);
		//move slider 50 right
		action.moveToElement(slider).dragAndDropBy(slider, 50, 0).build().perform();
		Thread.sleep(5000);
		
		
		//get new page
		driver.get("http://www.jqueryui.com/resizable/");
		driver.manage().window().maximize();
		// specifies the amount of time the driver should wait when searching
		// for an element if it is not immediately present.
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

		driver.switchTo().frame(driver.findElement(By.tagName("iframe")));

		//get dragable piece of resizable element
		WebElement corner = driver.findElement(By.xpath("//*[@id='resizable']/div[3]"));
		
		Actions action1 = new Actions(driver);
		
		//drag corner to resize 
		action1.moveToElement(corner).dragAndDropBy(corner, 100, 50).build().perform();
		// perform click hold and move
		// Actions drag = new Actions(driver);
		// drag.clickAndHold(all_source_element).build().perform();
		// Thread.sleep(3500);
		// drag.clickAndHold().moveToElement(destination).release(destination).build().perform();
		// Thread.sleep(3500);
	}
}
