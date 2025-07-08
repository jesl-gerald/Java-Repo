package foundations;

public class Reversing {

	public static void main(String[] args) {
		// abcd ---> dcba
		
		String sentence = "Full Stack Development";
		
		String r = "";
		char ch;
		
		
		for(int i = 0; i<sentence.length(); i++) 
		{
			
			ch = sentence.charAt(i);
			
			r =ch+r;
		}
		System.out.println(r);
		
		
	
	}

}
