package basicMath;

public class FactorialProgram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int k = 9;
		
		// 9 factorial answer = 9*8*7*6*5*4*3*2*1
		int fact = 1;
		for(int i = k; i>=1; i--) {
			fact = i * fact;
			//System.out.println(fact);
		}
		System.out.println(fact);
		

	}

}
