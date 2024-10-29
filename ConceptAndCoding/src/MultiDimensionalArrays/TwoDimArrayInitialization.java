package MultiDimensionalArrays;

public class TwoDimArrayInitialization {
	
	public static void printTwoDimArray(int[][] arr) {
		int c = arr[0].length; // No of cols 
		int r = arr.length; // No of rows 
		for(int i = 0; i<r; i++) {
			for(int j = 0; j<c; j++) {
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {
		
		// Methods of initializing the two Dim Arrays
		// Method 1
		int[][] twoDim = new int[3][5];
		
		// Method 2
		int[][] twoDim2 = {{1,2,3,4,5},{3,4,5,6,7},{8,9,10,11,12}};
		
		printTwoDimArray(twoDim2);
		
	}

}
