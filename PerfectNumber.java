package logicalPrograms;

import java.util.Scanner;

public class PerfectNumber 
{
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number ");
	     int num = sc.nextInt();
	     if (perfectNum(num)) {
	    	 System.out.println("It is perfect number ");
			
		} else {
			System.out.println("It is not perfect number ");

		}
	     sc.close();
	}
	//Method to check perfect number
	private static boolean perfectNum(int num) 
	{
		int sum =0, temp = num;
		while (num>0) 
		{
			int rem = num%10;
			sum = sum+fact(rem);
			num=num/10;
		}
		if (sum==temp) {
			return true;
		}
		else
		{
			return false;
		}
	}
	//method to find factorial of a number
	private static int fact(int num)
	{
		int res=1;
		for (int i = num; i >=1; i--) 
		{	
			res =res+1;
		}
		return res;
	}
}
