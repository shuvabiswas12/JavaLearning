package com.shuva.problem10;

public class Prob10Vol5 {

	public static void main(String[] args) {
		int row, col;
		for(row = 0; row<5; row++) {
			char var = 'A';
			for(col = 0; col<row; col++) {
				System.out.print(var);
				var++;
			}
			System.out.println();
		}
	}

}
