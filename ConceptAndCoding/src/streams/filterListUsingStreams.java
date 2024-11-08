package streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
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
		
		List<Integer> l1 = asList.stream().filter(I->I%2==0).collect(Collectors.toList());
		System.out.println(l1);
		
	}

}
