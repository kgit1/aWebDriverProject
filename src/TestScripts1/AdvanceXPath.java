package TestScripts1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AdvanceXPath {

	public static void main(String[] args) {
		// add path driver for chrome browser self navigate to project root lib
		// folder
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "/drivers/chromedriver.exe");

		// The main interface to use for testing, which represents an idealised
		// web browser.
		WebDriver driver = new ChromeDriver();

		driver.get("http://w3Schools.com");
		// driver.get("http://google.com");
		driver.manage().window().maximize();

		// find element tag 'a' inside id mySidenav with text learn CSS
		// driver.findElement(By.xpath("//*[@id='mySidenav']/a[text()='Learn
		// CSS']")).click();;

		// find element by xpath
		// driver.findElement(By.xpath("//*[@id='gb_70']")).click();

		// find same element by formula -
		// "//" means any where on page
		// "a" meant with tag "a"
		// "starts-with()" method for starts with mask were we giving partial or
		// full info
		// in our case starts-with(@id,'gb_7') - element id with name gb_7
		// driver.findElement(By.xpath("//a[starts-with(@id,'gb_7')]")).click();

		//start of an id 
		//By.CssSelector("id^=default-create-firstname")
		// ends-with CSS selector:
		//By.cssSelector("[id$=default-create-firstname]")
		
		// find element with tag "a" wich contains id with name which has or
		// equals to "b_7"
		// driver.findElement(By.xpath("//a[contains(@id,'b_7')]")).click();

		// *[@id="mySidenav"]/a[17]

		// something with id mySidenav has element a which has text which starts
		// with Learn SQL
		// driver.findElement(By.xpath("//*[@id='mySidenav']/a[starts-with(text(),'Learn
		// SQL')]")).click();

		// something with id mySidenav has element a which contains texts with
		// 'SQL' inside
		// driver.findElement(By.xpath("//*[@id='mySidenav']/a[contains(text(),'SQL')]")).click();

		// html->body->div 6->div 1->div->1->a last-1
		// driver.findElement(By.xpath("//div[6]/div[1]/div[1]/a[last()]")).click();

		// html->body->div 6->div 1->div->1->a last
		// driver.findElement(By.xpath("//div[6]/div[1]/div[1]/a[last()-1]")).click();

		// html->body->div 6->div 1->div->1->a element on position 1
		driver.findElement(By.xpath("//div[6]/div[1]/div[1]/a[position()='1']")).click();
	}

}
