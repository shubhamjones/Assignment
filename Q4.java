import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

public class Q4 {

	@BeforeSuite
	public static void beforeSuite() {
		System.out.println("before suite");
	}

	@BeforeTest
	public static void beforeTest() {
		System.out.println("before test");
	}

	@BeforeClass
	public static void beforeClass() {
		System.out.println("before class TestingTestNG");
	}

	@BeforeMethod
	public static void beforeMethod() {
		System.out.println("before every method");
	}

	@Test
	public static void Test1() {
		System.out.println("inside test 1");
	}

	@Test
	public static void Test2() {
		System.out.println("inside test 2");
	}

	@AfterMethod
	public static void afterMethod() {
		System.out.println("after every method");
	}

	@AfterClass
	public static void afterClass() {
		System.out.println(" after class TestingTestNG");
	}

	@AfterTest
	public static void afterTest() {
		System.out.println(" after test");
	}

	@AfterSuite
	public static void afterSuite() {
		System.out.println("After suite");
	}

}