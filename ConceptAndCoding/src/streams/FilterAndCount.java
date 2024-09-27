package streams;

import java.util.ArrayList;
import java.util.List;

public class FilterAndCount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Integer> salarylist = new ArrayList<>();
		salarylist.add(25000);
		salarylist.add(35000);
		salarylist.add(45000);
		salarylist.add(55000);
		salarylist.add(65000);
		salarylist.add(75000);
		salarylist.add(85000);
		salarylist.add(95000);
		
		
		long count = salarylist.stream().filter((sal) -> sal>=30000).count();
		System.out.println(count);

	}

}
