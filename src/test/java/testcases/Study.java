package testcases;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.interactions.Mouse;
import org.testng.annotations.Test;

import pages.study;

public class Study extends base {
	Actions action;
	
	@Test
	public void study1() throws InterruptedException, IOException
	{
		study s1=new study(driver);
		action=new Actions(driver);
		JavascriptExecutor jse=(JavascriptExecutor)driver;
		WebElement e=driver.findElement(By.xpath("//*[@id=\"home\"]/div[1]/div[4]/div[4]/div[3]/a"));
		jse.executeScript("arguments[0].scrollIntoView();",e);
		
		action.moveToElement(e).click(e);
		getScreenshot(driver,"study1");
		Thread.sleep(2000);
		test=extent.createTest("study1");
		log.info("study1 is passed successfully");
	}
	

}
