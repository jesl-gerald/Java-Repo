import java.util.Scanner;
class Grading
{
   public static void main(String[] args)
  {
   Scanner scan = new Scanner(System.in);
   int mark = scan.nextInt();

   if(mark>=90)
   {
      System.out.println("Your grade is S");
   }
   else if(mark >=80 && mark<90)
   {
     System.out.println("Your grade is A");
   }
   else if(mark>=70 && mark<80)
   {
     System.out.println("Your grade is B");
   }
   else if(mark>=60 && mark<70)
   {
    System.out.println("Your grade is C");
   }
   else
   {
    System.out.println("Fail");
 }

 }
}


     


