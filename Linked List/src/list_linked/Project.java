package list_linked;

import java.util.LinkedList;

public class Project {

	public static void main(String[] args) {
		
		LinkedList<String> countryNames = new LinkedList<>(); //এখানে size বলে দেওয়া যাবে না লিঙ্কড লিস্ট এর ক্ষেত্রে। 
		
		countryNames.add("Bangladesh");
		countryNames.add("India");
		countryNames.add("Nepal");
		countryNames.add("Finland");
		
		System.out.println(countryNames);
		System.out.println("\n-----------===================----------------\n");
		

		countryNames.addFirst("This is My First Country");  // this method add element to first
		countryNames.addLast("This is my last country");  // this method add element to last
		
		for(String temp : countryNames) {
			System.out.println(temp);
		}
		
		System.out.println("\n-----------===================----------------\n");
		
		
		// finding size of linked list
		System.out.println(countryNames.size());
		
		/*
		
		// removing elements from the linked list
		
		
		int size = countryNames.size();
		System.out.println(countryNames);
		System.out.println();
		// -----------------------------------
		for (int i=0; i<size; i++) {
			countryNames.remove();
			System.out.println("#0" +i+" : "+countryNames);
		}
		
		//-------------------------------------------------------------//
		
		*/
		
		
		// ------------------------------------------------------//
		
		/*
		countryNames.removeFirst();
		System.out.println(countryNames);
		
		countryNames.removeLast();
		System.out.println(countryNames);
		
		*/
		
		// ----------------------------------------------------//
		
		countryNames.remove(3);
		System.out.println(countryNames);
		
		countryNames.remove("Bangladesh");
		System.out.println(countryNames);
		
		//---------------------------------------------//
		
		System.out.println();
		System.out.println("First Element : " +countryNames.getFirst());
		System.out.println("Last Element : " +countryNames.getLast());
	}

}
