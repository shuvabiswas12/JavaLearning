package com.shuva.problem9;

public class Prob9Vol2 {

	public static void main(String[] args) {
		int series = 1, sum = 0;
		System.out.print(series);
		for(series=2 ; series<=20; series++) {
			System.out.print(" + "+series);
			sum = sum + series;
		}
		System.out.println(" = "+sum);
	}
}
