package test1;

import java.util.Scanner;

//Create a function to check if a number is even or odd.

public class Evenodd 
{
	public static void checkEvenorodd(int num)
	{
		if(num%2 == 0)
		{
			System.out.println("The number is a even number");
		}
		else
		{
			System.out.println("The number is a odd number");
		}
	}
	
	public static void main(String[] args)
	{
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a number: ");
		int num = scan.nextInt();
		
		checkEvenorodd(num);
		
		scan.close();
	}
}
