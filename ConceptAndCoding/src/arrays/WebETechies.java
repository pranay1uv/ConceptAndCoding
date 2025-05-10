package arrays;

import java.util.HashMap;
import java.util.Map;

public class WebETechies {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// ind the second lowest element in an int array ?
		// How do i find the 1st
		// then 2nd
		
		
		int[] array = {1,2,3,4,2,3};
		
		int firstLowest = array[0];
		int secondLowest = Integer.MAX_VALUE;
		
		for(int i = 0; i<=array.length; i++) {
			if(array[i]<firstLowest) {
				secondLowest = firstLowest;
				firstLowest = array[i];
			}
		}System.out.println(secondLowest);
	}

}
