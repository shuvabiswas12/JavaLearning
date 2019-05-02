package generics_class_1;

// Rules for writing Generic class and creating object -

// class_name<Type_parameter_list> {}

// class_name<Type_arg_list> var_name = new class_name<Type_arg_list>(cons_arg_list);


public class Generics<T> { 	     //here <T> is a placeHolder. T requires a reference Type
	private T obj;
	
	public Generics(T obj) {
		this.obj = obj;
	}
	
	public T getObj() {
		return obj;
	}
	
	public void showType() {
		System.out.println("Type of T is "+obj.getClass().getName());
	}
	
	public static void main(String[] args) {
		
		// here 88 is an object which is included in Constructor of Generic Class.
		Generics<Integer> value = new Generics<Integer>(88);
		System.out.println(value.getObj());
		
		value.showType();
	}

}

