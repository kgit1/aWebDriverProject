package testNG_1;

import static org.testng.Assert.assertEquals;

import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginTest {

	@Test
	public void testLoginViaEmail() {
		System.out.println("Login via Email");
		// Assertion - utverzdenie
		// Assert - Assertion tool class. Presents assertion methods with a more
		// natural parameter order. The order is always actualValue,
		// expectedValue
		// assertEquals(actualValue, expectedValue) - asserts that two valuess
		// are equal. If they are not, an AssertionError is thrown
		// Assert.assertEquals("Vaibhav", "Vaibhav1");

		// Asserts that a condition is true. If it isn't, an AssertionError is
		// thrown
		// Assert.assertTrue(1 > 4);
		// Asserts that a condition is true. If it isn't, an AssertionError is
		// thrown
		Assert.assertFalse(1 > 4);

	}

	@Test
	public void testLoginViaFacebook() {
		System.out.println("Login via facebook");
		// when we need to handle error - to catch and same time allow method to
		// finish
		try {
			Assert.assertEquals("Vaibhav", "Vaibhav1");
		} catch (Throwable t) {
			System.out.println(t);
		}
		System.out.println("Afeter error - Login via facebook");
	}

	@Test
	public void testLoginViaTwitter() {
		System.out.println("Login via Twitter");
	}

}
