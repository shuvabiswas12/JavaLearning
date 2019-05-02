package com.shuvabiswas.program2;

public interface Main_Interfaces {
	
	public static final String myName= "Shuva Biswas .";
	public static final String address = "I am from chittagong";
	
	public abstract void bio(String name, String address);
	
	public static void showLength() {
		System.out.println("Length of "+myName+" = "+myName.length());
		System.out.println("Length of "+address+" = "+address.length());
	}
	
	
	
	public interface Nested_Interface_1 {
		
		public static final String phone = "01703009482";
		
		public abstract void showPhoneNumber(String phone);
		
		public static void showLength() {
			System.out.println("Length of "+phone+" = "+phone.length());
		}
		
	}
	
	
	
	public static interface Nested_Interface_2 {
		
		public static final String email = "shuvabiswas12@gmail.com";
		
		public abstract void showEmailNumber(String email);
		
		public static void showLength() {
			System.out.println("Length of "+email+" = "+email.length());
		}
	}

}
