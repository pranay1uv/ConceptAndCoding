package strings;

import java.util.Scanner;

public class TrimMethodString {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String inputString = sc.nextLine();
		inputString = inputString.trim();
		System.out.println(inputString);
	}

}
