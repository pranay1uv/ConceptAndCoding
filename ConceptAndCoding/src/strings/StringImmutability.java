package strings;

public class StringImmutability {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1 = new String("Pranay");
		//s1.concat("Kumar"); 
		String concat = s1.concat("Kumar");
		s1 = s1.concat("Kumar");
		
		
		StringBuffer sb = new StringBuffer("JavaDeveloper");
		
		
		/*
		 * Unreferenced Objects are available for Garbage Collection
		 * In line num 8 we are concatenating another string to older string
		 * i.e we are performing a runtime operations on String Object
		 */
	}
}
