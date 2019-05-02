package com.shuva.problem9;

public class Prob9Vol5 {

	public static void main(String[] args) {
		int series = 5, sum = 0;
		System.out.print(series);
		for(series = 10; series<=100; series+=5) {
			if (series%5 == 0) {
				System.out.print(" + "+series);
				sum = sum +series;
			}
		}
		System.out.println(" = "+sum);
	}

}
