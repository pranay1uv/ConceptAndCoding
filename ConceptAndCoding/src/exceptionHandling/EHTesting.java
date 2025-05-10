package exceptionHandling;

import java.util.Scanner;

public class EHTesting {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int Age = sc.nextInt();
		if(Age>60) {
			// Here Why you have used throw KeyWord
			// To Create the exception object manually and hand it over to the default Exception Handler
			// Action the method in which exception is raised . that method is responsible for creating the exception object
			// and handling it to the default Exception handler
			// So the conclusion is if you want to do it manaully then use throw keyword
			throw new CustomizedException("You are too young to get married. Very ssoon you will find a match in heaven");
		}
	}

}
