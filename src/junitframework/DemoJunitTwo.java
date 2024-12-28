package junitframework;

import org.junit.Ignore;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

class DemoJunitTwo {

	static WebDriver driver;

	@BeforeAll
	static void setUpBeforeClass() throws Exception {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
		driver.quit();
	}

	@Disabled // Only skip the Junit 5 Version
	@Test
	void test1() {
		driver.get("https://www.google.com");
	}

	@Ignore // Only skip the Junit 3 & 4 Versions
	@Test
	void test2() {
		driver.get("https://www.facebook.com");
	}

	@Test
	void test3() {
		driver.get("https://www.selenium.dev");
	}

	@Disabled
	@Test
	void test4() {
		driver.get("https://www.jira.com");
	}

	@Test
	void test5() {
		driver.get("https://www.techlearn.in");
	}

	@Disabled
	@Test
	void test6() {
		driver.get("https://www.redmine.org");
	}

}
