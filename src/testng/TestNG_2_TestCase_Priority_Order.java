package testng;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNG_2_TestCase_Priority_Order {
	WebDriver driver;

	@Test(priority = 3)
	public void swiggy() {
		driver.get("https://www.swiggy.com");
	}

	@Test(priority = 2)
	public void jira() {
		driver.get("https://www.jira.com");
	}

	@Test(priority = 1)
	public void selenium() {
		driver.get("https://www.selenium.dev");
	}

	@Test(priority = 5)
	public void redmine() {
		driver.get("https://www.redmine.org");
	}

	@Test(priority = 4)
	public void google() {
		driver.get("https://www.google.com");
	}

	@Test(priority = 0)
	public void twitter() {
		driver.get("https://www.x.com");
	}

	@Test(priority = 6)
	public void zomato() {
		driver.get("https://www.zomato.com");
	}

	@Test(priority = 7)
	public void facebook() {
		driver.get("https://www.facebook.com");
	}

	@BeforeTest
	public void beforeTest() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
	}

	@AfterTest
	public void afterTest() {
		driver.quit();
	}

}
