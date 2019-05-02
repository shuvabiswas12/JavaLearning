package com.shuva.problem9;

public class Prob9Vol7 {

	public static void main(String[] args) {
		int sum = 0, series = 5;
		System.out.print(series);
		do {
			series++;
			if ((series%5) == 0) {
				System.out.print(" + "+series);
				sum = sum + series;
			}
			
		} while (series<=100);
		System.out.print(" = "+sum);
	}
}
