package com.shuva.problem11;

public class Prob11Vol4 {

	public static void main(String[] args) {
		int array[][] = new int[2][2];
		
		array[0][0] = 3;
		array[0][1] = 4;
		array[1][0] = 5;
		array[1][1] = 6;
		
		for(int i=0; i<array.length; i++) {
			for(int j=0; j<array.length; j++) {
				System.out.print(array[i][j]+" ");
			}
			System.out.println();
		}
	}
}
