package basicMath;

import java.util.Scanner;

public class PrimeNumorNot {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// given a number i.e integer
		// I have to check whether the number is a prime or not with better time complexity
		// Finally Return Boolean
		// A number is said to be a prime number 
		// it should only have two factors i.e one and itself
		// how do i find factors for a number
		// any number between 2 to 9 if it is completely divisible by given number 
		// then it is a factor 
		// otherwise it is not
		Scanner sc = new Scanner(System.in);
		int number = sc.nextInt();
		int count = 0;
		for(int i = 1; i<=number; i++) {
			if(number % i == 0){
				count++;
			}
		}
		if(count==2) {
			System.out.println("The given number is  a prime number");
		}else {
			System.out.println("The given number is not a prime number");
		}
	}

}
