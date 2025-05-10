package strings;

public class RemoveDuplicateCharacters {
	
	// Here we are comparing each character of the inputString with all
	// the characters present in the output string  
	// to maintain order of the characters while removal of duplicates

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String input = "Pranay";
		StringBuilder output = new StringBuilder("");
		boolean duplicateNotPresent = true;
		for(int i = 0; i<=input.length()-1; i++) {
			duplicateNotPresent = true;
			for(int j = 0; j<=output.length()-1; j++) {
				if(input.charAt(i) == output.charAt(j)) {
					duplicateNotPresent  = false;
				}
			}if(duplicateNotPresent) {
				output.append(input.charAt(i));
				System.out.print(input.charAt(i));
			}
		}
	}
}
