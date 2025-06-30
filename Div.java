class Div
{
  public void range(int a)
  {   
   for(a=100;a<=1000;a++)
   {
    int sum;
   sum = a%8;

    if(sum==0)
    {
    System.out.println(a);
   }
  }
}

  public static void main(String[] args)
  {
   Div demo = new Div();
   demo.range(100);
  }
}