package lambdaExpressions;

interface addable{
	
	int addition(int a , int b);
}

//class add implements addable{
//
//	 public int addition(int a, int b) {
//		// TODO Auto-generated method stub
//		return a+b;
//	}
//}

/**
 * 
 * @author Pranay
 * Multiple parameters in lambda expressions
 * Multiple statements in Lambda Body
 */
public class LambdaParameters {
	
	public static void main(String[] args) {
		
//		addable addingAB =  (a, b) -> a+b;
//		int addition = addingAB.addition(25, 35);
//		System.out.println(addition);
		
		
		addable adding =   (a, b) ->  { int c = a+b; 
                                        return c;
                                      };
                                      
        int LC = adding.addition(25, 35);
        System.out.println(LC);
		
		
	}

}
