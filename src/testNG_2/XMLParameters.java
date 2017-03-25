package testNG_2;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class XMLParameters {

	@Parameters("email")
	@Test
	public void login(String email) {
		System.out.println("Inside login: " + email);
	}

}
