/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;
import java.util.Scanner;
class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
		
                int s1, s2, s3, flag=0, i, j;
                Scanner sc = new Scanner(System.in);
                s1 = sc.nextInt();
                s2 = sc.nextInt();
                for ( i = s1 ; i < s2 ; i++ )
     {
     	    for ( j=2 ; j<i ; j++ )
     	{
     		if( i % j ==0 )
     		{
     			flag = 0;
     			break;
     		}
     		else
     		{
     			flag = 1;
     		}
     	}
     	if ( flag == 1 )
     	{
     		System.out.print(i+" ");
     	}
    
	
	}
}
}
