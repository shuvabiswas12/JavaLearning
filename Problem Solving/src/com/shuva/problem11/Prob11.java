package com.shuva.problem11;

import java.util.Scanner;

public class Prob11 {

	public static void main(String[] args) {
		int[] array = new int[5];
		int i;
		Scanner src = new Scanner(System.in);
		
		for(i=0; i<array.length; i++) {
			array[i] = src.nextInt();
		}
		
		for(i=0; i<array.length; i++) {
			System.out.print(array[i]+" ");
		}
	}
}
