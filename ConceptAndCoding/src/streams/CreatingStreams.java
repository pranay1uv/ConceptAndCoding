package streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class CreatingStreams {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Streams can be created from dataSource
		
		// DataSource : Array
		String[] sArray = {"Java","is","Awesome",};
		Stream<String> stream = Arrays.stream(sArray);
		//stream.forEach(System.out.println());
		

	}

}
