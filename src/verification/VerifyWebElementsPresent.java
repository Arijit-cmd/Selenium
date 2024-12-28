package verification;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class VerifyWebElementsPresent {
	WebDriver driver;

	@Test
	public void isDisplayedMethod() {
		driver.get("https://www.techlearn.in/admin");

		boolean lyp = driver.findElement(By.xpath("//a[@class='wp-login-lost-password']")).isDisplayed();

		if (lyp == true) {
			System.out.println("Lost your password is displayed in login page");
			driver.findElement(By.xpath("//a[@class='wp-login-lost-password']")).click();
		} else {
			System.out.println("Lost your password is Not displayed in login page");

		}
	}

	@Test
	public void isEnabledMethod() {
		driver.get("https://www.techlearn.in/admin");

		boolean username = driver.findElement(By.xpath("//input[@id='user_login']")).isEnabled();

		if (username == true) {
			System.out.println("Username or Email text field is enabled to enter the username");
			driver.findElement(By.xpath("//input[@id='user_login']")).sendKeys("Arijit");
		} else {
			System.out.println("Username or Email text field is Not enabled to enter the username");

		}
	}

	@Test
	public void isSelectedMethod() {
		driver.get("https://www.techlearn.in/admin");

		driver.findElement(By.xpath("//input[@id='rememberme']")).click();

		boolean checkbox = driver.findElement(By.xpath("//input[@id='rememberme']")).isSelected();

		if (checkbox == true) {
			System.out.println("Checkbox is Selected");
		}

		else {
			System.out.println("Checkbox is Not Selected");
		}

	}

	@BeforeTest
	public void beforeTest() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
	}
}
