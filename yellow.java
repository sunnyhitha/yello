import java.util.*;
import java.lang.*;
import java.io.*;
import java.util.Scanner.*;

/* Name of the class has to be "Main" only if the class is public. */
class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
	  int num,m,n,j;
	  Scanner sc=new Scanner(System.in);
	  m=sc.nextInt();
	  n=sc.nextInt();
	 num=m;
	  while(num<n)
	  {
	     if(num==m)
	     {
	     num=num+1;
	     }
	  	
	     if(num%2!=0)
	  System.out.print(num+"\t");
	  num++;
	}
	}	
}
