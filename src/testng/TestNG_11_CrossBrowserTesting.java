package testng;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class TestNG_11_CrossBrowserTesting {

	public WebDriver driver;

	@Parameters({ "browser" })
	@BeforeTest
	public void openBrowser(String browser) {

		try {

			if (browser.equalsIgnoreCase("Chrome")) {
				// System.setProperty("webdriver.chrome.driver","E:\\Libs\\chromedriver_win32\\chromedriver.exe");
				driver = new ChromeDriver();
				driver.manage().window().maximize();
			}

			else if (browser.equalsIgnoreCase("Mozilla")) { //
				//System.setProperty("webdriver.gecko.driver", "drivers\\geckodriver.exe");
				driver = new FirefoxDriver();
				driver.manage().window().maximize();
			}

			else if (browser.equalsIgnoreCase("MicroSoftEdge")) { //
				//System.setProperty("webdriver.edge.driver", "F:\\lib\\msedgedriver.exe");
				driver = new EdgeDriver();
				driver.manage().window().maximize();
			}

			/*
			 * else if (browser.equalsIgnoreCase("IE")) {
			 * System.setProperty("webdriver.ie.driver","D:\\lib\\IEDriverServer.exe");
			 * driver = new InternetExplorerDriver(); }
			 * 
			 * else if (browser.equalsIgnoreCase("opera")) {
			 * System.setProperty("webdriver.opera.driver","D:\\lib\\operadriver.exe");
			 * //--->IE for Windows path driver=new OperaDriver(); }
			 * 
			 * else (browser.equalsIgnoreCase("safari")) {
			 * System.setProperty("webdriver.safari.driver", "D:\\lib\\safariDriver.exe");
			 * //To stop uninstall each time driver = new SafariDriver(); }
			 */

		} catch (WebDriverException e) {
			System.out.println(e.getMessage());
		}
	}

	@Test
	public void googlesearch() throws Exception {

		driver.get("https://www.google.com");
		Thread.sleep(2000);
		driver.findElement(By.name("q")).sendKeys("Crossbrowser Testing in Selenium" + Keys.ENTER);
		// Thread.sleep(5000);

	}

	@Test
	public void facebook() throws Exception {

		driver.get("https://www.facebook.com");
		Thread.sleep(2000);

	}

	@Test
	public void selenium() throws Exception {

		driver.get("https://www.selenium.dev");
		Thread.sleep(2000);

	}

	@Test
	public void googleSelenium() throws Exception {

		driver.get("https://www.google.com");
		Thread.sleep(2000);
		driver.findElement(By.name("q")).sendKeys("Kolkata" + Keys.ENTER);
		// Thread.sleep(5000);

	}

	@Test
	public void googletest() throws Exception {

		driver.get("https://www.google.com");
		Thread.sleep(2000);
		driver.findElement(By.name("q")).sendKeys("Selenium" + Keys.ENTER);
		// Thread.sleep(5000);

	}

	@Test
	public void googletechlearn() throws Exception {

		driver.get("https://www.google.com");
		Thread.sleep(2000);
		driver.findElement(By.name("q")).sendKeys("techlearn.in" + Keys.ENTER);
		// Thread.sleep(5000);

	}

	@Test
	public void googletestBeng() throws Exception {

		driver.get("https://www.google.com");
		Thread.sleep(2000);
		driver.findElement(By.name("q")).sendKeys("Bengaluru" + Keys.ENTER);
		// Thread.sleep(5000);

	}
}
