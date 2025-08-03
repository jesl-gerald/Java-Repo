package test1;

import java.util.Scanner;

//Check if a number is divisible by both 3 and 5 print “Fizz Buzz”, 
//if a number is divisible only 3 print “Fizz” and the number is divisible only 5 print “Buzz”.
public class FizzBuzz 
{
	public static void main(String[] args)
	
	{
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter a number: ");
		int num = scan.nextInt();
		
		if(num%3 == 0 && num%5 == 0)
		{
			System.out.println("Fizz Buzz");
		}
		
		else if(num%3 == 0)
		{
			System.out.println("Fizz");
		}
		
		else if(num%5 == 0)
		{
			System.out.println("Buzz");
		}
		scan.close();
		}
}
