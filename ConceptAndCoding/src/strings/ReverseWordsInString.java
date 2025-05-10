package strings;

import java.util.Arrays;

public class ReverseWordsInString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String input = "Sky is Blue";
		// Expected Output : "Blue is SKy"
		
		
		// regex will be in the form of a string
		// 
		String[] sArray = input.split("[\s+]");
		Arrays.stream(sArray).forEach(p->System.out.println(p));

	}

}
