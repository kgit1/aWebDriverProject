package testNG_1;

import org.testng.annotations.Test;

public class LoginTest {

	@Test
	public void testLoginViaEmail() {
		System.out.println("Login via Email");
	}

	@Test
	public void testLoginViaFacebook() {
		System.out.println("Login via facebook");
	}

	@Test
	public void testLoginViaTwitter() {
		System.out.println("Login via Twitter");
	}

}
