package lambdaExpressions;

import java.util.function.Consumer;

public class ConsumerLambdaExprsn {
	
	public static void main(String[] args) {
		
		Consumer<String> cns = (String s) -> System.out.println(s);
		
		cns.accept("xyz");
		
	}

}
