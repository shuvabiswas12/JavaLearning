package com.shuva.problem9;

public class Prob9Vol3 {

	public static void main(String[] args) {
		int series = 1, sum = 0;
		System.out.print(series);
		for(series = 3; series<=20; series+=2) {
			System.out.print(" + "+series);
			sum = sum + series;
		}
		System.out.print(" = "+sum);
	}

}
