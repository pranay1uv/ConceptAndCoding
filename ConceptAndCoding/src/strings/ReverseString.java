package strings;

import java.util.Scanner;

public class ReverseString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		
		StringBuilder sb = new StringBuilder(str);
		sb.reverse().toString();
		
		StringBuffer buffer = new StringBuffer(str);
		buffer.reverse().toString();
		
		
	}
}
