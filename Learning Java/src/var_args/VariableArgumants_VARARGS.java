package var_args;

public class VariableArgumants_VARARGS {

	public static void main(String[] args) {
		
		Input obj = new Input();
		obj.add();
		
		
		
		// obj.add(4); // this create an ambigious problem

	}

}


class Input {
	
	public void add(int x, int ... a) {
		
		System.out.println("The length is = "+a.length);
	}
	

	public void add(int ... a) {
		int sum = 0;
		
		System.out.println("The length is = "+a.length);
		
		for (int i=0; i<a.length; i++) {
			sum = sum+a[i];
		}
		System.out.println(sum);
	}
	
	
	
	
	// in var_args(variable arguments), var_args instruction must be included at last after the another instruction.
		// if i write ver_args at first and after that i write another instruction then it must show an error.  
		
		
		
		// here show an error because of writing var_args at first.
		/*public void add(int ... a, int x) {
			
			System.out.println("The length is = "+a.length);
			
			
		}*/
	
	
	
	
	
	
	
	/*
	 var_args is an one dimentional (1D) array.
	 if i do not put any arguments as parameter then it can not show or produce any error. 
	 
	 */
}