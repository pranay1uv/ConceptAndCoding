package strings;

import java.util.Scanner;

public class Regex {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		// Regular Expression regex should be passed in the form a String
		String[] splitArray = str.split("[- ]+");
		for(String Str : splitArray) {
			System.out.println(Str);
		}
	}

}
