package patterns;

public class Right90degStarTriangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int N = 5;
		//    *
		//   **
		//  ***
		// ****
		//*****
		
		for(int i = 1; i<=N; i++) {
			for(int j = 1;j<=N-i;j++) {
				System.out.print(" ");
			}
			for(int k = 1; k<=i; k++) {
				System.out.print("*");
			}
			System.out.println();
		}

	}

}
