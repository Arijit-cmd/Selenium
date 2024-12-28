package log4j;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Log4j {
	WebDriver driver;

	@Test
	public void googlesearch() {
		Logger log = Logger.getLogger("Search");
		PropertyConfigurator.configure("Log4j.properties");

		driver = new ChromeDriver();
		log.info("Chrome browser launched");

		driver.manage().window().maximize();
		log.info("Browser window maximized");

		driver.get("https://www.google.com");
		log.info("Navigating to the Google Application");

		driver.findElement(By.name("q")).sendKeys("Kolkata");
		log.info("Google search text field enter the text Kolkata");

		driver.findElement(By.name("q")).sendKeys(Keys.ENTER);
		log.info("Enter button pressed");
	}
}
