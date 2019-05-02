package com.shape;

import java.util.Scanner;

public class ReverseNumberShapeTwo {
	public static void main(String[] args) {
		int i, j, size;
		Scanner src = new Scanner(System.in);
		System.out.println("Enter the  Size : ");
		size = src.nextInt();
		
		for(i=size; i>0; i--) {
			for(j=0; j<i; j++) {
				System.out.print(i+" ");
			}
			System.out.println(" ");
		}
	}

}
