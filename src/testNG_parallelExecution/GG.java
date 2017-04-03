package testNG_parallelExecution;

import java.awt.AWTException;
import java.awt.Robot;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

public class GG {

	@Test
	public void startGG() throws InterruptedException, AWTException {
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "/drivers/chromedriver.exe");

		for (int i = 0; i < 10; i++) {
			ChromeOptions options = new ChromeOptions();
			options.addArguments("--mute-audio");

			WebDriver driver = new ChromeDriver(options);
			driver.get("https://goodgame.ru/channel/ZERG/#autoplay");
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);

			Point coordinates = driver.findElement(By.xpath("//*[@id='_qualitySwitch']")).getLocation();
			System.out.println("Co-ordinates" + coordinates);
			Robot robot = new Robot();
			System.out.println("move 0");
			robot.mouseMove(coordinates.getX(), coordinates.getY());
			System.out.println("move 20");
			robot.mouseMove(coordinates.getX() + 20, coordinates.getY() + 10);
			// robot.mousePress( InputEvent.BUTTON1_DOWN_MASK);
			// robot.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
			System.out.println("move 200");
			for (int j = 400; j < 800; j = j + 20) {
				System.out.println(j);
				Thread.sleep(20);
				robot.mouseMove(coordinates.getX() + 500 + j, coordinates.getY() + 20);
			}

			driver.findElement(By.xpath("//*[@id='_qualitySwitch']/div/div[1]")).click();
			driver.findElement(By.xpath("//*[@id='_qualitySwitch']/div/ul/li[5]/a")).click();
		}
	}

	// @Test
	// public void startGG() throws InterruptedException, AWTException {
	// System.setProperty("webdriver.chrome.driver",
	// System.getProperty("user.dir") + "/drivers/chromedriver.exe");
	//
	// // for (int i = 0; i < 10; i++) {
	// ChromeOptions options = new ChromeOptions();
	// options.addArguments("--mute-audio");
	//
	// WebDriver driver = new ChromeDriver(options);
	// driver.get("https://goodgame.ru/channel/ZERG/#autoplay");
	// driver.manage().window().maximize();
	// driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
	//
	// Actions action = new Actions(driver);
	// for (int j = 100; j < 500; j = j + 20) {
	// action.moveToElement(
	// driver.findElement(By.xpath("//*[@id='entire']/div/div[1]/div[2]/div[2]/span[2]/span/a"))).click()
	// // Generates a composite action containing all actions so
	// // far,
	// // ready to be performed (and resets the internal builder
	// // state,
	// // so subsequent calls to build() will contain fresh
	// // sequences).
	// .build()
	// // A convenience method for performing the actions without
	// // calling build() first.(? not working without build first)
	// .perform();
	// }
	// driver.findElement(By.xpath("//*[@id='_qualitySwitch']/div/div[1]")).click();
	// System.out.println("move 300");
	// driver.findElement(By.xpath("//*[@id='_qualitySwitch']/div/ul/li[5]/a")).click();
	// }	
}
