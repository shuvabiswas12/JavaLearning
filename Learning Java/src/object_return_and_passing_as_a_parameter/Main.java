package object_return_and_passing_as_a_parameter;

public class Main {

	public static void main(String[] args) {
		Human boy = new Human();
		Human girl = new Human();
		
		boy.skinTone = "light";
		girl.skinTone = "pale";
		
		Human baby = girl.produce(boy);
		System.out.println(girl.produce(boy).skinTone);
		System.out.println(baby.skinTone);

	}

}
