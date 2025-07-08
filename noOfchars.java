package foundations;

public class noOfchars {

	public static void main(String[] args) {
		
		//Welcome|to|Amazon|ecommerce|application
		
		String sentence = "Welcome|to|Amazon|ecommerce|application";
		
		String[] words = sentence.split("|");
		
		
		String result = sentence.substring(0, 7);
		System.out.println(result);
		int count = result.length();
		System.out.println(count);
		
		String result1 = sentence.substring(8, 10);
		System.out.println(result1);
		int count1 = result1.length();
		System.out.println(count1);
		
		String result2 = sentence.substring(11, 17);
		System.out.println(result2);
		int count2 = result2.length();
		System.out.println(count2);
		
		String result3 = sentence.substring(18, 27);
		System.out.println(result3);
		int count3 = result3.length();
		System.out.println(count3);
		
		String result4 = sentence.substring(28, 39);
		System.out.println(result4);
		int count4 = result4.length();
		System.out.println(count4);
		


	}

}
