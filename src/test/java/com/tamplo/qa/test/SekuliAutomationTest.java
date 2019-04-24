package com.tamplo.qa.test;

import java.io.IOException;

import org.sikuli.basics.Settings;
import org.sikuli.script.FindFailed;
import org.sikuli.script.Finder;
import org.sikuli.script.Key;
import org.sikuli.script.Match;
import org.sikuli.script.Pattern;
import org.sikuli.script.Screen;
import org.testng.annotations.Test;

import com.tamplo.qa.pages.HomePage;
import com.tamplo.qa.pages.LoginPage;
import com.tamplo.qa.testbase.TestBase;
import com.tamplo.qa.utils.TestUtils;

public class SekuliAutomationTest extends TestBase
{
	public SekuliAutomationTest() throws IOException 
	{
		super();
		// TODO Auto-generated constructor stub
	}
	LoginPage loginPage;
	HomePage homePage;
	
	@Test(enabled = false)
	public void name() throws IOException, FindFailed, InterruptedException 
	{
        initialization();
		
		loginPage = new LoginPage();
		
		loginPage.login(prob.getProperty("username"), prob.getProperty("password"));
		
		Screen screen =  new Screen();
		
		Pattern pattern = new Pattern("C:\\Users\\Admin\\Desktop\\sikuli_images\\tamplologo.PNG");
		Pattern pattern2 = new Pattern("C:\\Users\\Admin\\Desktop\\sikuli_images\\action_image.PNG");
		Pattern pattern1 = new Pattern("C:\\Users\\Admin\\Desktop\\sikuli_images\\imagesnotmatch.PNG");
		
		//screen.click(pattern);
		
		//String te = screen.capture().save("C:\\Users\\Admin\\Desktop\\sikuli_images\\", "capturename");
		
	     screen.wait(20);
	   
	    
	    /*Finder finder = new Finder(screen.capture().getImage()); // actual image
	    Finder finder2 = new Finder();
	     //Finder finder = new Finder(pattern1.getImage());
	    
		finder.find(pattern);    //expected image
		 
		if (finder.hasNext()) 
		{
			Match match = finder.next();
			System.out.println("match found with "+ match.getScore()*100 +"%");
			
		} else 
		{
			System.out.println("match not found");

		}*/
		
		// image exist or not
		
		if(screen.exists(pattern2)!=null)
		{
			System.out.println("image exist");
			
		}else {
			System.out.println("image not exist");
		}
		
		
	}
	
	@Test
	public void checkCharacter() throws FindFailed
	{
		// this code  for searching text and get text from image 
		
		Pattern pattern = new Pattern("C:\\Users\\Admin\\Desktop\\sikuli_images\\widdowstext.PNG");
		Settings.OcrTextRead =  true;
		Settings.OcrTextSearch = true;
		
		Screen s1 = new Screen();
		s1.type("r",Key.WIN);    //  this will open the command promot  
		
		if (s1.exists(pattern) != null) 
		{
			System.out.println("run text display " + s1.find(pattern).text());
			System.out.println(s1.find(pattern).text());
		} else 
		{
            System.out.println("run text not found");
		}
		
		
	}
	
}
