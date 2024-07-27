package unaryOperators;

public class PreAndPostIncrement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int a = 7;
		 boolean res = a++ == 7 && ++a == 9 || a++ == 9 ;
		 System.out.println(a + " " + res);
	}

}
