package com.shape;

import java.util.Scanner;

public class StarShapeSecond {
	
	public static void main(String[] args) {
		int i, j, size;
		Scanner src = new Scanner(System.in);
		System.out.println("Enter the size : ");
		size = src.nextInt();
		for(i=1; i<=size; i++) {
			for(j=0; j<i; j++) {
				System.out.print(i+" ");
			}
			System.out.println(" ");
		}
	}
}
