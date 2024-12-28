package launchbrowsers;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BasicMethods {
	static WebDriver driver;

	public static void main(String[] args) throws Exception {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		Thread.sleep(2000);
	//	driver.manage().window().minimize();// Selenium 4 Version
	//	driver.manage().window().fullscreen();// Selenium 4 Version
    	driver.close();
		
	//	driver.quit();
	}
}
