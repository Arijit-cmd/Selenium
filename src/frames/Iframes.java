package frames;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Iframes {
	WebDriver driver;

	@Test
	public void frames() throws InterruptedException {
		driver.get("https://www.w3schools.com/js/tryit.asp?filename=tryjs_alert");
		Thread.sleep(1000);

		/*
		 * Webelement approach WebElement obj =
		 * driver.findElement(By.xpath("//*[@id=\"iframeResult\"]"));
		 * driver.switchTo().frame(obj);
		 */
		// Index approach not recommended
		// driver.switchTo().frame(2);

		// String id/name approach
		driver.switchTo().frame("iframeResult");

		driver.findElement(By.xpath("/html/body/button")).click();
		Thread.sleep(1000);

		driver.switchTo().alert().accept();

		driver.switchTo().defaultContent(); // any frame to main page

		// driver.switchTo().parentFrame(); // any frames immediate parent frame

		driver.findElement(By.xpath("//*[@id=\"getwebsitebtn\"]")).click();
	}

	@BeforeTest
	public void beforeTest() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
	}
}
