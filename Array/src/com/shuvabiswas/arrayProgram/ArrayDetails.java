package com.shuvabiswas.arrayProgram;

import java.util.Scanner;

public class ArrayDetails {

	public static void main(String[] args) {
		
		// this means there are created 5 different object in heap memory in each time
		/*Students[] myStudents;
		myStudents = new Students[5];*/
		
		//=======================================================================================//
		
		Students[] myStudents = new Students[5];
		
		//======================================================================================//
		
		// here is created two student object
		myStudents[0] = new Students();
		myStudents[2] = new Students();
		
		// for student 1
		myStudents[0].name = "Sangeeta Nandi";
		myStudents[0].roll = 16;
		myStudents[0].marks = 4.0f;

		myStudents[0].display();
		
		// for student 2
		myStudents[2].name = "Shuva Biswas";
		myStudents[2].roll = 20;
		myStudents[2].marks = 3.0f;
				
		myStudents[2].display();
		
		//========================================================================================//
		
		
		// this is show error because the referential object variable myStudents[3] is not point any object.
		/*myStudents[3].name = "akhbcac";
		myStudents[3].roll = 23;
		myStudents[3].marks = 3.2f;
		myStudents[3].display();*/
		
		//========================================================================================//
		
		
		// here are a testing program for array better understanding
		
		/*Scanner src = new Scanner(System.in);
		
		for (int i = 0; i < myStudents.length; i++) {
			myStudents[i] = new Students();
			
			System.out.println("For "+(i+1)+"_th students\n");
			
			myStudents[i].name = src.next();
			myStudents[i].roll = src.nextInt();
			myStudents[i].marks = src.nextFloat();
			System.out.println();
			
		}
		
		System.out.println("The Final List is -");
		for (int i = 0; i < myStudents.length; i++) {
			myStudents[i].display();
		}*/

	}

}

class Students {
	String name;
	int roll;
	float marks;
	
	public void display() {
		System.out.println("Name = "+this.name+"\nRoll = "+this.roll+"\nMarks = "+this.marks);
		System.out.println();
	}
}
