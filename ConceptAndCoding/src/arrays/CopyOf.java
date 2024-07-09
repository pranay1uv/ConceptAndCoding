package arrays;

import java.util.Arrays;

public class CopyOf {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] array = {10, 11, 12, 13, 14};
		int[] copyOfarray = Arrays.copyOf(array, array.length);
		
		for(int element : copyOfarray) {
			System.out.print(element+" ");
		}

	}

}
