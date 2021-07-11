package logicalPrograms;

import java.util.Scanner;

public class CheckPrime 
{
	public static void main(String[] args) {
		
		boolean flag = true;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number ");
	     int n = sc.nextInt();
	     int m = n/2;
	     for (int i = 2; i <= m; i++) 
	     {
	    	 if (n%i==0) 
	    	 {
	    		 flag = false; 
				
			 }
			
		 }
	     if (flag == true)
	     {
	    	 System.out.println("It is prime number");
		 }
	     else 
	     {
	    	 System.out.println("It is not prime number");
	     }
	     sc.close();
	}

}
