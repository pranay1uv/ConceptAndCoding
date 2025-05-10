package basicMath;


public class Fibonacci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Generate Fibonacci Series upto n = 11
		// 0 , 1 are the startting elements of the F series
		// The SubSequent Numbers after this are sum of the prev two elements
		// If i loop from i = 2 to n
		// fibonacciElement =  firstElement + SecondElement
		// after this i should update the elements
		
		int firstElement = 0;
		int secondElement = 1;
		int fibonacciElement = 0;
		int n = 11;
		System.out.print(firstElement);
		System.out.print(secondElement);
		for(int i = 2; i<=n; i++) {
		
			fibonacciElement = firstElement+secondElement;
			System.out.print(fibonacciElement);
			firstElement = secondElement;
		    secondElement = fibonacciElement;
		}
		

	}

}
