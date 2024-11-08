package lambdaExpressions;

import java.util.Optional;


public class Optionals {
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String email = "PranayKumar1uv@gmail.com";
		String emailID = "PranayKumar1uv@gmail.com";
		
		Optional<Object> ot = Optional.empty(); 
		System.out.println(ot);
		
//		Optional<String> of = Optional.of(emailID);
//		System.out.println(of);
		
		Optional<String> ofNullable = Optional.ofNullable(emailID);
		//System.out.println(ofNullable.get());
		
		
//		if(ofNullable.isPresent()) {
//			System.out.println(ofNullable.get());
//		}
		
		String orElse = ofNullable.orElse("Pranay");
		System.out.println(orElse);
		
		String orElseGet = ofNullable.orElseGet(()->{return "Implementation";});
		System.out.println(orElseGet);
		
		String orElseThrow = ofNullable.orElseThrow(() -> new IllegalArgumentException( "orElseThrow"));
		System.out.println(orElseThrow);
		
		
	}

}
