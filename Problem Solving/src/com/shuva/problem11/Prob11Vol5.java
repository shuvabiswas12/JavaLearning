package com.shuva.problem11;

public class Prob11Vol5 {

	public static void main(String[] args) {
		int[][] array = new int[5][10];
		
		array[0][0] = 10;
		array[0][1] = 11;
		array[0][2] = 12;
		array[0][3] = 13;
		array[0][4] = 14;
		
		array[1][0] = 15;
		array[1][1] = 16;
		array[1][2] = 17;
		array[1][3] = 18;
		array[1][4] = 19;
		
		array[2][0] = 20;
		array[2][1] = 21;
		array[2][2] = 22;
		array[2][3] = 23;
		array[2][4] = 24;
		
		array[3][0] = 25;
		array[3][1] = 26;
		array[3][2] = 27;
		array[3][3] = 28;
		array[3][4] = 29;
		
		array[4][0] = 30;
		array[4][1] = 31;
		array[4][2] = 32;
		array[4][3] = 33;
		array[4][4] = 34;
		
		for(int i=0; i<array.length; i++) {
			for(int j=0; j<array.length; j++) {
				System.out.print(array[i][j]+" ");
			}
			System.out.println();
		}
		System.out.println("Array Length: "+array.length);
	}

}
