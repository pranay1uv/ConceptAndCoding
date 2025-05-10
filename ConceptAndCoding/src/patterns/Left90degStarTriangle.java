package patterns;

public class Left90degStarTriangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int N = 5;
		//*
		//**
		//***
		//****
		//*****
		for(int i = 1; i<=N; i++) {
			// for every Line i have to print Line of stars
			for(int j =1; j<=i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
