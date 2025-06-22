import java.util.Scanner;
class Celc
{
  public static void main(String[] args)
  
{

 Scanner scan = new Scanner(System.in);
 float Celcius = scan.nextFloat();
 double Fahrenheit = ((Celcius*1.8)+32f);
 System.out.println(Fahrenheit);
}
}
 