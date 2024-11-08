package streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class CreatingStreams {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Streams can be created from dataSource
		// Stream Contains Elements/Objects of type present in DataSource 
		
		// DataSource : Array
		String[] sArray = {"Java","is","Awesome",};
		Stream<String> stream = Arrays.stream(sArray);
		
		// DataSource : List
		List<Integer> l1 = new ArrayList<Integer>();
		List<Integer> asList = Arrays.asList(2,3,4,5,6,7,8,9);
		l1.addAll(asList);
		Stream<Integer> stream2 = l1.stream();
		//stream.forEach(System.out.println());
		

	}

}
