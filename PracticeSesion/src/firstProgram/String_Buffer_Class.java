package firstProgram;

public class String_Buffer_Class {
	
	public static void main(String[] args) {
		String string = "Shuva Biswas";
		StringBuffer buffer = new StringBuffer(string);
		System.out.println(buffer);
		
		StringBuilder builder = new StringBuilder("This is "+string);
		builder.append(" I am from CTG. ");
		System.out.println(builder);
		
		builder.reverse();
		System.out.println(builder);
		
		
		
		/*StringBuffer stringBuffer = new StringBuffer("I am from Chittagong. ");
		System.out.println(stringBuffer);
		
		buffer.append(" This is ");
		buffer.append(stringBuffer);
		System.out.println(buffer);
		
		buffer.reverse();
		System.out.println(buffer);
		
		System.out.println(buffer.length());
		
		buffer.delete(13, 20);
		System.out.println(buffer);
		
		buffer.setLength(5);
		System.out.println(buffer);
*/		
		
	}

}
