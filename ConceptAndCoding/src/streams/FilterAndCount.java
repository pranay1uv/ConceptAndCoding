package streams;

import java.util.ArrayList;
import java.util.Arrays;
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
		
		List<Integer> asList = Arrays.asList(25000,35000,45000,55000,65000,75000,85000,95000);
		
		
		long count = asList.stream().filter((sal) -> sal>=30000).count();
		System.out.println(count);
		
		asList.forEach(intElement->System.out.println());
		
		// Lambda Syntax : parameters Lamda Operator Body of the Lambda

	}

}
