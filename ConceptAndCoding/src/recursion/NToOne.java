package recursion;


public class NToOne {

	static int  N = 5;
	static int  count  = 1;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// print Numbers from 5 to 1 using Recursion
		recursivePrint(N, count);
	}
	
	public static void recursivePrint(int N, int count) {
		if(count<=N) {
			recursivePrint(N, count);
		}
		System.out.println(count);
	}
}
