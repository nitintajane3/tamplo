package com.tamplo.qa.patterntest;

import org.testng.annotations.Test;

public class FirstClassForPatternTest 
{
	
	@Test
	public void patternOne()
	{
		teestOne();
		testTwo();
	}
	
	public void teestOne() 
	{
		for(int  i=5;i>=0;i--)
		{
			for(int j=5;j>=i;j--)
			{
			System.out.print("*");
			}
			System.out.println("");
		}
		
	}
	
	public void testTwo() 
	{
		for(int i=0;i<=5;i++)
		{
			for(int j=5;j>=i;j--)
			{
				System.out.print("*");
			}
			System.out.println();
			
		}
		
	}

}
