package com.shuva.problem11;

public class Prob11Vol7 {
	
	public static void main(String[] args) {
		int[][] array = {
				
				{10,11,12,13,14},
				{15,16,17,18,19},
				{20,21,22,23,24},
				{25,26,27,28,29},
				{30,31,32,33,34}
		};
		
		for(int i=0; i<array.length; i++) {
			for(int j=0; j<array.length; j++) {
				System.out.print(array[i][j]+" ");
			}
			System.out.println();
		}
	}
}
