package testng;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class TestNG_10_DataProvider {
	WebDriver driver;

	@DataProvider(name = "datainput")
	public String[][] login() {
		return new String[][] { { "arijit", "abc" }, { "bhuwana", "9000109120" }, { "pooja", "ABCDEF" },
				{ "chaithanya", "123456789" }, { "naveen", "ABCDEFGHI" }, { "manoj", "9980251000" },
				{ "akhil", "InValidPassword" }, { "lavanya", "9000109120" }, { "shiva", "Hello@123" },
				{ "bharath", "Chukka@2024" } };
	}

	@Test(dataProvider = "datainput")
	public void login(String user, String password) throws Exception {

		driver.get("https://www.semivlsi.com/wp-login.php");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"user_login\"]")).sendKeys(user);
		driver.findElement(By.xpath("//*[@id=\"user_pass\"]")).sendKeys(password);
		driver.findElement(By.xpath("//*[@id=\"wp-submit\"]")).click();
		try {
			Actions act = new Actions(driver);
			act.moveToElement(driver.findElement(By.xpath("//*[@id=\"wp-admin-bar-my-account\"]/a"))).build().perform();
			Thread.sleep(3000);
			driver.findElement(By.xpath("//*[@id=\"wp-admin-bar-logout\"]/a")).click();
			System.out.println("PASS");
		} catch (Exception e) {
			System.out.println("FAIL");
			// System.out.println("Exception due to: "+e);
		}
	}

	@BeforeTest
	public void beforeTest() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
	}
}
