package testng;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNG_6_TimeOutFeature {
	WebDriver driver;

	@Test
	public void method1() {
		driver.get("https://www.google.com");
		driver.findElement(By.name("q")).sendKeys("Kolkata");
		driver.findElement(By.name("q")).sendKeys(Keys.ENTER);
		driver.findElement(By.xpath("//div[@id='hdtb-tls']")).click();
		driver.findElement(By.xpath("//span[@class='KTBKoe']")).click();
	}

	@Test(timeOut = 3000)
	public void method2() {
		driver.get("https://www.google.com");
		driver.findElement(By.name("q")).sendKeys("Tirupati");
		driver.findElement(By.name("q")).sendKeys(Keys.ENTER);
		driver.findElement(By.xpath("//div[@id='hdtb-tls']")).click();
		driver.findElement(By.xpath("//span[@class='KTBKoe']")).click();
	}

	@BeforeTest
	public void beforeTest() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
	}

	@AfterTest
	public void afterTest() {
		// driver.quit();
	}

}
