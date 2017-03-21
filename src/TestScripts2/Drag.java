package TestScripts2;

import java.io.File;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.interactions.ClickAction;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.Select;

public class Drag {

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
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

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
	}
}
