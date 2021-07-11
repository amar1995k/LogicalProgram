package logicalPrograms;

import java.util.Scanner;

public class ReverseNumber
{
	public static void main(String[] args) {
		int rev=0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number ");
	     int num = sc.nextInt();
	     while (num>0) {
	    	 int rem=num%10;
	    	 rev=(rev*10)+rem;
	    	 num=num/10;
			
		}System.out.println("The reverse is "+rev);
		sc.close();
	     
	}
}
