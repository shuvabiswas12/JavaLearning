package object_return_and_passing_as_a_parameter;

public class Human {
	public String skinTone;
	
	public Human produce(Human anotherHuman) {
		Human newBie;
		newBie = new Human();
		
		newBie.skinTone = this.skinTone + anotherHuman.skinTone;
		
		return newBie;
	}

}
