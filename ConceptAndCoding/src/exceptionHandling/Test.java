package exceptionHandling;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		 * when an Exception is being raised by the programmer explicitly 
		 * with the help of throw keyword with creating exception object with
		 * no argument constrcutor
		 * Then Only Exception Type and stack trace are printed on the console
		 * But not the Exception Description
		 */
//		ArithmeticException ae = new ArithmeticException();
//		throw ae;
		
		/*
		 * when an Exception is being raised by the programmer explicitly 
		 * with the help of throw keyword with creating exception object with
		 * String argument constrcutor
		 * Then  Exception Type along with its Description and stack trace are printed on the console
		 */
//		throw new ArithmeticException("thrhrhrh");
		ArithmeticException ae1 =  new ArithmeticException("Division By Zero");
		throw ae1;
		
		/*
		 * When An exception is taken care by exception Default Exception Handler or 
		 * it is being raised by Default Exception Handler
		 * Exception with its Description is Printed on the console
		 * along with stack trace
		 */
// 		System.out.println(10/0);
		// throw new Test();

	}

}
