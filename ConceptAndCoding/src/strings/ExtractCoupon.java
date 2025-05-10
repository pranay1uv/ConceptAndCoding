package strings;

import java.util.Scanner;

public class ExtractCoupon {
	
//	The task was to extract a coupon code from a given string in Java. 
//	Input:
//	"Enjoy $10 off on any order over $50! Use code: DISCOUNT10 at checkout"
//	Output:
//	DISCOUNT10
	
	// Solution
	// Input String
	// Pasing the inputString to the method
	// Extracting the String from the Input
	// Printing the resultant

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String input = "Enjoy $10 off on any order over $50! Use code: DISCOUNT10 at checkout";
		String result = extractCouponCode(input);
		System.out.println(result);
	}
	
	public static String extractCouponCode(String input) {
		// how do i extract the coupon code from the input
		// how to identify the coupon code from the characters
		// Split 
		
		String[] splittedString = input.split(" ");
		// Iterating each and every word of the StringArray
		String temp = "";
		for(int i = 0; i < splittedString.length; i++) {
			String words = splittedString[i];
			char[] charArray = words.toCharArray();
			for(int j = 0; j<charArray.length; j++) {
				if(charArray[j] >= '0' && charArray[j] <= '9') {
					if(words.length()>=5) {
						temp = words;
					}
				}
			}
			
		}return temp;		
	}

}
