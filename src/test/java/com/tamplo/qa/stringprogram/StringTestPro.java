package com.tamplo.qa.stringprogram;


import org.testng.annotations.Test;

public class StringTestPro 
{
	
	int a = 12;
	String test = "50";
	String replacesamplestring = "nitin_tajane-sangamner";
	
	public void firstString()
	{
	// integer to string	
	//String convert = Integer.toString(a);
	//String second = String.valueOf(a);
	//string to integer
	int intconvrert = Integer.parseInt(test);
	System.out.println(intconvrert);
	//int secondconvert = Integer.parseInt(String.valueOf(a));
	}
	
	
	public void combinationOfStrings()
	{
		/*String aftereplace =  replacesamplestring.replaceAll("", "").trim();
		System.out.println(aftereplace);*/
		// String Str = new String("Welcome to Tutorialspoint.com");
	     // System.out.print("Return Value :" );
	      //System.out.println(Str.replaceAll("(.*)Tutorials(.*)", "AMROOD"));
	      // ouput is AMROOD
	      
	      //System.out.println(Str.replace("Tutorials", "AMROOD"));
	      
	     // System.out.println(Str.replaceFirst("o", "z"));
	      
	      String str = "This is String nitin tajane laxmna";
	      String[] splited = str.split(" ");
	      String split_one=splited[0];
	      String split_second=splited[1];
	      String split_three=splited[2];
	      String[] splitafter = str.split(" ", 3);
	      System.out.println(splitafter[2]);
	      
	      /*for(String name: splitafter)
	      {
	    	  System.out.println(name);
	      }*/

	}
	
	@Test
	public void testSample()
	{
		swapTwoNumber();
	}
	
	public void reverStringTest() 
	{
		String actual = "abcdefghijk";
		/*System.out.println(actual.length());
		char[] addchar = actual.toCharArray();
		int lenngthofchar = addchar.length-1;
		
		System.out.println(lenngthofchar);
		for(int i=lenngthofchar;i>=0;i--)
		{ 
			System.out.print(addchar[i]);
		}*/
		
		StringBuilder builder =  new StringBuilder();
		builder.append(actual);
		
		System.out.println(builder.reverse());
		
		StringBuffer buffer = new StringBuffer(actual);
		System.out.println(buffer.reverse());
		
	}
	
	public void swapTwoNumber() 
	{
		int x = 22;
        int y = 45;
        int  temp = 00;
        
        System.out.println("Before swap:");
        System.out.println("x value: "+x);
        System.out.println("y value: "+y);
        /*x = x+y; 
        y=x-y; 
        x=x-y;*/
        /*System.out.println("After swap:");
        System.out.println("x value: "+x);
        System.out.println("y value: "+y);*/
        
        temp = x;
        x =  y;
        y = temp;
        
        
        
        System.out.println(temp + " temp value ");
        
        System.out.println(x + " x value ");
       
        System.out.println(y + " y value ");
        
		
	}
}
