package testcases;

import java.io.IOException;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import pages.card;
import pages.store;

public class titlepage extends base {
	@Test
	public void title() throws IOException
	{
		getScreenshot(driver,"title");
		String t=driver.getTitle();
		System.out.println(t);
		if(t.equals("Furniture Online: @Upto 70% Off on Wooden Furniture Online in India at Best Price - Urban Ladder"))
		{
			Assert.assertTrue(true);
			test=extent.createTest("title");
			log.info("tst is pass");
		}
		else {
			Assert.assertTrue(false);
			test=extent.createTest("title");
			log.info("test is fail");
		}
		
		
	}
	@Test
	public void gift() throws InterruptedException, IOException
	{
		card c=new card(driver);
		c.gc1().click();
		Thread.sleep(2000);
		getScreenshot(driver,"gift");
		if(driver.getTitle().contains("India"))
		{
			Assert.assertTrue(true);
			log.info("title is  true");
		}
		else {
			Assert.assertTrue(false);
			log.info("title is incorrect");
		}
		driver.navigate().back();
		test=extent.createTest("gift");
	}
	@Test
	public void urbanStore() throws InterruptedException, IOException
	{
		store s=new store(driver);
		s.store1().click();
		Thread.sleep(2000);
		s.topdeal1().click();
		Thread.sleep(2000);
		getScreenshot(driver,"urbanStore");
		s.deal1().click();
		
		//s.product1().click();
		
		test=extent.createTest("urbanstore");
		log.info("urbanstore is passed");
	}
	
	

}
