package map;

import java.util.HashMap;
import java.util.Map;

public class GetOrDefaultmethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Map<String, Integer> map = new HashMap<>();
		map.put("a", 100);
		map.put("b", 200);
		//map.put("c", 300);
		map.put("d", 400);
		
		/*
		 * i have commented the line No : 14 to get the get the default value
		 * for the specified key i.e 'c'
		 */
		Integer orDefault = map.getOrDefault("c", 500);
		
		System.out.println(orDefault);

	}

}
