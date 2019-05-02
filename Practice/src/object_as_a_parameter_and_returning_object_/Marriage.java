package object_as_a_parameter_and_returning_object_;

public class Marriage {
	
	public static void main (String[] args) {
		Human wife = new Human();
		wife.setSkinTone("light");
		
		Human husband = new Human();
		husband.setSkinTone("pale");
		
		Human myChild /*= wife.produce(husband)*/;
		
		
		/*System.out.println(myChild.getSkinTone());*/
		
		System.out.println(wife.getSkinTone(husband));
			
	}

}

class Human {
	
	private String skinTone;
	
	public void setSkinTone(String skinTone) {
		this.skinTone = skinTone;
	}
	
	public String getSkinTone() {
		return skinTone;
	}
	
	public String getSkinTone(Human anotherHuman) {
		
		return skinTone = this.produce(anotherHuman).skinTone; 
	}
	
	
	public Human produce(Human anotherHuman) {
		Human newBie = new Human();
		newBie.skinTone = this.skinTone + anotherHuman.skinTone;
		return newBie;
	}
}
