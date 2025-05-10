package arrays;

public class SecondLowestElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] array = {1,1,1};
		
		// I have to find the second lowest element in the above array
		// how to do
		// First thing i need support of first lowest element
		// how can i take support of fle
		// assign fle as array[0]
		// create secondlowestelement variable
		// assign sle as math.maxValue
		// loop the array from the second element
		int smallest = Integer.MAX_VALUE;
		int secSmallest = -1;
		// Smallest is already Defined
		// So in the process of iterating the elements in the array
		// if at all any element is smaller than smallest element
		// what does that mean?
		// till now maxValue is the smallest
		// Now some other value is smaller than smallest
		
		// our motive is calculating both smallestelement
		// and secondSmallest element at each iteration of the array
		// by comparison
		for(int i = 0; i<array.length; i++) {
			if(array[i] < smallest) {
				secSmallest = smallest;
				smallest = array[i];
			}else if(array[i] < secSmallest && array[i]!=smallest) {
				secSmallest = array[i];
			}
			//System.out.println(smallest+","+secSmallest);
		}System.out.println(secSmallest);
	}
}
