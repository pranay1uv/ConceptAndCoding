package strings;

import java.util.Scanner;

public class PrefixStringandSuffixString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		String inputString = sc.next();
		PSStringsMethod(inputString);
	}
	public static void PSStringsMethod(String stringName) {
		
		// prefix String -- all the SubString that start at 0th index and can end at any index
		// suffix String -- all the SubString that end at last index and can begin at any index
		for(int i=0; i<stringName.length()+1; i++) {
			String substring = stringName.substring(0, i);
			System.out.println(substring);
		    StringBuilder sb = new StringBuilder();
		    sb.reverse();
		}
		
		for(int j = 0; j<=stringName.length();j++) {
			String substring = stringName.substring(j, stringName.length());
			System.out.println(substring);
			//Character.to
		}
		
	}

}
