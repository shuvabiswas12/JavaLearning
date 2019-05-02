package Day2;

public class ToStringMethod {

	public static void main(String[] args) {
		Method method = new Method("Shuva", 20);
		Method method2 = new Method("Sritoma", 17);
		
		System.out.println(method);
		System.out.println(method2);
	}

}

class Method {
	private String name;
	private int age;
	
	public Method(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	public String toString() {
		return "Name = "+name+" "+"Age = "+age;
	}
}
