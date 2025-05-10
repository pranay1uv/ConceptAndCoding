package strings;

import java.util.Scanner;

public class DuplicateWordsInString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		String input = "iam  learning iam learning java java";
		
		String[] split = input.split(" ");
		for(String element : split) {
			System.out.println(element);
		}
	}

}
