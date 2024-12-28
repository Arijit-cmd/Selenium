package junitframework;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

class DemoJunitOne {

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

	@Test
	void google() {
		driver.get("https://www.google.com");
	}

	@Test
	void facebook() {
		driver.get("https://www.facebook.com");
	}

	@Test
	void selenium() {
		driver.get("https://www.selenium.dev");
	}

	@Test
	void jira() {
		driver.get("https://www.jira.com");
	}

	@Test
	void techlearn() {
		driver.get("https://www.techlearn.in");
	}

	@Test
	void redmine() {
		driver.get("https://www.redmine.org");
	}

}
