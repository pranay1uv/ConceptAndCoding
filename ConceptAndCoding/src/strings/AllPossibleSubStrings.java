package strings;

public class AllPossibleSubStrings {

	public static void main(String[] args) {
		
		CharSequence cs = "";
		// TODO Auto-generated method stub
		String str = "abc";
		// a b c 
		// ab bc ac
		// 0 , 1 ==> 0, 0 ==> a
		// 0 , 2 ==> 0, 1 ==> ab
		// 1 , 2 ==> 1, 1 ==> b
		// here it is stopping
		int total = 0;
		for(int i = 0; i<=str.length()-1; i++) {
			for(int j = i+1; j<=str.length(); j++) {
				String substring = str.substring(i, j);
				total = total + substring.length();
				System.out.println(substring);
			}
		}System.out.println(total);
	}
}
