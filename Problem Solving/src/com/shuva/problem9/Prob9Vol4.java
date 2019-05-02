package com.shuva.problem9;

public class Prob9Vol4 {

	public static void main(String[] args) {
		int series = 2, sum = 0;
		System.out.print(series);
		for(series=4; series<=20; series+=2) {
			System.out.print(" + "+series);
			sum = sum + series;
		}
		System.out.print(" = "+sum);
	}

}
