package testng;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNG_9_Groups_Regression_Smoke {
	WebDriver driver;

	@Test(groups = { "Food", "PMT" })
	public void swiggy() {
		driver.get("https://www.swiggy.com");
	}

	@Test(groups = { "BugTracking", "PMT" })
	public void jira() {
		driver.get("https://www.jira.com");
	}

	@Test(groups = "Tech")
	public void selenium() {
		driver.get("https://www.selenium.dev");
	}

	@Test(groups = "BugTracking")
	public void redmine() {
		driver.get("https://www.redmine.org");
	}

	@Test(groups = "Search")
	public void google() {
		driver.get("https://www.google.com");
	}

	@Test(groups = "Social")
	public void twitter() {
		driver.get("https://www.x.com");
	}

	@Test(groups = "Food")
	public void zomato() {
		driver.get("https://www.zomato.com");
	}

	@Test(groups = "Social")
	public void facebook() {
		driver.get("https://www.facebook.com");
	}

	@BeforeTest(groups = "PMT")
	public void beforeTest() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
	}

	@AfterTest
	public void afterTest() {
		driver.quit();
	}

}
