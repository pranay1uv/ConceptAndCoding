package methodReference;

import java.util.function.Function;
import java.lang.*;

public class MRtoStaticmethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Function<Integer, Double> fi = (value)->{double sqrt = Math.sqrt(value);return sqrt;};
		System.out.println(fi.apply(4));

	}

}
