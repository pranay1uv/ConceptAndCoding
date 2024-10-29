package lambdaExpressions;

import java.time.LocalDateTime;
import java.util.function.Supplier;

public class SupplierLambdaExprsn {
	
	
	public static void main(String[] args) {
		
		Supplier<LocalDateTime> supl = () -> LocalDateTime.now();
		System.out.println(supl.get());
    }
}
