package logicalPrograms;

import java.util.Scanner;

public class FibonacciSeries 
{
	public static void main(String[] args) 
	{
		 Scanner sc = new Scanner(System.in);
		 System.out.println("Enter the limit : ");
	     int n = sc.nextInt();
	     int x=0,y=1;
	     for (int i = 0; i <= n; i++) 
	     {
	    	 System.out.println(" "+x);
	    	 int t=x;
	    	 x=y;
	    	 y=t+y;
		 }
	     sc.close();
	}
}
