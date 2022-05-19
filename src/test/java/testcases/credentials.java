package testcases;

import java.io.IOException;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import pages.logindetails;
import utility.readexcel;

public class credentials extends base {
	@Test()
	public void getexcel() throws InterruptedException, IOException
	{
		logindetails ld=new logindetails(driver);
		ld.hover1().click();
		Thread.sleep(8000);
		ld.login1().click();
		//Thread.sleep(1000);
		
		//ld.logbutton1().click();
		getScreenshot(driver,"getexcel");
		test=extent.createTest("credintials");
		log.info("test is pass");
		
	}
	/*@DataProvider(name="loginData")
	String [][]getData() throws IOException
	{
		String path="C:\\Users\\HP\\Desktop\\urban.xlsx";
		int rownum=readexcel.getRowCount(path,"Sheet1");
		int colnum=readexcel.getCellCount(path, "Sheet1", 1);
		String loginData[][]=new String[rownum][colnum];
		for(int i=1;i<=rownum;i++)
		{
			for(int j=0;j<colnum;j++)
			{
				loginData[i-1][j]=readexcel.getCellData(path, "Sheet1", i, j);
			}
		}
		return loginData;
		
				
	}*/

}
