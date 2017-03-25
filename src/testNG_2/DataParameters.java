package testNG_2;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataParameters {

	@Test(dataProvider = "testData")
	public void registerUser(String firstName, String lastName, String email, String password) {
		System.out.println(firstName);
		System.out.println(lastName);
		System.out.println(email);
		System.out.println(password);
	}

	// Mark a method as supplying data for a test method. The data provider name
	// defaults to method name. The annotated method must return an Object[][]
	// where each Object[] can be assigned the parameter list of the test
	// method. The @Test method that wants to receive data from this
	// DataProvider needs to use a dataProvider name equals to the name of this
	// annotation
	@DataProvider
	public Object[][] testData() {
		Object[][] obj = new Object[3][4];
		obj[0][0] = "rahul";
		obj[0][1] = "singh";
		obj[0][2] = "ra@gmail.com";
		obj[0][3] = "123";

		obj[1][0] = "saurav";
		obj[1][1] = "singh";
		obj[1][2] = "test1@gmail.com";
		obj[1][3] = "12345";

		obj[2][0] = "vaibhav";
		obj[2][1] = "singh";
		obj[2][2] = "test@gmail.com";
		obj[2][3] = "pass123";

		return obj;
	}

}
