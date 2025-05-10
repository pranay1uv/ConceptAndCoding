package arrays;

public class SecondLargestElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] array = {12, 7, 3, 19, 5, 21, 8, 14, 2};
		
		// SecondLargest : 19
		
		// Find the SecondLargest Element in the array
		// First i need to know first largest
		// then i can find second largest
		// i have to loop the entire array
		// in process of this 
		// I will be finding both first largest and second largest
		// Simultaneously
		// if i find any element that is greater than firstlargest
		// then i have to do shuffling reversely
		
		int firstLargest = Integer.MIN_VALUE;
		int secondLargest = Integer.MIN_VALUE;
		for(int i = 0; i<=array.length-1; i++) {
			if(array[i]>firstLargest) {
				secondLargest = firstLargest;
				firstLargest = array[i];
			}else if (array[i] == firstLargest || array[i]>secondLargest) {
				secondLargest = array[i];
			}
		}System.out.println(secondLargest);
	}

}
