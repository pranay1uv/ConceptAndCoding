package MultiDimensionalArrays;

import java.util.Scanner;

public class TakeTwoDimArrInputAndPrint {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		// I have to receive 2d array fromm the scanner
		
		
		
		System.out.println("enter the no of rows");
		int r = sc.nextInt();
		System.out.println("enter the no of cols");
		int c = sc.nextInt();
		
		int[][] twoDim = new int[r][c];
		
		for(int i = 0; i<r; i++) {
			for(int j = 0; j<c; j++) {
				twoDim[i][j] = sc.nextInt();
			}
		}
		
		for(int k = 0; k<twoDim.length; k++) {
			for(int l = 0; l<twoDim[k].length; l++) {
				System.out.print(twoDim[k][l]+" ");
			}
			System.out.println();
		}
		

	}

}
