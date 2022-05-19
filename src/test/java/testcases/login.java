package testcases;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import pages.study;

public class login extends base {
	Actions action;
	@Test
	public void login1() throws InterruptedException, IOException
	{
		Thread.sleep(2000);
		
		
		WebElement e=driver.findElement(By.xpath("//*[@id=\"topnav_wrapper\"]/ul/li[1]/span"));
		action=new Actions(driver);
		action.moveToElement(e).perform();
		Thread.sleep(2000);
		WebElement e1=driver.findElement(By.xpath("//*[@id=\"topnav_wrapper\"]/ul/li[1]/div/div/ul/li[2]/div/a"));
		Thread.sleep(2000);
		action.click();
		getScreenshot(driver,"login");
		driver.navigate().back();
		test=extent.createTest("test is passed");
		log.info("login1 is passed successfully");
		
	}
	
	

}
