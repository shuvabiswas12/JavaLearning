package com.shuva.problem11;

public class Prob11Vol6 {

	public static void main(String[] args) {
		int[] array = {10,11,12,13,14,15,16,17,18,19,20,21,22,23,24,25,26,27,28,29,30,31,32,33,34};
		int i, j;
		/*for(i=0; i<array.length; i++) {
			System.out.print(array[i]+" ");
		}
		System.out.println("\n Array Length: "+array.length);*/
		
		for(i=0; i<array.length; i++) {
			for(j=0; j<array.length; j++) {
				System.out.print(array[j]+" ");
			}
			System.out.println();
		}
		System.out.println("Array Length: "+array.length);
		System.out.println("Row = "+(i-2));
		System.out.println("Coulmn = "+array.length);
		

	}

}
