package patterns;

public class Left90degIncNumberTriangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int N = 5;
		// 1
		// 23
		// 345
		// 4567
		// 56789
		// Printing Num is Dynamic
		// How can i get 3
		int count = 1;
		for(int i = 1; i<=N;i++) {
			for(int j = 1; j<=i;j++) {
				System.out.print(count++);
			}
			System.out.println();
		}
	}
}
