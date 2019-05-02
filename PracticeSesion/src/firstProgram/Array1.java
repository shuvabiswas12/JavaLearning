package firstProgram;

import java.util.Arrays;
import java.util.Scanner;

public class Array1 {

	public static void main(String[] args) {
		
		int myArray[] = new int[5];
		
		Scanner src = new Scanner(System.in);
		
		System.out.println("Enter the elements : ");
		for (int i=0; i<myArray.length; i++) {
			myArray[i] = src.nextInt();
		}
		
		for (int i=0; i<myArray.length; i++) {
			System.out.println("myArray["+i+"]="+myArray[i]);
		}
		
		/*for (int i=myArray.length-1; i>-1; i--) {
			System.out.println("myArray["+i+"]= "+myArray[i]);
		}*/
		
		Arrays.sort(myArray);
		
		System.out.println("After Sorted Array:.....");
		for (int i=0; i<myArray.length; i++) {
			System.out.println("myArray["+i+"]="+myArray[i]);
		}
		
		System.out.println("reverse direction: ...");
		for (int i=myArray.length-1; i>-1; i--) {
			System.out.println("myArray["+i+"]=" +myArray[i]);
		}
	}

}
