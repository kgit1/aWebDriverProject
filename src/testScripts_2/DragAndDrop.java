package testScripts_2;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDrop {

	public static void main(String[] args) throws InterruptedException {
		// add path driver for chrome browser self navigate to project root lib
		// folder
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "/drivers/chromedriver.exe");

		// The main interface to use for testing, which represents an idealised
		// web browser.
		WebDriver driver = new ChromeDriver();

		// open www.jqueryui.com/draggable/
		driver.get("http://www.jqueryui.com/droppable/");
		driver.manage().window().maximize();

		driver.switchTo().frame(driver.findElement(By.tagName("iframe")));

		WebElement drag = driver.findElement(By.xpath("//*[@id='draggable']"));
		System.out.println(drag.getText());

		// to drag element we need Actions object
		// transfer our driver to Actions object
		Actions action = new Actions(driver);
		
		// use method moveTo() of actions to select our drag element
		// use method dragAndDropBy to take chosen element and drag it by 150px
		// x direction and 50 y direction
		// use methods build() to build our action and perform() to perform
		// programmed action
		action.moveToElement(drag).dragAndDropBy(drag, 150, 150).build().perform();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		action.moveToElement(drag).dragAndDrop(drag, driver.findElement(By.xpath("//*[@id='droppable']"))).build()
				.perform();

		// perform click hold and move
		// Actions drag = new Actions(driver);
		// drag.clickAndHold(all_source_element).build().perform();
		// Thread.sleep(3500);
		// drag.clickAndHold().moveToElement(destination).release(destination).build().perform();
		// Thread.sleep(3500);
	}
}
