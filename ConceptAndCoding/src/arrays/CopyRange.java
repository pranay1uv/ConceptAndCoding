package arrays;

import java.util.Arrays;

public class CopyRange {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] array = {22,33,44,55,66,77,88};
		
		// StartIndex is Inclusive // EndIndex is exclusive
		int[] copyOfRangearray = Arrays.copyOfRange(array, 2, array.length);
		
		for(int element : copyOfRangearray) {
			System.out.print(element+" ");
		}

	}

}
