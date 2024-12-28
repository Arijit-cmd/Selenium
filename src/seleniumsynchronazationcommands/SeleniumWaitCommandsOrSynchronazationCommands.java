package seleniumsynchronazationcommands;

import org.testng.annotations.Test;

public class SeleniumWaitCommandsOrSynchronazationCommands {
/*==================Selenium 4==================

driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));// implicit

WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));
wait.until(ExpectedConditions.visibilityOfElementLocated(By.linkText("Selenium Quiz"))); // Explicit

driver.manage().timeouts().setScriptTimeout(Duration.ofMinutes(2)); //Javascript

driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10)); //pageLoadTimeout

 //Fluent Wait
 FluentWait<WebDriver> wait = new org.openqa.selenium.support.ui.FluentWait<WebDriver>(driver)
		        .withTimeout(Duration.ofSeconds(50))
		        .pollingEvery(Duration.ofSeconds(5))
		        .ignoring(NoSuchElementException.class);
		wait.until(
		        d -> {
		        	driver.findElement(By.linkText("Selenium")).click();		   
		          return true;
		        });		
		 
robot.delay(900); //Robot class wait

Thread.sleep(1000); // java wait

==================Selenium 3==================

driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

WebDriverWait wait=new WebDriverWait(driver,10);
wait.until(ExpectedConditions.elementToBeClickable(By.name("q")));

driver.manage().timeouts().setScriptTimeout(2, TimeUnit.MINUTES);

driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);

Wait<WebDriver>  wait = new FluentWait<WebDriver>(driver)
.withTimeout(50, SECONDS)
.polingEvery(5, SECONDS)
.ignoring(NoSuchElemntException.class);*/	
}
