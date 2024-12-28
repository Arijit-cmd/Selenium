package locators;

import java.util.List;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

class SeleniumLocators {

	static WebDriver driver;

	@BeforeAll
	static void setUpBeforeClass() throws Exception {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
	}

	@Disabled
	@Test
	void idnameclassnamecssselector() throws InterruptedException {
		driver.get("https://www.techlearn.in/admin");
		driver.findElement(By.id("user_login")).sendKeys("Arijit");
		driver.findElement(By.name("pwd")).sendKeys("ABC");
		driver.findElement(By.id("rememberme")).click();
		Thread.sleep(2000);
		driver.findElement(By.className("wp-login-lost-password")).click();

		driver.findElement(By.cssSelector("input#user_login")).sendKeys("arijith123@gmail.com");
		driver.findElement(By.cssSelector("#wp-submit")).click();

		driver.findElement(By.cssSelector("a.wp-login-log-in")).click();
		// driver.findElement(By.cssSelector(".wp-login-log-in")).click();
	}

	@Disabled
	@Test
	void linktextpartiallinktext() throws InterruptedException {
		driver.get("https://www.techlearn.in/admin");
		Thread.sleep(2000);
//	driver.findElement(By.linkText("Lost your password?")).click();

		driver.findElement(By.partialLinkText("Lost")).click();
//	driver.findElement(By.partialLinkText("Lost your password?")).click();

	}

	@Disabled
	@Test
	void totalnumoflinks() throws InterruptedException {
		driver.get("https://www.ndtv.com/");
		Thread.sleep(2000);

		List<WebElement> imgages = driver.findElements(By.tagName("img"));

		System.out.println("Total Images on NDTV Application: " + imgages.size());

	}

}
/* Selenium Locators : (Selenium 3 & 4 )

1) id();
2) name();
3) className();
4) cssSelector();
5) linkText();
6) partialLinkText();
7) tagName();
8) xpath();
    - Absolute / Full xpath
	- Relative
	
Relative Locators in Selenium 4
	1. above()
	2. below() 
	3. toLeftOf()
	4. toRightOf() 
	5. near()	
 xpath();
   - absolute or Full xpath
   1)  / start  2) from start tagname
   - relative
   1) // start   2) current node or parent to corrent node
   
    //*[@attributename='attributevalue']
    //*[@attributename="attributevalue"]
    //tagname[@attributename='attributevalue']
	//tagname[@attributename="attributevalue"]
	- Index Method
	(total code)[10]
	
	- Parent to current node
	//*[@id="idattributevalue"]/tagname
	
	- text
		//*[text()='textname/linkname']
		
	- contains
	  //tagname[contains(text(),'textname/linkname or subtext/linktext')]
	  //*[contains(text(),'Rep')]
	  //tagname[contains(text(),'Repository')]
	  
	- normalize-space	
	  //tagname[normalize-space()='Register']
	
	- xpath axis */
