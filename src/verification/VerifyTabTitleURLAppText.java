package verification;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class VerifyTabTitleURLAppText {
	WebDriver driver;

	@Test
	public void verifyTabTitle() {
		driver.get("https://www.google.com");

		String exptabtitle = "Google";
		System.out.println("Expcted Tab title is :" + exptabtitle);

		String acttabtitle = driver.getTitle();
		System.out.println("Actual Tab title is :" + acttabtitle);

		Assert.assertEquals(acttabtitle, exptabtitle);

	}

	@Test
	public void verifyAppURL() {
		driver.get("https://www.google.com");

		String expurl = "https://www.google.com/";

		String acturl = driver.getCurrentUrl();

		Assert.assertEquals(acturl, expurl);

	}

	@Test
	public void verifyApptext() {
		driver.get("https://www.google.com");

		String expgmtext = "Gmail";
		String actgmtext = driver.findElement(By.xpath("//a[contains(@aria-label,'Gmail')]")).getText();
		Assert.assertEquals(actgmtext, expgmtext);

		String expimgtext = "Images";
		String actimgtext = driver.findElement(By.xpath("//a[@aria-label='Search for Images ']")).getText();
		Assert.assertEquals(actimgtext, expimgtext);

	}

	@BeforeTest
	public void beforeTest() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
	}

}
