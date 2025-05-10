package strings;

import java.util.Arrays;

public class PalindromeCheckUsingRecursion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Store the Characters of the Input in the reverse order in the charArray
		// using Recursion
		// After Recursion Ends 
		// Convert charArray to String
		// Now check the contents of the two Strings using compareTo()
		// What i Have to Pass Input String, ResultCharArray
		
		String input = "Liril";
		char[] inputCharArray = new char[input.length()];
		int count = 0;
		char[] storingCharsInReverse = storingCharsInReverse(input,inputCharArray,input.length(),input.length()-1,count);
		String result = String.valueOf(storingCharsInReverse);
		System.out.println(result);
		if(input.equalsIgnoreCase(result)) {
			System.out.println("It is a Palindrome");
		}
	}
	
	public static char[] storingCharsInReverse(String input,char[] inputCharArray,int len,int counter,int count) {
		 inputCharArray[count]= input.charAt(counter);
		 counter--;
		 count++;
		 if(counter>=0) {
			 storingCharsInReverse(input, inputCharArray, len, counter, count);
		 }return inputCharArray;
	}
}
