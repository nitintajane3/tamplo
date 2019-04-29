package com.tamplo.qa.patterntest;

import org.testng.annotations.Test;

public class FirstClassForPatternTest 
{
	
	@Test
	public void patternOne()
	{
		//teestOne();
		//testTwo();
		//testThree();
		//testFour();
		testFive();
	}
	
	public void teestOne() 
	{
		for(int  i=5;i>=0;i--)
		{
			for(int j=5;j>i;j--)
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
			for(int j=5;j>i;j--)
			{
				System.out.print("*");
			}
			System.out.println();
			
		}
		
	}
	
	public void testThree() 
	{
		/*for(int i=1;i<=5;i++)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print("*");
			}
			System.out.println("");
		}*/
		
		/*for(int p=1;p<=5;p++)
		{
			for(int q=5;q>=p;q--)
			{
				System.out.print("*");
			}
			System.out.println("");
		}*/
		
//pattern 
		
		/*for(int p=5;p>=1;p--)
		{
			for(int z=5;z>p;z--)
			{
				System.out.print(" ");
			}
			
			for(int q=1;q<=(2*p-1);q++)
			{
				
				System.out.print("*");
			}
			
			
			System.out.println("");
		}*/
		/*********
		 *******
		  *****
		   ***
		    */
		
//pattern 	
		for(int p=1;p<=5;p++)
		{
			for(int z=5;z>p;z--)
			{
				System.out.print(" ");
			}
			
			for(int q=1;q<=(2*p-1);q++)
			{
				
				System.out.print("*");
			}
			
			
			System.out.println("");
		}
	    /*
	    ***
	   *****
	  *******
	 *********/
		
		
	}
	
	public void testFour() 
	{
		int k =1;
		for(int i=1;i<=5;i++)
		{
			for(int j=1;j<=k;j++)
			{
				System.out.print("*");
			}
			k = k+2;
			System.out.println("");
		}
		
	}
   /*
	***
	*****
	*******
	*********/
	
	public void testFive() 
	{
		int i, j, k;
		/*for(i=1;i<=5;i++)
		{
		for(j=i;j<5;j++)
		    {
		         System.out.print(" ");
		    }
		for(k=1;k<(i*2);k++)
		    {
		         System.out.print("*");
		    }
		System.out.println();
		}
		
		for(i=4;i>=1;i--)
		   {
		      for(j=5;j>i;j--)
		         {
		            System.out.print(" ");
		         }
		             for(k=1;k<(i*2);k++)
		                 {
		                    System.out.print("*");
		                 }
		               
		    System.out.println();
	
		   }*/
		
		for(int p=1;p<=5;p++)
		{
			for(int z=5;z>p;z--)
			{
				System.out.print(" ");
			}
			
			for(int q=1;q<=(2*p-1);q++)
			{
				
				System.out.print("*");
			}
			
			
			System.out.println("");
		}
		for(int p=4;p>=1;p--)
		{
			for(int z=5;z>p;z--)
			{
				System.out.print(" ");
			}
			
			for(int q=1;q<=(2*p-1);q++)
			{
				
				System.out.print("*");
			}
			
			
			System.out.println("");
		}
	    /*
	    ***
	   *****
	  *******
	 *********
	  *******
	   *****
	    ***
	     */
	}

}
