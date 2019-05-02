package firstProgram;

public class Main {

	public static void main(String[] args) {
		
		Human boy = new Human();
		boy.skinTone = "pale";
		
		Human girl = new Human();
		girl.skinTone = "light";
		
		Human brother = girl.produce(boy);
		System.out.println(brother.skinTone);
		
		/*brother = boy;
		System.out.println(brother.skinTone);
*/
	}

}

class Human {
	String skinTone;
	
	public Human produce(Human anotherHuman) {
		Human newBie;
		newBie = new Human();
		
		//newBie.skinTone = this.skinTone;
		newBie.skinTone = this.skinTone + anotherHuman.skinTone;
		
		return newBie;
	}
}
