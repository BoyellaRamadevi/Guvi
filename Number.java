/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;
class Number
{
	public static void main (String[] args) throws java.lang.Exception
	{
		
	    Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		int b=sc.nextInt();
		int c=sc.nextInt();
		if(a>b && a>c)
		   {
		   	System.out.println(a);
		   }
		 else if(b>c)
		   {
		 	  System.out.println(b);
		   }
		   else
	       {
		   	System.out.println(c);
		   }		

	}
	}
