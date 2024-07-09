package arrays;

public class Clone {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] array1 = {5,6,7,8,9};
		int[] array2 =  array1.clone();
		
		array2[0] = 0;
		array2[1] = 0;
		
		for(int element : array2) {
			System.out.print(element+" ");
		}
	}

}
