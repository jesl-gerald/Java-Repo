import java.util.Scanner;
class Largest
{
  public static void main(String[] args)
  {
   Scanner scan = new Scanner(System.in);
   int num1 = scan.nextInt();
   int num2 = scan.nextInt();
   int num3 = scan.nextInt();

   if(num1>num2 && num1>num3)
   {
    System.out.println(num1 + "is the largest");
   }
  
  if(num2>num1 && num2>num3)
   {
    System.out.println(num2 + "is the largest");
   }

  if(num3>num1 && num3>num2)
   {
    System.out.println(num3 + "is the largest");
   }
}
}




