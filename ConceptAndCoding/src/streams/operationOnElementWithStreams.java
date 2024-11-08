package streams;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class operationOnElementWithStreams {
	
	public static void main(String[] args) {
		
		Set<Integer> set = new HashSet<>();
		List<Integer> asList = Arrays.asList(12,14,1,6,17,18,22,35,66);
		set.addAll(asList);
		
		Set<Integer> setStream = new HashSet<>();
		setStream = set.stream().map(I->I*2).collect(Collectors.toSet());
		System.out.println(setStream);
		
	}

}
