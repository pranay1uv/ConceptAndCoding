package unaryOperators;

public class PreAndPostIncrement {

	public static void main(String[] args) {
		 int a = 7;
		 boolean res = a++ == 7 && ++a == 9 || a++ == 9 ;
		 System.out.println(a + " " + res);
	}

}
