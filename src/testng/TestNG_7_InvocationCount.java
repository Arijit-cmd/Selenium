package testng;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNG_7_InvocationCount {
	WebDriver driver;

	@Test
	public void method1() {
		driver.get("https://www.google.com");
		driver.findElement(By.name("q")).sendKeys("Kolkata");
		driver.findElement(By.name("q")).sendKeys(Keys.ENTER);
		driver.findElement(By.xpath("//div[@id='hdtb-tls']")).click();
		driver.findElement(By.xpath("//span[@class='KTBKoe']")).click();
	}

	@Test
	public void method3() {
		driver.get("https://www.google.com");
		driver.findElement(By.name("q")).sendKeys("Bengalure");
		driver.findElement(By.name("q")).sendKeys(Keys.ENTER);
		driver.findElement(By.xpath("//div[@id='hdtb-tls']")).click();
		driver.findElement(By.xpath("//span[@class='KTBKoe']")).click();
	}

	@Test(invocationCount = 3)
	public void method2() {
		driver.get("https://www.google.com");
		driver.findElement(By.name("q")).sendKeys("Selenium");
		driver.findElement(By.name("q")).sendKeys(Keys.ENTER);
		driver.findElement(By.xpath("//div[@id='hdtb-tls']")).click();
		driver.findElement(By.xpath("//span[@class='KTBKoe']")).click();
	}

	@Test
	public void method4() {
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
