package streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

//Example 1: Filtering a List of Integers Using Predicate
//Suppose we have a list of integers, and we want to filter out all even numbers using a Predicate.
public class filerListWithOutStreams {
	
	public static void main(String[] args) {
//		List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);
		
		ArrayList<Integer> al = new ArrayList<>();
		al.add(0);
		al.add(10);
		al.add(20);
		al.add(2);
		al.add(23);
		al.add(55);
		
		List<Integer> l1 = new ArrayList<>();
		for(Integer I1 : al) {
			if(I1%2==0) {
				l1.add(I1);
			}
		}
		System.out.println(l1);
	}
}
