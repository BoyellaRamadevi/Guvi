/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;
import java.util.Scanner;
/* Name of the class has to be "Main" only if the class is public. */
class Bhanu
{
	public static void main (String[] args) throws java.lang.Exception
	{
	 Scanner reader = new Scanner(System.in);
        int num = reader.nextInt();

        if(num % 2 == 0)
            System.out.println( "Even");
        else if (num % 2 != 0)
            System.out.println("Odd");
        else
             System.out.println("invalid");    
        
	}
}
