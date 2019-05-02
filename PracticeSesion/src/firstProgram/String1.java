package firstProgram;

import java.util.Arrays;
import java.util.Scanner;

public class String1 {

	public static void main(String[] args) {
		
		String myString = "My Name is Shuva Biswas.";
		System.out.println(myString);
		
		String string = new String(myString);
		System.out.println(string);
		
		String[] str = new String[]{"myString", "svv", "sfvv"};
		//System.out.println(str);
		for (int i=0; i<str.length; i++) {
			System.out.println(str[i]);
		}

		String[] myString2 = {"my", "name", "is", "Shuva", "Biswas"};
		for (int i = 0; i < myString2.length; i++) {
			System.out.println(myString2[i]);
		}
		
		/*Scanner src = new Scanner(System.in);
		String myString3[] = new String[5];
		System.out.println("Enter the Strings Elemnts :");
		for (int i=0; i<myString3.length; i++) {
			myString3[i] = src.nextLine();
		}
		
		System.out.println("Before Sorted: ");
		for (int i=0; i<myString3.length; i++) {
			System.out.println("myString3["+i+"]=" +myString3[i]);
		}
		
		Arrays.sort(myString3);
		System.out.println("After Sorted: ");
		for (int i=0; i<myString3.length; i++) {
			System.out.println("myString3["+i+"]=" +myString3[i]);
		}
		*/
		char[] array1 = {'a', 'b', 'c', 'd', 'e','.'};
		System.out.println(array1);
		
	}

}
