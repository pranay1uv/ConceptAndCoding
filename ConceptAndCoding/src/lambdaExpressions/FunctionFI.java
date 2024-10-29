package lambdaExpressions;

import java.util.function.Function;

public class FunctionFI {

	
	public static void main(String[] args) {
		
		Function<String, Integer>  function = (String t) ->  t.length();
		System.out.println(function.apply("pranay"));
	}

}
