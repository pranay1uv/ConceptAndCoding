package strings;

public class StringEquality {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1 = "pranay";
		String s2 = "pranay";
		System.out.println(s1==s2);
		// == operators will compare the references of two strings
		
		String s3 = new String("PamujulaPranayKumar");
        String s4 = "PamujulaPranayKumar";
        System.out.println(s3==s4);
	}

}
