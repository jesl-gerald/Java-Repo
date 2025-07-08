package foundations;

public class Equals {

	public static void main(String[] args) {
		
		String a = "Adminnn";
		int count = a.length();
		System.out.println(count);
		
		String b = "Abcdefg";
		int count1 = b.length();
		System.out.println(count1);
		
		boolean compareResult = (count == count1);
		System.out.print(compareResult);

	}

}
