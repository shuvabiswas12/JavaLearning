package generics_example;

public class Example {

	public static void main(String[] args) {
		
		/*
		Number<Integer> number = new Number(8658, 6586);
		
		System.out.println(number.getNumber1());
		System.out.println(number.getNumber2());
		
		number.showType();
		
		
		Number number2 = new Number("101", "Shuva", "CTG");
		System.out.println(number2.getNumber1() +" "+ number2.getNumber2() +" "+ number2.getNumber3());
		
*/
		
		
		Person person = new Person("Shuva Biswas", 116, "Chittagong");
		System.out.println("My name is : " + person.getName() + " Id : " + person.getId() + " City : " + person.getCity());
		
		
		Number<Person> number = new Number(person, person, person);
		System.out.println("My name is : " + number.getNumber1().getName() + "\nId : " + number.getNumber2().getId() + "\nCity : " + number.getNumber3().getCity());
	}

}


class Number <T> {
	
	T num1;
	T num2;
	T num3;
	
	public Number (T number1, T number2) {
		num1 = number1;
		num2 = number2;
	}
	
	public Number (T number1, T number2, T number3) {
		num1 = number1;
		num2 = number2;
		num3 = number3;
	}
	
	public T getNumber1 () {
		return num1;
	}
	
	public T getNumber2 () {
		return num2;
	}
	
	public T getNumber3 () {
		return num3;
	}
	
	public void showType () {
		System.out.println(num1.getClass().getName());
	}
}

class Person {
	
	private String name;
	private int id;
	private String city;
	
	public Person () {
		name = null;
		city = null;
		id = 0;
	}
	
	public Person (String name, int id) {
		this();
		this.setName(name);
		this.setId(id);
	}
	
	public Person (String name, int id, String city) {
		this.setName(name);
		this.setCity(city);
		this.setId(id);
	}
	
	private void setName (String name) {
		this.name = name;
	}
	
	private void setId (int id) {
		this.id = id;
	}
	
	private void setCity (String city) {
		this.city = city;
	}
	
	public String getName () {
		return name;
	}
	
	public String getCity () {
		return city;
	}
	
	public int getId () {
		return id;
	}
}