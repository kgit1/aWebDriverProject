package testScripts_2;

import java.util.Base64;

public class PasswordEncodeDecodeExample {
	public static void main(String[] args) {

		String password = "Appium123";

		// Base64 - class consists exclusively of static methods for obtaining
		// encoders and decoders for the Base64 encoding scheme.
		// getEncoder() - Returns a Encoder that encodes using the Basic type
		// base64 encoding scheme
		// encode() - Encodes all bytes from the specified byte array into a
		// newly-allocated byte array using the Base64 encoding scheme.
		String encodedPassword = new String(Base64.getEncoder().encode(password.getBytes()));
		System.out.println(encodedPassword);

		// getDecoder() -Returns a Decoder that decodes using the Basic type
		// base64 encoding scheme
		// decode() - Decodes all bytes from the input byte array using the
		// Base64 encoding scheme, writing the results into a newly-allocated
		// output byte array.
		String decodedPassword = new String(Base64.getDecoder().decode(encodedPassword.getBytes()));
		System.out.println(decodedPassword);
	}

}
