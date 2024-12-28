package tabshandling;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class NewTabs {
	WebDriver driver;

	@Test
	public void newtabfeature() throws InterruptedException {
		driver.get("https://www.w3schools.com/js/tryit.asp?filename=tryjs_alert");
		Thread.sleep(1000);

		// chaning frame
		driver.switchTo().frame("iframeResult");

		driver.findElement(By.xpath("/html/body/button")).click();
		Thread.sleep(1000);
		// chaning to alert
		driver.switchTo().alert().accept();
		// come back to main page
		driver.switchTo().defaultContent();

		driver.findElement(By.xpath("//*[@id=\"getwebsitebtn\"]")).click();

		// switch to the new tab
		ArrayList<String> tabs = new ArrayList<String>(driver.getWindowHandles());
		driver.switchTo().window(tabs.get(1));

		Thread.sleep(3000);
		driver.findElement(By.xpath("//a[normalize-space()='PYTHON']")).click();

		// back to main tab
		driver.close();
		// driver.switchTo().window(tabs.get(0));
	}

	@Test(enabled = false)
	public void navigation() throws InterruptedException {
		driver.get("https://www.google.com");
		Thread.sleep(1000);

		// selenium 4
		// opens new window
		driver.switchTo().newWindow(WindowType.WINDOW);
		// opens new tab
		// driver.switchTo().newWindow(WindowType.TAB);
		driver.get("https://www.facebook.com");
	}

	@BeforeTest
	public void beforeTest() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
	}
}
