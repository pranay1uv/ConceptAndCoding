package bitManipulation;

import java.util.Scanner;

public class ToogleIthbit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int givenNumber = sc.nextInt();
	    int ith = 4;
	    int value = (givenNumber ^ (1<<ith));
	    System.out.println(value);
	}

}
