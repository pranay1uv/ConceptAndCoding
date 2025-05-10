package strings;

public class IterateStringUsingRecursion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Calling the function itself
		// Based on a condition
		String input = "pranay";
		
		int len = input.length();
		int count = 0;
		recursive(input,count,len);
	}
	public static void recursive(String input,int count,int len) {
		System.out.println(input.charAt(count));
		count++;
		if(count<=len-1) {		
			recursive(input, count,len);
		}
		return ;
	}

}
