package testNG_3;

import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginTest {

	@Test
	public void loginWithEmail() {
		System.out.println("Inside test login with email");
	}

	@Test
	public void loginViaFacebook() {
		System.out.println("Inside test login with facebook");
		Assert.assertEquals("String1", "String2");
	}
}
