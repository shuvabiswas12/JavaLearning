package com.shuva.problem10;

public class Prob10 {

	public static void main(String[] args) {
		int row, col;
		for(row=0; row<5; row++) {
			for(col=0; col<row; col++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

}
