package testNG_1;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNGAnnotation_1 {

	// testNG configuration annotations
	// @BeforeSuite: The annotated method will be run before all tests in this
	// suite have run.
	// @AfterSuite: The annotated method will be run after all tests in this
	// suite have run.
	// @BeforeTest: The annotated method will be run before any test method
	// belonging to the classes inside the <test> tag is run.
	// @AfterTest: The annotated method will be run after all the test methods
	// belonging to the classes inside the <test> tag have run.
	// @BeforeGroups: The list of groups that this configuration method will run
	// before. This method is guaranteed to run shortly before the first test
	// method that belongs to any of these groups is invoked.
	// @AfterGroups: The list of groups that this configuration method will run
	// after. This method is guaranteed to run shortly after the last test
	// method that belongs to any of these groups is invoked.
	// @BeforeClass: The annotated method will be run before the first test
	// method in the current class is invoked.
	// @AfterClass: The annotated method will be run after all the test methods
	// in the current class have been run.
	// @BeforeMethod: The annotated method will be run before each test method.
	// @AfterMethod: The annotated method will be run after each test method.

	// @Test - mark a class or a method as part of the test.

	// @BeforeSuite
	// public void beforeSuit() {
	// System.out.println("Starting test suite execution");
	// }
	//
	// @AfterSuite
	// public void afterSuit() {
	// System.out.println("Ending test suite execution");
	// }
	//
	// @BeforeTest
	// public void beforeTest() {
	// System.out.println("Start Tests Execution");
	// }
	//
	// @AfterTest
	// public void afterTest() {
	// System.out.println("Stop Tests Execution");
	// }
	//
	// @BeforeClass
	// public void beforeClass() {
	// System.out.println("Initialise selenium driver");
	// }
	//
	// @AfterClass
	// public void afterClass() {
	// System.out.println("Destroy selenium driver");
	// }
	//
	// @BeforeMethod
	// public void beforemethod() {
	// System.out.println("Opening browser");
	// }
	//
	// @AfterMethod
	// public void afterMethod() {
	// System.out.println("Closing browser");
	// }
	//
	// @Test
	// public void test1() {
	// System.out.println("Inside Test 1");
	// }
	//
	// @Test
	// public void test2() {
	// System.out.println("Inside Test 2");
	// }
	//
	// @Test
	// public void test3() {
	//
	// }
}
