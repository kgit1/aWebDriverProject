package testNG_1;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TestsPriority {

	// priority - lower priorities will be scheduled first.
	@Test(priority = 1)
	public void login() {
		System.out.println("Login");
		Assert.assertEquals("String1", "String2");
	}

	// dependsOnMethods - The list of methods this method depends on. There is
	// no guarantee on the order on which the methods depended upon will be run,
	// but you are guaranteed that all these methods will be run before the test
	// method that contains this annotation is run. Furthermore, if any of these
	// methods was not a SUCCESS, this test method will not be run and will be
	// flagged as a SKIP. If some of these methods have been overloaded, all the
	// overloaded versions will be run.
	@Test(priority = 2, dependsOnMethods = { "login" })
	public void navigating() {
		System.out.println("Navigating");
	}

	@Test(priority = 3, dependsOnMethods = { "login" })
	public void logOut() {
		System.out.println("LogOut");
	}

}
