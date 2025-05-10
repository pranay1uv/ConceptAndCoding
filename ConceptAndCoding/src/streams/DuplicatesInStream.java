package streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class DuplicatesInStream{

	public static void main(String[] args){
		//,TODO,Auto-generated,method,stub
		
		int[] array = {19,19,11,17,15,15,20,11,10,17,17,15,18,16,17,13,17,19};
		// whwn i use Distinct Method 
		// it return a new stream of distinct integers from the datasource
		Arrays.stream(array).distinct().boxed().forEach(i -> 
		{
			System.out.println(i);
		} );
		// Thhe type of the input Argument will automatically be inferred 

	}

}
