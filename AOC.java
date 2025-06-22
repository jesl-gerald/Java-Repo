import java.util.Scanner;
class AOC
{
public static void main(String[] args)
{
 Scanner scan = new Scanner(System.in);
 double radius = scan.nextByte();
 double Area = 3.14*(radius*radius);
 System.out.println(Area);
}
}