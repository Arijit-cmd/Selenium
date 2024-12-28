package fileupload;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class UploadFile {
	WebDriver driver;

	@Test
	public void fileattachement() throws InterruptedException {
		driver.get("https://www.w3schools.com/howto/howto_html_file_upload_button.asp");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@id='myFile']")).sendKeys("D:\\GT\\Sliders\\Gangaaram-Slide-1.jpg");
	}

	@BeforeTest
	public void beforeTest() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
	}
}
