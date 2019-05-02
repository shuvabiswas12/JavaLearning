package com.shuva.problem10;

public class Prob10Vol4 {

	public static void main(String[] args) {
		int row, col;
		for(row = 5; row>0; row--) {
			for(col=1; col<row; col++) {
				System.out.print(col);
			}
			System.out.println();
		}
	}
}
