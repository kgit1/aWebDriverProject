package testNG_1;

import org.testng.annotations.Test;

public class PaymentTest {

	@Test
	public void paymentInDollar(){
		System.out.println("Payment in Dollar");
	}
	
	@Test
	public void paymentInRupee(){
		System.out.println("Payment in Rupee");
	}
}
