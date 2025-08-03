package test1;

//Define a class Rectangle with methods to calculate area and perimeter.
public class Rectangle {
	
	public void multiply(int length, int breadth)
	{
		System.out.println("Method invoked");
		int area;
		area = length*breadth;
		System.out.println("The area is: " + area);
		
	}
	
	public void perimeter(int len, int width)
	{
		System.out.println("Method invoked");
		int perimeter;
		perimeter = 2 * (len + width);
		System.out.println("The perimeter is: " + perimeter);
	}
	
	public static void main(String[] args)
	{
		Rectangle  re = new Rectangle();
		
		re.multiply(5,20);
		re.perimeter(10, 20);
		
	}
	
	}
