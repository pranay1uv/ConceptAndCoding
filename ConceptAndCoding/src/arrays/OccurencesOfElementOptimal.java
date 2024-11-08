package arrays;

import java.util.HashMap;
import java.util.Map;

public class OccurencesOfElementOptimal {
	
    // Intution: Using map for storing frquency of each element	
	// getMethod of map is your saviour for getting the previously stored value for the associated key
	// then we increment that value with 1
	// So every time in the loop an element is present in the map
	// we increment the previously stored value with 1(add 1)

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] array = {1,2,3,4,2,3};
		Map<Integer,Integer> map = new HashMap<>();
		for(int i = 0; i<array.length;i++) {
			if(map.containsKey(array[i])) {
				 map.put(array[i], map.get(array[i])+1);
			}
			map.put(array[i], 1);
		}

	}

}
