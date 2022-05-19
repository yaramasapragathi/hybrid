package testcases;


import java.io.IOException;

import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import pages.study;

public class signin extends base {
	Actions action;
	@Test
	public void sign() throws InterruptedException, IOException
	{
		study s=new study(driver);
		s.log1().click();
		Thread.sleep(5000);
		s.sign1().click();
		Thread.sleep(5000);
		s.email1().sendKeys("pragathiyaramasa39@gmail.com");
		Thread.sleep(3000);
		s.pwd1().click();
		s.pwd1().sendKeys("Pragu@123");
		Thread.sleep(2000);
		s.signup1().click();
		Thread.sleep(3000);
		getScreenshot(driver,"sign");
		test=extent.createTest("sign");
		log.info(" sign in test is passed");
		
	}

}
