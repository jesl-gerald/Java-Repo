class Method
{
  public void avg(float a, float b, float c)
{
  System.out.println("Method called");
  float d;
  c=(a+b+c)/3;
  System.out.println(c);
}
 
  public static void main(String[] args)
{

  Method demo = new Method();
  demo.avg(12, 8, 20);
}
}