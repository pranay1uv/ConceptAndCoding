package arrays;

public class LargestAndSmallestElements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] array = {12, 7, 3, 19, 5, 21, 8, 14, 2};
		// Largest = 21
		// Smallest Element = 2
		
		int largest = Integer.MIN_VALUE;
		int smallest = Integer.MAX_VALUE;
		
		// Can i Sumultaneously find both with one loop
		
		for(int i = 0; i<=array.length-1; i++) {
			if(array[i]>=largest) {
				largest = array[i];
			}
			if(array[i]<=smallest) {
				smallest = array[i];
			}
		}System.out.println(largest +" , " + smallest);
	}

}
