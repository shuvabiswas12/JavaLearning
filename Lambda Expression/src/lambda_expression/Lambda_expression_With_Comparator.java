package lambda_expression;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Lambda_expression_With_Comparator {
	
	public static void main(String[] args) {
		
		List<Product> list = new ArrayList<>();
		
		list.add(new Product(1, "Tv", 1900));
		list.add(new Product(2, "Macbook Pro", 3200));
		list.add(new Product(3, "Iphone", 2900));
		list.add(new Product(4, "Nokia 8", 700));
		
		for (Product p2 : list) {
			System.out.println(p2.id + " " + p2.name + " " + p2.price);
		}
		
		System.out.println("//------------------------------------------------//");
		
		// here lambda expression with comparator
		// sorting on the basis of name
		Collections.sort(list, (p1, p2) -> {
			return p1.name.compareTo(p2.name);
		});
		
		for (Product p : list) {
			System.out.println(p.id + " " + p.name + " " + p.price);
		}
		
		
		System.out.println("//-------------------------------------------------//");
		
		// sorting on the basis of price
		Collections.sort(list, (p1, p2) -> {
			return Float.valueOf(p1.price).compareTo(Float.valueOf(p2.price));
		});
		
		for (Product product : list) {
			System.out.println(product.id + " " + product.name + " " +product.price);
		}
		
	}


}

class Product {

	public int id;
	public String name;
	public float price;
	
	public Product (int id, String name, float price) {
		this.id = id;
		this.name = name;
		this.price = price;
	}

}
