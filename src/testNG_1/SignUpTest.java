package testNG_1;

import org.testng.SkipException;
import org.testng.annotations.Test;

public class SignUpTest {

	@Test
	public void signUpViaEmail() {
		System.out.println("SignUp via Email");
	}

	@Test
	public void signUpViaFacebook() {
		System.out.println("SignUp via Facebook");
		throw new SkipException("Facebook functionality is not supported");
	}

	@Test
	public void signUpViaTwitter() {
		System.out.println("SignUp via Twitter");
	}

}
