package generics_class_1;

// This Generic program for different types of parameter

public class GenericsExample1<X, Y> {
	
	private X objX;
	private Y objY;
	
	
	public GenericsExample1(X objX, Y objY) {
		this.objX = objX;
		this.objY = objY;
	}
	
	public X getObjX() {
		return objX;
	}
	
	public Y getObjY() {
		return objY;
	}

	public void showTypes() {
		System.out.println("Type of X is :"+ objX.getClass().getName());
		System.out.println("And\n Type of Y is :"+objY.getClass().getName());
	}

	public static void main(String[] args) {
		
		GenericsExample1<Integer, String> data = new GenericsExample1<Integer, String>(2017, "Shuva Biswas");
		
		System.out.println(data.getObjX());
		System.out.println(data.getObjY());
		
		data.showTypes();
		
		
		// here showing that how can keep generic data/obj into another generic data/obj
		GenericsExample1<Integer, GenericsExample1<Integer, String>> myData = 
				new GenericsExample1<Integer, GenericsExample1<Integer,String>>(2017, new GenericsExample1<>(7, "august, 2017"));
		
		System.out.println(myData.getObjX());
		System.out.println(myData.getObjY());
		
		myData.showTypes();
	}

}
