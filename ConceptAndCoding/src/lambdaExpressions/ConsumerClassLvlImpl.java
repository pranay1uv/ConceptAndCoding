package lambdaExpressions;

import java.util.function.Consumer;

public class ConsumerClassLvlImpl implements Consumer<String> {


	@Override
	public void accept(String t) {
		System.out.println(t);
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Consumer<String> c = new ConsumerClassLvlImpl();
		c.accept("ShikharDhawan");
		
	}

}
