package generics_class_final;

public class MainTest {
	
	public static void main(String[] args) {
		
		Person person = new Person("James", "password");
		LogIn<Person> pLogIn = new LogIn(person, person);
		
		System.out.println(pLogIn.getName().getName() + ", "+ pLogIn.getName().getPassword());
		
	}

}



/*-----------This is a normal class-------------*/
class Person {
	
	private String name;
	private String password;
	
	
	public Person(String name, String password) {
		this.setName(name);
		this.setPassword(password);
	}
	
	private void setName(String name) {
		this.name = name;
	}
	
	private void setPassword(String password) {
		this.password = password;
	}
	
	public String getName() {
		return name;
	}
	
	public String getPassword() {
		return password;
	}
	
	
}




/*-------------This is an Generic Class--------------*/

class LogIn<T> {
	
	private T name;
	private T password;
	
	public LogIn(T name, T password) {
		this.setName(name);
		this.setPassword(password);
	}
	
	private void setName(T name) {
		this.name = name;
	}
	
	private void setPassword(T password) {
		this.password = password;
	}
	
	public T getName() {
		return name;
	}
	
	public T getPassword() {
		return password;
	}

}