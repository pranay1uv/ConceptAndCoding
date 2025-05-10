package arrays;

public class SecondSmallest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] array = {5,5,5};
		// now from the above array i have to find the second smallest element
		
		int firstSmallest = Integer.MAX_VALUE;
		int secondSmallest = Integer.MAX_VALUE-1;
		for(int i = 0; i<=array.length-1; i++) {
			if(array[i] < firstSmallest) {
				secondSmallest = firstSmallest;
				firstSmallest = array[i];
			}else if(array[i] < secondSmallest) {
				secondSmallest = array[i];
			}
		}System.out.println(secondSmallest);
	}

}
