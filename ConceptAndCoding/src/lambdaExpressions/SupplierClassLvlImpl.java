package lambdaExpressions;

import java.time.LocalDateTime;
import java.util.function.Supplier;

public class SupplierClassLvlImpl implements Supplier<LocalDateTime> {

	@Override
	public LocalDateTime get() {
		// TODO Auto-generated method stub
		return LocalDateTime.now();
	}
	
	public static void main(String[] args) {
		Supplier<LocalDateTime> supp = new SupplierClassLvlImpl();
		LocalDateTime localDateTime = supp.get();
		System.out.println(localDateTime);
	}

}
