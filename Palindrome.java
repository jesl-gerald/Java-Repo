package foundations;

public class Palindrome {

	public static void main(String[] args) {
		
		// MADAM ----> MADAM
		
		String S = "MADAM";
		String r = "";
		char ch;
		
		for (int i=0;i<S.length();i++) 
		{
			ch = S.charAt(i);
			r  = ch+r;
		}
         boolean compareResult = S.equals(r);
         System.out.println(compareResult);
	}

}
