package lambda_expression;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class FilterDataWithStream {

	public static void main(String[] args) {
		
		List<Products> lProducts = new ArrayList<>();
		
		lProducts.add(new Products(1, "LG", 200));
		lProducts.add(new Products(2, "Sony", 2000));
		lProducts.add(new Products(3, "Samsung", 1600));
		lProducts.add(new Products(4, "Symphony", 800));
		lProducts.add(new Products(5, "Xiaomi", 1200));
		
		Stream<Products> filter = lProducts.stream().filter(p -> p.price>1000);
		
		filter.forEach(
			
				(products) -> System.out.println(products.id + " " + products.name + " " + products.price)
		);
		

	}

}


class Products {
	
	public int id;
	public String name;
	public float price;
	
	public Products (int id, String name, float price) {
		this.id = id;
		this.name = name;
		this.price = price;
	}
	
}