package arrays;

import java.util.Arrays;


public class ReverseArrayTwoPointerWhileLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] array = {1,2,3,4,5};
		
		// I have to reverse it
		// 5 4 3 2 1
		// How can i use swapping technique
		int i = 0;
		int j = array.length-1;
		int temp = 0;
		while(i<j) {
			temp = array[i];
			array[i] = array[j];
			array[j] = temp;
			i++;
			j--;
		}
		
		Arrays.stream(array).forEach(k -> System.out.println(k));
	}

}
