package arrays;

import java.util.HashSet;
import java.util.Set;

public class RemoveDuplicatesInArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] array = {12, 7, 12, 3, 19, 5, 21, 21, 8, 14, 2};
		
		// Duplicate Elements in the above array  = 12 ,24
		// how can i remove all the duplicate elements in the array
		// I can Take Support of Set DataStructure
		
		Set<Integer> set = new HashSet<Integer>();
		
		for(Integer element : array) {
			set.add(element);
		}
        set.stream().forEach(p->System.out.println(p));
	}

}
