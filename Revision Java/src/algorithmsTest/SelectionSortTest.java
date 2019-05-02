package algorithmsTest;

import java.util.Scanner;

public class SelectionSortTest {
	
	public static void main (String args[]) {
		
		Scanner src = new Scanner(System.in);
		
		System.out.println("Enter the size of array: ");
		int size = src.nextInt();
		
		System.out.println("Enter the number list: ");
		int[] arr = new int[size];
		
		for (int i=0; i<size; i++) {
			arr[i] = src.nextInt();
		}
		
		SelectionSortTest obj = new SelectionSortTest();
		;
		int [] a = obj.sort(arr,  size);
		for (int i=0; i<a.length; i++) {
			System.out.print(a[i] + " ");
		}
		
		System.out.println();
		
		
	}

	protected int[] sort(int a[], int n) {
		
		int i, j, temp, index_min;
		
		for (i=0; i<n-1; i++) {
			
			index_min  = i;
			
			j = i+1;

			while (j<n) {
				if (a[index_min] > a[j]) {
					index_min = j;
				}
				j++;
			}
			
	
			
			if (index_min != i) {
				temp = a[i];
				a[i] = a[index_min];
				a[index_min]= temp; 
				
				for (j=0; j<n; j++) {
					System.out.print(a[j] + " ");
				}
				System.out.println();
				
			}
		}
		
		return a;
	}
}

