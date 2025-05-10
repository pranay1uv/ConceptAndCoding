package exceptionHandling;

public class DefaultExceptionHandler {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		 doStuff();
	}

	public static void doStuff()   {
		// TODO Auto-generated method stub
	//	doMoreStuff();
	}
	
	public static void doMoreStuff() throws InterruptedException  {
		//System.out.println(10/0);
		Thread.sleep(10000);
		//throw new InterruptedException("thread Exception");
		
	}
	

}
