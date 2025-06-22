import java.util.Scanner;
class AOT
{
public static void main(String[] args)
{
Scanner scan = new Scanner(System.in);
double breadth = scan.nextDouble();
double height = scan.nextDouble();
double Area = 0.5d*breadth*height;
System.out.println(Area);
}
}