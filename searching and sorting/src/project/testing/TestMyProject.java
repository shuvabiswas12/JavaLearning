package project.testing;

import java.util.Scanner;

import project.bin_search.BinSearchProject;
import project.bubble_sort.BubbleSortProject;

public class TestMyProject {

	public static void main(String[] args) {
		
	Scanner src = new Scanner(System.in);
	
	int array[], size, key;
	
	System.out.println("Enter the size of array : ");
	size = src.nextInt();
	
	array = new int[size];
	
	System.out.println("Enter the elements of array : ");
	for(int i=0; i<array.length; i++) {
		array[i] = src.nextInt();
	}
	
	System.out.println("Enter the key : ");
	key = src.nextInt();
	
	System.out.print("\nSorted Array : ");
	BubbleSortProject bubbleSortProject = new BubbleSortProject();
	bubbleSortProject.bubSort(array);
	
	System.out.println("\n");
	BinSearchProject binSearchProject = new BinSearchProject();
	binSearchProject.binSearch(key, array);
	
	}

}
