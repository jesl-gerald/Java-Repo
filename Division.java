import java.util.Scanner;
class Division
{
  public void div(int num1, int num2)
  {
   int sum = num1/num2;
   System.out.println(sum);
  }
  
  public static void main(String[] args)
  {
    Scanner scan = new Scanner(System.in);
    int a = scan.nextInt();
    int b = scan.nextInt();

    Division demo = new Division();
    demo.div(a, b);
  }
}