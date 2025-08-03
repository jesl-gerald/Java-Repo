package test1;

public class Zoo {

	public static void main(String[] args) 
	{
		Dog dg = new Dog();
		System.out.println(dg.Type);
		dg.breed();
		dg.name();
		
		Cat ct = new Cat();
		System.out.println(ct.Type);
		ct.breed();
		ct.colour();
		
	}

}
