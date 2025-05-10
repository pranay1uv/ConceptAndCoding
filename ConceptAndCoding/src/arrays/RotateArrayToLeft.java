package arrays;

import java.util.Arrays;

public class RotateArrayToLeft {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] array = {1,2,3,4,5,6,7,8};
		int k = 3;
		k = k%array.length;
		
		// RotatedArray = 4,5,6,7,8,1,2,3  
		
		// how to left rotate array
		// Reverse the entire array // 8,7,6,5,4,3,2,1
		// Reverse the last half //   array.length - k is the startIndex array.length-1 is the endIndex
		// Reverse the first Half // 0 is the startIndex array.length-1 - k
		reverseArray(array, 0, array.length-1);
		reverseArray(array, array.length-k, array.length-1);
		int[] finalarray = reverseArray(array, 0, array.length-1 - k);
		Arrays.stream(finalarray).forEach(p -> System.out.println(p));
	}
	
	public static int[] reverseArray(int[] array, int startIndex,int endIndex) {
		int temp = 0;
		while(startIndex<endIndex) {
			temp = array[startIndex];
			array[startIndex] = array[endIndex];
			array[endIndex] = temp;
			startIndex++;
			endIndex--;
		}return array;
		
	}
	
	

}
