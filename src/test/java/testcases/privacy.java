package testcases;

import java.awt.Window;

import org.openqa.selenium.JavascriptExecutor;
import org.testng.annotations.Test;

import pages.track;

public class privacy extends base{
	@Test
	public void policy() throws InterruptedException
	{
		track t=new track(driver);
		t.order1().click();
		Thread.sleep(3000); 
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,2500)","");
		t.pri1().click();
		Thread.sleep(2000);
		test=extent.createTest("policy");
		log.info("test policy is passed");
		
	}

}
