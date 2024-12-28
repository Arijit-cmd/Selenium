package testng;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

public class TestNG_4_DescriptionFeature {
	WebDriver driver;

	@Test(priority = 3, enabled = false, description = "Swiggy")
	public void TC1() {
		driver.get("www.swiggy.com");
	}

	@Test(enabled = false, priority = 2, description = "Jira")
	public void TC2() {
		driver.get("https://www.jira.com");
	}

	@Test(priority = 1, description = "Selenium")
	public void TC3() {
		driver.get("www.selenium.dev");
	}

	@Ignore
	@Test(description = "Redmine", priority = 5)
	public void TC4() {
		driver.get("www.redmine.org");
	}

	@Test(priority = 4, description = "Google")
	public void TC5() {
		driver.get("https://www.google.com");
	}

	@Test(priority = 0, description = "Twitter", enabled = true)
	public void TC6() {
		driver.get("www.x.com");
	}

	@Ignore
	@Test(priority = 6, description = "Zomato")
	public void TC7() {
		driver.get("https://www.zomato.com");
	}

	@Test(priority = 7, description = "Facebook")
	public void TC8() {
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
