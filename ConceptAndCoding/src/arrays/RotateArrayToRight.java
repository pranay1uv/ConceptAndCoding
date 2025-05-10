package arrays;

import java.util.Arrays;

public class RotateArrayToRight {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Right Rotation of array
		// pick the asked number of elements from the right
		// and move them counterclock wise to the left most part of the array
		
		int[] array = {1,2,3,4,5,6,7,8};
		int k = 5;
		// Rotated Array = 4,5,6,7,8,1,2,3
		
		// Reverse the Entire Array Using Swapping Technique : 8,7,6,5,4,3,2,1
		// Reverse the picked half StartIndex : 1     EndIndex : k-1
		// finally reverse the rest of the half StartIndex : K  EndIndex : Array.length-1
		reverseArray(array, 0, array.length-1);
		reverseArray(array, 0, k-1);
		int[] finalArray = reverseArray(array, k, array.length-1);
		Arrays.stream(finalArray).forEach(p->System.out.println(p));
		

	}
	
	public static int[] reverseArray(int[] array, int si, int ei) {
		int temp = 0;
		while(si<ei) {
			temp = array[si];
			array[si] = array[ei];
			array[ei] = temp;
			si++;
			ei--;
		}
		return array;
	}
}
