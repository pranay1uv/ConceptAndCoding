package VarArgMethod;

public class Declaration {

	// This is how you declare var-arg method
	// You should make sure to insert only three dots
	// other wise you will get a compilation error
	public static void m1(int... x) {
		System.out.println("Var-arg Method");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		m1();
		m1(10);
		m1(10,20);
		m1(10,20,30);
		m1(10,20,30,40);
		m1(10,20,30,40,50);
	}

}
