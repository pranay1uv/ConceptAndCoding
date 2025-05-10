package arrays;

import java.util.Arrays;

public class ReverseArrayTwoPointerForLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] array = {6,22,1,33,3,11,2};
		// Reveresed Array = 2, 11 3 33 1 22 6
		int j = array.length-1;
		for(int i= 0; i<j; i++) {
			int temp = 0 ; 
			temp = array[i];
			array[i] = array[j];
			array[j] = temp;
			j--;
		}
		Arrays.stream(array).forEach(k->System.out.println(k));

	}

}
