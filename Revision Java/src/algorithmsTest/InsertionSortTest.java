package algorithmsTest;

import java.util.Scanner;

public class InsertionSortTest {
	
	public static void main (String[] args) {
		Scanner src = new Scanner(System.in);
		
		System.out.println("Enter the size : ");
		int size = src.nextInt();
		
		System.out.println("Enter the array: ");
		int [] a = new int[size];
		
		for (int i=0; i<size; i++) {
			a[i] = src.nextInt();
		}
		
		InsertionSortTest obj = new InsertionSortTest();
		a = obj.sort(a, size);
		for (int i=0; i<a.length; i++) {
			System.out.print(a[i] + " ");
		}
		System.out.println();
	}

	
	protected int [] sort(int[] a, int n) {
		
		int j, item;
		for (int i=1; i<n; i++) {
			
			item = a[i];
			j = i-1;
			
			
			while(j>=0 && a[j] > item) {
				a[j+1] = a[j];
				j--;
			}

			
			a[j+1] = item;
			
			for (j=0; j<n; j++) {
				System.out.print(a[j] + " ");
			}
			
			System.out.println();
		}
		
		return a;
	}
}


