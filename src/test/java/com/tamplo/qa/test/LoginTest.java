package com.tamplo.qa.test;

import java.io.IOException;

import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.markuputils.ExtentColor;
import com.aventstack.extentreports.markuputils.MarkupHelper;
import com.tamplo.qa.pages.HomePage;
import com.tamplo.qa.pages.LoginPage;
import com.tamplo.qa.testbase.TestBase;
import com.tamplo.qa.utils.ExtentManager;
import com.tamplo.qa.utils.TestListener;
import com.tamplo.qa.utils.TestUtils;

@Listeners(value=TestListener.class)
public class LoginTest extends TestBase
{
	LoginPage loginPage ;
	HomePage homePage;
	String sheetname = "Sheet1";
	TestListener testlistener;

	public LoginTest() throws IOException 
	{
		super();
		System.out.println("parent ");
		// TODO Auto-generated constructor stub
	}

	@BeforeMethod
	public void initialiseBrowser() throws IOException
	{
		initialization();
		loginPage = new LoginPage();
	}
	
	
	@DataProvider
	public  Object[][] getDataExcel() throws IOException
	{
		 Object objects[][] = TestUtils.getTestData(sheetname);
		 return objects;
	}
	
	
	@Test(dataProvider="getDataExcel")
	public void loginTestCases(String username, String passwrod,ITestResult result) throws IOException
	{
		
		
		ExtentManager.logger = ExtentManager.extent.createTest("Login test");
		 loginPage.login(username,passwrod);
		System.out.println(username   +   passwrod);
		ExtentManager.logger.log(Status.PASS, MarkupHelper.createLabel("check test for " + username, ExtentColor.GREEN));
		ExtentManager.logger.log(Status.PASS, MarkupHelper.createLabel("User login  successfully", ExtentColor.GREEN));
		
	}
	
	@AfterMethod
	public void tearDown()
	{
		 driver.quit();
	}
	
	
}
