package testcases;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

import pages.findhotel;
import pages.study;


public class home extends base {
	Actions action;
	
	@Test
	public void page() throws IOException, InterruptedException
	{
		findhotel fp=new findhotel(driver);
		getScreenshot(driver,"page");
		fp.search1().click();
		fp.search1().sendKeys("sofas");
		Thread.sleep(2000);
		fp.click1().click();
		action=new Actions(driver);
		action.moveToElement(fp.sofa1()).perform();
		action.moveToElement(fp.material1()).perform();
		fp.mat1().click();
		
		driver.navigate().back();

		test=extent.createTest("page");
		log.info("test is passed");
	}
	@Test
	public void scroll() throws InterruptedException, IOException
	{
		study s=new study(driver);
		JavascriptExecutor jse=(JavascriptExecutor)driver;
		//jse.executeScript("window.scrollBy(0,3300)");
		getScreenshot(driver,"scroll");
		Thread.sleep(2000);
		WebElement e=driver.findElement(By.xpath("//*[@id=\"content\"]/div[3]/div/div[3]/a[7]"));
		
		jse.executeScript("arguments[0].scrollIntoView();",e);
		System.out.println(e);
		
		action=new Actions(driver);
		action.moveToElement(e).click();
		Thread.sleep(3000);
		
		test=extent.createTest("scroll");
		log.info("scroll test is passed successfully");
		
	}
	

}
