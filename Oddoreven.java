class Oddoreven
{
  public void ooe(int num)
  {
   System.out.println("Method Called");
   int sum;
   sum = num%2;  
   if(sum==0) 
   {
    System.out.println("Even");
   }
   else
   {
    System.out.println("Odd");
   }
 }

 public static void main(String[] args)
 {
  Oddoreven demo = new Oddoreven();
  demo.ooe(1);
}
}
