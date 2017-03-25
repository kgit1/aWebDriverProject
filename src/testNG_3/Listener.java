package testNG_3;

import org.testng.ITestResult;
import org.testng.TestListenerAdapter;

//TestListenerAdapter - A simple ITestListener adapter that stores all the tests that were run. 
//You can retrieve these results with the following methods: getPassedTests() getFailedTests() 
//getSkippedTests() If you extend this class in order to override any of these methods, 
//remember to call their super equivalent if you want this list of tests to be maintained.
public class Listener extends TestListenerAdapter {

	public void onTestSuccess(ITestResult tr) {
		System.out.println("Test passed");
	}

	public void onTestFailure(ITestResult tr){
		System.out.println("Test failed");
	}
}
