package verification;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Assertioncase {
	// Hard Assertion
	//@Test
	public void login() {
		String s = "Hello";
		String s1 = "Hello1";

		System.out.println("Login Started");
		// Assert.assertEquals(s, s1);
		// Assert.assertEquals(s1, s);
		Assert.assertTrue(s.equals(s1), "String is not equal");
		System.out.println("Login Finished");
	}

	// Soft Assertion
	@Test
	public void login1() {
		String s = "Hello";
		String s1 = "Hello1";

		System.out.println("Login Started");
		SoftAssert sf = new SoftAssert();
		// Assert.assertEquals(s, s1);
		// Assert.assertEquals(s1, s);
		sf.assertEquals(s, s1);
		System.out.println("Login Finished");

		sf.assertEquals(s, s1);
		System.out.println("Login Finished with SF");
		sf.assertAll();
	}
}
