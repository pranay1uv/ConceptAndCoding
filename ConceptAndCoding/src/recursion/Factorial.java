package recursion;

public class Factorial {

	static int  N = 5;
	static int count = N;
	static int  fact = 1;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Write a program to calculate the factorial where N = 5
		// 5! = 5*4*3*2*1
		System.out.println(recursiveFactorial(N, count,fact));

	}
	public static int recursiveFactorial(int N, int count,int fact){
		
		fact = fact * count;
		count--;
		if(count>=1) {
			return recursiveFactorial(N,count,fact);
		}
		return fact;
	}
}
