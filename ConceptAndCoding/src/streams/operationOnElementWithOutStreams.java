package streams;

import java.util.HashSet;
import java.util.Set;

public class operationOnElementWithOutStreams {
	
	
	public static void main(String[] args) {
		
		// Collection Set
		// Set hold objects of type Integer
		Set<Integer> set = new HashSet<>();
		set.add(55);
		set.add(65);
		set.add(75);
		set.add(85);
		set.add(95);
		set.add(105);
		
		Set<Integer> sett = new HashSet<>();
		for(Integer I1:set) {
			sett.add(I1*2);
		}
		//Set Doesnt follow Insertion Order
		System.out.println(sett);
		
	}

}
