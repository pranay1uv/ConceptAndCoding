package MultiThreading;

public class StartRunnable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ImpRunnable impr = new ImpRunnable();
		Thread t = new Thread(impr);
		t.start();
		System.out.println("MainThread Executed");
	}

}
