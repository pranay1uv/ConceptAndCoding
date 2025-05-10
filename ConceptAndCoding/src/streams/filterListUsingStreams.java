package streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class filterListUsingStreams {
	
	public static void main(String[] args) {
		
		// al holds Integer type of objects
//		ArrayList<Integer> al = new ArrayList<>();
//		al.add(10);
//		al.add(12);
//		al.add(33);
//		al.add(36);
		
//		List<Integer> list = new ArrayList<>();
//		list.add(10);
//		list.add(12);
//		list.add(33);
//		list.add(36);
		
		List<Integer> asList = Arrays.asList(26,27,29,35,46,80,82,99);
		
		List<Integer> evenList = asList.stream().filter((I)->I%2==0).collect(Collectors.toList());
		// filter() accepts Predicate FunctionalInterface as a parameter
		// So we have to provide Lambda Expression which is the implementation for the FunctionalInterface
		// So we have create Lambda Expression for the test method present in Predicate
		System.out.println(evenList);
		
		Predicate<Integer> pred = ((i)->i%2!=0);
		List<Integer> oddList = asList.stream().filter(pred).collect(Collectors.toList());
		System.out.println(oddList);
		
	}

}
