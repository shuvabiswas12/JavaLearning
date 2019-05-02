package com.shuva.problem10;

public class Prob10Vol7 {

	public static void main(String[] args) {
		int row, col;
		for(row=5; row>0; row--) {
			for(col=0; col<row; col++) {
				System.out.print("  *");
			}
			System.out.print("\n");
		}
		for(row=0; row<=5; row++) {
			for(col=0; col<row; col++) {
				System.out.print("  *");
			}
			System.out.print("\n");
		}
	}
}
