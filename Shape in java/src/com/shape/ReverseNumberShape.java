package com.shape;

import java.util.Scanner;

public class ReverseNumberShape {

	public static void main(String[] args) {
		int i, j, size;
		Scanner src = new Scanner(System.in);
		System.out.println("Enter the size : ");
		size = src.nextInt();
		for(i=size; i>0; i--) {
			for(j=1; j<=i; j++) {
				System.out.print(j+" ");
			}
			System.out.println(" ");
		}
	}

}
