package lambdaExpressions;

import java.util.function.Predicate;

// Write a Java program that uses a Predicate to check if a number is prime.
public class PredicateClassLvlImpl implements Predicate<Integer> {

    public static void main(String[] args) {
	    PredicateClassLvlImpl pcl = new PredicateClassLvlImpl();
	    var x = 99;
	    pcl.test(5);
	}

	@Override
	public boolean test(Integer t) {
		// TODO Auto-generated method stub
		//if(t)
		// Prime Number
		// A given number is said to be prime
		// if it has only factors 1 and itself
		// How to find the factors of a given number
		// factor is a number which completely divides given number
		// In the process of complete division 
		// range of factors 1 to given Number
		int count = 0;
		for(int i = 1; i<=t; i++) {
			if(i%t == 0) {
				count++;
			}
		}
		if(count == 2) {
			System.out.println(true);
			return true;
		}
		System.out.println(false);
		return false;
	}	
}
	
