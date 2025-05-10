package arrays;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class OccurencesOfElementOptimal {
	
    // Intution: Using map for storing frquency of each element	
	// getMethod of map is your saviour for getting the previously stored value for the associated key
	// then we increment that value with 1
	// So every time in the loop an element is present in the map
	// we increment the previously stored value with 1(add 1)

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Integer MaxValue =  -1;
		
		int[] array = {1,2,3,4,2,3};
		Map<Integer,Integer> map = new HashMap<>();
		for(int i = 0; i<array.length;i++) {
			if(map.containsKey(array[i])) {
				 map.put(array[i], map.get(array[i])+1);
			}else {
				map.put(array[i], 1);
			}
		}
		for(Entry<Integer, Integer> values :map.entrySet()) {
			Integer key = values.getKey();
			Integer value = values.getValue();
			System.out.println(key+" "+value);
			MaxValue = Math.max(MaxValue, value);
		}
		System.out.println(MaxValue);
//		for(var vars : map.entrySet()) {
//			System.out.println(vars);
//		}
		
//		ArrayList<Integer> al = new ArrayList<Integer>(map.values()); 
//		for(Integer value : al) {
//			System.out.println(value);
//		}

	}

}
