package screenshots;

import java.io.File;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class ErrorPageScreenshot {
	WebDriver driver;

	public void ErrorPageLineScreenshot() throws Exception {

		File f = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(f, new File("D:\\Arijit\\Screenshots\\FailedScreenshotPage.png"));
	}

	@Test
	public void googlesearch() throws Exception {
		driver.get("https://www.google.com/");

		try {
			driver.findElement(By.name("q")).sendKeys("Kolkata");
			Thread.sleep(1000);

			driver.findElement(By.name("q")).sendKeys(Keys.ENTER);
			Thread.sleep(1000);

			driver.findElement(By.id("hdtb-tl")).click();
			Thread.sleep(1000);

			driver.findElement(By.xpath("//span[@class=\"KTBKoe\"]")).click();
			Thread.sleep(1000);
		}

		catch (Exception e) {
			System.out.println("Error Page: " + e);
			ErrorPageLineScreenshot();
		}

	}

	@BeforeTest
	public void beforeTest() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
	}

}
