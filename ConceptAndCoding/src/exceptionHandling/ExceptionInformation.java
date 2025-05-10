package exceptionHandling;

public class ExceptionInformation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			System.out.println(10/0);
		}catch(Exception e) {
			System.out.println(e);
			System.out.println(e.getMessage());
		    System.out.println(e.getLocalizedMessage());
		    e.printStackTrace();
			
		}

	}

}
