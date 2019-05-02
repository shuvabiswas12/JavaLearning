package com.shuva.problem10;

public class Prob10Vol3 {

	public static void main(String[] args) {
		int row, col;
		for(row = 0; row<=5; row++) {
			for(col = 1; col<row; col++) {
				System.out.print(col);
			}
			System.out.println();
		}
	}

}
