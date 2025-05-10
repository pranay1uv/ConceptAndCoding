package strings;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class HighestFrequencyStringinList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> list = new ArrayList<>();
		list = Arrays.asList("India","is","Best","India","is","Great");
		Map<String,Integer> map = new HashMap<>();
		
		
		for(String value : list) {
			if(map.containsKey(value)) {
				map.put(value, map.get(value)+1);
			}else {
				map.put(value, 1);
			}
		}
		for(Map.Entry<String,Integer> entry : map.entrySet()) {
			System.out.println(entry.getKey()+" "+entry.getValue());
		}

	}

}
