package com.tamplo.qa.test;

import java.io.IOException;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;


import com.tamplo.qa.pages.HomePage;
import com.tamplo.qa.pages.LoginPage;
import com.tamplo.qa.testbase.TestBase;


public class HomePageTest extends TestBase
{
	LoginPage loginPage;
	HomePage homePage;
	
	

	public HomePageTest() throws IOException 
	{
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	@BeforeMethod
	public void setUp() throws IOException
	{
		
		/*NewExtendReport.newReport("Login test","logintoapplication");
		
		NewExtendReport.logger =  NewExtendReport.extent.createTest("Login Test ");*/
		initialization();
		
		loginPage = new LoginPage();
		
		loginPage.login(prob.getProperty("username"), prob.getProperty("password"));
		
		/*NewExtendReport.logger.log(Status.PASS, MarkupHelper.createLabel("User login  successfully", ExtentColor.GREEN));
		
		NewExtendReport.extent.flush();*/
	
	}
	
	
	
	@Test
	public void verifyDpartmentPage() throws IOException, InterruptedException
	{
		
		/*NewExtendReport.logger2 =  NewExtendReport.extent.createTest("Remove Project Test");*/
		
		/*homePage = new HomePage();
		
	    homePage.clickOnDprtmentlink();*/
	    
	    driver.findElement(By.xpath("html/body/div[1]/div[1]/header/div/div[3]/nav/ul/li[6]/a")).click();
	    
	    driver.findElement(By.xpath("//div[@class='allItemWidget ng-scope']/div[2]/header/h3/a")).click();
	    
	    driver.findElement(By.xpath("//div[@class='ng-scope']/header/div[3]/ul/li[3]/a")).click();
	    
	    driver.findElement(By.xpath("//div[@class='zeroStateContainer']/p/a")).click();
	    		
	    driver.findElement(By.xpath("//section[@class='tamplo-messageDialogContentSection']/form/div/label/strong")).click();
	    
	    
	    Thread.sleep(1000);
	    
	    
	    Runtime.getRuntime().exec("D:\\autoit\\FileUpload.exe");
	    
		/*String dprtmentpage = homePage.veryfyDprtmentPage();
		
		Assert.assertEquals(dprtmentpage, "DEPARTMENTSs","Department page not found");*/
		
		/*NewExtendReport.logger2.log(Status.PASS, MarkupHelper.createLabel("Department verify successfully", ExtentColor.GREEN));
	
		NewExtendReport.extent.flush();*/
		
	}
	
	
	@AfterMethod
	public void tearDown()
	{
		//driver.quit();
	}
	
	

}
