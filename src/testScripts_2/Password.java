package testScripts_2;

import java.util.Base64;

public class Password {

	// to hide our password to be stored in open condition in program, we can
	// store just encoded version and use method password() where we need the
	// password, which decodes and returns password value
	private static String encodedPassword = "QXBwaXVtMTIz";

	public static String password() {
		return new String(Base64.getDecoder().decode(encodedPassword.getBytes()));
	}

}
