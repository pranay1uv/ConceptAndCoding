package map;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class IterateMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Map<Integer,Integer> map = new HashMap<>();
		map.put(1, 8);
		map.put(2, 20);
		map.put(3, 30);
		map.put(4, 41);
		
		
		
		Set<Entry<Integer, Integer>> entrySet = map.entrySet();
		for(Entry element : entrySet) {
			System.out.println(element);
		}
		
		
        for(Integer element : map.values()) {
        	System.out.println(element);
        }
        
        for(Integer element : map.keySet()) {
        	System.out.println(element);
        }
        
        

	}

}
