package map;

import java.util.HashMap;
import java.util.Map;

public class PutReturnValue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Put Method in Map actually returns the previously stored value of the key
		
		Map<String,String> map = new HashMap<>();
		map.put("key1", "value1");
		System.out.println(map.put("key1", "value2"));
		

	}

}
