package exceptionHandling;

public class ExceptionHasAlreadyBeenCaught {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		try {
//			System.out.println(10/0);
//		}catch(ArithmeticException e) {
//               System.out.println(10/9);
//		}
//		catch(Exception e) {
//			System.out.println(10/9);
//		}
		System.out.println(10/0);
		
//		finally {
//			System.out.println("Finally Block Executed");
//		}
		System.out.println("GracefulTermination");
	}

}
