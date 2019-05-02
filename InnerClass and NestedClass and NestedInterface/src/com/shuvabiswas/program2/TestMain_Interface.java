package com.shuvabiswas.program2;

public class TestMain_Interface implements Main_Interfaces {

	@Override
	public void bio(String name, String address) {
		Main_Interfaces.showLength();
		System.out.println(name+" "+address+".");
	}
}

class Test_Nested_Interface extends TestMain_Interface implements Main_Interfaces.Nested_Interface_1, Main_Interfaces.Nested_Interface_2 {

	@Override
	public void showEmailNumber(String email) {
		System.out.println(Main_Interfaces.Nested_Interface_2.email);
		Main_Interfaces.Nested_Interface_1.showLength();
	}

	@Override
	public void showPhoneNumber(String phone) {
		System.out.println(Main_Interfaces.Nested_Interface_1.phone);
		Main_Interfaces.Nested_Interface_2.showLength();
	}
	
}
