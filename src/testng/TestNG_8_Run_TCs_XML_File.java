package testng;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNG_8_Run_TCs_XML_File {

	WebDriver driver;

	@Test
	public void swiggy() {
		driver.get("https://www.swiggy.com");
	}

	@Test
	public void jira() {
		driver.get("https://www.jira.com");
	}

	@Test
	public void selenium() {
		driver.get("https://www.selenium.dev");
	}

	@Test
	public void redmine() {
		driver.get("https://www.redmine.org");
	}

	@Test
	public void google() {
		driver.get("https://www.google.com");
	}

	@Test
	public void twitter() {
		driver.get("https://www.x.com");
	}

	@Test
	public void zomato() {
		driver.get("https://www.zomato.com");
	}

	@Test
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
