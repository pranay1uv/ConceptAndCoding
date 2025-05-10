package recursion;

public class OneToN {
	static int counter = 1;
	static int sum = 0;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int N =4;
		
		System.out.println(recursiveSum(N,counter,sum));
		

	}
	
	public static int recursiveSum(int N, int count,int sum) {
		sum = sum + count;
		count = count+1;
		System.out.println(sum);
		if(count<=N) {
			return recursiveSum(N, count, sum);
		}
		return sum;
	}
}
