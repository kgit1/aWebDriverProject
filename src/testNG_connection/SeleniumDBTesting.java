package testNG_connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumDBTesting {

	public static void main(String[] args) {

		// Testdata
		String email = "vivek@rediffmail.com";
		String name = "vivek";
		String fullname = "rediff";

		// Input using selenium
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "/drivers/chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("http://mailing.dollartree.com/user/signup.jsp");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

		driver.findElement(By.xpath("//*[@id='emailAddress']")).sendKeys(email);
		driver.findElement(By.xpath("//*[@id='zipCode']")).sendKeys("52431");
		driver.findElement(By.xpath("//*[@id='firstName']")).sendKeys(name);
		driver.findElement(By.xpath("//*[@id='lastName']")).sendKeys(fullname);
		
		driver.findElement(By.xpath("//*[@id='subscribeForm']/div[2]/input[3]")).click();
		driver.findElement(By.xpath("//*[@id='subscribeForm']/div[3]/input[2]")).click();

		// Database connection
		Connection connection = null;

		String url = "jdbc:mysql://localhost:3306/";
		String dabaseName = "spitter";
		String user = "root";
		String password = "123456";

		try {
			// It initialize the class "com.mysql.jdbc.Driver" if found in the
			// classpath, this imply that the driver is registered in the JDBC
			// driver manager since the registration process is inside the
			// static initializer of the driver class ...
			//
			// There is another approach you can use to register a driver : is
			// to use
			// the static DriverManager.registerDriver() method.
			Class.forName("com.mysql.jdbc.Driver");

			connection = DriverManager.getConnection(url + dabaseName, user, password);

			String sqlQuery = "select * from spitter";

			Statement statement = connection.createStatement();

			ResultSet result = statement.executeQuery(sqlQuery);

			result.next();
			System.out.println(result.getString(1));
			System.out.println(result.getString(2));
			System.out.println(result.getString(3));
			System.out.println(result.getString(4));
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			// the safe pattern in Java is to close your ResultSet, Statement,
			// and Connection (in that order) in a finally block
			// if (result != null) {
			// try {
			// result.close();
			// } catch (SQLException e) { /* ignored */}
			// }
			// if (statement != null) {
			// try {
			// statement.close();
			// } catch (SQLException e) { /* ignored */}
			// }
			if (connection != null) {
				try {
					connection.close();
				} catch (SQLException e) {
					/* ignored */}
			}
		}

	}

}
