package com.shuva.problem9;

public class Prob9Vol6 {

	public static void main(String[] args) {
		int series = 5, sum = 0;
		System.out.print(series);
		while (series<=100) {
			if((series%5) == 0) {
				System.out.print(" + "+series);
				sum = sum + series;
			}
			series+=5;
		}
		System.out.print(" = "+sum);
	}
}
