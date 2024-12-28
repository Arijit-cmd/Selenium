package screenshots;

import java.io.File;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class SelectedWebElementScreenshot {
	WebDriver driver;

	@Test
	public void TakeScreenShot() throws Exception {
		driver.get("https://www.google.com/");
		Thread.sleep(3000);

		WebElement logo = driver.findElement(By.xpath("//a[@aria-label='Gmail ']"));

		File f = logo.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(f, new File("D:\\Arijit\\Screenshots\\gm.png"));

		/*
		 * WebElement search = driver.findElement(By.name("q"));
		 * search.sendKeys("TestNG");
		 */

		// driver.findElement(By.name("q")).sendKeys("TestNG");
	}

	@BeforeTest
	public void beforeTest() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
	}

}
