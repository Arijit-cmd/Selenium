package alerts;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class SimpleConfirmationPromptAlerts {
	WebDriver driver;

	@Test
	// Simple Alert omly ok button
	public void alertokbutton() throws InterruptedException {
		driver.get("https://www.techlearn.in/code/confirmation-dialog-box/");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@onclick='myFunction()']")).click();
		Thread.sleep(2000);
		driver.switchTo().alert().accept();

	}

	@Test
	// Confirmation Alert ok and cancel button
	public void alertcancelbutton() throws InterruptedException {
		driver.get("https://www.techlearn.in/code/confirmation-dialog-box/");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@onclick='myFunction()']")).click();
		Thread.sleep(2000);
		driver.switchTo().alert().dismiss();

	}

	@Test
	// Prompt Alert
	public void alertsendtextokcancelbutton() throws InterruptedException {
		driver.get("https://www.techlearn.in/code/prompt-dialog-box/");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@onclick='myFunction()']")).click();
		Thread.sleep(2000);

		Alert alt = driver.switchTo().alert();
		alt.sendKeys("Arijit");
		alt.accept();

		/*
		 * driver.switchTo().alert().sendKeys("Kolkata");
		 * driver.switchTo().alert().accept();
		 */

	}

	@Test
	// NoAlertPresentException
	public void noalert() throws InterruptedException {
		driver.get("https://www.techlearn.in/");
		Thread.sleep(2000);

		Alert alt = driver.switchTo().alert();
		alt.sendKeys("Arijit");
		alt.accept();

		/*
		 * driver.switchTo().alert().sendKeys("Kolkata");
		 * driver.switchTo().alert().accept();
		 */

	}

	@BeforeTest
	public void beforeTest() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
	}

}
