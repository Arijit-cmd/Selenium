package screenshots;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TimeformatScreenshot {
	WebDriver driver;

	public void TakeScreenshot() throws IOException {
		SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy_MMM_dd HH_mm_ss");
		Date date = new Date();
		String time = dateFormat.format(date);

		File f = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(f, new File("D:\\Arijit\\Screenshots\\Google_" + time + ".png"));
	}

	@Test
	public void googlesearch() throws Exception {
		driver.get("https://www.google.com");
		Thread.sleep(2000);
		TakeScreenshot();
		driver.findElement(By.name("q")).sendKeys("Kolkata");
		Thread.sleep(1000);
		TakeScreenshot();
		driver.findElement(By.name("q")).sendKeys(Keys.ENTER);
		Thread.sleep(1000);
		TakeScreenshot();
		driver.findElement(By.id("hdtb-tls")).click();
		Thread.sleep(2000);
		TakeScreenshot();
		driver.findElement(By.xpath("//span[@class=\"KTBKoe\"]")).click();
		Thread.sleep(1000);
		TakeScreenshot();
	}

	@Test(enabled = false)
	public void facebook() throws Exception {
		driver.get("http://seleniumlearn.com/selenium-commands");
		Thread.sleep(6000);
		TakeScreenshot();

		String selectalltext = Keys.chord(Keys.CONTROL, "a"); // select all text in techlearn.in home page
		driver.findElement(By.xpath("//*[@id=\"edit-submit\"]")).sendKeys(selectalltext);
		TakeScreenshot();
	}

	@BeforeTest
	public void beforeTest() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
	}

}
