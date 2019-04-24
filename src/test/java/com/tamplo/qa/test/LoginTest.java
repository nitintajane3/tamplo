package com.tamplo.qa.test;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.tamplo.qa.pages.HomePage;
import com.tamplo.qa.pages.LoginPage;
import com.tamplo.qa.testbase.TestBase;

import com.tamplo.qa.utils.TestListener;
import com.tamplo.qa.utils.TestUtils;


public class LoginTest extends TestBase
{
	LoginPage loginPage ;
	HomePage homePage;
	String sheetname = "Sheet1";
	

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
	
	
	@Test()
	public void loginTestCases() throws IOException
	{
		
		
		
		 loginPage.login("nitintajane3@gmail.com","1234");
		 driver.findElement(By.xpath("html/body/div[1]/div[1]/header/div/div[3]/nav/ul/li[3]/a")).click();
		 driver.findElement(By.xpath("html/body/div[1]/section/section/section/div[2]/section/div/div/div[1]/div[2]/div/ul/li/div[2]/div[1]/a/span")).click();
		 String alerts= driver.getWindowHandle() ;
		 driver.switchTo().window(alerts);
		 driver.findElement(By.xpath("html/body/div[1]/section/nav/div/ul/li[2]/span/label/a")).click();
		 driver.findElement(By.xpath("//*[@id='criticalContainer']/div[2]/div[1]/ul/li/div/a/span")).click();
		
		
		

	}
	
	@AfterMethod
	public void tearDown()
	{
      /* String alerts= driver.getWindowHandle() ;
		driver.switchTo().window(alerts);*/
	}
	
	
	
	
}
