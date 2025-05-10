package patterns;

public class Right90degIncNumberTriangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int N = 4;
		//      1
		//     23
		//    456
		//  78910
//	   1112131415
		int count = 1;
		for(int i = 1; i <= N;i++) {
			for(int j = 1;j<=N-i; j++) {
				System.out.print(" ");
			}
			for(int k = 1; k<=i; k++) {
				System.out.print(count++);
			}
			System.out.println();
		}

	}

}
