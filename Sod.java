// 369 = 18
import java.util.Scanner;
class Sod
{
  public static void main(String[] args)
  {
    Scanner scan = new Scanner(System.in);
    int num =scan.nextInt();
    int sum = 0;

    while(num>0)
    {
      sum += num%10;
      num = num/10;
    }
    

    System.out.println("The sum of digits is " + sum);
  }
}

  