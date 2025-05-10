package arrays;

import java.util.HashSet;
import java.util.Set;

public class FirstDuplicateElementInArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] array = {1,2,22,9,5,5,22,6,6};
		
		Set<Integer> set = new HashSet<>();
		
		// Answer : 22
		for(Integer value :array) {
			if(!set.add(value)) {
				System.out.println("First Duplicate Element"+value);
			}
		}
	}
	

}
